package com.zhy.http.okhttp.builder;

import java.util.Map;

/**
 * Created by zhy on 16/3/1.
 */
public interface HasParamsable
{
    OkHttpRequestBuilder params(Map<String, String> params);
    OkHttpRequestBuilder addParams(String key, String val);
    OkHttpRequestBuilder paramsForJson(Map<String, Object> params);
    OkHttpRequestBuilder addParamsForJson(String key, String val);

}
