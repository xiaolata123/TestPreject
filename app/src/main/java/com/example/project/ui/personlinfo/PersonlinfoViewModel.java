package com.example.project.ui.personlinfo;

/**
 * @Author：Jiangxin
 * @Time：2020/10/28 21:26
 */
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PersonlinfoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PersonlinfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}