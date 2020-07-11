package com.example.p_popupwindow_recyclerview_sport;
//解析資料
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "hank";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        api();

//        test();
    }

    private void api() {
        //取得assets的json檔案
        String json = AssetManagerUtils.getInstance(this).getJson("PopularGame.json");
        try {
            JSONObject jsonObject = new JSONObject(json);

            //取得裡面的Data資料
            JSONObject jsonData = jsonObject.getJSONObject("Data");

            //將Data資料一個一個叫給類別去解析取值,存入bean
            Data data = new Data(jsonData);
            String ballTypeName =  data.getHotRaceManages().get(0).getBallTypeName();
            Log.v(TAG,"ballTypeName:" +ballTypeName +"/d:" +data.getBannerList().get(0).getTitle() + "/c:" + data.getMemberInfo().getLevelEName());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.v(TAG,"e:" +e.toString());
        }
    }

    //留下解析原始碼可供參考
    private void test() {
        Gson gson = new Gson();
        String json = AssetManagerUtils.getInstance(this).getJson("PopularGame.json");
        Log.v("hank","newJson:" + json);
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject jsonData = jsonObject.getJSONObject("Data");

            JSONArray bannerList = jsonData.getJSONArray("BannerList");
            JSONArray marqueeList = jsonData.getJSONArray("MarqueeList");
            JSONArray hotRaceManages = jsonData.getJSONArray("HotRaceManages");
            JSONObject memberInfo = jsonData.getJSONObject("MemberInfo");
            JSONArray importantNotices = jsonData.getJSONArray("ImportantNotices");

            String jsonBannerString = bannerList.toString();
            String marqueeListString = marqueeList.toString();
            String hotRaceManagesString = hotRaceManages.toString();
            String memberInfoString = memberInfo.toString();
            String importantNoticesString = importantNotices.toString();

            List<Data.BannerList> bannerLists = gson.fromJson(jsonBannerString,new TypeToken<List<Data.BannerList>>(){}.getType());
            List<Data.MarqueeList> marqueeLists = gson.fromJson(marqueeListString,new TypeToken<List<Data.MarqueeList>>(){}.getType());
            List<Data.HotRaceManages> hotRaceManagesLists = gson.fromJson(hotRaceManagesString,new TypeToken<List<Data.HotRaceManages>>(){}.getType());
            Data.MemberInfo memberInfoLists = gson.fromJson(memberInfoString, com.example.p_popupwindow_recyclerview_sport.Data.MemberInfo.class);
            List<Data.ImportantNotices> importantNoticesLists = gson.fromJson(importantNoticesString,new TypeToken<List<Data.ImportantNotices>>(){}.getType());



            Log.v("hank","PickName:" + bannerLists.get(0).getPicName());
            Log.v("hank","bannerLists:" + bannerLists);

            Log.v(TAG,"gameTypeName:" + hotRaceManagesLists.get(0).getBallTypeName());

            Log.v("hank","bannerList:" + bannerList.toString());
            Log.v("hank","marqueeList:" + marqueeList.toString());
            Log.v("hank","hotRaceManages:" + hotRaceManages.toString());
            Log.v("hank","memberInfo:" + memberInfo.toString());
            Log.v("hank","importantNotices:" + importantNotices.toString());

        } catch (JSONException e) {
            e.printStackTrace();
            Log.v(TAG,"e:" + e.toString());
        }
    }

}
