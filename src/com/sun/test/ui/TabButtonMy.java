package com.sun.test.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

public class TabButtonMy extends Button {
	private int normal_bg_res;
	private int selected_bg_res;
	private int type;

	public TabButtonMy(Context context) {
		super(context);
	}

	public TabButtonMy(Context context, AttributeSet attrs) {
		super(context, attrs);
//		
		TypedArray typeArray = context.obtainStyledAttributes(attrs, R.styleable.TabButton);
		normal_bg_res = typeArray.getResourceId(R.styleable.TabButton_normal_bg, 0);
		selected_bg_res = typeArray.getResourceId(R.styleable.TabButton_selected_bg, 0);
		typeArray.recycle();
		System.out.println(12);
	}
	
	/*
	 * ���ﱾ����׼���Զ���һ���������Ա���Activity�е��ã�
	 * ����д�귢��Button�ĸ���TextView���Ѿ�����ͬ�������������Զ������˸��ǣ���������ν����Ӱ��Ч��
	 */
	public void setSelected(boolean selected) {
		if (selected) {
			//setBackgroundResource(selected_bg_res);
			//setTextColor(Color.WHITE);
			//setSelected(true);
		} else {
			//setBackgroundResource(normal_bg_res);
			//setTextColor(Color.GRAY);
			//setSelected(false);
		}
		//setSelected(true);
	}
	
	
}
