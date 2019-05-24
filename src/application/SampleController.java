package application;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Pair;

public class SampleController {
	
	@FXML public final Image START_BOMBING=new Image("images/startBombingPoint.png");
	@FXML public final Image END_BOMBING=new Image("images/endBombingPoint.png");
	@FXML public final Image NORMAL_POINT=new Image("images/bombPoint.png");
	
	@FXML private ImageView imgMapa;
 	@FXML private ImageView  Bogota;
 	@FXML private ImageView  Kansas;
    @FXML private ImageView  Alberta;
    @FXML private ImageView  Ottawa;
    @FXML private ImageView  Washington;
    @FXML private ImageView  CiudadDeMexico;
    @FXML private ImageView  Brasilia;
    @FXML private ImageView  Rio;
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
    @FXML private ImageView  CiudadaDelCabo;
    @FXML private ImageView  Bloemfontein;
    @FXML private ImageView  Pretoria;
    @FXML private ImageView  Kinsasa;
	
    @FXML private Button butClear;
    
    private ArrayList<Pair<ImageView, Boolean>> imgs;
    	
    private boolean bomber1;
    private boolean bomber2;
    
    public SampleController() {
    	imgs=new ArrayList<>();
    	imgs.add(new Pair<ImageView, Boolean>(Bogota, false));
    	imgs.add(new Pair<ImageView, Boolean>(Kansas,false));
    	imgs.add(new Pair<ImageView, Boolean>(Alberta,false));
    	imgs.add(new Pair<ImageView, Boolean>(Ottawa,false));
    	imgs.add(new Pair<ImageView, Boolean>(Washington,false));
    	imgs.add(new Pair<ImageView, Boolean>(CiudadDeMexico,false));
    	imgs.add(new Pair<ImageView, Boolean>(Brasilia,false));
    	imgs.add(new Pair<ImageView, Boolean>(Rio,false));
    	imgs.add(new Pair<ImageView, Boolean>(BuenosAires,false));
    	imgs.add(new Pair<ImageView, Boolean>(Moscu,false));
    	imgs.add(new Pair<ImageView, Boolean>(Astana,false));
    	imgs.add(new Pair<ImageView, Boolean>(Krasnoyarsk,false));
    	imgs.add(new Pair<ImageView, Boolean>(UlanBator,false));
    	imgs.add(new Pair<ImageView, Boolean>(Pekin,false));
    	imgs.add(new Pair<ImageView, Boolean>(HongKong,false));
    	imgs.add(new Pair<ImageView, Boolean>(NewDelhi,false));
    	imgs.add(new Pair<ImageView, Boolean>(Teheran,false));
    	imgs.add(new Pair<ImageView, Boolean>(Riad,false));
    	imgs.add(new Pair<ImageView, Boolean>(Argel,false));
    	imgs.add(new Pair<ImageView, Boolean>(Camberra,false));
    	imgs.add(new Pair<ImageView, Boolean>(CiudadaDelCabo,false));
    	imgs.add(new Pair<ImageView, Boolean>(Bloemfontein,false));
    	imgs.add(new Pair<ImageView, Boolean>(Pretoria,false));
    	imgs.add(new Pair<ImageView, Boolean>(Kinsasa,false));
    	
    	bomber1=false;
    	bomber2=false;
    }

	public void initialize() {			
		Tooltip.install( Bogota, new Tooltip("Bogota, Colombia"));
		Tooltip.install( Alberta, new Tooltip("Alberta, Canada"));
		Tooltip.install( Ottawa, new Tooltip("Ottawa, Canada"));
		Tooltip.install( Washington, new Tooltip("Washington, EE.UU"));
		Tooltip.install( CiudadDeMexico, new Tooltip("Ciudad de Mexico, Mexico"));
		Tooltip.install( Brasilia, new Tooltip("Brasilia, Brasil"));
		Tooltip.install( Rio, new Tooltip("Rio de Janeiro, Brasil"));
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
		Tooltip.install( CiudadaDelCabo, new Tooltip("Ciudad del Cabo, Sudafrica"));
		Tooltip.install( Bloemfontein, new Tooltip("Bloemfontein, Sudafrica"));
		Tooltip.install( Pretoria, new Tooltip("Pretoria, Sudafrica"));
		Tooltip.install( Kinsasa, new Tooltip("Kinsasa, Republica Democratica del Congo"));
		Tooltip.install( Kansas, new Tooltip("Kansas, EE.UU"));
		actions();
	}
	
	public void actions() {
		butClear.setOnAction(e->{
			actions();
			bomber1=false;
			bomber2=false;
		});
		
		 Bogota.setOnMouseClicked(e-> changeImages( Bogota));
		 Alberta.setOnMouseClicked(e-> changeImages( Alberta));
		 Ottawa.setOnMouseClicked(e-> changeImages( Ottawa));
		 Washington.setOnMouseClicked(e-> changeImages( Washington));
		 CiudadDeMexico.setOnMouseClicked(e-> changeImages( CiudadDeMexico));
		 Brasilia.setOnMouseClicked(e-> changeImages( Brasilia));
		 Rio.setOnMouseClicked(e-> changeImages( Rio));
		 BuenosAires.setOnMouseClicked(e-> changeImages( BuenosAires));
		 Moscu.setOnMouseClicked(e-> changeImages( Moscu));
		 Astana.setOnMouseClicked(e-> changeImages( Astana));
		 Krasnoyarsk.setOnMouseClicked(e-> changeImages( Krasnoyarsk));
		 UlanBator.setOnMouseClicked(e-> changeImages( UlanBator));
		 Pekin.setOnMouseClicked(e-> changeImages( Pekin));
		 HongKong.setOnMouseClicked(e-> changeImages( HongKong));
		 NewDelhi.setOnMouseClicked(e-> changeImages( NewDelhi));
		 Teheran.setOnMouseClicked(e-> changeImages( Teheran));
		 Riad.setOnMouseClicked(e-> changeImages( Riad));
		 Argel.setOnMouseClicked(e-> changeImages( Argel));
		 Camberra.setOnMouseClicked(e-> changeImages( Camberra));
		 CiudadaDelCabo.setOnMouseClicked(e-> changeImages( CiudadaDelCabo));
		 Bloemfontein.setOnMouseClicked(e-> changeImages( Bloemfontein));
		 Pretoria.setOnMouseClicked(e-> changeImages(Pretoria));
		 Kinsasa.setOnMouseClicked(e-> changeImages( Kinsasa));
		 Kansas.setOnMouseClicked(e-> changeImages( Kansas));
	}
	
	public void changeImages(ImageView img) {
		System.out.println(img.getId());
		if(bomber1 && bomber2) {
			System.out.println("Solo 2 puntos");
		}else if(bomber1) {
			bomber2=true;
			img.setImage(END_BOMBING);
			for(int i=0;i<imgs.size();i++) {
				if(imgs.get(i).getKey().getId().equalsIgnoreCase(img.getId())) {
					imgs.set(i, new Pair<ImageView, Boolean>(img, true));
				}
			}
			pintala();
		}else {
			for(int i=0;i<imgs.size();i++) {
				if(imgs.get(i).getKey().getId().equalsIgnoreCase(img.getId())) {
					imgs.set(i, new Pair<ImageView, Boolean>(img, true));
				}
			}
			img.setOnMouseClicked(e->nothingMethod());
			bomber1=true;
			img.setImage(START_BOMBING);
		}
	}
	
	public void pintala() {
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
		Line linea=new Line(point1.getLayoutX(), point1.getLayoutY(), point2.getLayoutX(), point2.getLayoutY());
		Main.getRoot().getChildren().add(linea);
	}
	
	public void nothingMethod() {
		
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
