package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrm implements zzrl {
    public static final zzkm zza;

    static {
        zzkg zzkgVarZzb = new zzkg(zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzkgVarZzb.zzd("measurement.tcf.consent_fix", true);
        zzkgVarZzb.zzd("measurement.tcf.client", true);
        zzkgVarZzb.zzd("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzrl
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
