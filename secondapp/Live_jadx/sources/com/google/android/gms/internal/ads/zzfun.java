package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfun implements Runnable {
    final /* synthetic */ zzfuo zza;

    public zzfun(zzfuo zzfuoVar) {
        Objects.requireNonNull(zzfuoVar);
        this.zza = zzfuoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfuo zzfuoVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzfuoVar.zzf();
        float fZzc = zzfuoVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzfuoVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzfuoVar.zzd().post(new zzfum(this, fZzc));
        }
    }
}
