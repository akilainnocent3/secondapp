package com.sportybet.plugin.jackpot.data;

import com.sporty.android.core.model.gson.AlwaysListTypeAdapterFactory;
import defpackage.zbp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AdSpots {

    @zbp(AlwaysListTypeAdapterFactory.class)
    public List<Ads> ads;
    public String spotId;

    public Ads getFirstAd() {
        List<Ads> list = this.ads;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.ads.get(0);
    }
}
