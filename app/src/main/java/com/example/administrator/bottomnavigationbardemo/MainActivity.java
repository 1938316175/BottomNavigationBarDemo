package com.example.administrator.bottomnavigationbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationBar bottomNavigationBar;
    private FragmentOne mFragmentOne;
    private FragmentTwo mFragmentTwo;
    private FragmentThree mFragmentThree;
    private FragmentFour mFragmentFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        BadgeItem badgeItem=new BadgeItem();
//        badgeItem.setHideOnSelect(false)
//                .setText("10")
                //.setBackgroundColor(R.color.light)
//                .setBorderWidth(10);
        bottomNavigationBar= (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
//        bottomNavigationBar.setBackgroundColor(Color.WHITE);
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC
                );
        bottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.icon_1,R.string.tab_one)
                //.setActiveColorResource(R.color.green)
//                .setBadgeItem(badgeItem)
                )
                .addItem(new BottomNavigationItem(R.drawable.icon_2, R.string.tab_two)
//                        .setActiveColorResource(R.color.orange)
                )
                .addItem(new BottomNavigationItem(R.drawable.icon_3, R.string.tab_three)
                //        .setActiveColorResource(R.color.pink)
                )
                .addItem(new BottomNavigationItem(R.drawable.icon_4, R.string.tab_four)
                //        .setActiveColor(R.color.yellow)
                ).addItem(new BottomNavigationItem(R.drawable.icon_4, R.string.tab_four)
                //        .setActiveColor(R.color.yellow)
        )//依次添加item,分别icon和名称
                .setFirstSelectedPosition(0)//设置默认选择item
                .initialise();//初始化
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                android.support.v4.app.FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                switch(position)
                {
                    case 0:
                    {
                        if(mFragmentOne==null)
                        {
                            mFragmentOne=FragmentOne.newInstance("First Fragment");
                        }
                        transaction.replace(R.id.ll_content, mFragmentOne);
                        break;
                    }
                    case 1:
                    {
                        if(mFragmentTwo==null)
                        {
                            mFragmentTwo=FragmentTwo.newInstance("Second Fragment");
                        }
                        transaction.replace(R.id.ll_content,mFragmentTwo);
                        break;
                    }
                    case 2:
                    {
                        if(mFragmentThree==null)
                        {
                            mFragmentThree=FragmentThree.newInstance("ThirdFragment");
                        }
                        transaction.replace(R.id.ll_content,mFragmentThree);
                        break;
                    }
                    case 3:
                    {
                        if(mFragmentFour==null)
                        {
                            mFragmentFour=FragmentFour.newInstance("Forth Fragment");
                        }
                        transaction.replace(R.id.ll_content,mFragmentFour);
                        break;
                    }
                    case 4:
                    {
                        if(mFragmentFour==null)
                        {
                            mFragmentFour=FragmentFour.newInstance("Forth Fragment");
                        }
                        transaction.replace(R.id.ll_content,mFragmentFour);
                        break;
                    }
                    default:
                        if(mFragmentOne==null)
                        {
                            mFragmentOne=FragmentOne.newInstance("First Fragment");
                        }
                        transaction.replace(R.id.ll_content,mFragmentOne);
                        break;

                }
                transaction.commit();
            }
            @Override
            public void onTabUnselected(int position) {

            }
            @Override
            public void onTabReselected(int position) {

            }
        });
    }
}
