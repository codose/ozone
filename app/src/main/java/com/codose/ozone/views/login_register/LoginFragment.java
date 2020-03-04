package com.codose.ozone.views.login_register;

import android.content.Intent;
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
import com.codose.ozone.views.BaseFragment;
import com.codose.ozone.views.update_details.UpdateDetailsActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends BaseFragment {

    public LoginFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button register = view.findViewById(R.id.frgment_login_register_button);
        Button login_btn = view.findViewById(R.id.frgment_login_button);

       login_btn.setOnClickListener(v -> openDetails());

        register.setOnClickListener(v ->
            navigateToReg()
        );
    }

    private void openDetails() {
        startActivity( new Intent(getContext(), UpdateDetailsActivity.class));
    }

    private void navigateToReg() {
        NavController navController = Navigation.findNavController(getActivity(), R.id.reg_navHostFragment);
        navController.navigate(R.id.action_loginFragment_to_registerFragment);

    }
}
