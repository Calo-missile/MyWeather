package com.hcoolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15827 on 2017/3/21.
 */

public class Basic {
    
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
