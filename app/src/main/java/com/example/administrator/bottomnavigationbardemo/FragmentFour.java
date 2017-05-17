package com.example.administrator.bottomnavigationbardemo;

import android.os.Bundle;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class FragmentFour extends BaseFragment {
    public static FragmentFour newInstance(String s){
        Bundle bundle = new Bundle();
        bundle.putString("key_name",s);
        FragmentFour fragment = new FragmentFour();
        fragment.setArguments(bundle);
        return fragment;
    }
}
