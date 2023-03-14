package com.example.bottomcalculators;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class SimpleCalcFragment extends Fragment {
    public SimpleCalcFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple_calc, container, false);

        Toast.makeText(view.getContext(), "Welcome to\nsimple calculator", Toast.LENGTH_SHORT).show();

        Button btnAdd = view.findViewById(R.id.button1);
        Button btnSubs = view.findViewById(R.id.button2);
        Button btnMult = view.findViewById(R.id.button3);
        Button btnDiv = view.findViewById(R.id.button4);
        TextView lbl = view.findViewById(R.id.lbl);
        EditText strnumb1 = view.findViewById(R.id.numb1);
        EditText strnumb2 = view.findViewById(R.id.numb2);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (strnumb1.getText().toString().equals("") || strnumb2.getText().toString().equals("")) {
                    Snackbar.make(view, "One of the numbers is not inputted", BaseTransientBottomBar.LENGTH_LONG).show();
                    return;
                }
                Double numb1 = Double.parseDouble(strnumb1.getText().toString());
                Double numb2 = Double.parseDouble(strnumb2.getText().toString());
                Snackbar.make(view, "The sum is: " + (numb1+ numb2), BaseTransientBottomBar.LENGTH_LONG).show();
                lbl.setText("The sum is: " + (numb1+ numb2));
            }

        });

        btnSubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (strnumb1.getText().toString().equals("") || strnumb2.getText().toString().equals("")) {
                    Snackbar.make(view, "One of the numbers is not inputted", BaseTransientBottomBar.LENGTH_LONG).show();
                    return;
                }
                Double numb1 = Double.parseDouble(strnumb1.getText().toString());
                Double numb2 = Double.parseDouble(strnumb2.getText().toString());
                Snackbar.make(view, "The difference is: " + (numb1 - numb2), BaseTransientBottomBar.LENGTH_LONG).show();
                lbl.setText("The difference is: " + (numb1 - numb2));
            }

        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (strnumb1.getText().toString().equals("") || strnumb2.getText().toString().equals("")) {
                    Snackbar.make(view, "One of the numbers is not inputted", BaseTransientBottomBar.LENGTH_LONG).show();
                    return;
                }
                Double numb1 = Double.parseDouble(strnumb1.getText().toString());
                Double numb2 = Double.parseDouble(strnumb2.getText().toString());
                Snackbar.make(view, "The product is: " + (numb1 * numb2), BaseTransientBottomBar.LENGTH_LONG).show();
                lbl.setText("The product is: " + (numb1 * numb2));
            }

        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (strnumb1.getText().toString().equals("") || strnumb2.getText().toString().equals("")) {
                    Snackbar.make(view, "One of the numbers is not inputted", BaseTransientBottomBar.LENGTH_LONG).show();
                    return;
                }
                Double numb1 = Double.parseDouble(strnumb1.getText().toString());
                Double numb2 = Double.parseDouble(strnumb2.getText().toString());
                Snackbar.make(view, "The ratio is: " + (numb1 / numb2), BaseTransientBottomBar.LENGTH_LONG).show();
                lbl.setText("The ratio is: " + (numb1 / numb2));
            }

        });



        // Inflate the layout for this fragment
        return view;
    }
}
