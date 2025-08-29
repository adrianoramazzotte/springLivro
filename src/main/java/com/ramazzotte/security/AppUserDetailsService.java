package com.ramazzotte.security;


import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Usuario;
import com.ramazzotte.repository.UsuarioRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private HttpServletRequest request;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String origem = "http://localhost:4200";
//		String origem = request.getHeader("Origin");
//		Optional<Usuario> usuarioOptional = usuarioRepository.findByTelefone(cpf);
		Optional<Usuario> usuarioOptional = usuarioRepository.findByCpf(username);

		if (!usuarioOptional.isEmpty()) {
			Usuario usuario = usuarioOptional.get();
			if        (origem.equals("http://localhost:4200")) {
				usuario = usuarioOptional
						.orElseThrow(() -> new UsernameNotFoundException("Usuário e/ou senha incorretos"));
				return new User(username, usuario.getSenha(), getPermissoes(usuario));
			} else {
				usuario = null;
				Optional<Usuario> usuarioOptional1 = usuarioRepository.findByTelefone("00000");
				usuario = usuarioOptional1
						.orElseThrow(() -> new UsernameNotFoundException("Usuário e/ou senha incorretos"));
				return new User(username, usuario.getSenha(), getPermissoes(usuario));
			}
		} else {
			Optional<Usuario> usuarioOptional1 = usuarioRepository.findByTelefone("00000");
			Usuario usuario;
			usuario = usuarioOptional1
					.orElseThrow(() -> new UsernameNotFoundException("Usuário e/ou senha incorretos"));
			return new User(username, usuario.getSenha(), getPermissoes(usuario));
		}
	}
	private Collection<? extends GrantedAuthority> getPermissoes(Usuario usuario) {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		usuario.getPermissoes().forEach(p -> authorities.add(new SimpleGrantedAuthority(p.getDescricao().toUpperCase())));
		return authorities;
	}

}