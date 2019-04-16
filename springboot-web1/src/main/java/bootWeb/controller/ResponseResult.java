package bootWeb.controller;

import java.io.Serializable;

public class ResponseResult<T>  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer state;
	private String message;
	private T data;
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
