package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class HelloController {
    @FXML
    private void onBackButton() throws IOException {
        FXRouter.goTo("book");
    }
}