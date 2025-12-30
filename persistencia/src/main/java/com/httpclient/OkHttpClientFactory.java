package com.httpclient;

import java.time.Duration;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public class OkHttpClientFactory {
	 private List<Interceptor> interceptors;
	    private long connectTimeout;
	    private long readTimeout;
	    private long writeTimeout;

	    public OkHttpClient create() {
	        OkHttpClient.Builder builder = new OkHttpClient.Builder()
	                .connectTimeout(Duration.ofSeconds(connectTimeout))
	                .readTimeout(Duration.ofSeconds(readTimeout))
	                .writeTimeout(Duration.ofSeconds(writeTimeout));

	        if (interceptors != null) {
	            interceptors.forEach(builder::addInterceptor);
	        }

	        return builder.build();
	    }

		public List<Interceptor> getInterceptors() {
			return interceptors;
		}

		public void setInterceptors(List<Interceptor> interceptors) {
			this.interceptors = interceptors;
		}

		public long getConnectTimeout() {
			return connectTimeout;
		}

		public void setConnectTimeout(long connectTimeout) {
			this.connectTimeout = connectTimeout;
		}

		public long getReadTimeout() {
			return readTimeout;
		}

		public void setReadTimeout(long readTimeout) {
			this.readTimeout = readTimeout;
		}

		public long getWriteTimeout() {
			return writeTimeout;
		}

		public void setWriteTimeout(long writeTimeout) {
			this.writeTimeout = writeTimeout;
		}
	    

}
