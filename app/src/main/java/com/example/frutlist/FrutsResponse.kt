package com.example.frutlist

import android.os.Message
import com.google.gson.annotations.SerializedName

data class FrutsResponse(

    @SerializedName("name") var name:String,
    @SerializedName("nutritions") var nutritions:List<Int>
)