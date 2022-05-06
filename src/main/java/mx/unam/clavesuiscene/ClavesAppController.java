package mx.unam.clavesuiscene;

import javafx.beans.property.*;
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
    private TextField numeroTextField;

    @FXML
    private Label caracteres;

    @FXML
    private Button cerrarButton;

    private DoubleProperty sliderValue = new SimpleDoubleProperty(0.0);
    private IntegerProperty sliderInt = new SimpleIntegerProperty(0);


    @FXML
    public void sliderGetValue(MouseEvent me){
        sliderValue.bind(slider.valueProperty());
        sliderInt.bind(sliderValue);
        numeroTextField.setText(sliderInt.getValue().toString());
        FuncionGeneradora.KeyGenerator(sliderInt.getValue());
        claveTextField.setText( FuncionGeneradora.KeyGenerator(sliderInt.getValue()));
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