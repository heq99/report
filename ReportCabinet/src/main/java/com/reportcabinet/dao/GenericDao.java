package com.reportcabinet.dao;

import java.util.List;

import com.reportcabinet.domainobjects.DomainObject;

public interface GenericDao<T extends DomainObject> {

	public T get(Integer id);
	public List<T> getAll();
	public T save(T obj);
	public T update(T obj);
	public T delete(T obj);
	
}
