package threads;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class MusicThread extends Thread {

	private File ruta;		
	private boolean on;
	
	public MusicThread(File ruta) {this.ruta=ruta; setOn(true);}
	
	@Override
	public void run() {
		try {		
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(ruta));
			Player player=new Player(bis);
			player.play();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	public void setRuta(File ruta) {this.ruta=ruta;}
	
	public String getRuta() {return ruta.getPath();}

	public boolean isOn() {return on;}
	
	public void setOn(boolean running) {this.on = running;}
	
}
