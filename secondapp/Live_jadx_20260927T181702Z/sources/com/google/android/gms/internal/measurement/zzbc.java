package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbc implements zzbe {
    private final zzg zza;
    private final String zzb;

    public zzbc(zzg zzgVar, String str) {
        this.zza = zzgVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbe
    public final zzg zza(zzao zzaoVar) {
        zzg zzgVarZzc = this.zza.zzc();
        zzgVarZzc.zzg(this.zzb, zzaoVar);
        return zzgVarZzc;
    }
}
