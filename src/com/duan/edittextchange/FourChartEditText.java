package com.duan.edittextchange;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class FourChartEditText extends EditText {

	public FourChartEditText(Context context, AttributeSet attrs) {
		super(context, attrs);

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		
		if (count == 1) {
			if ((s.length() + 1) % 5 == 0) {
				setText(s + " ");
				setSelection(s.length() + 1);
			}
		}  else if (count == 0) {
			if (s.length() > 0 && s.length() % 5 == 0) {
				setText(s.subSequence(0, s.length() - 1));
				setSelection(s.length() - 1);
			}
		}
		
	} 
	

}
