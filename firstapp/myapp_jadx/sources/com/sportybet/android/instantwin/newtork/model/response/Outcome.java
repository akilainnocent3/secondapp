package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes5.dex */
public class Outcome {

    @SerializedName("desc")
    public String desc;

    @SerializedName("enable")
    public boolean enable;

    @SerializedName("mutexLookupKey")
    public String mutexLookupKey;

    @SerializedName("odds")
    public String odds;

    @SerializedName("outcomeId")
    public String outcomeId;

    @SerializedName("probability")
    public String probability;

    public Outcome(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.outcomeId = str;
        this.odds = str2;
        this.desc = str3;
        this.mutexLookupKey = str4;
        this.enable = z;
        this.probability = str5;
    }
}
