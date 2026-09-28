package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1wSDK extends AFh1ySDK {
    private final AFc1bSDK getCurrencyIso4217Code;
    private final boolean getRevenue;

    public AFh1wSDK(AFc1bSDK aFc1bSDK) {
        aFc1bSDK.getClass();
        this.getCurrencyIso4217Code = aFc1bSDK;
        this.getRevenue = true;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getCurrencyIso4217Code.equals().getRevenue("D", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z4) {
            this.getCurrencyIso4217Code.equals().getRevenue("E", getRevenue(str, aFg1cSDK));
        }
        if (z4) {
            this.getCurrencyIso4217Code.equals().getMonetizationNetwork(th);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        aFg1cSDK.getClass();
        str.getClass();
        this.getCurrencyIso4217Code.equals().getRevenue("F", getRevenue(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getCurrencyIso4217Code.equals().getRevenue("I", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getCurrencyIso4217Code.equals().getRevenue("V", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.getCurrencyIso4217Code.equals().getRevenue("W", getRevenue(str, aFg1cSDK));
        }
    }
}
