package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagu implements zzafp {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzafs zzf;
    private zzahb zzg;

    public zzagu(int i10, int i11, String str) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        int i10 = this.zza;
        zzgsw.zzi((i10 == -1 || this.zzb == -1) ? false : true);
        int i11 = this.zzb;
        zzes zzesVar = new zzes(i11);
        ((zzafg) zzafqVar).zzh(zzesVar.zzi(), 0, i11, false);
        return zzesVar.zzt() == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        this.zzf = zzafsVar;
        zzahb zzahbVarZzu = zzafsVar.zzu(1024, 4);
        this.zzg = zzahbVarZzu;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzn(str);
        zztVar.zzo(str);
        zzahbVarZzu.zzA(zztVar.zzO());
        this.zzf.zzv();
        this.zzf.zzw(new zzagv(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        int i10 = this.zze;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzahb zzahbVar = this.zzg;
        zzahbVar.getClass();
        int iZza = zzahbVar.zza(zzafqVar, 1024, true);
        if (iZza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j10, long j11) {
        if (j10 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return f.b(this);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }
}
