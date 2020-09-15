/**
 * 
 */
package com.twolak.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * @author twolak
 *
 */
@Getter
@Setter
public class User implements Serializable {
	
	private static final long serialVersionUID = 8599573885790690791L;
	
	private String gender;
	private Name name;
	private Location location;
	private String email;
	private Login login;
	private String phone;
	private Job job;
	private Billing billing;
	private String language;
	private String currency;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
