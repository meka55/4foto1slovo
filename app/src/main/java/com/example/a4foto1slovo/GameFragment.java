package com.example.a4foto1slovo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.gesture.GestureLibraries;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.a4foto1slovo.databinding.FragmentGameBinding;
import com.google.android.material.snackbar.Snackbar;


public class GameFragment extends Fragment {

    FragmentGameBinding binding;
    String first;
    String second;
    String third;
    String four;
    String answer;
    String prompt;
    String level;
    ImageView firstImg,secondImg,thirdImg,fourImg;
    Button prinyatBtn;
    EditText editText;
    TextView textView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentGameBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstImg = view.findViewById(R.id.firstImg);
        secondImg = view.findViewById(R.id.secondImg);
        thirdImg = view.findViewById(R.id.thirdImg);
        fourImg = view.findViewById(R.id.fourImg);
        prinyatBtn = view.findViewById(R.id.prinyatBtn);
        editText = view.findViewById(R.id.answerEdit);
        textView = view.findViewById(R.id.level);


        first = getArguments().getString("first");
        second = getArguments().getString("second");
        third = getArguments().getString("third");
        four = getArguments().getString("four");
        answer = getArguments().getString("answer");
        prompt = getArguments().getString("prompt");
        level = getArguments().getString("level");
        textView.setText(level);

            Glide.with(requireContext()).load(first).into(firstImg);
            Glide.with(requireContext()).load(second).into(secondImg);
            Glide.with(requireContext()).load(third).into(thirdImg);
            Glide.with(requireContext()).load(four).into(fourImg);

            prinyatBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (editText.getText().toString().trim().equalsIgnoreCase(answer)) {
                        Toast.makeText(requireContext(), "Правильно", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(requireContext(), "Не правильно", Toast.LENGTH_SHORT).show();

                    }
                }
            });

        binding.promptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(requireContext());
                dialog.setTitle("Вам подсказка");
                dialog.setMessage(prompt);

                dialog.setPositiveButton("Понятно", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }
}