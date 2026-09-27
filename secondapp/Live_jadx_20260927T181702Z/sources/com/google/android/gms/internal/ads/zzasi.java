package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzasi implements Runnable {
    final /* synthetic */ zzasx zza;
    final /* synthetic */ zzasj zzb;

    public zzasi(zzasj zzasjVar, zzasx zzasxVar) {
        this.zza = zzasxVar;
        Objects.requireNonNull(zzasjVar);
        this.zzb = zzasjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
