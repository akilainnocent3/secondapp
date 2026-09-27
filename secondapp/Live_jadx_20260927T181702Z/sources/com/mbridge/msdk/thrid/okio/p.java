package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    static o f70193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static long f70194b;

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = f70193a;
                if (oVar == null) {
                    return new o();
                }
                f70193a = oVar.f70191f;
                oVar.f70191f = null;
                f70194b -= 8192;
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(o oVar) {
        if (oVar.f70191f == null && oVar.f70192g == null) {
            if (oVar.f70189d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j10 = f70194b + 8192;
                    if (j10 > 65536) {
                        return;
                    }
                    f70194b = j10;
                    oVar.f70191f = f70193a;
                    oVar.f70188c = 0;
                    oVar.f70187b = 0;
                    f70193a = oVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
