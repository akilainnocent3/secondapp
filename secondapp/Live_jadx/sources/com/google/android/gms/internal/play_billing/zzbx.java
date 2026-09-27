package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbx extends zzca {
    public zzbx() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzca
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzca
    public final zzca zzb(Comparable comparable, Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        if (iCompareTo < 0) {
            return zzca.zzb;
        }
        return iCompareTo > 0 ? zzca.zzc : zzca.zza;
    }
}
