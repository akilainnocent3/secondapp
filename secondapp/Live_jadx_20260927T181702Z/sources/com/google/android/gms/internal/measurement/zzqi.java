package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqi implements zzqh {
    public static final zzkm zza;

    static {
        zzkg zzkgVarZzb = new zzkg(zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        zzkgVarZzb.zzd("measurement.gmscore_feature_tracking", true);
        zza = zzkgVarZzb.zzd("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqh
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
