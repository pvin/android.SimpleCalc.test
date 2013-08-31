package com.example.simplecalc.test;

import android.graphics.Rect;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.Button;


import android.test.ActivityInstrumentationTestCase2;  
import android.view.View;  
import android.widget.Button;  
import com.example.simplecalc.MainActivity;  
import com.example.simplecalc.R;  

public class LayoutTests extends ActivityInstrumentationTestCase2<MainActivity> {  
	   private Button addValues;  
	   private Button multiplyValues;  
	   private View mainLayout;  
	   public LayoutTests() {  
	       super("com.mamlambo.article.simplecalc", MainActivity.class);  
	   }  
	   protected void setUp() throws Exception {  
	       super.setUp();  
	       MainActivity mainActivity = getActivity();  
	       addValues = (Button) mainActivity.findViewById(R.id.addValues);  
	       multiplyValues = (Button) mainActivity  
	               .findViewById(R.id.multiplyValues);  
	       mainLayout = (View) mainActivity.findViewById(R.id.resultLabel);  
	   }  
	   
	   public void testAddButtonOnScreen() {  
		   int fullWidth = mainLayout.getWidth();  
		   int fullHeight = mainLayout.getHeight();  
		   int[] mainLayoutLocation = new int[2];  
		   mainLayout.getLocationOnScreen(mainLayoutLocation);  
		   int[] viewLocation = new int[2];  
		   addValues.getLocationOnScreen(viewLocation);  
		   Rect outRect = new Rect();  
		   addValues.getDrawingRect(outRect);  
		   assertTrue("Add button off the right of the screen", fullWidth  
		           + mainLayoutLocation[0] > outRect.width() + viewLocation[0]);  
		   assertTrue("Add button off the bottom of the screen", fullHeight  
		           + mainLayoutLocation[1] > outRect.height() + viewLocation[1]);  
		} 
	}  
