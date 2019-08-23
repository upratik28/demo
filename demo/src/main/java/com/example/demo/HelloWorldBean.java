package com.example.demo;

public class HelloWorldBean {

	private String msg;
	
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HelloWorldBean [msg=" + msg + "]";
	}

	public  HelloWorldBean(String msg) {
		this.msg=msg;
	}

}
