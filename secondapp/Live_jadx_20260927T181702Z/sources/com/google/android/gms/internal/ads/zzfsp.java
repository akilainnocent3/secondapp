package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.mediation.AppLovinUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfsp {
    private final zzdyz zza;

    public zzfsp(zzdyz zzdyzVar, Context context) {
        this.zza = zzdyzVar;
    }

    private final void zzt(String str, long j10, @Nullable String str2, @Nullable String str3, AdFormat adFormat, int i10, int i11, int i12, String str4) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", str);
        zzdyyVarZza.zzc("pat", Long.toString(j10));
        zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdyyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdyyVarZza.zzc("pas", Integer.toString(i12));
        zzdyyVarZza.zzc("pv", "2");
        zzdyyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str3);
        zzdyyVarZza.zzc("pid", str2);
        zzdyyVarZza.zzd();
    }

    private final void zzu(@Nullable String str, String str2, long j10, int i10, int i11, @Nullable String str3, @Nullable zzfsw zzfswVar, String str4) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc(str2, Long.toString(j10));
        if (zzfswVar != null) {
            zzdyyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfswVar.zza());
            zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, zzfswVar.zzb());
            zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        }
        zzdyyVarZza.zzc("action", str);
        if (str3 != null) {
            zzdyyVarZza.zzc("gqi", str3);
        }
        if (i10 >= 0) {
            zzdyyVarZza.zzc("max_ads", Integer.toString(i10));
        }
        if (i11 >= 0) {
            zzdyyVarZza.zzc("cache_size", Integer.toString(i11));
        }
        zzdyyVarZza.zzc("pv", str4);
        zzdyyVarZza.zzd();
    }

    private final void zzv(String str, long j10, String str2, String str3, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", str);
        zzdyyVarZza.zzc("pat", Long.toString(j10));
        zzdyyVarZza.zzc("pid", str2);
        zzdyyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str3);
        zzdyyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdyyVarZza.zzc("tpcnt", Integer.toString(i13));
        zzdyyVarZza.zzc("mpl", Integer.toString(i14));
        if (adFormat != null) {
            zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i12 > 0) {
            zzdyyVarZza.zzc("nptr", Integer.toString(i12));
        }
        zzdyyVarZza.zzd();
    }

    public final void zza(int i10, long j10, zzfsw zzfswVar, String str) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "start_preload");
        zzdyyVarZza.zzc("sp_ts", Long.toString(j10));
        zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, zzfswVar.zzb());
        zzdyyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfswVar.zza());
        zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        zzdyyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdyyVarZza.zzc("pv", str);
        zzdyyVarZza.zzd();
    }

    public final void zzb(Map map, long j10, String str) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "start_preload");
        zzdyyVarZza.zzc("sp_ts", Long.toString(j10));
        zzdyyVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdyyVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdyyVarZza.zzd();
    }

    public final void zzc(int i10, int i11, long j10, zzfsw zzfswVar) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "cache_resize");
        zzdyyVarZza.zzc("cs_ts", Long.toString(j10));
        zzdyyVarZza.zzc("orig_ma", Integer.toString(i10));
        zzdyyVarZza.zzc("max_ads", Integer.toString(i11));
        zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, zzfswVar.zzb());
        zzdyyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfswVar.zza());
        zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        zzdyyVarZza.zzc("pv", "1");
        zzdyyVarZza.zzd();
    }

    public final void zzd(int i10, int i11, long j10, @Nullable Long l10, @Nullable String str, @Nullable zzfsw zzfswVar, String str2) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("plaac_ts", Long.toString(j10));
        zzdyyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdyyVarZza.zzc("action", "is_ad_available");
        if (zzfswVar != null) {
            zzdyyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfswVar.zza());
            zzdyyVarZza.zzc("pid", zzfswVar.zzc());
            zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, zzfswVar.zzb());
        }
        if (l10 != null) {
            zzdyyVarZza.zzc("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            zzdyyVarZza.zzc("gqi", str);
        }
        zzdyyVarZza.zzc("pv", str2);
        zzdyyVarZza.zzd();
    }

    public final void zze(long j10, String str) {
        zzu("poll_ad", "ppacwe_ts", j10, -1, -1, null, null, "2");
    }

    public final void zzf(long j10, zzfsw zzfswVar, int i10, int i11, String str) {
        zzu("poll_ad", "ppac_ts", j10, i10, i11, null, zzfswVar, str);
    }

    public final void zzg(long j10, int i10, int i11, String str, zzfsw zzfswVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j10, i10, i11, str, zzfswVar, str2);
    }

    public final void zzh(long j10, int i10, int i11, @Nullable String str, zzfsw zzfswVar, String str2) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("ppla_ts", Long.toString(j10));
        zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, zzfswVar.zzb());
        zzdyyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfswVar.zza());
        zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        zzdyyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdyyVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdyyVarZza.zzc("gqi", str);
        }
        zzdyyVarZza.zzc("pv", str2);
        zzdyyVarZza.zzd();
    }

    public final void zzi(long j10, @Nullable String str, zzfsw zzfswVar, int i10, int i11, String str2) {
        zzu("paa", "pano_ts", j10, i10, i11, str, zzfswVar, str2);
    }

    public final void zzj(long j10, zzfsw zzfswVar, int i10, String str) {
        zzu("pae", "paeo_ts", j10, i10, 0, null, zzfswVar, str);
    }

    public final void zzk(long j10, zzfsw zzfswVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i10, int i11, String str) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "pftla");
        zzdyyVarZza.zzc("pftlat_ts", Long.toString(j10));
        zzdyyVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdyyVarZza.zzc(FirebaseAnalytics.d.f52079b, zzfswVar.zzb());
        zzdyyVarZza.zzc("max_ads", Integer.toString(i10));
        zzdyyVarZza.zzc("cache_size", Integer.toString(i11));
        zzdyyVarZza.zzc(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfswVar.zza());
        zzdyyVarZza.zzc("pid", zzfswVar.zzc());
        zzdyyVarZza.zzc("pv", str);
        zzdyyVarZza.zzd();
    }

    public final void zzl(long j10, AdFormat adFormat, int i10) {
        zzt("pda", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzm(long j10, String str, String str2, AdFormat adFormat, int i10, int i11) {
        zzt("pd", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j10, int i10) {
        zzt("pgcs", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzo(long j10, String str, @Nullable String str2, AdFormat adFormat, int i10, int i11) {
        zzt("pgc", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzp(int i10, long j10, String str, @Nullable String str2, AdFormat adFormat, int i11) {
        zzt("pnav", j10, str, str2, adFormat, i11, i10, 1, "2");
    }

    public final void zzq(long j10, String str, String str2, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13) {
        zzv("acmpa", j10, str, str2, adFormat, i10, i11, 0, i12, i13);
    }

    public final void zzr(long j10, String str, String str2, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        zzv("acmpr", j10, str, str2, adFormat, i10, i11, i12, i13, i14);
    }

    public final void zzs(long j10, int i10, int i11) {
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "acmlr");
        zzdyyVarZza.zzc("pat", Long.toString(j10));
        zzdyyVarZza.zzc("mpl", Integer.toString(i10));
        zzdyyVarZza.zzc("pas", Integer.toString(i11));
        zzdyyVarZza.zzd();
    }
}
