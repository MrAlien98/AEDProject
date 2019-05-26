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
		fillingArrayMethod();
	}


	public void fillingArrayMethod() {
		bPoints[0]= new BombingPoint("Washington",0,0);
		bPoints[1]= new BombingPoint("Kansas",0,0);
		bPoints[2]= new BombingPoint("CiudaddeMexico",0,0);
		bPoints[3]= new BombingPoint("Brasilia",0,0);
		bPoints[4]= new BombingPoint("RiodeJaneiro",0,0);
		bPoints[5]= new BombingPoint("Moscu",0,0);
		bPoints[6]= new BombingPoint("Krasnoyarsk",0,0);
		bPoints[7]= new BombingPoint("Pekin",0,0);
		bPoints[8]= new BombingPoint("Hong Kong",0,0);
		bPoints[9]= new BombingPoint("Canberra",0,0);
		bPoints[10]= new BombingPoint("NuevaDelhi",0,0);
		bPoints[11]= new BombingPoint("Teheran",0,0);
		bPoints[12]= new BombingPoint("Riad",0,0);
		bPoints[13]= new BombingPoint("BuenosAires",0,0);
		bPoints[14]= new BombingPoint("Astana",0,0);
		bPoints[15]= new BombingPoint("UlanBator",0,0);
		bPoints[16]= new BombingPoint("Argel",0,0);
		bPoints[17]= new BombingPoint("ciudaddelCabo",0,0);
		bPoints[18]= new BombingPoint("Bogota",0,0);
		bPoints[19]= new BombingPoint("Kinshasa",0,0);
		bPoints[20]= new BombingPoint("Ottawa",0,0);
		bPoints[21]= new BombingPoint("Alberta",0,0);
		
	
		fillingGraphMethod();
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
		
		//Kansas
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
		graph.addEdge(bPoints[3], bPoints[13], false, 2900, 0);
		graph.addEdge(bPoints[3], bPoints[14], false, 7652, 0);
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
		graph.addEdge(bPoints[4], bPoints[13], false, 3009, 0);
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
		graph.addEdge(bPoints[5], bPoints[6], false, 4000, 0);
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
		graph.addEdge(bPoints[6], bPoints[1], false, 12345, 0);
		graph.addEdge(bPoints[6], bPoints[2], false, 18765, 0);
		graph.addEdge(bPoints[6], bPoints[3], false, 15432, 0);
		graph.addEdge(bPoints[6], bPoints[4], false, 16543, 0);
		graph.addEdge(bPoints[6], bPoints[5], false,9765, 0);
		graph.addEdge(bPoints[6], bPoints[6], false, 12986, 0);
		graph.addEdge(bPoints[6], bPoints[7], false, 9876, 0);
		graph.addEdge(bPoints[6], bPoints[8], false, 9457, 0);
		graph.addEdge(bPoints[6], bPoints[9], false, 6499, 0);
		graph.addEdge(bPoints[6], bPoints[10], false, 9876.0, 0);
		graph.addEdge(bPoints[6], bPoints[11], false, 14570, 0);
		graph.addEdge(bPoints[6], bPoints[12], false, 8765, 0);
		graph.addEdge(bPoints[6], bPoints[13], false, 9876, 0);
		graph.addEdge(bPoints[6], bPoints[14], false, 16543, 0);
		graph.addEdge(bPoints[6], bPoints[15], false, 12987, 0);
		graph.addEdge(bPoints[6], bPoints[16], false, 17545, 0);
		graph.addEdge(bPoints[6], bPoints[17], false, 12850, 0);
		graph.addEdge(bPoints[6], bPoints[18], false, 13654, 0);
		graph.addEdge(bPoints[6], bPoints[19], false, 18654, 0);
		graph.addEdge(bPoints[6], bPoints[20], false, 98765, 0);
		graph.addEdge(bPoints[6], bPoints[21], false, 6789, 0);
		
		//Pekin
		graph.addEdge(bPoints[7], bPoints[1], false, 7654,0);
		graph.addEdge(bPoints[7], bPoints[2], false, 7456, 0);
		graph.addEdge(bPoints[7], bPoints[3], false, 9345, 0);
		graph.addEdge(bPoints[7], bPoints[4], false, 9876, 0);
		graph.addEdge(bPoints[7], bPoints[5], false,11345 , 0);
		graph.addEdge(bPoints[7], bPoints[6], false, 16543, 0);
		graph.addEdge(bPoints[7], bPoints[7], false, 17654, 0);
		graph.addEdge(bPoints[7], bPoints[8], false, 13567, 0);
		graph.addEdge(bPoints[7], bPoints[9], false, 11245, 0);
		graph.addEdge(bPoints[7], bPoints[10], false, 8543, 0);
		graph.addEdge(bPoints[7], bPoints[11], false, 9765, 0);
		graph.addEdge(bPoints[7], bPoints[12], false, 10765, 0);
		graph.addEdge(bPoints[7], bPoints[13], false, 12875, 0);
		graph.addEdge(bPoints[7], bPoints[14], false, 15678, 0);
		graph.addEdge(bPoints[7], bPoints[15], false, 9876, 0);
		graph.addEdge(bPoints[7], bPoints[16], false, 9567, 0);
		graph.addEdge(bPoints[7], bPoints[17], false, 12345, 0);
		graph.addEdge(bPoints[7], bPoints[18], false, 11876, 0);
		graph.addEdge(bPoints[7], bPoints[19], false, 10987, 0);
		graph.addEdge(bPoints[7], bPoints[20], false, 9285, 0);
		graph.addEdge(bPoints[7], bPoints[21], false, 9712, 0);
		
		//Hong-Kong
		graph.addEdge(bPoints[8], bPoints[0], false, 9875, 0);
		graph.addEdge(bPoints[8], bPoints[1], false, 12987, 0);
		graph.addEdge(bPoints[8], bPoints[2], false, 10765, 0);
		graph.addEdge(bPoints[8], bPoints[3], false, 12876, 0);
		graph.addEdge(bPoints[8], bPoints[4], false, 11345, 0);
		graph.addEdge(bPoints[8], bPoints[5], false, 9876, 0);
		graph.addEdge(bPoints[8], bPoints[6], false, 9456, 0);
		graph.addEdge(bPoints[8], bPoints[7], false, 7934, 0);
		graph.addEdge(bPoints[8], bPoints[9], false, 12876, 0);
		graph.addEdge(bPoints[8], bPoints[10], false, 9876, 0);
		graph.addEdge(bPoints[8], bPoints[11], false, 9123, 0);
		graph.addEdge(bPoints[8], bPoints[12], false, 13987, 0);
		graph.addEdge(bPoints[8], bPoints[13], false, 12345, 0);
		graph.addEdge(bPoints[8], bPoints[14], false, 10987, 0);
		graph.addEdge(bPoints[8], bPoints[15], false, 11654, 0);
		graph.addEdge(bPoints[8], bPoints[16], false, 12976, 0);
		graph.addEdge(bPoints[8], bPoints[17], false, 10987, 0);
		graph.addEdge(bPoints[8], bPoints[18], false, 11234, 0);
		graph.addEdge(bPoints[8], bPoints[19], false, 9678, 0);
		graph.addEdge(bPoints[8], bPoints[20], false, 8656, 0);
		graph.addEdge(bPoints[8], bPoints[21], false, 7854, 0);
		
		//Canberra
		graph.addEdge(bPoints[9], bPoints[0], false, 8965, 0);
		graph.addEdge(bPoints[9], bPoints[1], false, 9345, 0);
		graph.addEdge(bPoints[9], bPoints[2], false, 11987, 0);
		graph.addEdge(bPoints[9], bPoints[3], false, 7645, 0);
		graph.addEdge(bPoints[9], bPoints[4], false, 7896, 0);
		graph.addEdge(bPoints[9], bPoints[5], false,9087, 0);
		graph.addEdge(bPoints[9], bPoints[6], false, 12345, 0);
		graph.addEdge(bPoints[9], bPoints[7], false, 11233, 0);
		graph.addEdge(bPoints[9], bPoints[8], false, 10987, 0);
		graph.addEdge(bPoints[9], bPoints[10], false, 9456, 0);
		graph.addEdge(bPoints[9], bPoints[11], false, 16543, 0);
		graph.addEdge(bPoints[9], bPoints[12], false, 9876, 0);
		graph.addEdge(bPoints[9], bPoints[13], false, 9820, 0);
		graph.addEdge(bPoints[9], bPoints[14], false, 14324, 0);
		graph.addEdge(bPoints[9], bPoints[15], false, 8907, 0);
		graph.addEdge(bPoints[9], bPoints[16], false, 6799, 0);
		graph.addEdge(bPoints[9], bPoints[17], false, 8976, 0);
		graph.addEdge(bPoints[9], bPoints[18], false, 12344, 0);
		graph.addEdge(bPoints[9], bPoints[19], false, 9876, 0);
		graph.addEdge(bPoints[9], bPoints[20], false, 10987, 0);
		graph.addEdge(bPoints[9], bPoints[21], false, 11234, 0);
		
		//Nueva Delhi
		graph.addEdge(bPoints[10], bPoints[0], false, 9876, 0);
		graph.addEdge(bPoints[10], bPoints[1], false, 11234, 0);
		graph.addEdge(bPoints[10], bPoints[2], false, 14567, 0);
		graph.addEdge(bPoints[10], bPoints[3], false, 16543, 0);
		graph.addEdge(bPoints[10], bPoints[4], false, 12345, 0);
		graph.addEdge(bPoints[10], bPoints[5], false, 19872, 0);
		graph.addEdge(bPoints[10], bPoints[6], false, 14567, 0);
		graph.addEdge(bPoints[10], bPoints[7], false, 9876, 0);
		graph.addEdge(bPoints[10], bPoints[8], false, 9134, 0);
		graph.addEdge(bPoints[10], bPoints[9], false, 13245, 0);
		graph.addEdge(bPoints[10], bPoints[11], false, 12345, 0);
		graph.addEdge(bPoints[10], bPoints[12], false, 10973, 0);
		graph.addEdge(bPoints[10], bPoints[13], false, 9567, 0);
		graph.addEdge(bPoints[10], bPoints[14], false, 9873, 0);
		graph.addEdge(bPoints[10], bPoints[15], false, 12345, 0);
		graph.addEdge(bPoints[10], bPoints[16], false, 11345, 0);
		graph.addEdge(bPoints[10], bPoints[17], false, 10987, 0);
		graph.addEdge(bPoints[10], bPoints[18], false, 9876, 0);
		graph.addEdge(bPoints[10], bPoints[19], false, 9012, 0);
		graph.addEdge(bPoints[10], bPoints[20], false, 9054, 0);
		graph.addEdge(bPoints[10], bPoints[21], false, 14234, 0);
		
		//Teheran
		graph.addEdge(bPoints[11], bPoints[0], false, 9567, 0);
		graph.addEdge(bPoints[11], bPoints[1], false, 9812, 0);
		graph.addEdge(bPoints[11], bPoints[2], false, 12345, 0);
		graph.addEdge(bPoints[11], bPoints[3], false, 11987, 0);
		graph.addEdge(bPoints[11], bPoints[4], false, 10987, 0);
		graph.addEdge(bPoints[11], bPoints[5], false,6789, 0);
		graph.addEdge(bPoints[11], bPoints[6], false, 8976, 0);
		graph.addEdge(bPoints[11], bPoints[7], false, 7098, 0);
		graph.addEdge(bPoints[11], bPoints[8], false, 8765, 0);
		graph.addEdge(bPoints[11], bPoints[9], false, 9000, 0);
		graph.addEdge(bPoints[11], bPoints[10], false, 12345, 0);
		graph.addEdge(bPoints[11], bPoints[12], false, 11234, 0);
		graph.addEdge(bPoints[11], bPoints[13], false, 9127, 0);
		graph.addEdge(bPoints[11], bPoints[14], false, 9812, 0);
		graph.addEdge(bPoints[11], bPoints[15], false, 14327, 0);
		graph.addEdge(bPoints[11], bPoints[16], false, 12456, 0);
		graph.addEdge(bPoints[11], bPoints[17], false, 9345, 0);
		graph.addEdge(bPoints[11], bPoints[18], false, 7895, 0);
		graph.addEdge(bPoints[11], bPoints[19], false, 9876, 0);
		graph.addEdge(bPoints[11], bPoints[20], false, 9999, 0);
		graph.addEdge(bPoints[11], bPoints[21], false, 12345, 0);
		
		//Riad
		graph.addEdge(bPoints[12], bPoints[0], false, 13567, 0);
		graph.addEdge(bPoints[12], bPoints[1], false, 12345, 0);
		graph.addEdge(bPoints[12], bPoints[2], false, 9876, 0);
		graph.addEdge(bPoints[12], bPoints[3], false, 7457, 0);
		graph.addEdge(bPoints[12], bPoints[4], false, 7654, 0);
		graph.addEdge(bPoints[12], bPoints[5], false, 5673, 0);
		graph.addEdge(bPoints[12], bPoints[6], false, 76535, 0);
		graph.addEdge(bPoints[12], bPoints[7], false, 3456, 0);
		graph.addEdge(bPoints[12], bPoints[8], false, 76543, 0);
		graph.addEdge(bPoints[12], bPoints[9], false, 8999, 0);
		graph.addEdge(bPoints[12], bPoints[10], false, 9987, 0);
		graph.addEdge(bPoints[12], bPoints[11], false, 10345, 0);
		graph.addEdge(bPoints[12], bPoints[13], false, 12455, 0);
		graph.addEdge(bPoints[12], bPoints[14], false, 12345, 0);
		graph.addEdge(bPoints[12], bPoints[15], false, 9087, 0);
		graph.addEdge(bPoints[12], bPoints[16], false, 12345, 0);
		graph.addEdge(bPoints[12], bPoints[17], false, 10234, 0);
		graph.addEdge(bPoints[12], bPoints[18], false, 12344, 0);
		graph.addEdge(bPoints[12], bPoints[19], false, 10763, 0);
		graph.addEdge(bPoints[12], bPoints[20], false, 8765, 0);
		graph.addEdge(bPoints[12], bPoints[21], false, 9876, 0);
		
		//Buenos Aires
		graph.addEdge(bPoints[13], bPoints[0], false, 12357, 0);
		graph.addEdge(bPoints[13], bPoints[1], false, 10233, 0);
		graph.addEdge(bPoints[13], bPoints[2], false, 10087, 0);
		graph.addEdge(bPoints[13], bPoints[3], false, 12567, 0);
		graph.addEdge(bPoints[13], bPoints[4], false, 14211, 0);
		graph.addEdge(bPoints[13], bPoints[5], false, 5678, 0);
		graph.addEdge(bPoints[13], bPoints[6], false, 9876, 0);
		graph.addEdge(bPoints[13], bPoints[7], false, 7654, 0);
		graph.addEdge(bPoints[13], bPoints[8], false, 10876, 0);
		graph.addEdge(bPoints[13], bPoints[9], false, 11987, 0);
		graph.addEdge(bPoints[13], bPoints[10], false, 6789, 0);
		graph.addEdge(bPoints[13], bPoints[11], false, 9876, 0);
		graph.addEdge(bPoints[13], bPoints[12], false, 5647, 0);
		graph.addEdge(bPoints[13], bPoints[14], false, 13456, 0);
		graph.addEdge(bPoints[13], bPoints[15], false, 10654, 0);
		graph.addEdge(bPoints[13], bPoints[16], false, 11234, 0);
		graph.addEdge(bPoints[13], bPoints[17], false, 14678, 0);
		graph.addEdge(bPoints[13], bPoints[18], false, 3456, 0);
		graph.addEdge(bPoints[13], bPoints[19], false, 16893, 0);
		graph.addEdge(bPoints[13], bPoints[20], false, 7899, 0);
		graph.addEdge(bPoints[13], bPoints[21], false, 98760, 0);
		
		//Astana
		graph.addEdge(bPoints[14], bPoints[0], false, 9872, 0);
		graph.addEdge(bPoints[14], bPoints[1], false, 11345, 0);
		graph.addEdge(bPoints[14], bPoints[2], false, 12456, 0);
		graph.addEdge(bPoints[14], bPoints[3], false, 15432, 0);
		graph.addEdge(bPoints[14], bPoints[4], false, 6789, 0);
		graph.addEdge(bPoints[14], bPoints[5], false,9876, 0);
		graph.addEdge(bPoints[14], bPoints[6], false, 11234, 0);
		graph.addEdge(bPoints[14], bPoints[7], false, 9876, 0);
		graph.addEdge(bPoints[14], bPoints[8], false, 7895, 0);
		graph.addEdge(bPoints[14], bPoints[9], false, 8678, 0);
		graph.addEdge(bPoints[14], bPoints[10], false, 9865, 0);
		graph.addEdge(bPoints[14], bPoints[11], false, 8765, 0);
		graph.addEdge(bPoints[14], bPoints[12], false, 5678, 0);
		graph.addEdge(bPoints[14], bPoints[13], false, 9873, 0);
		graph.addEdge(bPoints[14], bPoints[15], false, 15432, 0);
		graph.addEdge(bPoints[14], bPoints[16], false, 16543, 0);
		graph.addEdge(bPoints[14], bPoints[17], false, 12988, 0);
		graph.addEdge(bPoints[14], bPoints[18], false, 13455, 0);
		graph.addEdge(bPoints[14], bPoints[19], false, 5678, 0);
		graph.addEdge(bPoints[14], bPoints[20], false, 9865, 0);
		graph.addEdge(bPoints[14], bPoints[21], false, 6547, 0);
		
		//Ulab Bator
		graph.addEdge(bPoints[15], bPoints[0], false, 8765, 0);
		graph.addEdge(bPoints[15], bPoints[1], false, 7653, 0);
		graph.addEdge(bPoints[15], bPoints[2], false, 13453, 0);
		graph.addEdge(bPoints[15], bPoints[3], false, 15432, 0);
		graph.addEdge(bPoints[15], bPoints[4], false, 9876, 0);
		graph.addEdge(bPoints[15], bPoints[5], false,45678 , 0);
		graph.addEdge(bPoints[15], bPoints[6], false, 9876, 0);
		graph.addEdge(bPoints[15], bPoints[7], false, 9634, 0);
		graph.addEdge(bPoints[15], bPoints[8], false, 8762, 0);
		graph.addEdge(bPoints[15], bPoints[9], false, 8743, 0);
		graph.addEdge(bPoints[15], bPoints[10], false, 4567, 0);
		graph.addEdge(bPoints[15], bPoints[11], false, 8765, 0);
		graph.addEdge(bPoints[15], bPoints[12], false, 6574, 0);
		graph.addEdge(bPoints[15], bPoints[13], false, 10987, 0);
		graph.addEdge(bPoints[15], bPoints[14], false, 12098, 0);
		graph.addEdge(bPoints[15], bPoints[16], false, 10234, 0);
		graph.addEdge(bPoints[15], bPoints[17], false, 11234, 0);
		graph.addEdge(bPoints[15], bPoints[18], false, 6082, 0);
		graph.addEdge(bPoints[15], bPoints[19], false, 9566, 0);
		graph.addEdge(bPoints[15], bPoints[20], false, 9876, 0);
		graph.addEdge(bPoints[15], bPoints[21], false, 6790, 0);
		
		//Argel
		graph.addEdge(bPoints[16], bPoints[1], false, 8990, 0);
		graph.addEdge(bPoints[16], bPoints[2], false, 6789, 0);
		graph.addEdge(bPoints[16], bPoints[3], false, 8765, 0);
		graph.addEdge(bPoints[16], bPoints[4], false, 10873, 0);
		graph.addEdge(bPoints[16], bPoints[5], false,9876 , 0);
		graph.addEdge(bPoints[16], bPoints[6], false, 6284, 0);
		graph.addEdge(bPoints[16], bPoints[7], false, 6542, 0);
		graph.addEdge(bPoints[16], bPoints[8], false, 11098, 0);
		graph.addEdge(bPoints[16], bPoints[9], false, 12334, 0);
		graph.addEdge(bPoints[16], bPoints[10], false, 12644, 0);
		graph.addEdge(bPoints[16], bPoints[11], false, 12987, 0);
		graph.addEdge(bPoints[16], bPoints[12], false, 15000, 0);
		graph.addEdge(bPoints[16], bPoints[13], false, 9876, 0);
		graph.addEdge(bPoints[16], bPoints[14], false, 5642, 0);
		graph.addEdge(bPoints[16], bPoints[15], false, 6753, 0);
		graph.addEdge(bPoints[16], bPoints[16], false, 8765, 0);
		graph.addEdge(bPoints[16], bPoints[17], false, 1200, 0);
		graph.addEdge(bPoints[16], bPoints[18], false, 5678, 0);
		graph.addEdge(bPoints[16], bPoints[19], false,6789 , 0);
		graph.addEdge(bPoints[16], bPoints[20], false, 9345, 0);
		graph.addEdge(bPoints[16], bPoints[21], false, 9876, 0);
		
		//Ciudad del Cabo
		graph.addEdge(bPoints[17], bPoints[0], false, 12789, 0);
		graph.addEdge(bPoints[17], bPoints[1], false, 9456, 0);
		graph.addEdge(bPoints[17], bPoints[2], false, 7027, 0);
		graph.addEdge(bPoints[17], bPoints[3], false, 9876, 0);
		graph.addEdge(bPoints[17], bPoints[4], false, 7719, 0);
		graph.addEdge(bPoints[17], bPoints[5], false,4567, 0);
		graph.addEdge(bPoints[17], bPoints[6], false, 9876, 0);
		graph.addEdge(bPoints[17], bPoints[7], false, 8765, 0);
		graph.addEdge(bPoints[17], bPoints[8], false, 4567, 0);
		graph.addEdge(bPoints[17], bPoints[9], false, 9876, 0);
		graph.addEdge(bPoints[17], bPoints[10], false, 7654, 0);
		graph.addEdge(bPoints[17], bPoints[11], false, 3456, 0);
		graph.addEdge(bPoints[17], bPoints[12], false, 7654, 0);
		graph.addEdge(bPoints[17], bPoints[13], false, 9876, 0);
		graph.addEdge(bPoints[17], bPoints[14], false, 2346, 0);
		graph.addEdge(bPoints[17], bPoints[15], false, 9876, 0);
		graph.addEdge(bPoints[17], bPoints[16], false, 8765, 0);
		graph.addEdge(bPoints[17], bPoints[18], false, 6570, 0);
		graph.addEdge(bPoints[17], bPoints[19], false, 15677, 0);
		graph.addEdge(bPoints[17], bPoints[20], false, 12345, 0);
		graph.addEdge(bPoints[17], bPoints[21], false, 8765, 0);
		
		//Bogota
		graph.addEdge(bPoints[18], bPoints[0], false, 9874, 0);
		graph.addEdge(bPoints[18], bPoints[1], false, 7865, 0);
		graph.addEdge(bPoints[18], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[18], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[18], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[18], bPoints[5], false,7816 , 0);
		graph.addEdge(bPoints[18], bPoints[6], false, 9876, 0);
		graph.addEdge(bPoints[18], bPoints[7], false, 9876, 0);
		graph.addEdge(bPoints[18], bPoints[8], false, 7654, 0);
		graph.addEdge(bPoints[18], bPoints[9], false, 7895, 0);
		graph.addEdge(bPoints[18], bPoints[10], false, 3245, 0);
		graph.addEdge(bPoints[18], bPoints[11], false, 12556, 0);
		graph.addEdge(bPoints[18], bPoints[12], false, 12345, 0);
		graph.addEdge(bPoints[18], bPoints[13], false, 3456, 0);
		graph.addEdge(bPoints[18], bPoints[14], false, 6786, 0);
		graph.addEdge(bPoints[18], bPoints[15], false, 5876, 0);
		graph.addEdge(bPoints[18], bPoints[16], false, 5678, 0);
		graph.addEdge(bPoints[18], bPoints[17], false, 8763, 0);
		graph.addEdge(bPoints[18], bPoints[19], false, 7893, 0);
		graph.addEdge(bPoints[18], bPoints[20], false, 9732, 0);
		graph.addEdge(bPoints[18], bPoints[21], false, 5647, 0);
		
		//Kinsasa
		graph.addEdge(bPoints[19], bPoints[0], false, 9873, 0);
		graph.addEdge(bPoints[19], bPoints[1], false, 5647, 0);
		graph.addEdge(bPoints[19], bPoints[2], false, 3027, 0);
		graph.addEdge(bPoints[19], bPoints[3], false, 6782, 0);
		graph.addEdge(bPoints[19], bPoints[4], false, 7712, 0);
		graph.addEdge(bPoints[19], bPoints[5], false,7812 , 0);
		graph.addEdge(bPoints[19], bPoints[6], false, 32875, 0);
		graph.addEdge(bPoints[19], bPoints[7], false, 7654, 0);
		graph.addEdge(bPoints[19], bPoints[8], false, 8765, 0);
		graph.addEdge(bPoints[19], bPoints[9], false, 5463, 0);
		graph.addEdge(bPoints[19], bPoints[10], false, 8763, 0);
		graph.addEdge(bPoints[19], bPoints[11], false, 14568, 0);
		graph.addEdge(bPoints[19], bPoints[12], false, 9874, 0);
		graph.addEdge(bPoints[19], bPoints[13], false, 12345, 0);
		graph.addEdge(bPoints[19], bPoints[14], false, 8765, 0);
		graph.addEdge(bPoints[19], bPoints[15], false, 6789, 0);
		graph.addEdge(bPoints[19], bPoints[16], false, 5432, 0);
		graph.addEdge(bPoints[19], bPoints[17], false, 9876, 0);
		graph.addEdge(bPoints[19], bPoints[18], false, 9865, 0);
		graph.addEdge(bPoints[19], bPoints[20], false, 8754, 0);
		graph.addEdge(bPoints[19], bPoints[21], false, 9876, 0);
	
		//Ottawa
		graph.addEdge(bPoints[20], bPoints[0], false, 432, 0);
		graph.addEdge(bPoints[20], bPoints[1], false, 234, 0);
		graph.addEdge(bPoints[20], bPoints[2], false, 3987, 0);
		graph.addEdge(bPoints[20], bPoints[3], false, 7654, 0);
		graph.addEdge(bPoints[20], bPoints[4], false, 9877, 0);
		graph.addEdge(bPoints[20], bPoints[5], false,5678 , 0);
		graph.addEdge(bPoints[20], bPoints[6], false, 8765, 0);
		graph.addEdge(bPoints[20], bPoints[7], false, 7689, 0);
		graph.addEdge(bPoints[20], bPoints[8], false, 8789, 0);
		graph.addEdge(bPoints[20], bPoints[9], false, 8889, 0);
		graph.addEdge(bPoints[20], bPoints[10], false, 9876, 0);
		graph.addEdge(bPoints[20], bPoints[11], false, 18900, 0);
		graph.addEdge(bPoints[20], bPoints[12], false, 12345, 0);
		graph.addEdge(bPoints[20], bPoints[13], false, 7890, 0);
		graph.addEdge(bPoints[20], bPoints[14], false, 7898, 0);
		graph.addEdge(bPoints[20], bPoints[15], false, 6270, 0);
		graph.addEdge(bPoints[20], bPoints[16], false, 9876, 0);
		graph.addEdge(bPoints[20], bPoints[17], false, 6789, 0);
		graph.addEdge(bPoints[20], bPoints[18], false, 8765, 0);
		graph.addEdge(bPoints[20], bPoints[19], false, 9643, 0);
		graph.addEdge(bPoints[20], bPoints[21], false, 328, 0);
		
		//Toronto
		graph.addEdge(bPoints[21], bPoints[0], false, 300, 0);
		graph.addEdge(bPoints[21], bPoints[1], false, 270, 0);
		graph.addEdge(bPoints[21], bPoints[2], false, 3067, 0);
		graph.addEdge(bPoints[21], bPoints[3], false, 6098, 0);
		graph.addEdge(bPoints[21], bPoints[4], false, 6200, 0);
		graph.addEdge(bPoints[21], bPoints[5], false, 12300 , 0);
		graph.addEdge(bPoints[21], bPoints[6], false, 14500, 0);
		graph.addEdge(bPoints[21], bPoints[7], false, 13800, 0);
		graph.addEdge(bPoints[21], bPoints[8], false, 12000, 0);
		graph.addEdge(bPoints[21], bPoints[9], false, 6789, 0);
		graph.addEdge(bPoints[21], bPoints[10], false, 9876, 0);
		graph.addEdge(bPoints[21], bPoints[11], false, 5678, 0);
		graph.addEdge(bPoints[21], bPoints[12], false, 7655, 0);
		graph.addEdge(bPoints[21], bPoints[13], false, 6555, 0);
		graph.addEdge(bPoints[21], bPoints[14], false, 18999, 0);
		graph.addEdge(bPoints[21], bPoints[15], false, 7690, 0);
		graph.addEdge(bPoints[21], bPoints[16], false, 6543, 0);
		graph.addEdge(bPoints[21], bPoints[17], false, 5667, 0);
		graph.addEdge(bPoints[21], bPoints[18], false, 6753, 0);
		graph.addEdge(bPoints[21], bPoints[19], false, 8769, 0);
		graph.addEdge(bPoints[21], bPoints[20], false, 300, 0);
		
	}


	public BombingPoint[] getbPoints() {
		return bPoints;
	}


	public void setbPoints(BombingPoint[] bPoints) {
		this.bPoints = bPoints;
	}


	public GraphByLists<BombingPoint, Integer> getGraph() {
		return graph;
	}


	public void setGraph(GraphByLists<BombingPoint, Integer> graph) {
		this.graph = graph;
	}

	public ArrayList<Vertex<BombingPoint>> getPath(Vertex<BombingPoint> start, Vertex<BombingPoint> end){
		
		MethodsGraphs<BombingPoint, Integer> meth= new MethodsGraphs<>();
		
		ArrayList<Vertex<BombingPoint>> path= meth.dijkstra(graph, start).creatingPath(start, end);
		
		return path;
	}

	public String pathToString(Vertex<BombingPoint> start, Vertex<BombingPoint> end) {
		
		MethodsGraphs<BombingPoint,Integer> meth= new MethodsGraphs<>();
		
		ArrayList<Vertex<BombingPoint>> path = meth.dijkstra(graph, start).creatingPath(start, end);
		
		String pathS="";
		
		for (int i = 0; i < path.size(); i++) {
			
			Vertex<BombingPoint> a= path.get(i);
			Vertex<BombingPoint> b= path.get(i +1);
			
			pathS +=a.toString() + " -- " + graph.edgesBetween(a.getValue(), b.getValue()) + " --> " + b.toString() + "\n" ;
			
			
		}
		 
		return pathS;
	}

	public int[] gethPathKruskal() {
		
		MethodsGraphs<BombingPoint, Integer> meth= new MethodsGraphs<>();
		
		ArrayList<Vertex<BombingPoint>> path= new ArrayList<>();
		
		int[] pathIndex= meth.primP(graph, new Vertex<>(bPoints[0])).getPath();
//		int[] pathIndex= meth.kruskal(graph);
		return pathIndex;
	}
	
	public BombingPoint findBombingPoint(String id) {
		System.out.println(id);
		for(int i=0;i<bPoints.length;i++) {
			if(bPoints[i].getName().equalsIgnoreCase(id)){
				return bPoints[i];
			}
		}
		return null;
	}

}
