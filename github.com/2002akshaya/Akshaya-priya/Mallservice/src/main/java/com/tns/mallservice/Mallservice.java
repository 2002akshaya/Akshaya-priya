package com.tns.mallservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Mallservice {
	@Autowired
	private MallserviceRepository repo;
	public List<Mall> listAll()
	{
		return repo.findAll();
	}
	public Mall get(Integer mall_id)
	{
		return repo.findById(mall_id).get();
		
	}
	public void delete(Integer mall_id)
	{
		repo.deleteById(mall_id);
	}
	public void save(Mall mal) {
		repo.save(mal);
	}
}
