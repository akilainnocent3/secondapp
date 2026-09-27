package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class H {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "ALLOWED";
        }
        if (i10 == 2) {
            return "FORBIDDEN_BY_CLIENT_CONFIG";
        }
        if (i10 != 3) {
            return i10 != 4 ? fw.b.f85379f : "UNKNOWN";
        }
        return "FORBIDDEN_BY_REMOTE_CONFIG";
    }
}
