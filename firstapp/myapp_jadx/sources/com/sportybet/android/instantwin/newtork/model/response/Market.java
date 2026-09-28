package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import defpackage.itf0;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Market {

    @SerializedName("attributes")
    public MarketAttribute attributes;

    @SerializedName("bannerTitles")
    public String bannerTitles;

    @SerializedName("guide")
    public String guide;

    @SerializedName("marketId")
    public String marketId;

    @SerializedName("marketPoolId")
    public String marketPoolId;

    @SerializedName("outcomes")
    public List<Outcome> outcomes;

    @SerializedName("subTitle")
    public String subTitle;

    @SerializedName("title")
    public String title;

    @SerializedName("type")
    public String type;

    public Market(String str, String str2, String str3, String str4, String str5, MarketAttribute marketAttribute, List<Outcome> list, String str6) {
        this.marketId = str;
        this.type = str2;
        this.title = str3;
        this.subTitle = str4;
        this.bannerTitles = str5;
        this.attributes = marketAttribute;
        this.outcomes = list;
        this.guide = str6;
    }

    public float getMaxOddsDiff() {
        List<Outcome> list = this.outcomes;
        if (list == null || list.isEmpty()) {
            return 0.0f;
        }
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        for (Outcome outcome : this.outcomes) {
            try {
                float f = Float.parseFloat(outcome.odds);
                fMin = Math.min(fMin, f);
                fMax = Math.max(fMax, f);
            } catch (Exception e) {
                String str = outcome.odds;
                itf0.a aVar = itf0.a;
                aVar.q(str);
                aVar.b(e);
            }
        }
        if (fMax == Float.MIN_VALUE || fMin == Float.MAX_VALUE) {
            return 0.0f;
        }
        return fMax - fMin;
    }
}
