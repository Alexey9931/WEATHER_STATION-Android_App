package com.example.weatherstation11.ui.home;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.weatherstation11.FireBase;
import com.example.weatherstation11.MainActivity;
import com.example.weatherstation11.R;
import com.example.weatherstation11.databinding.FragmentHomeBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    static Date date;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // HomeViewModel homeViewModel =
       //         new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        FireBase firebase = new FireBase();


        final ImageView imagewind = root.findViewById(R.id.imagewind);
        final TextView STREET_TEMP = root.findViewById(R.id.STREET_TEMP);
        final TextView STREET_HUM = root.findViewById(R.id.STREET_HUM);
        final TextView RAIN = root.findViewById(R.id.RAIN);
        final TextView VBat = root.findViewById(R.id.VBat);
        final TextView WIND_SPEED = root.findViewById(R.id.WIND_SPEED);
        final TextView WIND_DIRECTION = root.findViewById(R.id.WIND_DIRECTION);

        firebase.get_firebase(STREET_TEMP, STREET_HUM, RAIN, VBat, WIND_SPEED, WIND_DIRECTION, imagewind);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}