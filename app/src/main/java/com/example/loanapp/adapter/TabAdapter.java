package com.example.loanapp.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.loanapp.model.LoanResponse;
import com.example.loanapp.model.LoanResponseData;
import com.example.loanapp.ui.LoanFragment;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;
    LoanResponse loanResponse;

    public TabAdapter(Context context, FragmentManager fm, int totalTabs, LoanResponse data) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
        loanResponse = data;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                LoanFragment homeFragment = new LoanFragment(getLoanData("approved"));
                return homeFragment;
            case 1:
                LoanFragment homeFragment2 = new LoanFragment(getLoanData("in-process"));
                return homeFragment2;
            case 2:
                LoanFragment homeFragment3 = new LoanFragment(getLoanData("rejected"));
                return homeFragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    private List<LoanResponseData> getLoanData(String type) {

        ArrayList<LoanResponseData> list = new ArrayList<>();
        for (int i = 0; i < loanResponse.data.size(); i++) {

            if (loanResponse.data.get(i).status.equals(type)) {
                list.add(loanResponse.data.get(i));
            }

        }
        return list;
    }
}
