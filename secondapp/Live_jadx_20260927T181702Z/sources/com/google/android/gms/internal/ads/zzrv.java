package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrv extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzrv(int i10, zzv zzvVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25);
        sb2.append("AudioTrack write failed: ");
        sb2.append(i10);
        super(sb2.toString());
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzvVar;
    }
}
