package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzu implements zzeu {
    final WeakReference zza;
    private final zzq zzb = new zzt(this);

    public zzu(zzr zzrVar) {
        this.zza = new WeakReference(zzrVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zzr zzrVar = (zzr) this.zza.get();
        boolean zCancel = this.zzb.cancel(z10);
        if (!zCancel || zzrVar == null) {
            return zCancel;
        }
        zzrVar.zza();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zzb.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzb.zzc instanceof zzg;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzb.isDone();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza(Object obj) {
        return this.zzb.zzd(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.zzb.zzb(runnable, executor);
    }

    public final boolean zzc(Throwable th2) {
        zzi zziVar = new zzi(th2);
        zzf zzfVar = zzq.zzb;
        zzq zzqVar = this.zzb;
        if (!zzfVar.zzd(zzqVar, null, zziVar)) {
            return false;
        }
        zzq.zzc(zzqVar);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzb.get(j10, timeUnit);
    }
}
