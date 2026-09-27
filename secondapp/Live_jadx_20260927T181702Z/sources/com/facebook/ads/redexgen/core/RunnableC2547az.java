package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2547az implements Runnable {
    public final /* synthetic */ C2548b0 A00;
    public final /* synthetic */ InterfaceC2549b1 A01;

    public RunnableC2547az(C2548b0 c2548b0, InterfaceC2549b1 interfaceC2549b1) {
        this.A00 = c2548b0;
        this.A01 = interfaceC2549b1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
