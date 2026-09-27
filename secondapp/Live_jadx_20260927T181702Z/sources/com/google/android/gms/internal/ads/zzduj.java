package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzduj implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdyz zzc;
    private final zzeju zzd;
    private final Executor zze;
    private final zzbai zzf;
    private final VersionInfoParcel zzg;
    private final zzfro zzh;
    private final zzekf zzi;
    private final zzfkq zzj;

    public zzduj(Context context, Executor executor, zzbai zzbaiVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcky zzckyVar, zzeju zzejuVar, zzfro zzfroVar, zzdyz zzdyzVar, zzekf zzekfVar, zzfkq zzfkqVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzbaiVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzejuVar;
        this.zzh = zzfroVar;
        this.zzc = zzdyzVar;
        this.zzi = zzekfVar;
        this.zzj = zzfkqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdul zzdulVar = new zzdul(this);
        zzdulVar.zza();
        return zzdulVar;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public final /* synthetic */ zzdyz zzc() {
        return this.zzc;
    }

    public final /* synthetic */ zzeju zzd() {
        return this.zzd;
    }

    public final /* synthetic */ Executor zze() {
        return this.zze;
    }

    public final /* synthetic */ zzbai zzf() {
        return this.zzf;
    }

    public final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    public final /* synthetic */ zzfro zzh() {
        return this.zzh;
    }

    public final /* synthetic */ zzekf zzi() {
        return this.zzi;
    }

    public final /* synthetic */ zzfkq zzj() {
        return this.zzj;
    }
}
