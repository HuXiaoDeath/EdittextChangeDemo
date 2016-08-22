package com.duan.edittextchange;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity1 extends Activity {

	private EditText mEdit_text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
		
		inti();
		
	}

	private void inti() {
		mEdit_text = (EditText) findViewById(R.id.edit_text);
		mEdit_text.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				
				if (count == 1) {
					if ((s.length() + 1) % 5 == 0) {
						mEdit_text.setText(s + " ");
						mEdit_text.setSelection(s.length() + 1);
					}
				}  else if (count == 0) {
					if (s.length() > 0 && s.length() % 5 == 0) {
						mEdit_text.setText(s.subSequence(0, s.length() - 1));
						mEdit_text.setSelection(s.length() - 1);
					}
				}

				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				
			}
			
		});
		
		
		
		
	}

	

}
