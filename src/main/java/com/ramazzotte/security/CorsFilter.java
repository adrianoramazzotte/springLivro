package com.ramazzotte.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ramazzotte.config.NomeProjetoProperty;




//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter { //implements Filter {
	
//	@Autowired
	private NomeProjetoProperty adfApiProperty;
	
	
	
	private List<String> listaOrigemPermitida = new ArrayList<>();
	private String origemPermitida;
	
	
	
	public String getOrigemPermitida() {
		return origemPermitida;
	}

	public void setOrigemPermitida(String origemPermitida) {
		this.origemPermitida = origemPermitida;
	}

	public List<String> getListaOrigemPermitida() {
		return listaOrigemPermitida;
	}

	public void setListaOrigemPermitida(List<String> listaOrigemPermitida) {
		this.listaOrigemPermitida = listaOrigemPermitida;
	}

//	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		
		response.setHeader("Access-Control-Allow-Origin", adfApiProperty.getOriginPermitida());
        response.setHeader("Access-Control-Allow-Credentials", "true");
		
		if ("OPTIONS".equals(request.getMethod()) && adfApiProperty.getOriginPermitida().equals(request.getHeader("Origin"))) {
			response.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, PUT, OPTIONS");
        	response.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
        	response.setHeader("Access-Control-Max-Age", "3600");
			
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			chain.doFilter(req, resp);
		}
		
	}
	
//	@Override
	public void destroy() {
	}

//	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}