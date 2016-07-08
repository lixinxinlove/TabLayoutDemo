package com.lixinxin.twer.factory;

import android.util.Log;
import android.widget.Toast;

import com.lixinxin.twer.ui.base.BaseFragment;
import com.lixinxin.twer.ui.fragment.BlankFragment;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lixinxin on 2016/7/8.
 * 缓存 fragment
 */
public class PagerFactory {

    private static Map<Integer, BaseFragment> mCaches = new LinkedHashMap<Integer, BaseFragment>();

    public static BaseFragment getFragment(int position) {
        BaseFragment fragment = mCaches.get(position);

        if (fragment != null) {
            Log.e("lxx", "缓存离得数据" + position);
            return fragment;
        }

        switch (position) {
            case 0:
                fragment = new BlankFragment();
                break;
            case 1:
                fragment = new BlankFragment();
                break;
            case 2:
                fragment = new BlankFragment();
                break;
            case 3:
                fragment = new BlankFragment();
                break;
            case 4:
                fragment = new BlankFragment();
                break;
        }

        mCaches.put(position, fragment);
        Log.e("lxx", "添加到缓存" + position);
        return fragment;
    }

}
