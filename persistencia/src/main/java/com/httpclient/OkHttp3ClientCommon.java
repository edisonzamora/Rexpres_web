package com.httpclient;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttp3ClientCommon {

	private OkHttpClient okHttpClient;
    private ObjectMapper objectMapper;

	 public <T> T execute(Request request, Class<T> responseType) {
	        try (Response response = okHttpClient.newCall(request).execute()) {

	            if (!response.isSuccessful()) {
	                throw new HttpClientException("HTTP error: " + response.code());
	            }

	            if (response.body() == null) {
	                return null;
	            }

	            return objectMapper.readValue(
	                    response.body().string(), responseType
	            );

	        } catch (IOException e) {
	            throw new HttpClientException("Error ejecutando petición HTTP", e);
	        }
	    }
	 public Headers execute(Request request) {
	        try (Response response = okHttpClient.newCall(request).execute()) {

	            if (!response.isSuccessful()) {
	                throw new HttpClientException("HTTP error: " + response.code());
	            }

	            if (response.body() == null) {
	                return null;
	            }

	            return response.headers();

	        } catch (IOException e) {
	            throw new HttpClientException("Error ejecutando petición HTTP", e);
	        }
	    }

	public void setOkHttpClient(OkHttpClient okHttpClient) {
		this.okHttpClient = okHttpClient;
	}
	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}
	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
	public OkHttpClient getOkHttpClient() {
		return okHttpClient;
	}
	
	
}
