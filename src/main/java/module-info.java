module ex.sdkteam.linkidink {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ex.sdkteam.linkidink to javafx.fxml;
    exports ex.sdkteam.linkidink;
}