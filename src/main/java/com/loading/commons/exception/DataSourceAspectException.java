package com.loading.commons.exception;

public class DataSourceAspectException extends Exception {

	public DataSourceAspectException(String string, Throwable e) {
		super(string, e);
	}

	public DataSourceAspectException(){
		super();
	}
	
	public DataSourceAspectException(String message){
		super(message);
	}
	
	public DataSourceAspectException(Throwable e){
		super(e);
	}
}
