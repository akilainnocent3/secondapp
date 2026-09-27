package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzasv implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzasx zzc;

    public zzasv(zzasx zzasxVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzasxVar);
        this.zzc = zzasxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasx zzasxVar = this.zzc;
        zzasxVar.zzx().zza(this.zza, this.zzb);
        zzasxVar.zzx().zzb(zzasxVar.toString());
    }
}
