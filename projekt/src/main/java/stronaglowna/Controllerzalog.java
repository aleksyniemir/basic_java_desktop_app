/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stronaglowna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author konra
 */
public class Controllerzalog {
    Stage stagezalog;
    Scene scenelogout;
    
    
    
    @FXML
    void initialize() {
        
    }
    
    @FXML
    public void onActionlogoutBu(ActionEvent e) {
        logout();
        
    }
    

    public void logout(){
        stagezalog.setScene(scenelogout);      
    }
}
