package com.bytedance.sdk.component.tq.hww.tq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
final class hu {
    static hv hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    static long f35053tq;

    private hu() {
    }

    public static hv hww() {
        synchronized (hu.class) {
            hv hvVar = hww;
            if (hvVar == null) {
                return new hv();
            }
            hww = hvVar.f35054hu;
            hvVar.f35054hu = null;
            f35053tq -= 8192;
            return hvVar;
        }
    }

    public static void hww(hv hvVar) {
        if (hvVar.f35054hu == null && hvVar.vgm == null) {
            if (hvVar.vy) {
                return;
            }
            synchronized (hu.class) {
                try {
                    long j10 = f35053tq;
                    if (j10 + 8192 > 65536) {
                        return;
                    }
                    f35053tq = j10 + 8192;
                    hvVar.f35054hu = hww;
                    hvVar.f35056sd = 0;
                    hvVar.f35057tq = 0;
                    hww = hvVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
