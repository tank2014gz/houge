package com.ysp.houge.view;

import com.ysp.houge.R;
import com.ysp.houge.widget.MyActionBar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;



public class RecommendFragment extends BaseFragment{
	
	

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState)
	{
		super.onViewCreated(view, savedInstanceState);
 	}

	@Override
	protected void initActionbar(View view) {
		MyActionBar actionBar = new MyActionBar(getActivity());
		actionBar.setTitle("推荐");
		actionBar.setLeftEnable(false);
		RelativeLayout actionbar = (RelativeLayout)view.findViewById(R.id.rl_actionbar);
		actionbar.addView(actionBar);		
	}

	@Override
	protected int getContentView() {
		return R.layout.fragment_recommend;
	}

	@Override
	protected void initializeViews(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
	}

}
