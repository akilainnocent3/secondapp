package com.bytedance.sdk.component.rs.hww;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile hww f34998tq;
    private volatile tq hww;

    private hww() {
    }

    public static hww hww() {
        if (f34998tq == null) {
            synchronized (hww.class) {
                try {
                    if (f34998tq == null) {
                        f34998tq = new hww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34998tq;
    }

    public tq tq() {
        return this.hww;
    }

    public void hww(tq tqVar) {
        this.hww = tqVar;
    }
}
