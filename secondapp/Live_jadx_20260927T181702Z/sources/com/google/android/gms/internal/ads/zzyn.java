package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzyn implements zzabc {
    public long zza;
    public long zzb;

    @Nullable
    public zzabb zzc;

    @Nullable
    public zzyn zzd;

    public zzyn(long j10, int i10) {
        zza(j10, 65536);
    }

    public final void zza(long j10, int i10) {
        zzgsw.zzi(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }

    public final int zzb(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzyn zzc() {
        this.zzc = null;
        zzyn zzynVar = this.zzd;
        this.zzd = null;
        return zzynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final zzabb zzd() {
        zzabb zzabbVar = this.zzc;
        zzabbVar.getClass();
        return zzabbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    @Nullable
    public final zzabc zze() {
        zzyn zzynVar = this.zzd;
        if (zzynVar == null || zzynVar.zzc == null) {
            return null;
        }
        return zzynVar;
    }
}
