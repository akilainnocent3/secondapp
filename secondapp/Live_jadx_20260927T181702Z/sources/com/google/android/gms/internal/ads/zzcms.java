package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcms {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcms(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcms zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        if (zzrVar.zzd) {
            return new zzcms(3, 0, 0);
        }
        if (zzrVar.zzi) {
            return new zzcms(2, 0, 0);
        }
        return zzrVar.zzh ? new zzcms(0, 0, 0) : new zzcms(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzcms zzb() {
        return new zzcms(0, 0, 0);
    }

    public static zzcms zzc(int i10, int i11) {
        return new zzcms(1, i10, i11);
    }

    public static zzcms zzd() {
        return new zzcms(4, 0, 0);
    }

    public static zzcms zze() {
        return new zzcms(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
