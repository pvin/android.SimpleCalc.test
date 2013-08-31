package com.example.simplecalc.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.simplecalc.R;
import com.example.simplecalc.MainActivity;
public class MathValidation extends
		ActivityInstrumentationTestCase2<MainActivity> {
	 private static final String NUMBER_24 = "2 4 ENTER ";
	    private static final String NUMBER_64 = "6 4 ENTER ";
	    private static final String NUMBER_6_DOT_5 = "6 PERIOD 5 ENTER ";
	    private static final String NUMBER_NEG_22 = "MINUS 2 2 ENTER ";

	    private static final String ADD_RESULT = "88";
	    private static final String ADD_DECIMAL_RESULT = "70";
	    private static final String ADD_NEGATIVE_RESULT = "52";
	    private static final String MULTIPLY_RESULT = "1776";
	    
	   // private static final String ADD_DECIMAL_RESULT1 =
	private TextView result;
	public MathValidation() {
		super("com.example.simplecalc",MainActivity.class);
	}

	protected void setUp() throws Exception {  
	       super.setUp();  
	       MainActivity mainActivity = getActivity();  
	       
	       result = (TextView) mainActivity.findViewById(R.id.result);
	   }  

	
   
    public void testAddValues() {  
    	 
    	sendKeys(NUMBER_24 + NUMBER_64 + "ENTER"); 
       //sendKeys(NUMBER_24);  
       // now on value2 entry  
       //sendKeys(NUMBER_74);  
       // now on Add button  
       //sendKeys("ENTER");  
       // get result  
       String mathResult = result.getText().toString();  
       System.out.println("-------********-----" + mathResult +"---********---------");
       assertTrue("Add result should be 98", mathResult.equals(ADD_RESULT));  
      }  
    
//    public void testAddDecimalValues() {
//        sendKeys(NUMBER_6_DOT_5 + NUMBER_64 + "ENTER");
//
//        String mathResult = result.getText().toString();
//        assertTrue("Add result should be 70.5" , mathResult.equals(ADD_DECIMAL_RESULT));
//    }
//    public void testAddDecimalValues() {  
//        sendKeys(NUMBER_5_DOT_5 + NUMBER_74 + "ENTER");  
//        String mathResult = result.getText().toString();  
//        assertTrue("Add result should be " + ADD_DECIMAL_RESULT1 + " but was "  
//                + mathResult, mathResult.equals(ADD_DECIMAL_RESULT1));  
//    }  
}
