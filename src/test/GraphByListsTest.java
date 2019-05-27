package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dataStructure.GraphByLists;

class GraphByListsTest {

		
		  GraphByLists<String,Integer> graph;

		
	     void stageOne() {
	    	
	    	graph = new GraphByLists<>(5);
	     }
	    
	    
		 
		
	     void stageTwo() {
	    	
	    	graph = new GraphByLists<>(3);
	    	

	    	String washington = new String("Washington");
	    	String moscu = new String("Moscu");
	    	
	    	graph.addVertex(moscu);
	    	graph.addVertex(washington);
	    
	     }
	    

	     void stageThree() {
	    	
	    	graph = new GraphByLists<>(3);
	    	

	    	String washington = new String("Washington");
	    	String moscu = new String("Moscu");
	    	
	    	graph.addVertex(moscu);
	    	graph.addVertex(washington);
	    
	    	graph.addEdge(washington, moscu, true, 1333, 0);
	    	graph.addEdge(washington, moscu, true, 1000, 0);
	    
	     }
	    
	    
	    
	    @Test
	     void testAddVertex() {
	    	
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
	    	String moscu = new String("Moscu");
	    
	    	graph.addEdge(washington, moscu, true, 1333, 0);
	    	graph.addEdge(washington, moscu, true, 1000, 0);

	        assertEquals(2, graph.numEdgesOfVertex(washington));
	    }
	    
	   
	    
	    @Test
	     void testIsAdjacent() {
	    	
	    	stageThree();
	    	
	    	
	    	
	    	assertTrue(graph.isAdjacent("Washington", "Moscu"));
	    }
	    
	    @Test 
	     void testGetEdgesOfVertex() {
	    	
	    	stageThree();
	    	
	    	assertEquals(2, graph.numEdgesOfVertex("Washington"));
	    }
	    
}
