package com.github.tcw.cor;


public final class Handler2 implements CorHandler {

    private CorHandler next;

    @Override
    public void setNext(CorHandler handler) {
        this.next = handler;
    }

    @Override
    public Response handleRequest(Request request) {
        if ("STOP".equals(request.getValue())){
            return new Response("Handler 2: " + request.getValue());
        }
        return next.handleRequest(request);
    }
}
