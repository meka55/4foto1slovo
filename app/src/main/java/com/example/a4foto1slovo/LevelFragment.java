package com.example.a4foto1slovo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a4foto1slovo.databinding.FragmentLevelBinding;

public class LevelFragment extends Fragment {
    FragmentLevelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            binding.firstLevelBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    bundle.putString("first","https://fainaidea.com/wp-content/uploads/2016/03/glass-04.jpg");
                    bundle.putString("second", "https://a-static.besthdwallpaper.com/levi-akerman-ataka-titanov-4-oboi-2048x1536-86349_26.jpg");
                    bundle.putString("third","https://4okna.info/wp-content/uploads/2015/05/Remont-termoozhoga-plastikovogo-okna.jpg");
                    bundle.putString("four",  "https://avatars.mds.yandex.net/get-mpic/4341821/img_id875904602462055904.jpeg/orig");
                    bundle.putString("answer", "Стекло");
                    bundle.putString("level","1");
                    bundle.putString("prompt", "Есть в каждом доме");

                    GameFragment gameFragment = new GameFragment();
                    gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container,gameFragment)
                        .commit();
            }
        });
        binding.secondLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", "https://admin.cgon.ru/storage/upload/medialibrary/f069073f396a99d82e9958dd70ac1939.jpeg");
                bundle.putString("second", "https://papik.pro/uploads/posts/2021-12/thumbs/1639530050_28-papik-pro-p-son-risunok-28.jpg");
                bundle.putString("third", "https://www.ikea.com/ru/ru/images/products/dekad-budilnik-chernyy__0637379_pe698263_s5.jpg?f=s");
                bundle.putString("four", "https://i.pinimg.com/originals/95/21/89/9521891d196714d177ce53052d064f09.jpg");
                bundle.putString("answer", "Сон");
                bundle.putString("level","2");
                bundle.putString("prompt", "Снится ночью");

                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_container,gameFragment)
                        .commit();
            }

        });
        binding.thirdLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("first", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3OzA82da7-CCfKKFUyAlRoyLJtSy_ZSva9g&usqp=CAU");
                bundle.putString("second", "https://natworld.info/wp-content/uploads/2020/02/osennij-grib.jpg");
                bundle.putString("third", "https://w7.pngwing.com/pngs/782/561/png-transparent-headgear-neck-turban-miscellaneous-black-headgear.png");
                bundle.putString("four", "https://vegaform.ru/image/catalog/tovari/golovnieubori/bandanag017.jpg");
                bundle.putString("answer", "Шапка");
                bundle.putString("level","3");
                bundle.putString("prompt", "Что обычно надевают на голову ");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_container, gameFragment).commit();
            }
        });
    }
}