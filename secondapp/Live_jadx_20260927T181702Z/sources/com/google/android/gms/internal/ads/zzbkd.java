package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkd {
    public static final zzbjo zza = new zzbjo("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbjo zzb = new zzbjo("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbjo zzc = zzbjo.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbjo zzd = zzbjo.zza("gads:gma_attestation:click:enable", false);
    public static final zzbjo zze = zzbjo.zzb("gads:gma_attestation:click:enable_dynamite_version", Long.MAX_VALUE);
    public static final zzbjo zzf = zzbjo.zza("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbjo zzg = zzbjo.zza("gads:gma_attestation:image_hash", false);
    public static final zzbjo zzh = zzbjo.zza("gads:gma_attestation:impression:enable", false);
    public static final zzbjo zzi;

    static {
        zzbjo.zza("gads:gma_attestation:request:enable_javascript", false);
        zzbjo.zza("gads:gma_attestation:request:enable", true);
        zzi = zzbjo.zza("gads:gma_attestation:click:report_error", true);
    }
}
