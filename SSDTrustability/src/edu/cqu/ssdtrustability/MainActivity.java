package edu.cqu.ssdtrustability;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	EditText edt1;
	EditText edt2;
	EditText edt3;
	Button bt1; //开始按钮
	Button bt2; //复位按钮
	Button bt3; //退出按钮

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edt1 = (EditText) findViewById(R.id.editText1);
		edt2 = (EditText) findViewById(R.id.editText2);
		edt3 = (EditText) findViewById(R.id.editText3);
		bt1 = (Button) findViewById(R.id.button1);
		bt2 = (Button) findViewById(R.id.button2);
		bt3 = (Button) findViewById(R.id.button3);
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override//
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				WriteFiles(edt1.getText().toString());
			}
		});
		
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edt1.setText("");
				edt2.setText("");
				edt3.setText("");
				
			}
		});
		
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
	}
	
	//保存文件内容
		public void WriteFiles(String content){
			 try {
				FileOutputStream fos = openFileOutput("a.txt", MODE_WORLD_READABLE+MODE_WORLD_WRITEABLE);
				 fos.write(content.getBytes());
				 fos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
	
	
	
	
	
}
