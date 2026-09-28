package com.appsflyer.internal;

import defpackage.d5d;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.uf80;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1ySDK(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.getCurrencyIso4217Code = i;
        this.AFAdRevenueData = i2;
        this.getMonetizationNetwork = i3;
        this.getRevenue = i4;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1ySDK)) {
            return false;
        }
        AFg1ySDK aFg1ySDK = (AFg1ySDK) obj;
        return this.getCurrencyIso4217Code == aFg1ySDK.getCurrencyIso4217Code && this.AFAdRevenueData == aFg1ySDK.AFAdRevenueData && this.getMonetizationNetwork == aFg1ySDK.getMonetizationNetwork && this.getRevenue == aFg1ySDK.getRevenue && Intrinsics.g(this.getMediationNetwork, aFg1ySDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + gpp.a(this.getRevenue, gpp.a(this.getMonetizationNetwork, gpp.a(this.AFAdRevenueData, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.getCurrencyIso4217Code;
        int i2 = this.AFAdRevenueData;
        int i3 = this.getMonetizationNetwork;
        int i4 = this.getRevenue;
        String str = this.getMediationNetwork;
        StringBuilder sbA = dy5.a("CmpTcfData(policyVersion=", i, i2, ", gdprApplies=", ", cmpSdkId=");
        d5d.a(sbA, i3, ", cmpSdkVersion=", i4, ", tcString=");
        return uf80.a(sbA, str, ")");
    }
}
