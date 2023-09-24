package com.example.democrudquarkus.service.impl;

import com.example.democrudquarkus.commons.GenericServiceImpl;
import com.example.democrudquarkus.model.Persona;
import com.example.democrudquarkus.service.api.PersonaServiceApi;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Integer> implements PersonaServiceApi {
	
	public PersonaServiceImpl() {
		super(Persona.class);
	}
	
	@Inject
	EntityManager em;

	@Override
	public EntityManager getEm() {
		return em;
	}

}
