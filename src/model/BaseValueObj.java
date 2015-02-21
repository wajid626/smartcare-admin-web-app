package model;


import org.json.JSONObject;

public class BaseValueObj {
	public String toString() {
		return (new JSONObject(this)).toString();
	}
}
