package ku.cs.basicjavafx;

import ku.cs.services.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "Book Application", 600, 400);
        configRoute();
        FXRouter.goTo("book");
    }

    public static void configRoute() {
        String viewPath = "ku/cs/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
        FXRouter.when("book", viewPath + "book-view.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}