package com.hcoolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15827 on 2017/3/21.
 */

public class Now {
    
    @SerializedName("tmp")
    public String temperature;
    
    @SerializedName("cond")
    public More more;
    
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
