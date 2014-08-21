package com.github.tcw.cor;

public final class Cor {

    private final CorProcessor processor;

    public Cor(CorHandler... corHandlers) {
        processor = new CorProcessor();
        for (CorHandler corHandler : corHandlers) {
            processor.addHandler(corHandler);
        }
    }

    public Response execute(Request request) {
        return processor.execute(request);
    }
}
