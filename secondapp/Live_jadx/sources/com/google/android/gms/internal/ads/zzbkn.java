package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbkn {
    public static final zzbjo zza = zzbjo.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbjo zzb = zzbjo.zza("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbjo zzc = new zzbjo("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbjo zzd = new zzbjo("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbjo zze;
    public static final zzbjo zzf;

    static {
        zzbjo.zza("gads:sdk_crash_report_enabled", false);
        zze = zzbjo.zza("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbjo.zzc("gads:trapped_exception_sample_rate", 0.01d);
    }
}
