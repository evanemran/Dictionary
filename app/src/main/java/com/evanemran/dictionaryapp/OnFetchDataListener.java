package com.evanemran.dictionaryapp;

import com.evanemran.dictionaryapp.Model.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}
