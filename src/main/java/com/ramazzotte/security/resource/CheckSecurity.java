package com.ramazzotte.security.resource;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.security.access.prepost.PreAuthorize;

public @interface CheckSecurity {

	public @interface Editora {

		@PreAuthorize("hasAuthority('C_EDTR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_EDTR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_EDTR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_EDTR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Livro {

		@PreAuthorize("hasAuthority('C_LVR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_LVR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_LVR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_LVR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Biblioteca {

		@PreAuthorize("hasAuthority('C_BIB')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_BIB')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_BIB')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_BIB')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Codigo {

		@PreAuthorize("hasAuthority('C_CDG')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_CDG')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_CDG')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_CDG')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Endereco {

		@PreAuthorize("hasAuthority('C_ENDC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_ENDC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_ENDC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_ENDC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Escola {

		@PreAuthorize("hasAuthority('C_ESC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_ESC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_ESC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_ESC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Genero {

		@PreAuthorize("hasAuthority('C_GNR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_GNR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_GNR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_GNR')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Locacao {

		@PreAuthorize("hasAuthority('C_LCC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_LCC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_LCC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_LCC')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Reserva {

		@PreAuthorize("hasAuthority('C_RSRV')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_RSRV')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_RSRV')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_RSRV')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Serie {

		@PreAuthorize("hasAuthority('C_SRE')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_SRE')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_SRE')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_SRE')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}

	public @interface Usuario {

		@PreAuthorize("hasAuthority('C_USU')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeCadastrar {
		}

		@PreAuthorize("hasAuthority('D_USU')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeExcluir {
		}

		@PreAuthorize("hasAuthority('U_USU')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeAtualizar {
		}

		@PreAuthorize("hasAuthority('R_USU')")
		@Retention(RUNTIME)
		@Target(METHOD)
		public @interface PodeConsultar {
		}

	}
}