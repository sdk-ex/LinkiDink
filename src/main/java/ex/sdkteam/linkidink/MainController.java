package ex.sdkteam.linkidink;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.io.BufferedReader;

public class MainController {

    /* Class Constructors for UI Objects */

    /* Input and Button UI Constructors */
    @FXML
    TextField Input_TextField = new TextField();
    @FXML
    Button Send_Button = new Button();
    @FXML
    ToggleGroup FileType = new ToggleGroup();

    /* Progress Level and Indicator Constructors */
    @FXML
    Label Indicator_Label = new Label();
    @FXML
    ProgressBar Indicator_ProgressBar = new ProgressBar();
    @FXML
    ImageView Progress_Icon_ImageView = new ImageView();


    public void initiateRequest() {

    }

}
