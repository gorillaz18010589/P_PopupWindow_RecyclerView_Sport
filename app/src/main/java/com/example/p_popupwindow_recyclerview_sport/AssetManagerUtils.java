package com.example.p_popupwindow_recyclerview_sport;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AssetManagerUtils {
    private static AssetManagerUtils instance;
    private static Context context;

    public static AssetManagerUtils getInstance(Context context) {
        if (instance == null) {
            instance = new AssetManagerUtils(context);
        }
        return instance;
    }

    public AssetManagerUtils(Context context) {
        this.context = context;
    }

    /* 取得Assets的Json檔案
    * ＠param fileName 要讀取的json檔案
    * return 讀取後的檔案json
    */
    public String getJson(String fileName) {
        String json = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            AssetManager assetManager = context.getAssets();
            BufferedReader bf = new BufferedReader(new InputStreamReader(
                    assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        json = stringBuilder.toString().replaceAll("\\s*", "");
        return json;
    }
}
