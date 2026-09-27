package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxp extends zzgty {
    final transient zzgto zza;

    public zzgxp(Map map, zzgto zzgtoVar) {
        super(map);
        this.zza = zzgtoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgty, com.google.android.gms.internal.ads.zzgup
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgus
    public final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgus
    public final Map zzl() {
        return zzm();
    }
}
