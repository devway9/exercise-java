package com.devway.tomcat.server01;

import java.io.*;

/**
 * Request class
 *
 * @author devway
 * @date 2017-12-11
 */
public class Request {
    private InputStream input;
    private String uri;

    public Request(InputStream input) {
        this.input = input;
    }

    public void parse() {
        StringBuffer request = new StringBuffer(2048);
        int i;
        byte[] buffer = new byte[2048];
        try {
            i = input.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            i = -1;
        }

        for (int j = 0; j < i; j++) {
            request.append((char) buffer[j]);
        }
        System.out.println(request.toString());
        uri = parseUri(request.toString());
    }


    private String parseUri(String requestString) {
        int index1 ,index2;
        index1 = requestString.indexOf(" ");
        if(index1!=-1){
            index2 = requestString.indexOf(" ",index1+1);
            if(index2>index1){
                return requestString.substring(index1+1,index2);
            }
        }
        return null;
    }

    public String getUri() {
        return uri;
    }


    public static void main(String[] args) {
        try {
            File directory = new File("");
            InputStream input = new FileInputStream(directory.getAbsolutePath() + "/tomcat/src/main/java/com/devway/tomcat/server01/requetTemplate.txt");
            Request request = new Request(input);
            request.parse();
            System.out.println(request.getUri());
            String uri=request.getUri();
            String servletName = uri.substring(uri.lastIndexOf("/")+1);
            System.out.println(servletName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
