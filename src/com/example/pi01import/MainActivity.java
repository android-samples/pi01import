package com.example.pi01import;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private int mCount = 0;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar1);
        seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
		    	TextView text = (TextView)findViewById(R.id.textView1);
		    	text.setText("PROGRESS = " + progress);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    // ボタンメソッド
    public void buttonMethodHello(View button){
    	TextView text = (TextView)findViewById(R.id.textView1);
    	EditText edit = (EditText)findViewById(R.id.editText1);
    	text.setText("Hello " + edit.getText().toString() + " " + mCount);
    	mCount++;
    }
    public void buttonMethodToast(View button){
    	Toast.makeText(this, "Hello" + mCount, Toast.LENGTH_SHORT).show();
    	mCount++;
    }
    
    // ラジオボタン押下時
    public void radioMethod(View _radio){
    	RadioButton radio = (RadioButton)_radio;
    	String msg = "ラジオボタン" + radio.getText() + "が選択されました。";
    	TextView text = (TextView)findViewById(R.id.textView1);
    	text.setText(msg);
    }
    
    // チェックボタン押下時
    public void checkMethod(View _check){
    	CheckBox check = (CheckBox)_check;
    	String msg = "チェックボックス" + check.getText() + (check.isChecked() ? "が選択されました。" : "選択解除されました。");
    	TextView text = (TextView)findViewById(R.id.textView1);
    	text.setText(msg);
    }
    
    
    
    
}
