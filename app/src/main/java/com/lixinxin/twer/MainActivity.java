package com.lixinxin.twer;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.lixinxin.twer.bean.Music;
import com.lixinxin.twer.factory.PagerFactory;
import com.lixinxin.twer.retrofit.MusicApi;
import com.lixinxin.twer.retrofit.MusicRetrofit;
import com.lixinxin.twer.ui.adapter.TabFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;


    private List<Fragment> fragments;
    private List<String> titles;
    private TabFragmentAdapter adpater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();
        initTab();
        viewPager.addOnPageChangeListener(this);
    }

    private void initData() {
        titles = new ArrayList<>();
        fragments = new ArrayList<>();
        titles.add("精选");
        titles.add("体育");
        titles.add("巴萨");
        titles.add("购物");
        titles.add("明星");

        for (int i = 0; i < titles.size(); i++) {
            fragments.add(PagerFactory.getFragment(i));
        }

        adpater = new TabFragmentAdapter(getSupportFragmentManager(), fragments, titles);

    }

    private void initTab() {
        for (int i = 0; i < titles.size(); i++) {
            tabLayout.addTab(tabLayout.newTab().setText(titles.get(i)));
        }
        viewPager.setAdapter(adpater);
        tabLayout.setupWithViewPager(viewPager);
        TabLayout.Tab tab = tabLayout.getTabAt(0);
        viewPager.setCurrentItem(1);
        if (tab != null) {
            View item = View.inflate(this, R.layout.tab_view, null);
            tab.setCustomView(item);
        }
        viewPager.setCurrentItem(0);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


//    @OnClick(R.id.btn)
//    public void bOnClick(View v) {
//        MusicRetrofit.getRetrofit().create(MusicApi.class)
//                .getMusicData("红玫瑰", 1, 2)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<Music>() {
//                    @Override
//                    public void onCompleted() {
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.e("lxx", "失败");
//                    }
//
//                    @Override
//                    public void onNext(Music music) {
//                        Log.e("lxx", music.getError_msg());
//                    }
//                });
    //   }
}
