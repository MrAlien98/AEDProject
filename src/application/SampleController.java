package application;

import java.util.ArrayList;
import dataStructure.Vertex;
import exceptions.UnselectedPointException;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import model.BombingPoint;
import queue.Queue;
import threads.ImageThread;
//import threads.MusicThread;

/**
 * Controller class for the GUI of the AED final project
 * @author Victor Mora
 *
 */
public class SampleController {
	
	/**
	 * Constants on the SampleController class 
	 */
	@FXML public final Image START_BOMBING=new Image("images/startBombingPoint.png");
	@FXML public final Image END_BOMBING=new Image("images/endBombingPoint.png");
	@FXML public final Image NORMAL_POINT=new Image("images/bombPoint.png");
	@FXML public final Image BOMBED_POINT=new Image("images/bombedPoint.png");
	
	/**
	 * Atributes on the SampleController class
	 */
	@FXML private ImageView mgMapa;
 	@FXML private ImageView Bogota;
 	@FXML private ImageView Kansas;
    @FXML private ImageView Alberta;
    @FXML private ImageView Ottawa;
    @FXML private ImageView Washington;
    @FXML private ImageView CiudadDeMexico;
    @FXML private ImageView Brasilia;
    @FXML private ImageView RiodeJaneiro;
    @FXML private ImageView BuenosAires;
    @FXML private ImageView Moscu;
    @FXML private ImageView Astana;
    @FXML private ImageView Krasnoyarsk;
    @FXML private ImageView UlanBator;
    @FXML private ImageView Pekin;
    @FXML private ImageView HongKong;
    @FXML private ImageView NewDelhi;
    @FXML private ImageView Teheran;
    @FXML private ImageView Riad;
    @FXML private ImageView Argel;
    @FXML private ImageView Camberra;
    @FXML private ImageView CiudadDelCabo;
    @FXML private ImageView Bloemfontein;
    @FXML private ImageView Pretoria;
    @FXML private ImageView Kinsasa;
        
    @FXML private Button butClear;
    @FXML private Button bombEverything;
    @FXML private Button startBombing;
    
    private ArrayList<Triforce<ImageView, Boolean, Integer>> imgs;
    private ArrayList<ImageView> marked=new ArrayList<>();	
    
    private boolean bomber1;
    private boolean bomber2;
    
    private Timeline animation;
    
    /**
     * SampleController class constructor
     */
    public SampleController() {
    	bomber1=false;
    	bomber2=false;
    }

    /**
     * Oranizes every element in the SampleController class  
     */
	public void initialize() {		
		Tooltip.install( Bogota, new Tooltip("Bogota, Colombia"));
		Tooltip.install( Alberta, new Tooltip("Alberta, Canada"));
		Tooltip.install( Ottawa, new Tooltip("Ottawa, Canada"));
		Tooltip.install( Washington, new Tooltip("Washington, EE.UU"));
		Tooltip.install( CiudadDeMexico, new Tooltip("Ciudad de Mexico, Mexico"));
		Tooltip.install( Brasilia, new Tooltip("Brasilia, Brasil"));
		Tooltip.install( RiodeJaneiro, new Tooltip("Rio de Janeiro, Brasil"));
		Tooltip.install( BuenosAires, new Tooltip("Buenos Aires, Argentina"));
		Tooltip.install( Moscu, new Tooltip("Moscu, Rusia"));
		Tooltip.install( Astana, new Tooltip("Astana, Kazajstan"));
		Tooltip.install( Krasnoyarsk, new Tooltip("Krasnoyarsk, Rusia"));
		Tooltip.install( UlanBator, new Tooltip("Ulan Bator, Mongolia"));
		Tooltip.install( Pekin, new Tooltip("Pekin, China"));
		Tooltip.install( HongKong, new Tooltip("HongKong, China"));
		Tooltip.install( NewDelhi, new Tooltip("NewDelhi, India"));
		Tooltip.install( Teheran, new Tooltip("Teheran, Iran"));
		Tooltip.install( Riad, new Tooltip("Riad, Arabia Saudita"));
		Tooltip.install( Argel, new Tooltip("Argel, Argelia"));
		Tooltip.install( Camberra, new Tooltip("Camberra, Australia"));
		Tooltip.install( CiudadDelCabo, new Tooltip("Ciudad del Cabo, Sudafrica"));
		Tooltip.install( Bloemfontein, new Tooltip("Bloemfontein, Sudafrica"));
		Tooltip.install( Pretoria, new Tooltip("Pretoria, Sudafrica"));
		Tooltip.install( Kinsasa, new Tooltip("Kinsasa, Republica Democratica del Congo"));
		Tooltip.install( Kansas, new Tooltip("Kansas, EE.UU"));
		
		imgs=new ArrayList<>();
		imgs.add(new Triforce<ImageView, Boolean, Integer>(Washington,false, 0));
		imgs.add(new Triforce<ImageView, Boolean, Integer>(Kansas,false, 0));
		imgs.add(new Triforce<ImageView, Boolean, Integer>(CiudadDeMexico,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Brasilia,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(RiodeJaneiro,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Moscu,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Krasnoyarsk,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Pekin,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(HongKong,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Camberra,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(NewDelhi,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Teheran,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Riad,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(BuenosAires,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Astana,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(UlanBator,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Argel,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(CiudadDelCabo,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Bogota, false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Kinsasa,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Ottawa,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Alberta,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Pretoria,false, 0));
    	imgs.add(new Triforce<ImageView, Boolean, Integer>(Bloemfontein,false, 0));
    	
		actions();
	}
	
	/**
	 * Initializes the action of every element on the class SampleController
	 */
	public void actions() {
		butClear.setOnAction(e->{
			actions();
			Main.getRoot().getChildren().removeIf(h -> (h instanceof Line));
			bomber1=false;
			bomber2=false;
		});
		
		startBombing.setOnAction(e->{
			try{
				changeImages(marked);
			}catch(Exception f) {
				Alert exception=new Alert(AlertType.ERROR);
				exception.setContentText(f.getMessage());
				exception.setHeaderText(null);
				exception.setTitle("An Exception Has Ocurred");
				exception.showAndWait();
				f.printStackTrace();
			}
		});
		
		bombEverything.setOnAction(e-> bombEverything());
		
		for(int i=0;i<imgs.size();i++) {
			final int n=i;
			imgs.get(i).getKey().setImage(NORMAL_POINT);
			imgs.get(i).setValue(false);
			imgs.get(i).getKey().setOnMouseClicked(e-> changeImages(imgs.get(n).getKey()));
		}
	}
	
	/**
	 * Changes the image of all the elements on the ArrayList that comes
	 * as a parameter 
	 * @param img -> the ArrayList with the elements which images will be changed
	 * 				to the BombedPoint state
	 */
	public void changeImages(ArrayList<ImageView> img) throws UnselectedPointException{
		if( (bomber1==false && bomber2==false) || (bomber1==false && bomber2==true) || (bomber1==true && bomber2==false) ) {
			throw new UnselectedPointException();
		}else {
			Queue<ImageView> q=new Queue<>();
			for(ImageView a : img) {
				q.offer(a);
			}
			ImageThread t2=new ImageThread(q, BOMBED_POINT);
			t2.start();
		}
	}
	
	/**
	 * Changes the image of an image view object when this is clicked by the user
	 * can change it to StartBoming or EndBombing
	 * @param img -> the imageView object which image will be changed
	 */
	public void changeImages(ImageView img) {
		if(bomber1 && bomber2) {
			Alert exception=new Alert(AlertType.ERROR);
			exception.setContentText("You can only select two points\n One for the starting point and the other for the end point");
			exception.setHeaderText(null);
			exception.setTitle("Missclick (?)");
			exception.showAndWait();
		}else if(bomber1==false && bomber2==false) {
			bomber1=true;
			img.setOnMouseClicked(e->nothingMethod());
			img.setImage(START_BOMBING);
			for(int i=0;i<imgs.size();i++) {
				if(imgs.get(i).getKey().getId().equalsIgnoreCase(img.getId())) {
					imgs.get(i).getKey().setImage(START_BOMBING);
					imgs.get(i).setValue(true);
					imgs.get(i).setOrder(1);
				}
			}
		}else if(bomber1==true && bomber2==false) {
			bomber2=true;
			img.setOnMouseClicked(e->nothingMethod());
			img.setImage(END_BOMBING);
			for(int i=0;i<imgs.size();i++) {
				if(imgs.get(i).getKey().getId().equalsIgnoreCase(img.getId())) {
					imgs.get(i).getKey().setImage(END_BOMBING);
					imgs.get(i).setValue(true);
					imgs.get(i).setOrder(2);
				}
			}
			drawPath();
		}
	}
	
	/**
	 * Filters over the points recived from the model graph
	 * then it passes that information to the method drawPath(ArrayList<Vertex<BombingPoint>>)
	 */
	public void drawPath() {
		ImageView point1=null;
		ImageView point2=null;
		for(int i=0;i<imgs.size();i++) {
			if(imgs.get(i).getValue()==true) {
				if(imgs.get(i).getOrder()==1) {
					point1=imgs.get(i).getKey();
				}else if(imgs.get(i).getOrder()==2) {
					point2=imgs.get(i).getKey();
				}
			}
		}
		BombingPoint start=Main.getWar().findBombingPoint(point1.getId());
		BombingPoint end=Main.getWar().findBombingPoint(point2.getId());
		ArrayList<Vertex<BombingPoint>> b=Main.getWar().getPath(new Vertex<BombingPoint>(start), new Vertex<BombingPoint>(end));
		drawPath(b);
	}
	
	
	/**
	 * Draws the path from a starting point to an ending one
	 * @param arr ArrayList that contains the visit order of the graph in the model
	 * 				so it can be drawed over the GUI
	 */
	public void drawPath(ArrayList<Vertex<BombingPoint>> arr) {
		marked=new ArrayList<ImageView>();
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<imgs.size();j++) {
				if(imgs.get(j).getKey().getId().equalsIgnoreCase(arr.get(i).getValue().getName())) {
					marked.add(imgs.get(j).getKey());
				}
			}
		}
		for(int i=1;i<marked.size();i++) {
			Line line=new Line();
			line.setStyle("-fx-stroke-dash-array: 2 12 12 2;");
			line.setStartX(marked.get(i-1).getLayoutX());	line.setStartY(marked.get(i-1).getLayoutY());
			line.setEndX(marked.get(i).getLayoutX());	line.setEndY(marked.get(i).getLayoutY());
			Main.getRoot().getChildren().add(line);
		}
	}
	
	/**
	 * A method that does nothing
	 */
	public void nothingMethod() {
		
	}
	
	/**
	 * Gets the minimum span tree from the model to draw it over the GUI
	 */
	public void bombEverything() {
		bomber1=true;
		bomber2=true;
		int[] ax=Main.getWar().gethPathPrim();
		marked=new ArrayList<>();
		for(int i=1;i<ax.length;i++) {
			marked.add(imgs.get(ax[i]).getKey());
		}
		for(int i=1;i<marked.size();i++) {
			Line line=new Line();
			line.setStyle("-fx-stroke-dash-array: 2 12 12 2;");
			line.setStartX(marked.get(i-1).getLayoutX());	line.setStartY(marked.get(i-1).getLayoutY());
			line.setEndX(marked.get(i).getLayoutX());	line.setEndY(marked.get(i).getLayoutY());
			Main.getRoot().getChildren().add(line);
		}
	}
	
	
}
