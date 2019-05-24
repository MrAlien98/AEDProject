package application;

import javafx.fxml.FXML;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SampleController {
	
	@FXML public final Image START_BOMBING=new Image("images/startBombingPoint.png");
	@FXML public final Image END_BOMBING=new Image("images/endBombingPoint.png");
	
	@FXML private ImageView imgMapa;
 	@FXML private ImageView pointBogota;
    @FXML private ImageView pointAlberta;
    @FXML private ImageView pointOttawa;
    @FXML private ImageView pointWashington;
    @FXML private ImageView pointCiudadDeMexico;
    @FXML private ImageView pointBrasilia;
    @FXML private ImageView pointRio;
    @FXML private ImageView pointBuenosAires;
    @FXML private ImageView pointMoscu;
    @FXML private ImageView pointAstana;
    @FXML private ImageView pointKrasnoyarsk;
    @FXML private ImageView pointUlanBator;
    @FXML private ImageView pointPekin;
    @FXML private ImageView pointHongKong;
    @FXML private ImageView pointNewDelhi;
    @FXML private ImageView pointTeheran;
    @FXML private ImageView pointRiad;
    @FXML private ImageView pointArgel;
    @FXML private ImageView pointCamberra;
    @FXML private ImageView pointCiudadaDelCabo;
    @FXML private ImageView pointBloemfontein;
    @FXML private ImageView pointPretoria;
    @FXML private ImageView pointKinsasa;
	
    private boolean bomber1;
    private boolean bomber2;
    
    public SampleController() {
    	bomber1=false;
    	bomber2=false;
    }

	public void initialize() {	
		Tooltip.install(pointBogota, new Tooltip("Bogota, Colombia"));
		Tooltip.install(pointAlberta, new Tooltip("Alberta, Canada"));
		Tooltip.install(pointOttawa, new Tooltip("Ottawa, Canada"));
		Tooltip.install(pointWashington, new Tooltip("Washington, EE.UU"));
		Tooltip.install(pointCiudadDeMexico, new Tooltip("Ciudad de Mexico, Mexico"));
		Tooltip.install(pointBrasilia, new Tooltip("Brasilia, Brasil"));
		Tooltip.install(pointRio, new Tooltip("Rio de Janeiro, Brasil"));
		Tooltip.install(pointBuenosAires, new Tooltip("Buenos Aires, Argentina"));
		Tooltip.install(pointMoscu, new Tooltip("Moscu, Rusia"));
		Tooltip.install(pointAstana, new Tooltip("Astana, Kazajstan"));
		Tooltip.install(pointKrasnoyarsk, new Tooltip("Krasnoyarsk, Rusia"));
		Tooltip.install(pointUlanBator, new Tooltip("Ulan Bator, Mongolia"));
		Tooltip.install(pointPekin, new Tooltip("Pekin, China"));
		Tooltip.install(pointHongKong, new Tooltip("HongKong, China"));
		Tooltip.install(pointNewDelhi, new Tooltip("NewDelhi, India"));
		Tooltip.install(pointTeheran, new Tooltip("Teheran, Iran"));
		Tooltip.install(pointRiad, new Tooltip("Riad, Arabia Saudita"));
		Tooltip.install(pointArgel, new Tooltip("Argel, Argelia"));
		Tooltip.install(pointCamberra, new Tooltip("Camberra, Australia"));
		Tooltip.install(pointCiudadaDelCabo, new Tooltip("Ciudad del Cabo, Sudafrica"));
		Tooltip.install(pointBloemfontein, new Tooltip("Bloemfontein, Sudafrica"));
		Tooltip.install(pointPretoria, new Tooltip("Pretoria, Sudafrica"));
		Tooltip.install(pointKinsasa, new Tooltip("Kinsasa, Republica Democratica del Congo"));
		
		pointBogota.setOnMouseClicked(e-> changeImages(pointBogota));
		pointAlberta.setOnMouseClicked(e-> changeImages(pointAlberta));
		pointOttawa.setOnMouseClicked(e-> changeImages(pointOttawa));
		pointWashington.setOnMouseClicked(e-> changeImages(pointWashington));
		pointCiudadDeMexico.setOnMouseClicked(e-> changeImages(pointCiudadDeMexico));
		pointBrasilia.setOnMouseClicked(e-> changeImages(pointBrasilia));
		pointRio.setOnMouseClicked(e-> changeImages(pointRio));
		pointBuenosAires.setOnMouseClicked(e-> changeImages(pointBuenosAires));
		pointMoscu.setOnMouseClicked(e-> changeImages(pointMoscu));
		pointAstana.setOnMouseClicked(e-> changeImages(pointAstana));
		pointKrasnoyarsk.setOnMouseClicked(e-> changeImages(pointKrasnoyarsk));
		pointUlanBator.setOnMouseClicked(e-> changeImages(pointUlanBator));
		pointPekin.setOnMouseClicked(e-> changeImages(pointPekin));
		pointHongKong.setOnMouseClicked(e-> changeImages(pointHongKong));
		pointNewDelhi.setOnMouseClicked(e-> changeImages(pointNewDelhi));
		pointTeheran.setOnMouseClicked(e-> changeImages(pointTeheran));
		pointBogota.setOnMouseClicked(e-> changeImages(pointBogota));
		pointBogota.setOnMouseClicked(e-> changeImages(pointBogota));
	}
	
	public void changeImages(ImageView img) {
		if(bomber1 && bomber2) {
			
		}else if(bomber1) {
			bomber2=true;
			img.setImage(END_BOMBING);
		}else {
			img.setOnMouseClicked(e->nothingMethod());
			bomber1=true;
			img.setImage(START_BOMBING);
		}
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
