package pattayagorn.kritsana.tuexchange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pattayagorn.kritsana.tuexchange.R;

/**
 * Created by Administrator on 3/12/2560.
 */

public class ShowRateExchangeFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_rate_exchange, container, false);
        return view;
    }

}   // Main Class
