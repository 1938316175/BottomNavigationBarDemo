package com.example.administrator.bottomnavigationbardemo;

import android.os.Bundle;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class FragmentTwo extends BaseFragment {
    public static FragmentTwo newInstance(String s){
        Bundle bundle = new Bundle();
        bundle.putString("key_name",s);
        FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(bundle);
        return fragment;
    }
}
