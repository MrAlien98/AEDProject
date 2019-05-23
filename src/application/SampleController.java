package application;

import javafx.fxml.FXML;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;

public class SampleController {
	
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
	
	public void initialize() {
		Tooltip.install(pointBogota, new Tooltip("Bogotá, Colombia"));
		Tooltip.install(pointAlberta, new Tooltip("Alberta, Canada"));
		Tooltip.install(pointOttawa, new Tooltip("Ottawa, Canada"));
		Tooltip.install(pointWashington, new Tooltip("Washington, EE.UU"));
		Tooltip.install(pointCiudadDeMexico, new Tooltip("Ciudad de México, México"));
		Tooltip.install(pointBrasilia, new Tooltip("Brasilia, Brasil"));
		Tooltip.install(pointRio, new Tooltip("Rio de Janeiro, Brasil"));
		Tooltip.install(pointBuenosAires, new Tooltip("Buenos Aires, Argentina"));
		Tooltip.install(pointMoscu, new Tooltip("Moscú, Rusia"));
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
		Tooltip.install(pointCiudadaDelCabo, new Tooltip("Ciudad del Cabo, Sudáfrica"));
		Tooltip.install(pointBloemfontein, new Tooltip("Bloemfontein, Sudáfrica"));
		Tooltip.install(pointPretoria, new Tooltip("Pretoria, Sudáfrica"));
		Tooltip.install(pointKinsasa, new Tooltip("Kinsasa, Republica Democrática del Congo"));
	}
	
}
