package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzte {
    private final zzco[] zza;
    private final zztr zzb;
    private final zzcu zzc;

    public zzte(zzco... zzcoVarArr) {
        zztr zztrVar = new zztr();
        zzcu zzcuVar = new zzcu();
        zzco[] zzcoVarArr2 = {zztrVar, zzcuVar};
        this.zza = zzcoVarArr2;
        System.arraycopy(zzcoVarArr, 0, zzcoVarArr2, 0, 0);
        this.zzb = zztrVar;
        this.zzc = zzcuVar;
    }

    public final zzco[] zza() {
        return this.zza;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcu zzcuVar = this.zzc;
        zzcuVar.zzk(zzavVar.zzb);
        zzcuVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z10) {
        this.zzb.zzq(z10);
        return z10;
    }

    public final long zzd(long j10) {
        zzcu zzcuVar = this.zzc;
        return zzcuVar.zzc() ? zzcuVar.zzm(j10) : j10;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
