package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



	

	public class MainActivity extends Activity {
		Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,point,cancel,equal;
		EditText edit;
		float opt1,opt2;
		String optr;

		protected void onCreate(Bundle savedInstanceState) {
			
			
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
	    	
			one=(Button)findViewById(R.id.buttoneleven);
			two=(Button)findViewById(R.id.buttonen);
			three=(Button)findViewById(R.id.buttonine);
			four=(Button)findViewById(R.id.buttonfive);
			five=(Button)findViewById(R.id.buttonsix);
			six=(Button)findViewById(R.id.buttonseven);
			seven=(Button)findViewById(R.id.buttonone);
			eight=(Button)findViewById(R.id.buttontwo);
			nine=(Button)findViewById(R.id.buttonthree);
			zero=(Button)findViewById(R.id.buttonfourten);
			point=(Button)findViewById(R.id.buttonseventeen);
			add=(Button)findViewById(R.id.Buttonfifteen);
			sub=(Button)findViewById(R.id.buttontwelve);
			mul=(Button)findViewById(R.id.buttoneight);
			div=(Button)findViewById(R.id.buttonfour);
			cancel=(Button)findViewById(R.id.buttonthreteen);
			equal=(Button)findViewById(R.id.Buttonsisxteen);
			edit=(EditText)findViewById(R.id.editTextone);
			
		       
		}	 
			
		  
		public void operation()
		{
			if(optr.equals("+"))
			{
				opt2=Float.parseFloat(edit.getText().toString());
				edit.setText(" ");
				opt1=opt1+opt2;
				edit.setText(Float.toString(opt1));
			}
			else if(optr.equals("-"))
			{
				opt2=Float.parseFloat(edit.getText().toString());
				edit.setText(" ");
				opt1=opt1-opt2;
				edit.setText(Float.toString(opt1));
			}
			else if(optr.equals("*"))
			{
				opt2=Float.parseFloat(edit.getText().toString());
				edit.setText(" ");
				opt1=opt1*opt2;
				edit.setText(Float.toString(opt1));
			}
			else 
			{
				
				
					opt2=Float.parseFloat(edit.getText().toString());
					edit.setText("");
					opt1=opt1/opt2;
					edit.setText(Float.toString(opt1));
				
			}
				
		}
			public void onPerformClick(View v)
			{
				 Editable str=edit.getText();
				 switch(v.getId())

				 {
				 case R.id.buttoneleven:
				 { 
					 if(opt2 !=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(one.getText());
				 }
				 break;
				 case R.id.buttonen:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(two.getText());
					 edit.setText(str);
					 break;
				 }
				 case R.id.buttonine:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText( " ");
					 }
					 str=str.append(three.getText());
					 edit.setText(str);
					 break;
				}
				 
				 case R.id.buttonfive:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(four.getText());
					 edit.setText(str);
					 break;
				 }
				 case R.id.buttonsix:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(five.getText());
					 edit.setText(str);
					 break;
				 }
				 case R.id.buttonseven:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(six.getText());
					 edit.setText(str);
					 break;
				 }
				 case R.id.buttonone:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(seven.getText());
					 edit.setText(str);
					 break;
				 }
				 case R.id.buttontwo:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(eight.getText());
					 edit.setText(str);
					 break;
				 }
				 case R.id.buttonthree:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(nine.getText());
					 edit.setText(str);
					 break;
				 }
				 case R.id.buttonfourten:
				 {
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(zero.getText());
					 edit.setText(str);
					 break;
				 }
				 case R.id.buttonseventeen:
				 {
					try
					{
					 if(opt2!=0)
					 {
						 opt2=0;
						 edit.setText("");
					 }
					 str=str.append(point.getText());
					 edit.setText(str);
					 break;
				 }
				catch(NumberFormatException e )
				{
					
				}
				}
				 case R.id.Buttonfifteen:
				 {
					try{
					
					 optr = "+";
					 if(opt1 == 0)
					 
					 { 
						 opt1 = Float.parseFloat(edit.getText().toString()); 
						 edit.setText(""); 
					  } 
					 
					 else if(opt2 != 0)
					 
					 { 
						 opt2 = 0; 
						 edit.setText("");
						 
					 }
					 else
					 { 
						 opt2 = Float.parseFloat(edit.getText().toString());
						 edit.setText(""); 
						 opt1 = opt1 + opt2; 
						 edit.setText(Float.toString(opt1)); 
						 
					 }
					 break;
				 }
				
				 catch(NumberFormatException e){
					 
				 }
				 }
				 case R.id.buttontwelve:
				 {
					 try{
					   optr = "-";
					 if(opt1 == 0)
					 { 
						 opt1 = Float.parseFloat(edit.getText().toString());
					     edit.setText(""); 
					     
					 } 
					 else if(opt2 != 0)
					 { 
						 opt2 = 0; 
						 edit.setText(""); 
						 
					 } 
					 else
					 { 
						 opt2 = Float.parseFloat(edit.getText().toString()); 
					     edit.setText(""); 
					     opt1 = opt1 - opt2; 
					     edit.setText( Float.toString(opt1)); 
					     
					 }

					
					 break;
				 }
					 catch(NumberFormatException e)
					 {
						 
					 }
					 }
				 case R.id.buttoneight:
				 {
					
					 try{
					 
						 optr = "*";
					 
					 if(opt1 == 0)
					 { 
						 opt1 = Float.parseFloat(edit.getText().toString());
					     edit.setText(""); 
					     
					 } 
					 else if(opt2 != 0)
					 { 
						 opt2 = 0; 
						 edit.setText(""); 
						 
					 } 
					 else
					 { 
						 opt2 = Float.parseFloat(edit.getText().toString()); 
					     edit.setText(""); 
					     opt1 = opt1 * opt2; 
					     edit.setText(Float.toString(opt1)); 
					     
					 }

					 break;
				 }
				 catch(NumberFormatException e)
				 {
				 
				 }
				 
				 }
				
				 case R.id.buttonfour:
				 {
					 try{
					 optr = "/";
					 if(opt1 == 0)
					 { 
						 opt1 = Float.parseFloat(edit.getText().toString());
					     edit.setText(""); 
					     
					 } 
					 else if(opt2 != 0)
					 { 
						 opt2 = 0; 
						 edit.setText(""); 
						 
					 } 
					 else
					 { 
						 opt2 = Integer.parseInt(edit.getText().toString()); 
					     edit.setText(""); 
					     opt1 = opt1 / opt2; 
					     edit.setText(Float.toString(opt1)); 
					     
					 }
					 break;
					 
				 }
					 catch(NumberFormatException e)
					 {
				 }
				 }
				 case R.id.buttonthreteen://cancel button
				 {
					 opt1 = 0; 
					 opt2 = 0; 
					 edit.setText(""); 
				//	 edit.setHint("Perform Operation :)");
					 break;

					 
				 }
				 case R.id.Buttonsisxteen://equall buttom
				 {
					 if(!optr.equals(null))
					 {
						 if(opt2!=0)
						 {
							 if(optr.equals("+"))
							 {
								 edit.setText(" ");
								 edit.setText(Float.toString(opt1));
							 }
							 else if(optr.equals("-"))
							 {
								 edit.setText(" ");
								 edit.setText(Float.toString(opt1));
								 
							 }
							 else if(optr.equals("*"))
							 {
								 edit.setText(" ");
								 edit.setText(Float.toString(opt1));
							 }
							 else if(optr.equals("/"))
							 {
								 edit.setText(" ");
								 edit.setText(Float.toString(opt1));
							 }
						 }
						 else
						 {
							 operation();
						 }
					 }
					 break;
				 }
			}
				 
			
			}
			} 