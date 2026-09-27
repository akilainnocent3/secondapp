package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwk {
    private final zzdyz zza;

    public zzdwk(zzdyz zzdyzVar) {
        this.zza = zzdyzVar;
    }

    public final boolean zza(zzgad zzgadVar) {
        if (zzgadVar.zzj()) {
            zzdyy zzdyyVarZza = this.zza.zza();
            zzdyyVarZza.zzc("action", "aq_ad_closed");
            zzdyyVarZza.zzc("gqi", zzgadVar.zza());
            zzdyyVarZza.zzc("aq_ad_duration", String.valueOf(zzgadVar.zzb()));
            zzdyyVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzgadVar.zzc()));
            zzdyyVarZza.zzc("aq_time_away", String.valueOf(zzgadVar.zzg()));
            return zzdyyVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzdyy zzdyyVarZza2 = this.zza.zza();
        zzdyyVarZza2.zzc("action", "aq_ad_kill");
        zzdyyVarZza2.zzc("gqi", zzgadVar.zza());
        zzdyyVarZza2.zzc("aq_ad_duration", String.valueOf(zzgadVar.zzb()));
        zzdyyVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzgadVar.zzc()));
        zzdyyVarZza2.zzc("aq_time_away", String.valueOf(zzgadVar.zzg()));
        zzdyyVarZza2.zzc("aq_is_os_kill", String.valueOf(zzgadVar.zze()));
        return zzdyyVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
