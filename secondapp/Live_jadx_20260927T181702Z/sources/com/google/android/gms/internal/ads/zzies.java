package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzies implements zzifa {
    private final zzifa[] zza;

    public zzies(zzifa... zzifaVarArr) {
        this.zza = zzifaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    public final zziez zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzifa zzifaVar = this.zza[i10];
            if (zzifaVar.zzb(cls)) {
                return zzifaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
