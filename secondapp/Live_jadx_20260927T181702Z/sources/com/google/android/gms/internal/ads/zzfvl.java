package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfvl implements Runnable {
    final /* synthetic */ zzfvm zza;
    private final WebView zzb;

    public zzfvl(zzfvm zzfvmVar) {
        Objects.requireNonNull(zzfvmVar);
        this.zza = zzfvmVar;
        this.zzb = zzfvmVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
