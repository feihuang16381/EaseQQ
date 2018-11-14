package com.cqut.faymong.simpleqq.ui.fragment.third;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cqut.faymong.simpleqq.R;
import com.cqut.faymong.simpleqq.base.BaseMainFragment;
import com.cqut.faymong.simpleqq.ui.fragment.second.QQSecondFragment;

/**
 * Created by fei on 2018/11/10.
 */

public class QQThirdFragment extends BaseMainFragment {
    public static QQThirdFragment newInstance() {

        Bundle args = new Bundle();

        QQThirdFragment fragment = new QQThirdFragment();
        fragment.setArguments(args);

        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.d3, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /*if (findChildFragment(ViewPagerFragment.class) == null) {
            loadRootFragment(R.id.fl_second_container, ViewPagerFragment.newInstance());
        }*/
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        // 这里可以不用懒加载,因为Adapter的场景下,Adapter内的子Fragment只有在父Fragment是show状态时,才会被Attach,Create+
    }

}
