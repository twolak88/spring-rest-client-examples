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
public class Billing implements Serializable {
	
	private static final long serialVersionUID = 1966092846217582695L;
	
	private Card card;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
