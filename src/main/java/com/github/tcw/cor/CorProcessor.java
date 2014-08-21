package com.github.tcw.cor;

public class CorProcessor {

    private CorHandler first;
    private CorHandler prevHandler;

    public void addHandler(CorHandler handler) {
        if (first == null){
            first = handler;
        }
        if (prevHandler != null){
            prevHandler.setNext(handler);
        }
        prevHandler = handler;
    }

    public Response execute(Request request){
       return first.handleRequest(request);
    }
}
