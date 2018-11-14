package com.cqut.faymong.simpleqq;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import com.cqut.faymong.simpleqq.base.BaseMainFragment;
import com.cqut.faymong.simpleqq.ui.fragment.MainFragment;
import com.cqut.faymong.simpleqq.ui.fragment.first.QQFirstFragment;
import com.cqut.faymong.simpleqq.ui.fragment.second.QQSecondFragment;
import com.cqut.faymong.simpleqq.ui.fragment.third.QQThirdFragment;
import com.cqut.faymong.simpleqq.view.BottomBar;
import com.cqut.faymong.simpleqq.view.BottomBarTab;

import me.yokeyword.fragmentation.SupportActivity;
import me.yokeyword.fragmentation.SupportFragment;
import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

public class MainActivity extends SupportActivity implements BaseMainFragment.OnBackToFirstListener{
   /* public static final int FIRST = 0;
    public static final int SECOND = 1;
    public static final int THIRD = 2;

    private SupportFragment[] mFragments = new SupportFragment[3];
    private BottomBar mBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ddd", "onCreate: ");
        setContentView(R.layout.activity_main);
        SupportFragment firstFragment = findFragment(QQFirstFragment.class);
        if (firstFragment == null) {
            mFragments[FIRST] = QQFirstFragment.newInstance();
            mFragments[SECOND] = QQSecondFragment.newInstance();
            mFragments[THIRD] = QQThirdFragment.newInstance();


            loadMultipleRootFragment(R.id.fl_container, FIRST,
                   mFragments[FIRST],
                    mFragments[SECOND],
                    mFragments[THIRD])
                 ;
        } else {
            // 这里库已经做了Fragment恢复,所有不需要额外的处理了, 不会出现重叠问题

            // 这里我们需要拿到mFragments的引用
        mFragments[FIRST] = firstFragment;
            mFragments[SECOND] = findFragment(QQSecondFragment.class);
       mFragments[THIRD] = findFragment(QQThirdFragment.class);

        }
        initView();
    }

    private void initView() {

        mBottomBar = (BottomBar) findViewById(R.id.bottomBar);
        mBottomBar.addItem(new BottomBarTab(this, R.drawable.bottombar_message))
                .addItem(new BottomBarTab(this, R.drawable.bottombar_contacts))
                .addItem(new BottomBarTab(this, R.drawable.bottombar_dynamic));


        mBottomBar.setOnTabSelectedListener(new BottomBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position, int prePosition) {
            showHideFragment(mFragments[position], mFragments[prePosition]);
            }
            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

    @Override
    public void onBackPressedSupport() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            pop();
        } else {
            ActivityCompat.finishAfterTransition(this);
        }
    }

    @Override
    public void onBackToFirstFragment() {
        mBottomBar.setCurrentItem(0);
    }*/
   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.wechat_activity_main);

       if (findFragment(MainFragment.class) == null) {
           loadRootFragment(R.id.fl_container, MainFragment.newInstance());
       }
   }

    @Override
    public void onBackPressedSupport() {
        // 对于 4个类别的主Fragment内的回退back逻辑,已经在其onBackPressedSupport里各自处理了
        super.onBackPressedSupport();
    }

    @Override
    public FragmentAnimator onCreateFragmentAnimator() {
        // 设置横向(和安卓4.x动画相同)
        return new DefaultHorizontalAnimator();
    }

    @Override
    public void onBackToFirstFragment() {

    }
}
