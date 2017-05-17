package com.example.administrator.bottomnavigationbardemo;

import android.os.Bundle;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class FragmentThree extends BaseFragment {
    public static FragmentThree newInstance(String s){
        Bundle bundle = new Bundle();
        bundle.putString("key_name",s);
        FragmentThree fragment = new FragmentThree();
        fragment.setArguments(bundle);
        return fragment;
    }
}
