package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzpf extends zzpg {
    final /* synthetic */ zzpm zza;
    private int zzb;
    private final int zzc;

    public zzpf(zzpm zzpmVar) {
        Objects.requireNonNull(zzpmVar);
        this.zza = zzpmVar;
        this.zzb = 0;
        this.zzc = zzpmVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpi
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
