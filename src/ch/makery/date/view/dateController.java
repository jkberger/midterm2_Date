package ch.makery.date.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class dateController {

	@FXML
    private Label Month;
    @FXML
    private Label Day;
    @FXML
    private Label Year;
    
    @FXML
	private void initialize() {
	    //setting cell value to the value in the month day year sections
	    Month.setCellValueFactory(
	            cellData -> cellData.getValue().Month());
	    Day.setCellValueFactory(
	            cellData -> cellData.getValue().Day());
	    Year.setCellValueFactory(
	    		cellData -> cellData.getValue().Year());
	
	    private void showPersonDetails(Person person) {
	        if (person != null) {
	            
	            MonthLabel.setText(person.getMonth());
	            DayLabel.setText(person.getDay());
	            YearLabel.setText(person.getYear());
	            

	         
	        } else {
	            
	            MonthLabel.setText("");
	            DayLabel.setText("");
	            YearLabel.setText("");
	           
	        }
	    }
	    
	    if (Month == january, march, may, july, august, october, december){
	    
	    		DayMax == 31;
	    }else if (Month == april, june, september, november){
	    			DayMax == 30;
	    }else if (Month == february){
	    				if (Year == 2008 + 4){
	    					Day == 29;
	    				}
	    			}
	    		
	    		}
	    
    }

