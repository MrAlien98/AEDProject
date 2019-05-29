package threads;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import queue.Queue;

public class ImageThread extends Thread {

	private Queue<ImageView> q;
	private Image toChange;
	
	public ImageThread(Queue<ImageView> q, Image toChange) {this.q=q; this.toChange=toChange;}
	
	@Override
	public void run() {
		try {
			while(!q.isEmpty()) {
				q.poll().setImage(toChange);
				sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
