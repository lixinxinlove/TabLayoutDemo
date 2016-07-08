package com.lixinxin.twer.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lixinxin.twer.R;
import com.lixinxin.twer.ui.base.BaseFragment;
import com.lixinxin.twer.utils.BlurTransformation;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends BaseFragment {


    ImageView imageView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        imageView = (ImageView) view.findViewById(R.id.iv);
        initData();
        return view;
    }

    private void initData() {
        // Glide.with(getContext()).load(R.mipmap.m4).into(imageView);
        Glide.with(getActivity()).load(R.mipmap.m4).into(imageView);

    }

}
