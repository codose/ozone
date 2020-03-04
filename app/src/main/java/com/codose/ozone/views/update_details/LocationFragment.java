package com.codose.ozone.views.update_details;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.codose.ozone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.fragment_location_next_button);
        button.setOnClickListener(v -> openInterests());
    }

    private void openInterests() {
        NavController navController = Navigation.findNavController(getActivity(),R.id.details_navHostFragment);
        navController.navigate(R.id.action_locationFragment_to_interestsFragment);
    }
}
