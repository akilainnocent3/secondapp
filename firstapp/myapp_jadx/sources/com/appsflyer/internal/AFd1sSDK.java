package com.appsflyer.internal;

import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1sSDK {
    public static boolean getCurrencyIso4217Code(String str, String str2) {
        str.getClass();
        str2.getClass();
        int mediationNetwork = AFk1zSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1zSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1rSDK.getCurrencyIso4217Code(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        if (mediationNetwork2 != -1 && currencyIso4217Code == null) {
            return mediationNetwork2 == mediationNetwork;
        }
        if (monetizationNetwork != null) {
            return monetizationNetwork.a.intValue() <= mediationNetwork && mediationNetwork <= monetizationNetwork.b.intValue();
        }
        return currencyIso4217Code != null && currencyIso4217Code.a.intValue() <= mediationNetwork && mediationNetwork <= currencyIso4217Code.b.intValue();
    }
}
