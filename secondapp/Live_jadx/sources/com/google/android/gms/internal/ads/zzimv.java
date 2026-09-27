package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimv implements zzimr {
    private static final Object zza = new Object();
    private volatile zzimr zzb;
    private volatile Object zzc = zza;

    private zzimv(zzimr zzimrVar) {
        this.zzb = zzimrVar;
    }

    public static zzimr zza(zzimr zzimrVar) {
        return ((zzimrVar instanceof zzimv) || (zzimrVar instanceof zzimh)) ? zzimrVar : new zzimv(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzimr zzimrVar = this.zzb;
        if (zzimrVar == null) {
            return this.zzc;
        }
        Object objZzb = zzimrVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
