package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfyi extends Exception {
    private final int zza;

    public zzfyi(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfyi(int i10, Throwable th2) {
        super(th2);
        this.zza = i10;
    }
}
