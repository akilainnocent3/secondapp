package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1wSDK implements AFk1ySDK {
    @Override // com.appsflyer.internal.AFk1ySDK
    public final String getCurrencyIso4217Code(String str) {
        str.getClass();
        return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1uSDK.getMonetizationNetwork().getHostName());
    }
}
