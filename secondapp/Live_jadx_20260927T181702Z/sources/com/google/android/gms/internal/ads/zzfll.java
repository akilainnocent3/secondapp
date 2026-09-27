package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfll {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzhbs zzc;

    public zzfll(Callable callable, zzhbs zzhbsVar) {
        this.zzb = callable;
        this.zzc = zzhbsVar;
    }

    public final synchronized void zza(int i10) {
        Deque deque = this.zza;
        int size = i10 - deque.size();
        for (int i11 = 0; i11 < size; i11++) {
            deque.add(this.zzc.zzc(this.zzb));
        }
    }

    @Nullable
    public final synchronized nj.t1 zzb() {
        zza(1);
        return (nj.t1) this.zza.poll();
    }

    public final synchronized void zzc(nj.t1 t1Var) {
        this.zza.addFirst(t1Var);
    }
}
