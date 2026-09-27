package com.google.android.gms.internal.cast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfo extends zzfg {
    private final zzfq zza;

    public zzfo(zzfq zzfqVar, int i10) {
        super(zzfqVar.size(), i10);
        this.zza = zzfqVar;
    }

    @Override // com.google.android.gms.internal.cast.zzfg
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
