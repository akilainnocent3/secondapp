package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC2488a2 implements Runnable {
    public final /* synthetic */ C2490a4 A00;

    public RunnableC2488a2(C2490a4 c2490a4) {
        this.A00 = c2490a4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02.getVisibility() == 0) {
                this.A00.A07(8);
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
