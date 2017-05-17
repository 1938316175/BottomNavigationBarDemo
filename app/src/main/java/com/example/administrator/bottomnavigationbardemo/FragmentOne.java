package com.example.administrator.bottomnavigationbardemo;

import android.os.Bundle;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class FragmentOne extends BaseFragment {
    public static FragmentOne newInstance(String s){
        Bundle bundle = new Bundle();
        bundle.putString("key_name",s);
        FragmentOne fragment = new FragmentOne();
        fragment.setArguments(bundle);
        return fragment;
    }
}
