package com.my.ws; 
import javax.xml.bind.annotation.XmlRootElement; 

@XmlRootElement 
public class JXRes
{ 
	protected String message;
	protected String name;

	public JXRes() { 
		super();
	}
	// TODO Auto-generated constructor stub } /** * @return the id */
	public String getMessage() {
		return message;
	} 
	/** * @param id the id to set */
	public void setMessage(String message) { 
		this.message = message;
	}
	/** * @return the name */ 
	public String getName() { 
		return name; 
	}
	/** * @param name the name to set */ 
	public void setName(String name) {
		this.name = name; 
	}
} 
