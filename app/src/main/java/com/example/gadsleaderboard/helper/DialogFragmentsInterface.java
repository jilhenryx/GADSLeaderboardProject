package com.example.gadsleaderboard.helper;

import android.widget.ProgressBar;

public interface DialogFragmentsInterface {
    void onNegativeButtonClicked(int clickedButton);
    void onPositiveButtonClicked(int clickedButton, ProgressBar progressBar);
    void onDialogDismissed(boolean wasButtonClicked);
}
