package application;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
public class RegisterController implements Initializable{
	
    @FXML
    private ComboBox<String> cbo_City;

    @FXML
    private CheckBox chk_Java;

    @FXML
    private CheckBox chk_Javascript;

    @FXML
    private CheckBox chk_Php;

    @FXML
    private ToggleGroup genter_gp;

    @FXML
    private DatePicker txt_Birthday;


    @FXML
    private TextField txt_Email;

    @FXML
    private TextArea txt_Others;

    @FXML
    private PasswordField txt_Password;
    
    @FXML
    void btn_Register_click(ActionEvent event) {
    	String email = txt_Email.getText();
    	String pass = txt_Password.getText();
    	String city = cbo_City.getSelectionModel().getSelectedItem();
    	LocalDate dob = txt_Birthday.getValue();
    	String other_info = txt_Others.getText();
    	RadioButton selectRadio = (RadioButton) genter_gp.getSelectedToggle();
    	String gender = selectRadio.getText();
    	String skillset = "";
    	if(chk_Java.isSelected()) {
    		skillset += chk_Java.getText() + ",";
    	}
    	if(chk_Javascript.isSelected()) {
    		skillset += chk_Javascript.getText() + ",";
    	}
    	if(chk_Php.isSelected()) {
    		skillset += chk_Php.getText() + ",";
    	}
    	skillset = skillset.substring(0,skillset.lastIndexOf(","));
    	System.out.println("-----Profile Data------");
    	System.out.println("Email: " + email);
    	System.out.println("Password: " + pass);
    	System.out.println("City: " + city);
    	System.out.println("Birthday: " + dob);
    	System.out.println("Genter: " + gender);
    	System.out.println("Other Info: " + other_info);
    	System.out.println("Skillsets: " + skillset);
    }

    @FXML
    void lblLogin_click(MouseEvent event) throws IOException {
    	Main.changeScene("Sample.fxml");
    }
    
    @FXML
    void txt_Clear_click(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<String> cities = List.of("Yangon","Mandalay","PyinOOLwin");
		cbo_City.setItems(FXCollections.observableArrayList(cities));
		
	}
}
