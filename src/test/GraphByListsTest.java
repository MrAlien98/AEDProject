package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dataStructure.GraphByLists;

/**
 * Class that test methods from the GraphByList class 
 * @author Julian Brito
 *
 */
public class GraphByListsTest {

		
		  GraphByLists<String,Integer> graph;

		
	     void stageOne() {
	    	
	    	graph = new GraphByLists<>(5);
	     }
	    
	    
		 
		
	     void stageTwo() {
	    	
	    	graph = new GraphByLists<>(3);
	    	

	    	String washington = new String("Washington");
	    	String kansas = new String("Kansas");
	    	
	    	graph.addVertex(kansas);
	    	graph.addVertex(washington);
	    
	     }
	    

	     void stageThree() {
	    	
	    	graph = new GraphByLists<>(3);
	    	

	    	String washington = new String("Washington");
	    	String kansas = new String("Kansas");
	    	
	    	graph.addVertex(kansas);
	    	graph.addVertex(washington);
	    
	    	graph.addEdge(washington, kansas, false, 328, 0);

	    
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
	    	String kansas = new String("Kansas");
	    
	    	graph.addEdge(washington, kansas, false, 328, 0);


	        assertEquals(1, graph.numEdgesOfVertex(washington));
	    }
	    
	   
	    
	    @Test
	     void testIsAdjacent() {
	    	
	    	stageThree();
	    	
	    	
	    	
	    	assertTrue(graph.isAdjacent("Washington", "Kansas"));
	    }
	    
	    @Test 
	     void testGetEdgesOfVertex() {
	    	
	    	stageThree();
	    	
	    	assertEquals(1, graph.numEdgesOfVertex("Washington"));
	    }
	    
}
