package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MainView extends Scene {
    private ListView PatientList;
    private Button ChooseButton;
    private Label Title;
    private TextField NameFilter;
    private ImageView ClearFilter;

    public MainView(int width, int height){
        super(new Pane(), width, height);
        try {
            VBox root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
            setRoot(root);
            PatientList = (ListView) lookup("#PatientList");
            ChooseButton = (Button) lookup("#ChooseButton");
            Title = (Label) lookup("#Title");
            NameFilter = (TextField) lookup("#NameFilter");
            ClearFilter = (ImageView) lookup("#ClearFilter");
        }
        catch (java.io.IOException exception){
            System.out.println(exception.toString());
        }
    }
}