module dev.milong0.pooejemplo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens dev.milong0.pooejemplo1 to javafx.fxml;
    exports dev.milong0.pooejemplo1;
}