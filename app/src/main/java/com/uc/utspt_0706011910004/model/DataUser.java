package com.uc.utspt_0706011910004.model;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.uc.utspt_0706011910004.AdapterUser;
import com.uc.utspt_0706011910004.R;

import java.util.ArrayList;

public class DataUser {
    public static ArrayList<AdapterUser> userdata = new ArrayList<>();
    public static final Dialog loadingDialog(Context context){
        final Dialog dialog = new Dialog(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.loading_screen, null);
        dialog.setContentView(dialogView);
        dialog.setCancelable(false);
        return dialog;
    }
}
