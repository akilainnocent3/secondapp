package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzd extends zzwq {
    private final zzak zzc;

    private zzzd(zzbf zzbfVar, zzak zzakVar) {
        super(zzbfVar);
        this.zzc = zzakVar;
    }

    public static zzzd zzp(zzbf zzbfVar, zzak zzakVar) {
        return zzbfVar instanceof zzzd ? new zzzd(((zzzd) zzbfVar).zzb, zzakVar) : new zzzd(zzbfVar, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwq, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        this.zzb.zzb(i10, zzbeVar, j10);
        zzak zzakVar = this.zzc;
        zzbeVar.zzd = zzakVar;
        zzag zzagVar = zzakVar.zzb;
        zzbeVar.zzc = null;
        return zzbeVar;
    }
}
