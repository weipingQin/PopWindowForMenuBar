package com.qinweiping.popwindow;

import com.example.popwindowformenubar.R;
import com.qinweiping.common.AppUtil;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class PopWindowForMenuBar extends Activity {

	private ActionBar mActionBar;
	protected LayoutInflater mLayoutInflater;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mLayoutInflater.from(this);
		setContentView(R.layout.popwindowmenubar);
		init();
	}

	//
	private void init(){
		initActionBar("µ¯´°²Ëµ¥",true);
	}

	@SuppressLint("NewApi")
	private void initActionBar(final String str,boolean isShow){
		mActionBar = getActionBar();
		if(!isShow){
			mActionBar.hide();
			return;
		}
		mActionBar.setDisplayHomeAsUpEnabled(false);
		mActionBar.setDisplayShowCustomEnabled(true);
		mActionBar.setDisplayShowHomeEnabled(false);
		mActionBar.setDisplayShowTitleEnabled(true);
		View view = mLayoutInflater.inflate(R.layout.actionbar, null);
		TextView backView = (TextView)view.findViewById(R.id.actionbar_back);
		TextView titleView = (TextView)view.findViewById(R.id.actionbar_title);
		backView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
		titleView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if(AppUtil.isNotEmpty(str)){
					
				}
			}
		});
	}
	
	private void initMenu(){
		TextView btnCopy  = (TextView)findViewById(R.id.actionbar_menu_item1);
		TextView btnCut   = (TextView)findViewById(R.id.actionbar_menu_item2);
		TextView btnPaste = (TextView)findViewById(R.id.actionbar_menu_item3);
	}
	
}
