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
	}

	//
	private void init(){

	}

	@SuppressLint("NewApi")
	private void initActionBar(String title,boolean isShow){
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
		private OnClickListener onClickListener = new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				switch(arg0.getId()){
				case R.id.actionbar_back:
					finish();
					break;
				case R.id.actionbar_title:
					if(AppUtil.isNotEmpty(title)){
						
					}
					break;
				}
			}
		};
		
		TextView backView = (TextView)view.findViewById(R.id.actionbar_back);
		TextView titleView = (TextView)view.findViewById(R.id.actionbar_title);
		backView.setOnClickListener(onClickListener);
		titleView.setOnClickListener(onClickListener);
	}
	
	private void initMenu(){
		TextView btnCopy  = (TextView)findViewById(R.id.actionbar_menu_item1);
		TextView btnCut   = (TextView)findViewById(R.id.actionbar_menu_item2);
		TextView btnPaste = (TextView)findViewById(R.id.actionbar_menu_item3);
	}
	
}
