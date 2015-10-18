/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/10/9 3:49:18
 * Project: ShootBox
 * File: MyLinerLayout.java
 * Class: MyLinerLayout
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

package com.shootbox.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.shootbox.R;

/**
 * Created by yangyankai on 2015/10/9.
 */
public class MyLinerLayout extends LinearLayout {
	public MyLinerLayout(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		LayoutInflater mInflater = LayoutInflater.from(context);
		View myView = mInflater.inflate(R.layout.my_linearlayout, null);
		addView(myView);

	}

	public MyLinerLayout(Context context)
	{
		super(context);
		LayoutInflater mInflater = LayoutInflater.from(context);
		View myView = mInflater.inflate(R.layout.my_linearlayout, null);
		addView(myView);

	}

	public MyLinerLayout(Context context, AttributeSet attrs, int defStyleAttr)
	{
		super(context, attrs, defStyleAttr);
		LayoutInflater mInflater = LayoutInflater.from(context);
		View myView = mInflater.inflate(R.layout.my_linearlayout, null);
		addView(myView);
	}
}
