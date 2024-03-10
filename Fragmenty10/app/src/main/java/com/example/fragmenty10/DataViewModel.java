package com.example.fragmenty10;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataViewModel extends ViewModel {
    private final MutableLiveData<String> data  = new MutableLiveData<>();

    public void setSharedText(String newText){
        data.setValue(newText);
    }

    public LiveData<String> getSharedText(){
        return data;
    }
}
