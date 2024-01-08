package ex.sdkteam.linkidink;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import ex.sdkteam.linkidink.http.*;

public class MainController {

    /* Class Constructors for UI Objects */
    Filter f = new Filter();

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
    Label Test_Label = new Label();
    @FXML
    ProgressBar Indicator_ProgressBar = new ProgressBar();
    @FXML
    ImageView Progress_Icon_ImageView = new ImageView();

    public void Send_Button_ClickEvent(MouseEvent event) {
        Input_TextField.getText();
    }


    public void initiateRequest() {

    }

}
