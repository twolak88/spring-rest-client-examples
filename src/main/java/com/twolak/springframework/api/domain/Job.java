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
public class Job implements Serializable {
	
	private static final long serialVersionUID = -6639825647591681114L;
	
	private String title;
	private String company;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
