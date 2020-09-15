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
public class Login implements Serializable {
	
	private static final long serialVersionUID = -2293744398512182876L;
	
	private String username;
	private String password;
	private String md5;
	private String sha1;
	private String sha256;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
