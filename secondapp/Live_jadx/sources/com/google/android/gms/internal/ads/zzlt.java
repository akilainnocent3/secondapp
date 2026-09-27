package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlt {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlt() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzlt zza(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzlt zzb(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzgsw.zza(z10);
        this.zzb = f10;
        return this;
    }

    public final zzlt zzc(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzgsw.zza(z10);
        this.zzc = j10;
        return this;
    }

    public final zzlu zzd() {
        return new zzlu(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzlt(zzlu zzluVar, byte[] bArr) {
        this.zza = zzluVar.zza;
        this.zzb = zzluVar.zzb;
        this.zzc = zzluVar.zzc;
    }
}
