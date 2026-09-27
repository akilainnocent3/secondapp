package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdg {
    private boolean zza;

    @zq.h
    private final zzhdt zzc;
    private final zzhde zzb = zzhde.zza;
    private zzhdh zzd = null;

    @zq.h
    private zzhdi zze = null;

    public /* synthetic */ zzhdg(zzhdt zzhdtVar, byte[] bArr) {
        this.zzc = zzhdtVar;
    }

    public final zzhdg zza() {
        zzhdi zzhdiVar = this.zze;
        if (zzhdiVar != null) {
            zzhdiVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhdg zzb() {
        this.zzd = zzhdh.zza;
        return this;
    }

    public final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(boolean z10) {
        this.zza = false;
    }

    public final /* synthetic */ zzhde zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhdt zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzhdh zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzhdi zzh() {
        return this.zze;
    }

    public final /* synthetic */ void zzi(zzhdi zzhdiVar) {
        this.zze = zzhdiVar;
    }
}
