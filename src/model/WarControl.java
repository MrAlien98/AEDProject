package model;

import java.util.ArrayList;
import java.util.Arrays;
import dataStructure.*;
/**
 * This class represents the warControl that will lead the complete 
 * destruction of the world as we knows  
 * @author Brayan Garces
 */
public class WarControl {

	
	/**
	 * this constanst represent the amount of cities that the program use
	 * 
	 */
	public static final int BOMBPOINTS=24; 
	
	/**
	 * this constant is an array where we place all the cities 
	 */
	private BombingPoint[] bPoints;
	
	
	/*
	 * this constant represents the graph 
	 * 
	 * */
	private GraphByLists<BombingPoint, Integer> graph;

	/**
	 * 
	 * this is the constructor method of the WarControl class
	 * 
	 * */
	public WarControl() {
		bPoints= new BombingPoint[BOMBPOINTS];
		graph= new GraphByLists<>(BOMBPOINTS);
		fillingArrayMethod();
	}

	
	/**
	 *this method allows the program to fill up the array of cities
	 */
	public void fillingArrayMethod() {
		bPoints[0]= new BombingPoint("Washington");
		bPoints[1]= new BombingPoint("Kansas");
		bPoints[2]= new BombingPoint("CiudaddeMexico");
		bPoints[3]= new BombingPoint("Brasilia");
		bPoints[4]= new BombingPoint("RiodeJaneiro");
		bPoints[5]= new BombingPoint("Moscu");
		bPoints[6]= new BombingPoint("Krasnoyarsk");
		bPoints[7]= new BombingPoint("Pekin");
		bPoints[8]= new BombingPoint("HongKong");
		bPoints[9]= new BombingPoint("Camberra");
		bPoints[10]= new BombingPoint("NewDelhi");
		bPoints[11]= new BombingPoint("Teheran");
		bPoints[12]= new BombingPoint("Riad");
		bPoints[13]= new BombingPoint("BuenosAires");
		bPoints[14]= new BombingPoint("Astana");
		bPoints[15]= new BombingPoint("UlanBator");
		bPoints[16]= new BombingPoint("Argel");
		bPoints[17]= new BombingPoint("CiudadDelCabo");
		bPoints[18]= new BombingPoint("Bogota");
		bPoints[19]= new BombingPoint("Kinsasa");
		bPoints[20]= new BombingPoint("Ottawa");
		bPoints[21]= new BombingPoint("Alberta");
		bPoints[22]= new BombingPoint("Pretoria");
		bPoints[23]= new BombingPoint("Bloemfontein");
	
		fillingGraphMethod();
	}
	
	
	/**
	 * 
	 *this method allows the program to fill up the graph that we use 
	 * 
	 */
	public void fillingGraphMethod() {	
		for(int i=0; i<bPoints.length; i++) {
			graph.addVertex(bPoints[i]);
		}
		//Washington
		graph.addEdge(bPoints[0], bPoints[21], false, 3200, 0);
		graph.addEdge(bPoints[0], bPoints[5], false, 7812, 0);
		graph.addEdge(bPoints[0], bPoints[1], false, 1516, 0);
		graph.addEdge(bPoints[0], bPoints[18], false, 3819, 0);
		
		//Kansas
		graph.addEdge(bPoints[1], bPoints[0], false, 1516, 0);
		graph.addEdge(bPoints[1], bPoints[8], false, 12546, 0);
		

		//Ciudad de mexico
		graph.addEdge(bPoints[2], bPoints[13], false, 7383, 0);
		graph.addEdge(bPoints[2], bPoints[4], false,7672 , 0);
		
		//Brasilia
		graph.addEdge(bPoints[3], bPoints[20], false, 7347, 0);
		graph.addEdge(bPoints[3], bPoints[4], false,934 , 0);
		
		//Rio de Janeiro
		graph.addEdge(bPoints[4], bPoints[19], false,6594 , 0);
		graph.addEdge(bPoints[4], bPoints[15], false, 16155, 0);
		graph.addEdge(bPoints[4], bPoints[2], false, 7672, 0);
		
		//Moscu
		graph.addEdge(bPoints[5], bPoints[10], false,4335 , 0);
		graph.addEdge(bPoints[5], bPoints[0], false, 7812, 0);
		
		
		//Krasnoyarsk
		graph.addEdge(bPoints[6], bPoints[9], false, 11442, 0);
		
		
		//Pekin
		graph.addEdge(bPoints[7], bPoints[8], false, 1969, 0);
		graph.addEdge(bPoints[7], bPoints[10], false,3771 , 0);
		graph.addEdge(bPoints[7], bPoints[19], false, 11246, 0);
		
		//Hong-Kong
		graph.addEdge(bPoints[8], bPoints[17], false,11856 , 0);
		graph.addEdge(bPoints[8], bPoints[1], false, 12546, 0);
		
		//Camberra
		graph.addEdge(bPoints[9], bPoints[6], false,11442 , 0);
		graph.addEdge(bPoints[9], bPoints[10], false, 10340, 0);
		graph.addEdge(bPoints[9], bPoints[16], false,16949 , 0);

		//Nueva Delhi
		graph.addEdge(bPoints[10], bPoints[7], false, 3771, 0);
		graph.addEdge(bPoints[10], bPoints[22], false,7988 , 0);
		graph.addEdge(bPoints[10], bPoints[5], false,4335 , 0);
		graph.addEdge(bPoints[10], bPoints[9], false, 10340, 0);
		

		//Teheran
		graph.addEdge(bPoints[11], bPoints[21], false, 9965, 0);
		
		//Riad
		graph.addEdge(bPoints[12], bPoints[18], false,12824 , 0);

		//Buenos Aires
		graph.addEdge(bPoints[13], bPoints[2], false,7383 , 0);
		graph.addEdge(bPoints[13], bPoints[16], false, 10151, 0);
		graph.addEdge(bPoints[13], bPoints[23], false, 7758, 0);
		

		//Astana
		graph.addEdge(bPoints[14], bPoints[18], false,12982 , 0);
		
		//Ulab Bator
		graph.addEdge(bPoints[15], bPoints[4], false, 16155, 0);

		//Argel
		graph.addEdge(bPoints[16], bPoints[13], false, 10151, 0);
		graph.addEdge(bPoints[16], bPoints[9], false, 16949, 0);

		//Ciudad del Cabo
		graph.addEdge(bPoints[17], bPoints[23], false, 910, 0);
		graph.addEdge(bPoints[17], bPoints[8], false,11856 , 0);

		//Bogota
		graph.addEdge(bPoints[18], bPoints[14], false,12982 , 0);
		graph.addEdge(bPoints[18], bPoints[12], false,12824 , 0);
		graph.addEdge(bPoints[18], bPoints[0], false, 3819, 0);

		//Kinsasa
		graph.addEdge(bPoints[19], bPoints[4], false, 6594 , 0);
		graph.addEdge(bPoints[19], bPoints[7], false, 11246, 0);
		
		//Ottawa
		graph.addEdge(bPoints[20], bPoints[3], false, 7347 , 0);
		graph.addEdge(bPoints[20], bPoints[21], false,2844 , 0);
		

		//Alberta
		graph.addEdge(bPoints[21], bPoints[20], false, 2844, 0);
		graph.addEdge(bPoints[21], bPoints[0], false, 3200, 0);
		graph.addEdge(bPoints[21], bPoints[11], false,9965 , 0);

		//Pretoria
		graph.addEdge(bPoints[22], bPoints[10], false, 7988 , 0);
		graph.addEdge(bPoints[22], bPoints[23], false, 422 , 0);

		//Bloemfontein
		graph.addEdge(bPoints[23], bPoints[17], false,910 , 0);
		graph.addEdge(bPoints[23], bPoints[22], false, 422, 0);
		
	}

	/**
	 * method to get the aray of bombingPoints
	 * @return the array of bombingPoints  
	 */
	public BombingPoint[] getbPoints() {
		return bPoints;
	}

	/**
	 *method to modify the array of bombingPoints that represents the cities 
	 *@param a new array of bombingPoints
	 */
	public void setbPoints(BombingPoint[] bPoints) {
		this.bPoints = bPoints;
	}

	/**
	 *method to get the graph of BombingPoints
	 *@return the graph of bombingPoints 
	 */
	public GraphByLists<BombingPoint, Integer> getGraph() {
		return graph;
	}

	
	/**
	 *method to modify the graph of BombingPoints
	 *@param graph a new graph of BombingPoints
	 */
	public void setGraph(GraphByLists<BombingPoint, Integer> graph) {
		this.graph = graph;
	}
	
	
	/**
	 *method that return the path that represent the shorter path using the dijkstra algorithm
	 *@param start the starting point
	 *@param end the ending point
	 *@return an ArrayList that represents the shorter path
	 */
	public ArrayList<Vertex<BombingPoint>> getPath(Vertex<BombingPoint> start, Vertex<BombingPoint> end){
		MethodsGraphs<BombingPoint, Integer> meth= new MethodsGraphs<>();
		ArrayList<Vertex<BombingPoint>> path= meth.dijkstra(graph, start).creatingPath(start, end);
		return path;
	}
	
	/**
	 *method that return the path in a String that represent the shorter path using the dijkstra algorithm
	 *@param start the starting point
	 *@param end the ending point
	 *@return a String that represents the shorter path
	 */
	public String pathToString(Vertex<BombingPoint> start, Vertex<BombingPoint> end) {
		
		MethodsGraphs<BombingPoint,Integer> meth= new MethodsGraphs<>();
		
		ArrayList<Vertex<BombingPoint>> path = meth.dijkstra(graph, start).creatingPath(start, end);
		
		String pathS="";
		
		for (int i = 1; i < path.size(); i++) {
			
			Vertex<BombingPoint> a= path.get(i-1);
			Vertex<BombingPoint> b= path.get(i);
			
			pathS +=a.toString() + " --" +graph.edgesBetween(a.getValue(), b.getValue())+ "--> " + b.toString() + "\n" ;

			
			
		}
		 
		return pathS;
	}
	/**
	 *method that return minimun spam tree using the prim algoritm
	 *@return an Array that represents the minimun spam tree
	 */
	public int[] gethPathPrim() {
		
		MethodsGraphs<BombingPoint, Integer> meth= new MethodsGraphs<>();
		
		int[] pathIndex= meth.primP(graph, new Vertex<>(bPoints[0])).getPath();
		
		return pathIndex;
	}
	/**
	 *method that search a bombingPoint in the array of bombingPoints 
	 * @param id the string that idetifies the bombingPoint
	 * @return the bombingPoint or null if the bPoint is not finded
	 */
	public BombingPoint findBombingPoint(String id) {
		for(int i=0;i<bPoints.length;i++) {
			if(bPoints[i].getName().equalsIgnoreCase(id)){
				return bPoints[i];
			}
		}
		return null;
	}

}
