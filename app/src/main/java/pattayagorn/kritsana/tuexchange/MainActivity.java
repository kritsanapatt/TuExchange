package pattayagorn.kritsana.tuexchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pattayagorn.kritsana.tuexchange.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity
        if (savedInstanceState == null) {
//            Condition is True

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();

        }   // if



    }   // Main Method

}   // Main Class
