package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1rSDK {
    public final String AFAdRevenueData;
    public final Intent getMediationNetwork;
    public final String getMonetizationNetwork;

    public AFh1rSDK(Activity activity, AFi1kSDK aFi1kSDK) {
        activity.getClass();
        aFi1kSDK.getClass();
        this.getMediationNetwork = activity.getIntent();
        this.AFAdRevenueData = aFi1kSDK.getCurrencyIso4217Code(activity);
        this.getMonetizationNetwork = aFi1kSDK.getMediationNetwork(activity);
    }
}
