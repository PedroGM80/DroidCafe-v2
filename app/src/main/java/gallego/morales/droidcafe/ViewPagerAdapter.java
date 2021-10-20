package gallego.morales.droidcafe;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(FragmentActivity fa) {
        super(fa);
    }


    @Override
    public Fragment createFragment(int pos) {
        switch (pos) {
            case 0: {
                return new TabFragment1();
            }
            case 1: {

                return new TabFragment2();
            }
            case 2: {
                return new TabFragment3();
            }
            default:
                return null;
        }
    }


    @Override
    public int getItemCount() {
        return 3;
    }


}






