package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzedr extends Exception {
    private final int zza;

    public zzedr(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzedr(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzedr(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = 1;
    }
}
