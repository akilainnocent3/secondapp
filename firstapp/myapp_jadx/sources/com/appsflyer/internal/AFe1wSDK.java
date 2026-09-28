package com.appsflyer.internal;

import defpackage.tx5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1wSDK {
    final String AFAdRevenueData;
    final String getRevenue;

    public AFe1wSDK(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.AFAdRevenueData = str;
        this.getRevenue = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1wSDK)) {
            return false;
        }
        AFe1wSDK aFe1wSDK = (AFe1wSDK) obj;
        return Intrinsics.g(this.AFAdRevenueData, aFe1wSDK.AFAdRevenueData) && Intrinsics.g(this.getRevenue, aFe1wSDK.getRevenue);
    }

    public final int hashCode() {
        return this.getRevenue.hashCode() + (this.AFAdRevenueData.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("HostConfig(prefix=", this.AFAdRevenueData, ", host=", this.getRevenue, ")");
    }
}
