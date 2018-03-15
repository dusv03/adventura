package com.github.dusv03.adventura.uiText;

import javafx.scene.control.TextField;

import com.github.dusv03.adventura.logika.IHra;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class HomeController extends GridPane{
	
	@FXML private TextField textVstup;

	public void odesli() {
		System.out.println(textVstup.getText());
	}
	
	public void inicializuj(IHra hra){
		
	}
	
}
