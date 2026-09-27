package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbfa implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbfe zzb;

    public zzbfa(zzbfe zzbfeVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbfeVar);
        this.zzb = zzbfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
