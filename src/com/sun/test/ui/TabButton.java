package com.sun.test.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Button;

public class TabButton extends Button {
	private int normal_bg_res;
	private int selected_bg_res;
	private int type = 0;

	public TabButton(Context context) {
		super(context);
	}

	public TabButton(Context context, AttributeSet attrs) {
		super(context, attrs);

		TypedArray typeArray = context.obtainStyledAttributes(attrs,
				R.styleable.TabButton);
		normal_bg_res = typeArray.getResourceId(
				R.styleable.TabButton_normal_bg, 0);
		selected_bg_res = typeArray.getResourceId(
				R.styleable.TabButton_selected_bg, 0);
		type = typeArray.getInt(R.styleable.TabButton_type, 1);
		typeArray.recycle();
	}

	/*
	 * ���ﱾ����׼���Զ���һ���������Ա���Activity�е��ã�
	 * ����д�귢��Button�ĸ���TextView���Ѿ�����ͬ�������������Զ������˸��ǣ���������ν����Ӱ��Ч��
	 */
	public void setSelected(boolean selected) {
		if (normal_bg_res == 0 || selected_bg_res == 0) {
			switch (type) {
			case 0:
				setBgType(selected, R.drawable.tab_left,
						R.drawable.tab_left_nor);
				break;
			case 1:
				setBgType(selected, R.drawable.tab_mid, R.drawable.tab_mid_nor);
				break;
			case 2:
				setBgType(selected, R.drawable.tab_right,
						R.drawable.tab_right_nor);
				break;
			default:
				break;
			}
			return;
		}
		setBgType(selected, selected_bg_res, normal_bg_res);
	}

	public void setBgType(boolean isSelect, int bgSelect, int bgNor) {
		if (isSelect) {
			setBackgroundResource(bgSelect);
			setTextColor(Color.WHITE);
		} else {
			setBackgroundResource(bgNor);
			setTextColor(Color.GRAY);
		}
	}

}
