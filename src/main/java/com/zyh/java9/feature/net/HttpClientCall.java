package com.zyh.java9.feature.net;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;

/**
 * Created by zhyhang on 2017/3/19.
 */
public class HttpClientCall {
    public static void main(String... args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder(URI.create("http://cn.bing.com/")).GET().build();
        HttpResponse<String> response = client.send(req, HttpResponse.BodyHandler.asString());
        System.out.println(response.body());
    }
}
