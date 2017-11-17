package com.scw.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by scw on 2017/11/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
