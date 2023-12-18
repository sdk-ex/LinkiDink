package ex.sdkteam.linkidink;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class MainController {

    /* Class Constructors for UI Objects */

    /* Input and Button UI Constructors */
    @FXML
    ToggleGroup FileType = new ToggleGroup();

    /* Progress Level and Indicator Constructors */
    @FXML
    Label Indicator_Label = new Label();
    @FXML
    ProgressBar Indicator_ProgressBar = new ProgressBar();
    @FXML
    ImageView Progress_Icon_ImageView = new ImageView();




}
