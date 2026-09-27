package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpb implements zzear {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    private final Context zze;
    private final zzbqe zzf;
    private final zzcol zzg;
    private final zzcpb zzh = this;

    public zzcpb(zzcol zzcolVar, Context context, zzbqe zzbqeVar) {
        this.zzg = zzcolVar;
        this.zze = context;
        this.zzf = zzbqeVar;
        zzimi zzimiVarZza = zzimj.zza(this);
        this.zza = zzimiVarZza;
        zzimi zzimiVarZza2 = zzimj.zza(zzbqeVar);
        this.zzb = zzimiVarZza2;
        zzean zzeanVarZzc = zzean.zzc(zzimiVarZza2);
        this.zzc = zzeanVarZzc;
        this.zzd = zzimh.zza(zzeap.zza(zzimiVarZza, zzeanVarZzc));
    }

    public final zzeam zza() {
        return zzean.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzeao zzb() {
        return (zzeao) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzeaj zzc() {
        return new zzcoy(this.zzg, this.zzh, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
