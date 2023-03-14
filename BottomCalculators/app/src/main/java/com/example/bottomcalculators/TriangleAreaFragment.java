package com.example.bottomcalculators;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class TriangleAreaFragment extends Fragment {
    public TriangleAreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_triangle_area, container, false);


        Button button = view.findViewById(R.id.button);
        EditText a = view.findViewById(R.id.a);
        EditText b = view.findViewById(R.id.b);
        EditText c = view.findViewById(R.id.c);
        TextView lbl = view.findViewById(R.id.myLabel);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (a.getText().toString().equals("") || b.getText().toString().equals("")|| c.getText().toString().equals("")) {
                    Snackbar.make(view, "One of the numbers is not inputted", BaseTransientBottomBar.LENGTH_LONG).show();
                    return;
                }
                Double sidea = Double.parseDouble(a.getText().toString());
                Double sideb = Double.parseDouble(b.getText().toString());
                Double sidec = Double.parseDouble(c.getText().toString());
                Double p = (sidea+sideb+sidec)/2;
                Double Area = Math.sqrt(p*(p-sidea)*(p-sideb)*(p-sidec));
                Snackbar.make(view, "The Area is: " + Area, BaseTransientBottomBar.LENGTH_LONG).show();
                lbl.setText("The Area is: " + Math.round(Area * 1000.0) / 1000.0);
            }

        });



        // Inflate the layout for this fragment
        return view;
    }
}
