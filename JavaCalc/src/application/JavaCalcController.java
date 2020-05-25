package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class JavaCalcController implements Initializable{
	
	@FXML private TextField txtDisp;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;
	@FXML private Button btn0;
	@FXML private Button btnClear;
	@FXML private Button btnDiv;
	@FXML private Button btnMulti;
	@FXML private Button btnMinus;
	@FXML private Button btnPlus;
	@FXML private Button btnEqual;
	 @FXML private TextField tfNum1, tfNum2;
	private int operator;
	private int firstNum;
	private int secondNum;

	
	


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn0.setOnAction(event->btn0Handler());
		btn1.setOnAction(event->btn1Handler());
		btn2.setOnAction(event->btn2Handler());
		btn3.setOnAction(event->btn3Handler());
		btn4.setOnAction(event->btn4Handler());
		btn5.setOnAction(event->btn5Handler());
		btn6.setOnAction(event->btn6Handler());
		btn7.setOnAction(event->btn7Handler());
		btn8.setOnAction(event->btn8Handler());
		btn9.setOnAction(event->btn9Handler());
		btnClear.setOnAction(event->btnClearHandler());
		btnDiv.setOnAction(event->btnDivHandler());
		btnMulti.setOnAction(event->btnMultiHandler());
		btnMinus.setOnAction(event->btnMinusHandler());
		btnPlus.setOnAction(event->btnPlusHandler());
		btnEqual.setOnAction(event->btnEqualHandler());
	
		
		
	} // initialize end
	
	public void btn0Handler() {
		txtDisp.setText("0");
		if(firstNum != 0) {
			secondNum = 0;
		}else {
			firstNum = 0;
		}
	}
	
		
	
	
	public void btn1Handler() {
		txtDisp.setText("1");
		
		if(firstNum == 0) {
			secondNum = 1;
		}else {
			firstNum = 1;
		}
		
	}
	public void btn2Handler() {
		txtDisp.setText("2");
		secondNum = 2;
		
	}
	public void btn3Handler() {

	}
	public void btn4Handler() {

	}
	public void btn5Handler() {

	}
	public void btn6Handler() {

	}
	public void btn7Handler() {

	}
	public void btn8Handler() {

	}
	public void btn9Handler() {

	}

	

	public void btnDivHandler() {
		operator = 1;
		System.out.println("/");
	}
	public void btnMultiHandler() {
		operator = 2;
		System.out.println("*");
		
	}
	public void btnMinusHandler() {
		operator = 3;
		System.out.println("-");
	}
	public void btnPlusHandler() {
		operator = 4;
		System.out.println("+");
		
	}
	public void btnEqualHandler() {

        
        
		int result = 0;
		switch(operator) {
		case 1:
			result = firstNum / secondNum;
			break;
		case 2:
			result = firstNum * secondNum;
			break;
		case 3:
			result = firstNum - secondNum;
			break;
		case 4:
			result = firstNum + secondNum;
			break;
			
			}
		
	txtDisp.setText(""+result);
	
	
}
	public void btnClearHandler(){
		txtDisp.clear();
		txtDisp.setText("0");
		operator = 0;
		firstNum = 0;
		secondNum = 0;
		
		
	}
}