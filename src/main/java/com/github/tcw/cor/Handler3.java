package com.github.tcw.cor;


public final class Handler3 implements CorHandler {

    @Override
    public void setNext(CorHandler handler) {}

    @Override
    public Response handleRequest(Request request) {
        return new Response("Handler 3: " + request.getValue() );
    }
}
