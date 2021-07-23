package com.the_akshay.dove.addapter;

import com.the_akshay.dove.frag.CallsFragment;
import com.the_akshay.dove.frag.ChatsFragment;
import com.the_akshay.dove.frag.StatusFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentsAddpter extends FragmentPagerAdapter {

    public FragmentsAddpter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public FragmentsAddpter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ChatsFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return new ChatsFragment();
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "CHATS";

            case 1:
                return "STATUS";

            case 2:
                return "CALLS";

            default:
                return null;

        }
    }
}
