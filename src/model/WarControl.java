package model;

import java.util.ArrayList;
import java.util.Arrays;
import dataStructure.*;

public class WarControl {

	public static final int BOMBPOINTS=22;
	
	private BombingPoint[] bPoints;
	
	private GraphByLists<BombingPoint, Integer> graph;


	public WarControl() {
		bPoints= new BombingPoint[BOMBPOINTS];
		graph= new GraphByLists<>(BOMBPOINTS);
	}


	public void fillingArrayMethod() {
		bPoints[0]= new BombingPoint("Washington",0,0);
		bPoints[1]= new BombingPoint("New York",0,0);
		bPoints[2]= new BombingPoint("Ciudad de Mexico",0,0);
		bPoints[3]= new BombingPoint("Brasilia",0,0);
		bPoints[4]= new BombingPoint("Rio de Janeiro",0,0);
		bPoints[5]= new BombingPoint("Moscu",0,0);
		bPoints[6]= new BombingPoint("San Petersburgo",0,0);
		bPoints[7]= new BombingPoint("Pekin",0,0);
		bPoints[8]= new BombingPoint("Hong Kong",0,0);
		bPoints[9]= new BombingPoint("Canberra",0,0);
		bPoints[10]= new BombingPoint("Nueva Delhi",0,0);
		bPoints[11]= new BombingPoint("Teheran",0,0);
		bPoints[12]= new BombingPoint("Riad",0,0);
		bPoints[13]= new BombingPoint("Buenos Aires",0,0);
		bPoints[14]= new BombingPoint("Astana",0,0);
		bPoints[15]= new BombingPoint("Ulan Bator",0,0);
		bPoints[16]= new BombingPoint("Argel",0,0);
		bPoints[17]= new BombingPoint("ciudad del Cabo",0,0);
		bPoints[18]= new BombingPoint("Bogota",0,0);
		bPoints[19]= new BombingPoint("Kinshasa",0,0);
		bPoints[20]= new BombingPoint("Ottawa",0,0);
		bPoints[21]= new BombingPoint("Toronto",0,0);
		
	
		
	}
	
	public void fillingGraphMethod() {
		
		for(int i=0; i<bPoints.length; i++) {
			graph.addVertex(bPoints[0]);
			
		}
		
		//Washington
		graph.addEdge(bPoints[0], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[0], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[0], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[0], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[0], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[0], bPoints[6], false, 6723, 0);
		graph.addEdge(bPoints[0], bPoints[7], false, 7167, 0);
		graph.addEdge(bPoints[0], bPoints[8], false, 12123, 0);
		graph.addEdge(bPoints[0], bPoints[9], false, 12092, 0);
		graph.addEdge(bPoints[0], bPoints[10], false, 15923, 0);
		graph.addEdge(bPoints[0], bPoints[11], false, 12029, 0);
		graph.addEdge(bPoints[0], bPoints[12], false, 10164, 0);
		graph.addEdge(bPoints[0], bPoints[13], false, 10828, 0);
		graph.addEdge(bPoints[0], bPoints[14], false, 8345, 0);
		graph.addEdge(bPoints[0], bPoints[15], false, 9527, 0);
		graph.addEdge(bPoints[0], bPoints[16], false, 10341, 0);
		graph.addEdge(bPoints[0], bPoints[17], false, 6790, 0);
		graph.addEdge(bPoints[0], bPoints[18], false, 3819, 0);
		graph.addEdge(bPoints[0], bPoints[19], false, 10495, 0);
		graph.addEdge(bPoints[0], bPoints[20], false, 732, 0);
		graph.addEdge(bPoints[0], bPoints[21], false, 569, 0);
		
		//Nueva York
		graph.addEdge(bPoints[1], bPoints[0], false, 328, 0);
		graph.addEdge(bPoints[1], bPoints[2], false, 3500, 0);
		graph.addEdge(bPoints[1], bPoints[3], false, 7100, 0);
		graph.addEdge(bPoints[1], bPoints[4], false, 8100, 0);
		graph.addEdge(bPoints[1], bPoints[5], false,8000 , 0);
		graph.addEdge(bPoints[1], bPoints[6], false, 7300, 0);
		graph.addEdge(bPoints[1], bPoints[7], false, 12000, 0);
		graph.addEdge(bPoints[1], bPoints[8], false, 14000, 0);
		graph.addEdge(bPoints[1], bPoints[9], false, 16000, 0);
		graph.addEdge(bPoints[1], bPoints[10], false, 12000, 0);
		graph.addEdge(bPoints[1], bPoints[11], false, 11000, 0);
		graph.addEdge(bPoints[1], bPoints[12], false, 8500, 0);
		graph.addEdge(bPoints[1], bPoints[13], false, 10000, 0);
		graph.addEdge(bPoints[1], bPoints[14], false, 10500, 0);
		graph.addEdge(bPoints[1], bPoints[15], false, 6780, 0);
		graph.addEdge(bPoints[1], bPoints[16], false, 14000, 0);
		graph.addEdge(bPoints[1], bPoints[17], false, 4500, 0);
		graph.addEdge(bPoints[1], bPoints[18], false, 10700, 0);
		graph.addEdge(bPoints[1], bPoints[19], false, 12200, 0);
		graph.addEdge(bPoints[1], bPoints[20], false, 676, 0);
		graph.addEdge(bPoints[1], bPoints[21], false, 565, 0);
	
	
		//Ciudad de mexico
		graph.addEdge(bPoints[2], bPoints[0], false, 3027, 0);
		graph.addEdge(bPoints[2], bPoints[1], false, 3300, 0);
		graph.addEdge(bPoints[2], bPoints[3], false, 7000, 0);
		graph.addEdge(bPoints[2], bPoints[4], false, 7055, 0);
		graph.addEdge(bPoints[2], bPoints[5], false,12000 , 0);
		graph.addEdge(bPoints[2], bPoints[6], false, 11000, 0);
		graph.addEdge(bPoints[2], bPoints[7], false, 13500, 0);
		graph.addEdge(bPoints[2], bPoints[8], false, 16000, 0);
		graph.addEdge(bPoints[2], bPoints[9], false, 14000, 0);
		graph.addEdge(bPoints[2], bPoints[10], false, 13000, 0);
		graph.addEdge(bPoints[2], bPoints[11], false, 14500, 0);
		graph.addEdge(bPoints[2], bPoints[12], false, 8000, 0);
		graph.addEdge(bPoints[2], bPoints[13], false, 9000, 0);
		graph.addEdge(bPoints[2], bPoints[14], false, 11700, 0);
		graph.addEdge(bPoints[2], bPoints[15], false, 10000, 0);
		graph.addEdge(bPoints[2], bPoints[16], false, 14200, 0);
		graph.addEdge(bPoints[2], bPoints[17], false, 3700, 0);
		graph.addEdge(bPoints[2], bPoints[18], false, 13000, 0);
		graph.addEdge(bPoints[2], bPoints[19], false, 4100, 0);
		graph.addEdge(bPoints[2], bPoints[20], false, 3600, 0);
		graph.addEdge(bPoints[2], bPoints[21], false, 3280, 0);
	
		//Brasilia
		graph.addEdge(bPoints[3], bPoints[0], false, 7000, 0);
		graph.addEdge(bPoints[3], bPoints[1], false, 6700, 0);
		graph.addEdge(bPoints[3], bPoints[2], false, 6900, 0);
		graph.addEdge(bPoints[3], bPoints[4], false, 100, 0);
		graph.addEdge(bPoints[3], bPoints[5], false,8000 , 0);
		graph.addEdge(bPoints[3], bPoints[6], false, 8500, 0);
		graph.addEdge(bPoints[3], bPoints[7], false, 9000, 0);
		graph.addEdge(bPoints[3], bPoints[8], false, 10000, 0);
		graph.addEdge(bPoints[3], bPoints[9], false, 12000, 0);
		graph.addEdge(bPoints[3], bPoints[10], false, 10000, 0);
		graph.addEdge(bPoints[3], bPoints[11], false, 5600, 0);
		graph.addEdge(bPoints[3], bPoints[12], false, 7000, 0);
		graph.addEdge(bPoints[3], bPoints[13], false, 7809, 0);
		graph.addEdge(bPoints[3], bPoints[14], false, 9876, 0);
		graph.addEdge(bPoints[3], bPoints[15], false, 5642, 0);
		graph.addEdge(bPoints[3], bPoints[16], false, 9876, 0);
		graph.addEdge(bPoints[3], bPoints[17], false, 9876, 0);
		graph.addEdge(bPoints[3], bPoints[18], false, 9834, 0);
		graph.addEdge(bPoints[3], bPoints[19], false, 6000, 0);
		graph.addEdge(bPoints[3], bPoints[20], false, 7000, 0);
		graph.addEdge(bPoints[3], bPoints[21], false, 7300, 0);
	
		//Rio de Janeiro
		graph.addEdge(bPoints[4], bPoints[0], false, 7000, 0);
		graph.addEdge(bPoints[4], bPoints[1], false, 6700, 0);
		graph.addEdge(bPoints[4], bPoints[2], false, 6900, 0);
		graph.addEdge(bPoints[4], bPoints[4], false, 100, 0);
		graph.addEdge(bPoints[4], bPoints[5], false,8000 , 0);
		graph.addEdge(bPoints[4], bPoints[6], false, 8500, 0);
		graph.addEdge(bPoints[4], bPoints[7], false, 9000, 0);
		graph.addEdge(bPoints[4], bPoints[8], false, 10000, 0);
		graph.addEdge(bPoints[4], bPoints[9], false, 12000, 0);
		graph.addEdge(bPoints[4], bPoints[10], false, 10000, 0);
		graph.addEdge(bPoints[4], bPoints[11], false, 5600, 0);
		graph.addEdge(bPoints[4], bPoints[12], false, 7000, 0);
		graph.addEdge(bPoints[4], bPoints[13], false, 7809, 0);
		graph.addEdge(bPoints[4], bPoints[14], false, 9876, 0);
		graph.addEdge(bPoints[4], bPoints[15], false, 5642, 0);
		graph.addEdge(bPoints[4], bPoints[16], false, 9876, 0);
		graph.addEdge(bPoints[4], bPoints[17], false, 9876, 0);
		graph.addEdge(bPoints[4], bPoints[18], false, 9834, 0);
		graph.addEdge(bPoints[4], bPoints[19], false, 6000, 0);
		graph.addEdge(bPoints[4], bPoints[20], false, 7000, 0);
		graph.addEdge(bPoints[4], bPoints[21], false, 7300, 0);
		
		//Moscu
		graph.addEdge(bPoints[5], bPoints[1], false, 7600, 0);
		graph.addEdge(bPoints[5], bPoints[2], false, 7800, 0);
		graph.addEdge(bPoints[5], bPoints[3], false, 8000, 0);
		graph.addEdge(bPoints[5], bPoints[4], false, 11000, 0);
		graph.addEdge(bPoints[5], bPoints[5], false,10890 , 0);
		graph.addEdge(bPoints[5], bPoints[6], false, 300, 0);
		graph.addEdge(bPoints[5], bPoints[7], false, 4500, 0);
		graph.addEdge(bPoints[5], bPoints[8], false, 4650, 0);
		graph.addEdge(bPoints[5], bPoints[9], false, 7000, 0);
		graph.addEdge(bPoints[5], bPoints[10], false, 4500, 0);
		graph.addEdge(bPoints[5], bPoints[11], false, 5000, 0);
		graph.addEdge(bPoints[5], bPoints[12], false, 12000, 0);
		graph.addEdge(bPoints[5], bPoints[13], false, 5678, 0);
		graph.addEdge(bPoints[5], bPoints[14], false, 4578, 0);
		graph.addEdge(bPoints[5], bPoints[15], false, 7890, 0);
		graph.addEdge(bPoints[5], bPoints[16], false, 13000, 0);
		graph.addEdge(bPoints[5], bPoints[17], false, 7000, 0);
		graph.addEdge(bPoints[5], bPoints[18], false, 14500, 0);
		graph.addEdge(bPoints[5], bPoints[19], false, 7000, 0);
		graph.addEdge(bPoints[5], bPoints[20], false, 7200, 0);
		graph.addEdge(bPoints[5], bPoints[21], false, 9876, 0);
		
		//St Petersburgo
		graph.addEdge(bPoints[6], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[6], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[6], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[6], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[6], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[6], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[6], bPoints[21], false, 328.0, 0);
		
		//Pekin
		graph.addEdge(bPoints[7], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[7], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[7], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[7], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[7], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[7], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[7], bPoints[21], false, 328.0, 0);
		
		//Hong-Kong
		graph.addEdge(bPoints[8], bPoints[0], false, 328, 0);
		graph.addEdge(bPoints[8], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[8], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[8], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[8], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[8], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[8], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[8], bPoints[21], false, 328.0, 0);
		
		//Canberra
		graph.addEdge(bPoints[9], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[9], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[9], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[9], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[9], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[9], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[9], bPoints[21], false, 328.0, 0);
		
		//Nueva Delhi
		graph.addEdge(bPoints[10], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[10], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[10], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[10], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[10], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[10], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[10], bPoints[21], false, 328.0, 0);
		
		//Teheran
		graph.addEdge(bPoints[11], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[11], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[11], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[11], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[11], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[11], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[11], bPoints[21], false, 328.0, 0);
		
		//Riad
		graph.addEdge(bPoints[12], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[12], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[12], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[12], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[12], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[12], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[12], bPoints[21], false, 328.0, 0);
		
		//Buenos Aires
		graph.addEdge(bPoints[13], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[13], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[13], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[13], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[13], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[13], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[13], bPoints[21], false, 328.0, 0);
		
		//Astana
		graph.addEdge(bPoints[14], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[14], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[14], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[14], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[14], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[14], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[14], bPoints[21], false, 328.0, 0);
		
		//Ulab Bator
		graph.addEdge(bPoints[15], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[15], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[15], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[15], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[15], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[15], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[15], bPoints[21], false, 328.0, 0);
		
		//Argel
		graph.addEdge(bPoints[16], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[16], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[16], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[16], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[16], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[16], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[16], bPoints[21], false, 328.0, 0);
		
		//Ciudad del Cabo
		graph.addEdge(bPoints[17], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[17], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[17], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[17], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[17], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[17], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[17], bPoints[21], false, 328.0, 0);
		
		//Bogota
		graph.addEdge(bPoints[18], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[18], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[18], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[18], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[18], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[18], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[18], bPoints[21], false, 328.0, 0);
		
		//Kinsasa
		graph.addEdge(bPoints[19], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[19], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[19], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[19], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[19], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[19], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[20], false, 328.0, 0);
		graph.addEdge(bPoints[19], bPoints[21], false, 328.0, 0);
	
		//Ottawa
		graph.addEdge(bPoints[20], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[20], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[20], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[20], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[20], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[20], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[20], bPoints[21], false, 328.0, 0);
		
		//Toronto
		graph.addEdge(bPoints[21], bPoints[0], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[1], false, 328, 0);
		graph.addEdge(bPoints[21], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[21], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[21], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[21], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[21], bPoints[6], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[7], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[8], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[9], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[10], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[11], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[12], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[13], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[14], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[15], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[16], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[17], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[18], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[19], false, 328.0, 0);
		graph.addEdge(bPoints[21], bPoints[20], false, 328.0, 0);
		
	}



}
