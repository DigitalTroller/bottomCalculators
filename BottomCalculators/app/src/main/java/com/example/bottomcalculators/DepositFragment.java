package com.example.bottomcalculators;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class DepositFragment extends Fragment {
    public DepositFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_deposit, container, false);

        Button button = view.findViewById(R.id.save);
        EditText initial = view.findViewById(R.id.initial);
        EditText rate = view.findViewById(R.id.rate);
        EditText years = view.findViewById(R.id.years);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (initial.getText().toString().equals("") || rate.getText().toString().equals("")|| years.getText().toString().equals("")) {
                    Snackbar.make(view, "One of the numbers is not inputted", BaseTransientBottomBar.LENGTH_LONG).show();
                    return;
                }
                Double init = Double.parseDouble(initial.getText().toString());
                Double percentRate = Double.parseDouble(rate.getText().toString());
                Double yearsTime = Double.parseDouble(years.getText().toString());
                Double a = init*Math.pow((1+((percentRate/100)/12)), 12*yearsTime);
                Snackbar.make(view, "The total savings will be: " + Math.round(a * 1000.0) / 1000.0, BaseTransientBottomBar.LENGTH_LONG).show();
            }

        });

        // Inflate the layout for this fragment
        return view;
    }
}
