package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;
    TextView t_dialog_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_popup);
        t_dialog_msg = dialog.findViewById(R.id.dialog_message);
    }

    public void OpenFamDialog(View view) {
        t_dialog_msg.setText("What do you love most about your parent?"); //ADD MESSAGE
        dialog.create();
        dialog.show();

    }


    public void openIndivualDialog(View view) {
        t_dialog_msg.setText("What do you love most about yourself?"); //ADD MESSAGE
        dialog.create();
        dialog.show();
    }

    public void openCoupleDialog(View view) {
        t_dialog_msg.setText("What do you love most about your spouse?"); //ADD MESSAGE
        dialog.create();
        dialog.show();
    }

    public void openpandfdialog(View view) {
        t_dialog_msg.setText("what do you love about your past/future"); //ADD MESSAGE
        dialog.create();
        dialog.show();

    }

}