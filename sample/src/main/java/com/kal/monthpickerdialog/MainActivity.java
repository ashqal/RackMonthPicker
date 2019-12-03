package com.kal.monthpickerdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

import com.kal.rackmonthpicker.MonthType;
import com.kal.rackmonthpicker.RackMonthPicker;
import com.kal.rackmonthpicker.listener.DateMonthDialogListener;
import com.kal.rackmonthpicker.listener.OnCancelMonthDialogListener;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        new RackMonthPicker(this)
//                .setPositiveButton(new DateMonthDialogListener() {
//                    @Override
//                    public void onDateMonth(int month, int startDate, int endDate, int year, String monthLabel) {
//
//                    }
//                })
//                .setNegativeButton(new OnCancelMonthDialogListener() {
//                    @Override
//                    public void onCancel(AlertDialog dialog) {
//
//                    }
//                }).show();

        Button button = (Button) findViewById(R.id.btn_show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new RackMonthPicker(view.getContext())
                        .setMaxDate(System.currentTimeMillis())
                        .setSelectedYear(2019)
                        .setSelectedMonth(11)
                        .setLocale(Locale.CHINA)
                        .setMonthType(MonthType.NUMBER)
                        .setPositiveButton(new DateMonthDialogListener() {
                            @Override
                            public void onDateMonth(int month, int startDate, int endDate, int year, String monthLabel) {
                            }
                        })
                        .setNegativeButton(new OnCancelMonthDialogListener() {
                            @Override
                            public void onCancel(AlertDialog dialog) {
                                dialog.dismiss();
                            }
                        }).show();
            }
        });
    }
}
