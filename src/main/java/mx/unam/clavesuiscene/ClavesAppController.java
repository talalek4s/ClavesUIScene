package mx.unam.clavesuiscene;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ClavesAppController {

    @FXML
    private Slider slider;

    @FXML
    private TextField claveTextField;

    @FXML
    private Button cerrarButton;

    private DoubleProperty sliderValue = new SimpleDoubleProperty(0.0);
    private StringProperty sliderValueToString = new SimpleStringProperty();
    @FXML
    public void sliderGetValue(MouseEvent me){
        sliderValue.bind(slider.valueProperty());
        claveTextField.setText( sliderValue.getValue().toString());
    }

    private Stage stage;

    public void setStage(Stage stage){
        this.stage = stage;
    }

    @FXML
    public void closeEventHandler(ActionEvent e){

        stage.close();
    }
}