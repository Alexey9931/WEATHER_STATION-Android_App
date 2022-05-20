package com.example.weatherstation11.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weatherstation11.MainActivity;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("this is slideshow");
    }

    public LiveData<String> getText() {
        return mText;
    }
}