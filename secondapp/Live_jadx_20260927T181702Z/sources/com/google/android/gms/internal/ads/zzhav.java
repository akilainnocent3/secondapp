package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhav extends zzhbp {
    private final Executor zza;
    final /* synthetic */ zzhaw zzb;

    public zzhav(zzhaw zzhawVar, Executor executor) {
        Objects.requireNonNull(zzhawVar);
        this.zzb = zzhawVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzb(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final void zzg(Throwable th2) {
        zzhaw zzhawVar = this.zzb;
        zzhawVar.zzD(null);
        if (th2 instanceof ExecutionException) {
            zzhawVar.zzb(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            zzhawVar.cancel(false);
        } else {
            zzhawVar.zzb(th2);
        }
    }
}
