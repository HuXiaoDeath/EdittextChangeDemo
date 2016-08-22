package com.duan.edittextchange;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {



	private FourChartEditText mEdit;
	private TextView mText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mEdit = (FourChartEditText) findViewById(R.id.edit_text);
		mText = (TextView) findViewById(R.id.text);
		findViewById(R.id.button).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				String trim = mEdit.getText().toString().trim();
				mText.setText(getStringTrim(trim));
			}
		});
		
	}

	/**
	 * 去掉数字中的空格
	 * @param str
	 * @return
	 */
	private  String getStringTrim(String str){
		if(TextUtils.isEmpty(str)){
			return "";
		}
		StringBuffer content = new StringBuffer();
		char[] charArray = str.toCharArray();
		for(char charArr : charArray){
			if(!String.valueOf(charArr).equals(" ")){
				content.append(charArr);			
			}
		}
		
		str = content.toString();
		
		return str;
	}
	
	/**
	 * 去掉数字中的空格
	 * @param str
	 * @return
	 */
	private  String remove(String str) {

		int length = str.length();
		StringBuffer sb = new StringBuffer();
		int start = 0, end;
		for (int i = 0; i < length; i++) {
			char c = str.charAt(i);

			end = i;
			if (c == 32 || end == length - 1) {
				String temp;
				if (end == length - 1) {
					temp = str.substring(start, end + 1);
				} else {
					temp = str.substring(start, end);
				}
				sb.append(temp);
				start = i + 1;

			}

		}
		return sb.toString();
	}

}
