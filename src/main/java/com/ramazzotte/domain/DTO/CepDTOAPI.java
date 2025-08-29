package com.ramazzotte.domain.DTO;

import com.ramazzotte.domain.flat.brasilapi.Location;

public class CepDTOAPI {

	private String cep;
	private String state;
	private String city;
	private String neighborhood;
	private String street;
	private String service;
	private Location location;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public CepDTOAPI(String cep, String state, String city, String neighborhood, String street, String service,
			Location location) {
		super();
		this.cep = cep;
		this.state = state;
		this.city = city;
		this.neighborhood = neighborhood;
		this.street = street;
		this.service = service;
		this.location = location;
	}
	public CepDTOAPI() {

	}
	@Override
	public String toString() {
		return "CepDTOAPI [cep=" + cep + ", state=" + state + ", city=" + city + ", neighborhood=" + neighborhood
				+ ", street=" + street + ", service=" + service + ", location=" + location + "]";
	}


}
