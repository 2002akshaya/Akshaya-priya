package com.tns.mallservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Mall {

@Entity

public class Mallservice {
	private Integer mall_id;
	private String mall_name;
	private String mall_managername;
	private String mall_shops;
	private Integer mall_contact;
	private Integer mall_timings;
	public Mallservice() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public Mallservice(Integer mall_id, String mall_name, String mall_managername, String mall_shops,
			Integer mall_contact, Integer mall_timings) {
		super();
		this.mall_id = mall_id;
		this.mall_name = mall_name;
		this.mall_managername = mall_managername;
		this.mall_shops = mall_shops;
		this.mall_contact = mall_contact;
		this.mall_timings = mall_timings;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getMall_id() {
		return mall_id;
	}
	public void setMall_id(Integer mall_id) {
		this.mall_id = mall_id;
	}
	public String getMall_name() {
		return mall_name;
	}
	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}
	public String getMall_managername() {
		return mall_managername;
	}
	public void setMall_managername(String mall_managername) {
		this.mall_managername = mall_managername;
	}
	public String getMall_shops() {
		return mall_shops;
	}
	public void setMall_shops(String mall_shops) {
		this.mall_shops = mall_shops;
	}
	public Integer getMall_contact() {
		return mall_contact;
	}
	public void setMall_contact(Integer mall_contact) {
		this.mall_contact = mall_contact;
	}
	public Integer getMall_timings() {
		return mall_timings;
	}
	public void setMall_timings(Integer mall_timings) {
		this.mall_timings = mall_timings;
	}
	@Override
	public String toString() {
		return "Mallservice [mall_id=" + mall_id + ", mall_name=" + mall_name + ", mall_managername=" + mall_managername
				+ ", mall_shops=" + mall_shops + ", mall_contact=" + mall_contact + ", mall_timings=" + mall_timings
				+ "]";
	}
}
	
	



