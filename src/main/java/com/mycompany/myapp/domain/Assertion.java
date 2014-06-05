package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Assertion {

   /** evaluating the assertion key 
	* gives you an assertion value
	*/
	private String key;

	private String value;
	
	private MediaType inputMediaType = MediaType.JSON;

	private boolean isRegEx;

	private Status status;

	private String message;

	private String exception;
	
	public Assertion() {		
	}

	public Assertion(String key, String value) {
		this(key, value, false);
	}
	
	public Assertion(String key, String value, boolean isRegEx) {
		super();
		this.key = key;
		this.value = value;
		this.isRegEx = isRegEx;
	}

	/**
	 * key is the assertion that needs to be evaluated
	 * @return
	 */
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * If evaluation needs to treated as a regex
	 * @return
	 */
	public boolean isRegEx() {
		return isRegEx;
	}

	public void setRegEx(boolean isRegEx) {
		this.isRegEx = isRegEx;
	}
	
	public MediaType getInputMediaType() {
		return inputMediaType;
	}

	public void setInputMediaType(MediaType inputMediaType) {
		this.inputMediaType = inputMediaType;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

}
