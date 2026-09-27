package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import nj.t1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzrq extends zzro implements t1 {
    @Override // nj.t1
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.cast.zzro
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract t1 zzc();
}
