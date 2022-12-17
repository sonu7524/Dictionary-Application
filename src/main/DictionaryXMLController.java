package main;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author sonud
 */
public class DictionaryXMLController implements Initializable {

    @FXML
    private Button searchButton;
    @FXML
    private TextField wordTextField;
    @FXML
    private Label meaningDisplay;
DictionaryUsingHashMap d = new DictionaryUsingHashMap();
    @FXML
    private Label wordLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void search(ActionEvent event) {
// creating dictionary object for meaning checking
                        //getting the word form the text entered by user
                String word = wordTextField.getText();
             
                // checking word is worong
                if(word.isBlank() || word.isEmpty()) {
                    meaningDisplay.setText("Please enter a meaningful word!!!");
                    meaningDisplay.setTextFill(Color.RED);
                }
                else{
                    String meaning = d.getMeaning(word);
                    if("Meaning not found!!!".equals(meaning)){
                        meaningDisplay.setText(meaning);
                        meaningDisplay.setTextFill(Color.RED);
                    }
                    else {
                        wordLabel.setText(word);
                        meaningDisplay.setText(meaning);
                        meaningDisplay.wrapTextProperty();
                        meaningDisplay.setTextFill(Color.BLUE);
                    }
                }
    }
    
}
