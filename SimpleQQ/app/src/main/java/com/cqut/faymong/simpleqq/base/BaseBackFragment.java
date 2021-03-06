package com.cqut.faymong.simpleqq.base;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cqut.faymong.simpleqq.R;

import me.yokeyword.fragmentation.SupportFragment;


/**
 * Created by fei on 16/2/7.
 */
public class BaseBackFragment extends SupportFragment {

    protected void initToolbarNav(Toolbar toolbar) {
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _mActivity.onBackPressed();
            }
        });
    }
}
