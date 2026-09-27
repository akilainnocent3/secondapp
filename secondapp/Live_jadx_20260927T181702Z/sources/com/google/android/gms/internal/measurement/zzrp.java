package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrp implements zzro {
    public static final zzkm zza = new zzkg(zzkb.zza("com.google.android.gms.measurement")).zza().zzb().zzd("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final boolean zzb() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
