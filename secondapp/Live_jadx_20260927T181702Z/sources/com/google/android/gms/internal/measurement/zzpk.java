package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpk implements zzpj {
    public static final zzkm zza;
    public static final zzkm zzb;

    static {
        zzkg zzkgVarZzb = new zzkg(zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        zzkgVarZzb.zzd("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        zzkgVarZzb.zzd("measurement.set_default_event_parameters_with_backfill.service", true);
        zzkgVarZzb.zzc("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        zza = zzkgVarZzb.zzd("measurement.set_default_event_parameters.fix_app_update_logging", true);
        zzb = zzkgVarZzb.zzd("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        zzkgVarZzb.zzd("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean zzb() {
        return ((Boolean) zzb.zzd()).booleanValue();
    }
}
