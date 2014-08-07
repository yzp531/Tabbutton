package com.sun.test.ui;

import android.app.Activity;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class TestActivity extends Activity implements OnClickListener {
	private TabButton left;
	private TabButton center;
	private TabButton right;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		left = (TabButton) findViewById(R.id.btn_left);
		left.setOnClickListener(this);

		center = (TabButton) findViewById(R.id.btn_center);
		center.setOnClickListener(this);

		right = (TabButton) findViewById(R.id.btn_right);
		right.setOnClickListener(this);

		resetState(R.id.btn_left);
		
	}

	public void onClick(View v) {
		resetState(v.getId());
	}

	private void resetState(int id) {
		// 将三个按钮背景设置为未选中
		left.setSelected(false);
		center.setSelected(false);
		right.setSelected(false);
		
		// 将点击的按钮背景设置为已选中
		switch (id) {
		case R.id.btn_left:
			left.setSelected(true);
			break;
		case R.id.btn_center:
			center.setSelected(true);
			break;
		case R.id.btn_right:
			right.setSelected(true);
			break;
		}
	}
}