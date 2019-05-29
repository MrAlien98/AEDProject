package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dataStructure.GraphByMatrix;

/**
 * Class that test methods from the GraphByMatrix class 
 * @author Julian Brito
 *
 */
public class GraphByMatrixTest {

GraphByMatrix<String,Integer>  graph;
    
	 
	
    public void stageOne() {
    	
    	graph = new GraphByMatrix<>(5);
    }
    
    
	 
	
    public void stageTwo() {
    	
    	graph = new GraphByMatrix<>(3);
    	

    	String washington = new String("Washington");
    	String kansas = new String("Kansas");
    	
    	graph.addVertex(washington);
    	graph.addVertex(kansas);
    
    }
    

    public void stageThree() {
    	
    	graph = new GraphByMatrix<>(3);
    	

    	String washington = new String("Washington");
    	String kansas = new String("Kansas");
    	
    	graph.addVertex(washington);
    	graph.addVertex(kansas);
    	
    	graph.addEdge(washington, kansas, false, 328, 0);
    
    }
    
    
    @Test
    public void testInitMatrix() {
    	 
    	stageOne();
    	
    	assertNotNull(graph.getAdjMatrix());
    	
    }
    
    @Test
    public void testAddVertex() {
    	
    	stageOne();
    	
    	String vertexA = new String("Washington");
    	String vertexB = new String("Ottawa");
    	String vertexC = new String("Bogota");
    	
    	graph.addVertex(vertexA);
    	graph.addVertex(vertexB);
    	graph.addVertex(vertexC);

    	
    	assertEquals(3, graph.getVertices().size());

    	
    }
    
    @Test
    public void testAddEdge() {
    	
    	stageTwo();
    	
    
    	String washington = new String("Washington");
    	String kansas = new String("Kansas");
    	
    	graph.addEdge(washington, kansas, false, 328, 0);

        assertEquals(1, graph.numEdgesOfVertex(washington));
    }
    
    @Test
    public void testRemoveEdge() {
    	
    	stageThree(); 
    	
    	graph.removeEdge("Washington", "Kansas", false, 328);
    	
        assertNotEquals(1, graph.numEdgesOfVertex("Washington"));

    	
    }
    
    @Test
    public void testIsAdjacent() {
    	
    	stageThree();
    	
    	
    	
    	assertTrue(graph.isAdjacent("Washington", "Kansas"));
    }
    
    @Test 
    public void testGetEdgesOfVertex() {
    	
    	stageThree();
    	
    	assertEquals(1, graph.numEdgesOfVertex("Washington"));
    }

}
