package com.github.tcw.cor;

public interface CorHandler {

        public void setNext(CorHandler handler);

        public Response handleRequest(Request request);
}
