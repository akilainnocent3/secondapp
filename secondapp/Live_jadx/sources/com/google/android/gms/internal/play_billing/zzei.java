package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzei extends zzeg implements zzeu {
    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        zzd().zzb(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    public /* bridge */ /* synthetic */ Future zzc() {
        throw null;
    }

    public abstract zzeu zzd();
}
