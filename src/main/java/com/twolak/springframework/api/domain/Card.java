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
public class Card implements Serializable {
	
	private static final long serialVersionUID = 5211542360527332398L;
	
	private String type;
	private String number;
	private ExpirationDate expirationDate;
	private String iban;
	private String swift;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
