package com.appsflyer.internal;

import defpackage.f87;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1aSDK {
    public final long getCurrencyIso4217Code;
    public final boolean getMediationNetwork;
    public final String getMonetizationNetwork;

    public AFf1aSDK(String str, long j, boolean z) {
        str.getClass();
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = j;
        this.getMediationNetwork = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.g(this.getMonetizationNetwork, aFf1aSDK.getMonetizationNetwork) && this.getCurrencyIso4217Code == aFf1aSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iA = f87.a(this.getMonetizationNetwork.hashCode() * 31, this.getCurrencyIso4217Code, 31);
        boolean z = this.getMediationNetwork;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return iA + r4;
    }

    public final String toString() {
        String str = this.getMonetizationNetwork;
        long j = this.getCurrencyIso4217Code;
        return w.a(x.a(j, "AFUninstallToken(token=", str, ", receivedTime="), ", isQueued=", this.getMediationNetwork, ")");
    }
}
