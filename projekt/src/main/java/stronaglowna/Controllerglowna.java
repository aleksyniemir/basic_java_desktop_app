/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stronaglowna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author konra
 */
public class Controllerglowna {
    
    Stage stagecon;
    Scene scenecon1;
    Scene scenecon2;
    
    
    @FXML
    void initialize() {
        
    }
    
    @FXML
    public void onActionloginBu(ActionEvent e) {
        changescene(1);
        
    }
    
    @FXML
    public void onActionregisterBu(ActionEvent e) {
        changescene(2);
        
    }

    public void changescene(int i){
        if(i==1)
        stagecon.setScene(scenecon1);
        else if(i==2)
        stagecon.setScene(scenecon2);    
        
    }
    
}
