package br.com.borderlessdesenvolvimento.tablayoutexample;

/* @author: Sander Diniz - canal Domínio da Tecnologia
 * 
 * Dá trabalho trazer estes vídeos! 
 * deixe o seu apoio se inscrevendo no canal, comentando,
 * compartilhando e deixando o seu like no vídeo.
 * acesse: https://youtu.be/JNjA8KODG1U
 * 
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem tab1, tab2;
    private PagerAdapter pagerAdapter; // no vídeo estava como "public",
                                       // mas não há motivo para isso!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        viewPager = findViewById(R.id.viewPager);

        pagerAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                pagerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}