package application;


import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{

	//버튼선언할때 필요
	@FXML private Button btnClear;
	@FXML private Button btnRegister;
	
	@FXML private TextField txtUid;
	@FXML private TextField txtName;
	@FXML private TextField txtPos;
	@FXML private TextField txtTel;
	@FXML private DatePicker txtRegDate;
	
	
	
	
	//추상메써드를 재정의
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		btnRegister.setOnAction(event -> btnRegister());
		
		
		
		//초기화버튼 이벤트 핸들러
		btnClear.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
//				System.out.println("초기화 버튼을 클릭했습니다.");
				txtUid.clear();
				txtName.clear();
				txtPos.clear();
				txtTel.clear();
				txtRegDate.getEditor().clear();
								
			}
		});
		
	}






	public void btnRegister() {
		
		String uid  	= txtUid.getText();
		String name  	= txtName.getText();
		String pos  	= txtPos.getText();
		String tel  	= txtTel.getText();
		String regDate  = txtRegDate.getEditor().getText();
		
		
		System.out.println("===================");
		System.out.println("ID : "+uid);
		System.out.println("Name : "+name);
		System.out.println("Pos : "+pos);
		System.out.println("Tel : "+tel);
		System.out.println("Birth : "+regDate);
		
		
		
		System.out.println("직원등록 버튼을 클릭했습니다.");
	}
	
	
	
}
