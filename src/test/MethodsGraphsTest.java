package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import dataStructure.GraphByLists;
import dataStructure.GraphByMatrix;
import dataStructure.MethodsGraphs;
import dataStructure.Vertex;

class MethodsGraphsTest {

	GraphByLists<Integer, Integer> graphList;
	GraphByMatrix<Integer, Integer> graphMatrix;
	MethodsGraphs<Integer, Integer> mG;

	public void stageOne() {

		mG = new MethodsGraphs<>();
		graphList = new GraphByLists<>(5);
		Integer v1 = 13;
		Integer v2 = 8;
		Integer v3 = 9;
		Integer v4 = 21;
		Integer v5 = 5;

		graphList.addVertex(v1);
		graphList.addVertex(v2);
		graphList.addVertex(v3);
		graphList.addVertex(v4);
		graphList.addVertex(v5);

		graphList.addEdge(v1, v2, false, 5, 1);
		graphList.addEdge(v1, v4, false, 4, 2);
		graphList.addEdge(v1, v5, false, 2, 3);
		graphList.addEdge(v2, v3, false, 1, 4);
		graphList.addEdge(v3, v4, false, 4, 5);
		graphList.addEdge(v4, v5, false, 3, 6);

	}

	public void stageTwo() {

		mG = new MethodsGraphs<>();
		graphMatrix = new GraphByMatrix<>(5);
		Integer v1 = 13;
		Integer v2 = 8;
		Integer v3 = 9;
		Integer v4 = 21;
		Integer v5 = 5;

		graphMatrix.addVertex(v1);
		graphMatrix.addVertex(v2);
		graphMatrix.addVertex(v3);
		graphMatrix.addVertex(v4);
		graphMatrix.addVertex(v5);

		graphMatrix.addEdge(v1, v2, false, 5, 1);
		graphMatrix.addEdge(v1, v4, false, 4, 2);
		graphMatrix.addEdge(v1, v5, false, 2, 3);
		graphMatrix.addEdge(v2, v3, false, 1, 4);
		graphMatrix.addEdge(v3, v4, false, 4, 5);
		graphMatrix.addEdge(v4, v5, false, 3, 6);
	}

	public void stageThree() {

		mG = new MethodsGraphs<>();
		graphList = new GraphByLists<>(5);
		Integer v1 = 13;
		Integer v2 = 8;
		Integer v3 = 9;
		Integer v4 = 21;
		Integer v5 = 5;

		graphList.addVertex(v1);
		graphList.addVertex(v2);
		graphList.addVertex(v3);
		graphList.addVertex(v4);
		graphList.addVertex(v5);

		graphList.addEdge(v1, v2, false, 5, 1);
		graphList.addEdge(v1, v4, false, 4, 2);
		graphList.addEdge(v1, v5, false, 2, 3);
		graphList.addEdge(v2, v3, false, 1, 4);
		graphList.addEdge(v4, v5, false, 3, 5);

	}

	public void stageFour() {

		mG = new MethodsGraphs<>();
		graphMatrix = new GraphByMatrix<>(5);
		Integer v1 = 13;
		Integer v2 = 8;
		Integer v3 = 9;
		Integer v4 = 21;
		Integer v5 = 5;

		graphMatrix.addVertex(v1);
		graphMatrix.addVertex(v2);
		graphMatrix.addVertex(v3);
		graphMatrix.addVertex(v4);
		graphMatrix.addVertex(v5);

		graphMatrix.addEdge(v1, v2, false, 5, 1);
		graphMatrix.addEdge(v1, v4, false, 4, 2);
		graphMatrix.addEdge(v1, v5, false, 2, 3);
		graphMatrix.addEdge(v2, v3, false, 1, 4);
		graphMatrix.addEdge(v4, v5, false, 3, 5);

	}

	// Stage for checked the method prim in the GraphByMatrix
	public void stageFive() {
		mG = new MethodsGraphs<>();
		graphMatrix = new GraphByMatrix<>(8);
		Integer v0 = 0;
		Integer v1 = 1;
		Integer v2 = 2;
		Integer v3 = 3;
		Integer v4 = 4;
		Integer v5 = 5;
		Integer v6 = 6;
		Integer v7 = 7;

		graphMatrix.addVertex(v0);
		graphMatrix.addVertex(v1);
		graphMatrix.addVertex(v2);
		graphMatrix.addVertex(v3);
		graphMatrix.addVertex(v4);
		graphMatrix.addVertex(v5);
		graphMatrix.addVertex(v6);
		graphMatrix.addVertex(v7);

		graphMatrix.addEdge(v0, v1, false, 1, 0);
		graphMatrix.addEdge(v0, v2, false, 5, 0);
		graphMatrix.addEdge(v1, v3, false, 3, 0);
		graphMatrix.addEdge(v1, v6, false, 5, 0);
		graphMatrix.addEdge(v2, v6, false, 6, 0);
		graphMatrix.addEdge(v3, v5, false, 2, 0);
		graphMatrix.addEdge(v3, v7, false, 7, 0);
		graphMatrix.addEdge(v7, v4, false, 9, 0);
		graphMatrix.addEdge(v6, v4, false, 5, 0);
	}

	// Stage for checked the method prim in the GraphByLists
	public void stageSix() {

		mG = new MethodsGraphs<>();
		graphList = new GraphByLists<>(8);
		Integer v0 = 0;
		Integer v1 = 1;
		Integer v2 = 2;
		Integer v3 = 3;
		Integer v4 = 4;
		Integer v5 = 5;
		Integer v6 = 6;
		Integer v7 = 7;

		graphList.addVertex(v0);
		graphList.addVertex(v1);
		graphList.addVertex(v2);
		graphList.addVertex(v3);
		graphList.addVertex(v4);
		graphList.addVertex(v5);
		graphList.addVertex(v6);
		graphList.addVertex(v7);

		graphList.addEdge(v0, v1, false, 1, 0);
		graphList.addEdge(v0, v2, false, 5, 0);
		graphList.addEdge(v1, v3, false, 3, 0);
		graphList.addEdge(v1, v6, false, 5, 0);
		graphList.addEdge(v2, v6, false, 6, 0);
		graphList.addEdge(v3, v5, false, 2, 0);
		graphList.addEdge(v3, v7, false, 7, 0);
		graphList.addEdge(v7, v4, false, 9, 0);
		graphList.addEdge(v6, v4, false, 5, 0);

	}
	
	// Stage for checked the method kruskal in the GraphByMatrix
	public void stageSeven() {
		
		mG = new MethodsGraphs<>();
		graphMatrix = new GraphByMatrix<>(8);
		Integer v0 = 0;
		Integer v1 = 1;
		Integer v2 = 2;
		Integer v3 = 3;
		Integer v4 = 4;
		Integer v5 = 5;
		Integer v6 = 6;
		Integer v7 = 7;

		graphMatrix.addVertex(v0);
		graphMatrix.addVertex(v1);
		graphMatrix.addVertex(v2);
		graphMatrix.addVertex(v3);
		graphMatrix.addVertex(v4);
		graphMatrix.addVertex(v5);
		graphMatrix.addVertex(v6);
		graphMatrix.addVertex(v7);
		
		graphMatrix.addEdge(v0, v1, false, 4, 0);
		graphMatrix.addEdge(v0, v2, false, 9, 0);
		graphMatrix.addEdge(v1, v3, false, 7, 0);
		graphMatrix.addEdge(v1, v2, false, 7, 0);
		graphMatrix.addEdge(v1, v5, false, 4, 0);
		graphMatrix.addEdge(v1, v6, false, 2, 0);
		graphMatrix.addEdge(v2, v4, false, 6, 0);
		graphMatrix.addEdge(v2, v6, false, 7, 0);
		graphMatrix.addEdge(v3, v5, false, 9, 0);
		graphMatrix.addEdge(v3, v7, false, 6, 0);
		graphMatrix.addEdge(v4, v6, false, 3, 0);
		graphMatrix.addEdge(v5, v6, false, 2, 0);
		graphMatrix.addEdge(v6, v7, false, 2, 0);
	}
	
	
	// Stage for checked the method kruskal in the GraphByLists
	
	public void stageEight() {
		
		mG = new MethodsGraphs<>();
		graphList = new GraphByLists<>(8);
		Integer v0 = 0;
		Integer v1 = 1;
		Integer v2 = 2;
		Integer v3 = 3;
		Integer v4 = 4;
		Integer v5 = 5;
		Integer v6 = 6;
		Integer v7 = 7;

		graphList.addVertex(v0);
		graphList.addVertex(v1);
		graphList.addVertex(v2);
		graphList.addVertex(v3);
		graphList.addVertex(v4);
		graphList.addVertex(v5);
		graphList.addVertex(v6);
		graphList.addVertex(v7);
		
		graphList.addEdge(v0, v1, false, 4, 0);
		graphList.addEdge(v0, v2, false, 9, 0);
		graphList.addEdge(v1, v3, false, 7, 0);
		graphList.addEdge(v1, v2, false, 7, 0);
		graphList.addEdge(v1, v5, false, 4, 0);
		graphList.addEdge(v1, v6, false, 2, 0);
		graphList.addEdge(v2, v4, false, 6, 0);
		graphList.addEdge(v2, v6, false, 7, 0);
		graphList.addEdge(v3, v5, false, 9, 0);
		graphList.addEdge(v3, v7, false, 6, 0);
		graphList.addEdge(v4, v6, false, 3, 0);
		graphList.addEdge(v5, v6, false, 2, 0);
		graphList.addEdge(v6, v7, false, 2, 0);
	}
	

	
}
