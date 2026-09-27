package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzakt {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzes zzf;
    private final zzes zzg;
    private int zzh;
    private int zzi;

    public zzakt(zzes zzesVar, zzes zzesVar2, boolean z10) throws zzat {
        this.zzg = zzesVar;
        this.zzf = zzesVar2;
        this.zze = z10;
        zzesVar2.zzh(12);
        this.zza = zzesVar2.zzH();
        zzesVar.zzh(12);
        this.zzi = zzesVar.zzH();
        zzaft.zza(zzesVar.zzB() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzJ() : this.zzf.zzz();
        if (this.zzb == this.zzh) {
            zzes zzesVar = this.zzg;
            this.zzc = zzesVar.zzH();
            zzesVar.zzk(4);
            int i11 = this.zzi - 1;
            this.zzi = i11;
            this.zzh = i11 > 0 ? (-1) + zzesVar.zzH() : -1;
        }
        return true;
    }
}
