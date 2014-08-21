package com.github.tcw.cor;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorTest {

    static private Cor cor;

    @BeforeClass
    public static void init(){
        cor = new Cor(new Handler1(), new Handler2(), new Handler3());
    }

    @Test
    public void testChainExecution() throws Exception {
        Response response = cor.execute(new Request("Test"));
        assertEquals("Handler 3: Test", response.getValue());
    }

    @Test
    public void testChainExecutionWithShortCircuit() throws Exception {
        Response response = cor.execute(new Request("STOP"));
        assertEquals("Handler 2: STOP", response.getValue());
    }
}
