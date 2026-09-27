package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgvk extends zzgvm {
    public zzgvk() {
        super(null);
    }

    public static final zzgvm zzf(int i10) {
        if (i10 < 0) {
            return zzgvm.zzb;
        }
        return i10 > 0 ? zzgvm.zzc : zzgvm.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzb(int i10, int i11) {
        return zzf(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzc(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z11, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzd(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zze() {
        return 0;
    }
}
