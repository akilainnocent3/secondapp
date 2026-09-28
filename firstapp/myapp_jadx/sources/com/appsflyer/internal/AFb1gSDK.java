package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1gSDK {
    public final String getCurrencyIso4217Code;
    public final int getRevenue;

    public AFb1gSDK(int i, String str) {
        str.getClass();
        this.getRevenue = i;
        this.getCurrencyIso4217Code = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1gSDK)) {
            return false;
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
        return this.getRevenue == aFb1gSDK.getRevenue && Intrinsics.g(this.getCurrencyIso4217Code, aFb1gSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (Integer.hashCode(this.getRevenue) * 31);
    }

    public final String toString() {
        return h.a(this.getRevenue, "AppSetIdModel(scope=", ", id=", this.getCurrencyIso4217Code, ")");
    }
}
