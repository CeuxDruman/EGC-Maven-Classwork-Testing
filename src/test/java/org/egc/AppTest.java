package org.egc;

import org.junit.*;
import static org.junit.Assert.*;

import org.jgrapht.*;
import org.jgrapht.graph.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigurous Test :-)
     */
    @Test
    public void app()
    {

        DirectedGraph<String, DefaultEdge> graph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
        assertNotNull( graph );
        
        assertTrue( true );
    }

}
