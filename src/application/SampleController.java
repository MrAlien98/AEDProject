package application;

import java.util.ArrayList;

import dataStructure.Vertex;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import model.BombingPoint;

public class SampleController {
	
	@FXML public final Image START_BOMBING=new Image("images/startBombingPoint.png");
	@FXML public final Image END_BOMBING=new Image("images/endBombingPoint.png");
	@FXML public final Image NORMAL_POINT=new Image("images/bombPoint.png");
	@FXML public final Image BOMBED_POINT=new Image("images/bombedPoint.png");
	@FXML public final Image PLANE_1=new Image("images/plane1.png");
	@FXML public final Image PLANE_2=new Image("images/plane2.png");
	@FXML public final Image PLANE_3=new Image("images/plane3.png");
	@FXML public final Image PLANE_4=new Image("images/plane4.png");
	
	
	@FXML private ImageView imgMapa;
 	@FXML private ImageView  Bogota;
 	@FXML private ImageView  Kansas;
    @FXML private ImageView  Alberta;
    @FXML private ImageView  Ottawa;
    @FXML private ImageView  Washington;
    @FXML private ImageView  CiudadDeMexico;
    @FXML private ImageView  Brasilia;
    @FXML private ImageView  RiodeJaneiro;
    @FXML private ImageView  BuenosAires;
    @FXML private ImageView  Moscu;
    @FXML private ImageView  Astana;
    @FXML private ImageView  Krasnoyarsk;
    @FXML private ImageView  UlanBator;
    @FXML private ImageView  Pekin;
    @FXML private ImageView  HongKong;
    @FXML private ImageView  NewDelhi;
    @FXML private ImageView  Teheran;
    @FXML private ImageView  Riad;
    @FXML private ImageView  Argel;
    @FXML private ImageView  Camberra;
    @FXML private ImageView  CiudadDelCabo;
    @FXML private ImageView  Bloemfontein;
    @FXML private ImageView  Pretoria;
    @FXML private ImageView  Kinsasa;
	
    @FXML private ImageView airPlane;
    
    @FXML private Button butClear;
    @FXML private Button bombEverything;
    @FXML private Button startBombing;
    
    private ArrayList<Pair<ImageView, Boolean>> imgs;
    private ArrayList<ImageView> marked=new ArrayList<>();	
    
    private Timeline animation;
    
    private boolean bomber1;
    private boolean bomber2;
        
    private double dx;
    private double dy;
    
    public SampleController() {
    	bomber1=false;
    	bomber2=false;
    }

	public void initialize() {	
		airPlane.setVisible(false);
		
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
		imgs.add(new Pair<ImageView, Boolean>(Washington,false));
		imgs.add(new Pair<ImageView, Boolean>(Kansas,false));
		imgs.add(new Pair<ImageView, Boolean>(CiudadDeMexico,false));
    	imgs.add(new Pair<ImageView, Boolean>(Brasilia,false));
    	imgs.add(new Pair<ImageView, Boolean>(RiodeJaneiro,false));
    	imgs.add(new Pair<ImageView, Boolean>(Moscu,false));
    	imgs.add(new Pair<ImageView, Boolean>(Krasnoyarsk,false));
    	imgs.add(new Pair<ImageView, Boolean>(Pekin,false));
    	imgs.add(new Pair<ImageView, Boolean>(HongKong,false));
    	imgs.add(new Pair<ImageView, Boolean>(Camberra,false));
    	imgs.add(new Pair<ImageView, Boolean>(NewDelhi,false));
    	imgs.add(new Pair<ImageView, Boolean>(Teheran,false));
    	imgs.add(new Pair<ImageView, Boolean>(Riad,false));
    	imgs.add(new Pair<ImageView, Boolean>(BuenosAires,false));
    	imgs.add(new Pair<ImageView, Boolean>(Astana,false));
    	imgs.add(new Pair<ImageView, Boolean>(UlanBator,false));
    	imgs.add(new Pair<ImageView, Boolean>(Argel,false));
    	imgs.add(new Pair<ImageView, Boolean>(CiudadDelCabo,false));
    	imgs.add(new Pair<ImageView, Boolean>(Bogota, false));
    	imgs.add(new Pair<ImageView, Boolean>(Kinsasa,false));
    	imgs.add(new Pair<ImageView, Boolean>(Ottawa,false));
    	imgs.add(new Pair<ImageView, Boolean>(Alberta,false));
    	imgs.add(new Pair<ImageView, Boolean>(Pretoria,false));
    	imgs.add(new Pair<ImageView, Boolean>(Bloemfontein,false));
    	
		actions();
	}
	
	public void actions() {
		butClear.setOnAction(e->{
			actions();
			Main.getRoot().getChildren().removeIf(h -> (h instanceof Line));
			bomber1=false;
			bomber2=false;
		});
		startBombing.setOnAction(e-> moveAirPlane(marked));
		for(int i=0;i<imgs.size();i++) {
			final int n=i;
			imgs.get(i).getKey().setImage(NORMAL_POINT);
			imgs.get(i).setValue(false);
			imgs.get(i).getKey().setOnMouseClicked(e-> changeImages(imgs.get(n).getKey()));
		}
	}
	
	public void changeImages(ImageView img) {
		if(bomber1 && bomber2) {
			System.out.println("Solo 2 puntos");
		}else if(bomber1) {
			bomber2=true;
			for(int i=0;i<imgs.size();i++) {
				if(imgs.get(i).getKey().getId().equalsIgnoreCase(img.getId())) {
					imgs.get(i).getKey().setImage(END_BOMBING);
					imgs.get(i).setValue(true);
				}
			}
			drawPath();
		}else {
			for(int i=0;i<imgs.size();i++) {
				if(imgs.get(i).getKey().getId().equalsIgnoreCase(img.getId())) {
					imgs.get(i).getKey().setImage(START_BOMBING);
					imgs.get(i).setValue(true);
				}
			}
			img.setOnMouseClicked(e->nothingMethod());
			bomber1=true;
			img.setImage(START_BOMBING);
		}
	}
	
	public void drawPath() {
		ImageView point1=null;
		ImageView point2=null;
		for(int i=0;i<imgs.size();i++) {
			if(imgs.get(i).getValue()==true) {
				if(point1==null) {
					point1=imgs.get(i).getKey();
				}else if(point2==null) {
					point2=imgs.get(i).getKey();
				}
			}
		}
		BombingPoint start=Main.getWar().findBombingPoint(point1.getId());
		BombingPoint end=Main.getWar().findBombingPoint(point2.getId());
		ArrayList<Vertex<BombingPoint>> b=Main.getWar().getPath(new Vertex<BombingPoint>(start), new Vertex<BombingPoint>(end));
		for(Vertex<BombingPoint> a : b) {
			System.out.println(a.getValue().getName());
		}
		drawPath(b);
	}
	
	public void drawPath(ArrayList<Vertex<BombingPoint>> arr) {
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
	
	public void nothingMethod() {
		
	}
	
	public void bombEverything() {
		int[] ax=Main.getWar().gethPathKruskal();
		
	}
	
	public double MCD(double dx, double dy) {
		double res=0;
		do{
			res=dy;
			dy=dx%dy;
			dx=res;
		}while(dy!=0);
		return res;
	}
	
	public void moveAirPlane(ArrayList<ImageView> marked) {
		airPlane.setVisible(true);
		airPlane.setLayoutX(marked.get(marked.size()-1).getLayoutX());
		airPlane.setLayoutY(marked.get(marked.size()-1).getLayoutY());
		for(int i=1;i<marked.size();i++) {
			ImageView imgP1=marked.get(i-1);
			ImageView imgP2=marked.get(i);
			dx=(imgP2.getLayoutX()-imgP1.getLayoutX());
			dy=(imgP2.getLayoutY()-imgP1.getLayoutY());
			double change=MCD(dx,dy);
			dx=dx/change;
			dy=dy/change;
			animation = new Timeline(new KeyFrame(Duration.millis(3000), f-> {
				System.out.println("entro");
				if(airPlane.getLayoutX()<imgP2.getLayoutX()) {
					airPlane.setLayoutX(airPlane.getLayoutX()+dx);
				}
				if(airPlane.getLayoutX()>imgP2.getLayoutX()) {
					airPlane.setLayoutX(airPlane.getLayoutX()-dx);
				}
				if(airPlane.getLayoutY()>imgP2.getLayoutY()) {
					airPlane.setLayoutY(airPlane.getLayoutY()+dy);
				}
				if(airPlane.getLayoutY()<imgP2.getLayoutY()) {
					airPlane.setLayoutY(airPlane.getLayoutY()-dy);
				}
				if(airPlane.getLayoutY()==imgP2.getLayoutY() && airPlane.getLayoutX()==imgP2.getLayoutX()) {
					animation.pause();
				}
			}));
			animation.setCycleCount(Timeline.INDEFINITE);
			animation.play();
		}
	}
	
	public boolean isBomber1() {
		return bomber1;
	}

	public void setBomber1(boolean bomber1) {
		this.bomber1 = bomber1;
	}

	public boolean isBomber2() {
		return bomber2;
	}

	public void setBomber2(boolean bomber2) {
		this.bomber2 = bomber2;
	}
	
}
