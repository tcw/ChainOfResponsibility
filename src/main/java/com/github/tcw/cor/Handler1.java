package com.github.tcw.cor;


public final class Handler1 implements CorHandler {

    private CorHandler next;

    @Override
    public void setNext(CorHandler handler) {
        this.next = handler;
    }

    @Override
    public Response handleRequest(Request request) {
        return next.handleRequest(request);
    }
}
