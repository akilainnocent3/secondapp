package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhbh {
    private final boolean zza;
    private final zzgvz zzb;

    public /* synthetic */ zzhbh(boolean z10, zzgvz zzgvzVar, byte[] bArr) {
        this.zza = z10;
        this.zzb = zzgvzVar;
    }

    public final nj.t1 zza(Callable callable, Executor executor) {
        return new zzhaw(this.zzb, this.zza, executor, callable);
    }
}
