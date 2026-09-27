package com.mbridge.msdk.foundation.same;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f67029b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f67030a = null;

    private b() {
    }

    public static b b() {
        if (f67029b == null) {
            synchronized (b.class) {
                try {
                    if (f67029b == null) {
                        f67029b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67029b;
    }

    public Boolean a() {
        return this.f67030a;
    }
}
