package com.ramazzotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazzotte.domain.Usuario;
import com.ramazzotte.domain.flat.brasilapi.Coordinates;
import com.ramazzotte.repository.UsuarioRepository;
@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuRepo;
	
	@Autowired
	private ServicosResquestAllAIP serviceApi;

	public List<Usuario> findAll() {
		List<Usuario> list = usuRepo.findAllCat();

		return list;
	}

	public Usuario findPorId(Integer idusuario) {
		Usuario cat = usuRepo.findPorId(idusuario);
		return cat;
	}

	public Usuario addUsuario(Usuario usu) {

		Coordinates latlong1 = serviceApi.buscarLatLog( usu.getEndereco().getCep());
		usu.setLatitude(latlong1.getLatitude());
		usu.setLongitude(latlong1.getLongitude());
		
		return usuRepo.save(usu);
	}

	public void deleteUsu(Integer idusuario) {
		usuRepo.deleteById(idusuario);
		
	}

	public Usuario updateUsuario(Usuario usua) {
		Usuario usu = findPorId(usua.getId());
		usu.setNome(usua.getNome());
		return usuRepo.save(usu);
	}
}
