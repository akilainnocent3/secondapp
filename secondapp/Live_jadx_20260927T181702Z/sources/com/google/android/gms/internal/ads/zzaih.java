package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzaih {
    protected final zzahb zza;

    public zzaih(zzahb zzahbVar) {
        this.zza = zzahbVar;
    }

    public abstract boolean zza(zzes zzesVar) throws zzat;

    public abstract boolean zzb(zzes zzesVar, long j10) throws zzat;

    public final boolean zzf(zzes zzesVar, long j10) throws zzat {
        return zza(zzesVar) && zzb(zzesVar, j10);
    }
}
