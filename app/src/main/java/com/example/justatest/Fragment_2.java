package com.example.justatest;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Fragment_2 extends Fragment {
    String userInputEinsatz;
    String userInputLeverage;
    String userInputLoss;

    double cache1 =1.0;
    double cache2 =1.0;
    double cache3=1.0;
    double cache4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_2, container, false);

        EditText etEinsatz = view.findViewById(R.id.etEinsatz);
        EditText etLever = view.findViewById(R.id.etLeverage);
        EditText etLoss = view.findViewById(R.id.etMinusPercent);

        TextView outPut = view.findViewById(R.id.tvVerlust);

        etEinsatz.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
        etEinsatz.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                userInputEinsatz = etEinsatz.getText().toString();
//                double cache1;
                try {
                    cache1 = Double.parseDouble(userInputEinsatz);

                } catch (NumberFormatException e) {
                    cache1 = 1.0;
                }
                cache4 = (cache1 / 100) * (cache2 * cache3);
                System.out.println(cache1 + " " + cache2 + " " + cache3);
                outPut.setText(String.valueOf("Sie würden " + cache4 + " verlieren"));
                System.out.println(outPut);
            }
        });


        etLoss.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
        etLoss.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                userInputLoss = etLoss.getText().toString();
//                double cache2;
                try {
                    cache2 = Double.parseDouble(userInputLoss);

                } catch (NumberFormatException e) {
                    cache2 = 1.0;
                }

                cache4 = (cache1 / 100) * (cache2 * cache3);
                System.out.println(cache1 + " " + cache2 + " " + cache3);
                outPut.setText(String.valueOf("Sie würden " + cache4 + " verlieren"));
                System.out.println(outPut);

            }
        });

        etLever.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
        etLever.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                userInputLeverage = etLever.getText().toString();
//                double cache3;
                try {
                    cache3 = Double.parseDouble(userInputLeverage);

                } catch (NumberFormatException e) {
                    cache3 = 1.0;
                }

                cache4 = (cache1 / 100) * (cache2 * cache3);
                System.out.println(cache1 + " " + cache2 + " " + cache3);
                outPut.setText(String.valueOf("Sie würden " + cache4 + " verlieren"));
                System.out.println(outPut);
            }
        });

//        cache4 = (cache1 / 100) * (cache2 * cache3);
//        System.out.println(cache1 + " " + cache2+ " " + cache3);
//        outPut.setText(String.valueOf(cache4));


        return view;
    }
}