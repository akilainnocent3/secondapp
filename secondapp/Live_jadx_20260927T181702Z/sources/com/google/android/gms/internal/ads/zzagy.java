package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzagy extends zzage {
    final /* synthetic */ zzags zza;
    final /* synthetic */ zzagz zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagy(zzagz zzagzVar, zzags zzagsVar, zzags zzagsVar2) {
        super(zzagsVar);
        this.zza = zzagsVar2;
        Objects.requireNonNull(zzagzVar);
        this.zzb = zzagzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzage, com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j10) {
        zzagq zzagqVarZzc = this.zza.zzc(j10);
        zzagt zzagtVar = zzagqVarZzc.zza;
        long j11 = zzagtVar.zzb;
        zzagz zzagzVar = this.zzb;
        zzagt zzagtVar2 = new zzagt(j11, zzagtVar.zzc + zzagzVar.zza());
        zzagt zzagtVar3 = zzagqVarZzc.zzb;
        return new zzagq(zzagtVar2, new zzagt(zzagtVar3.zzb, zzagtVar3.zzc + zzagzVar.zza()));
    }
}
