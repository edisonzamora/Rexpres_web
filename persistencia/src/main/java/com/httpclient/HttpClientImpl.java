package com.httpclient;

import okhttp3.Headers;
import okhttp3.Request;

public class HttpClientImpl extends OkHttp3ClientCommon implements HttpClient{
	
	    @Override
	    public <T> T get(Request request, Class<T> responseType) {
	        return execute(request, responseType);
	    }
 
	    @Override
	    public <T> T post(Request request, Class<T> responseType) {
	        return execute(request, responseType);
	    }
	    @Override
	    public Headers headers(Request request) {
	    	return execute(request);
	    }
}
