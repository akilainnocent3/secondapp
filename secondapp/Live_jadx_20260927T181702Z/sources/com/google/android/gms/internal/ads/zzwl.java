package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzwl implements zzyw {
    private final zzyw zza;
    private final zzgvz zzb;

    public zzwl(zzyw zzywVar, List list) {
        this.zza = zzywVar;
        this.zzb = zzgvz.zzq(list);
    }

    public final zzgvz zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j10) {
        this.zza.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        return this.zza.zzm(zzluVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        return this.zza.zzn();
    }
}
