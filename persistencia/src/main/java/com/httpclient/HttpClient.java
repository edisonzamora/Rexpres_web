package com.httpclient;

import okhttp3.Headers;
import okhttp3.Request;

public interface HttpClient {

	public	<T> T get(Request request, Class<T> responseType);
	
	public <T> T post(Request request, Class<T> responseType);
	
	public Headers headers(Request request);
}
