package com.ty.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String address;
	private int panNumber;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the panNumber
	 */
	public int getPanNumber() {
		return panNumber;
	}
	/**
	 * @param panNumber the panNumber to set
	 */
	public void setPanNumber(int panNumber) {
		this.panNumber = panNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
