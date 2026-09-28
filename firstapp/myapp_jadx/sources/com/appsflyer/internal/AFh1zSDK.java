package com.appsflyer.internal;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1zSDK extends AFh1ySDK {
    private final AFc1bSDK getRevenue;

    public AFh1zSDK(AFc1bSDK aFc1bSDK) {
        aFc1bSDK.getClass();
        this.getRevenue = aFc1bSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z3) {
            if (StringsKt.U(str)) {
                str = "missing label";
            }
            this.getRevenue.afWarnLog().getRevenue(th, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
