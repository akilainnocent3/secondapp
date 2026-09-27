package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjk extends Exception {
    public zzjk() {
    }

    public zzjk(String str) {
        super(str);
    }

    public zzjk(String str, Throwable th2) {
        super("ContentProvider query failed", th2);
    }
}
