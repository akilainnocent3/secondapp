package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzahp implements zzahl {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzahp(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzahp zzb(zzes zzesVar) {
        int iZzC = zzesVar.zzC();
        zzesVar.zzk(8);
        int iZzC2 = zzesVar.zzC();
        int iZzC3 = zzesVar.zzC();
        zzesVar.zzk(4);
        int iZzC4 = zzesVar.zzC();
        zzesVar.zzk(12);
        return new zzahp(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final int zza() {
        return 1751742049;
    }
}
