package com.example.justatest;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Fragment_1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);
// Erstelle die TextViews
//        EditText fibbo = new EditText(getActivity());
//        TextView tvSixOneEighty = new TextView(getActivity());
//        TextView tvSixOneEighty_Writeable = new TextView(getActivity());
//        TextView tvThirtyEightTwenty = new TextView(getActivity());
//        TextView tvThirtyEightTwenty_Writeable = new TextView(getActivity());
        EditText fibbo = view.findViewById(R.id.instruction);
        TextView tvSixOneEighty = view.findViewById(R.id.Output_61_80);
        TextView tvSixOneEighty_Writeable = view.findViewById(R.id.Output_61_80_Writable);
        TextView tvSixOneEightyOne = view.findViewById(R.id.Output_161_80);
        TextView tvSixOneEightyOne_Writeable = view.findViewById(R.id.Output_161_80_Writable);
        TextView tvThirtyEightTwenty = view.findViewById(R.id.Output_38_20);
        TextView tvThirtyEightTwenty_Writeable = view.findViewById(R.id.Output_38_20_Writable);

        fibbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Trying to get the default text of the EditText


//                Toast.makeText(getActivity(), "TextView clicked", Toast.LENGTH_SHORT).show();

            }
        });

        fibbo.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
        fibbo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
//                String input = editable.toString();
//                // Entferne alle Nicht-Ziffern aus dem Text
//                input = input.replaceAll("\\D", "");
//                fibbo.setText(input);
                String userInput = editable.toString();
                userInput = userInput.replaceAll("(?!\\.)[^0-9.]", "");
//                tvThirtyEightTwenty_Writeable.setText(editable);
//                if (userInput.contains(".")) {
//                    int dotIndex = userInput.indexOf(".");
//                    userInput = userInput.substring(0, dotIndex) ;/*+ userInput.substring(dotIndex + 1*/
//                }

                //can still try this to filter . if more than 1: (unfinished)
//                String userInputEinsatz = etEinsatz.getText().toString();
//                userInputEinsatz = userInputEinsatz.replaceAll("[^\\d.]", "");
//
//                int indexOfDecimal = userInputEinsatz.indexOf(".");
//                if (indexOfDecimal != -1) {
//                    String before
                double cache1;
                try {
                    cache1 = Double.parseDouble(userInput);

                } catch (NumberFormatException e) {
                    cache1 = 0;
                }
                double sixOneEighty = (cache1 / 100) * 61.8;
                tvSixOneEighty.setText("61.80% von " + userInput + " sind: ");
                tvSixOneEighty_Writeable.setText(String.valueOf(sixOneEighty));


                double cache2;
                try {
                    cache2 = Double.parseDouble(userInput);

                } catch (NumberFormatException e) {
                    cache2 = 0;
                }
                double sixOneEightyOne = (cache2 / 100) * 161.8;
                tvSixOneEightyOne.setText("161.80% von " + userInput + " sind: ");
                tvSixOneEightyOne_Writeable.setText(String.valueOf(sixOneEightyOne));


                double cache3;
                try {
                    cache3 = Double.parseDouble(userInput);

                } catch (NumberFormatException e) {
                    cache3 = 0;
                }
                double thirtyEightTwenty = (cache3 / 100) * 38.2;
                tvThirtyEightTwenty.setText("38.20% von " + userInput + " sind: ");
                tvThirtyEightTwenty_Writeable.setText(String.valueOf(thirtyEightTwenty));


            }
        });

//        fibbo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus) {
//                    fibbo.setText("");
//                }
//            }});


        return view;
    }


}