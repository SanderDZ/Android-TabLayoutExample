package br.com.borderlessdesenvolvimento.tablayoutexample;

/* @author: Sander Diniz - canal Domínio da Tecnologia
 *
 * Dá trabalho trazer estes vídeos!
 * deixe o seu apoio se inscrevendo no canal, comentando,
 * compartilhando e deixando o seu like no vídeo.
 * acesse: https://youtu.be/JNjA8KODG1U
 *
 */

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int tabCount;

    public PageAdapter(FragmentManager fm, int tabCount) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new Tab1();
            case 1:
                return new Tab2();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
