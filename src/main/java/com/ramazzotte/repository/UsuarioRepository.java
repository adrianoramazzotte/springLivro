package com.ramazzotte.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramazzotte.domain.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	@Query(value = "SELECT * FROM usuario", nativeQuery = true)
	List<Usuario> findAllCat();

	@Query(value = "SELECT * FROM usuario where id = ?", nativeQuery = true)
	Usuario findPorId(Integer idusuario);
	
	@Query(value= "select * from usuario where telefone = ?", nativeQuery = true)
	Usuario findPorTelefone(String telefone);

	Optional<Usuario> findByTelefone(String telefone);
	@Query(value= "select * from usuario where nome = ?", nativeQuery = true)
	Usuario buscarUsuario(String nome);

	Optional<Usuario> findByCpf(String cpf);
}
