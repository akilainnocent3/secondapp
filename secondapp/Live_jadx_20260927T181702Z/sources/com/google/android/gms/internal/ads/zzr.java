package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i10) {
        zzgsw.zzi(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzs zzb() {
        zzgsw.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
