package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzbjo {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbjo(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbjo zza(String str, boolean z10) {
        return new zzbjo(str, Boolean.valueOf(z10), 1);
    }

    public static zzbjo zzb(String str, long j10) {
        return new zzbjo(str, Long.valueOf(j10), 2);
    }

    public static zzbjo zzc(String str, double d10) {
        return new zzbjo(str, Double.valueOf(d10), 3);
    }

    public static zzbjo zzd(String str, String str2) {
        return new zzbjo("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbku zzbkuVarZza = zzbkw.zza();
        if (zzbkuVarZza == null) {
            if (zzbkw.zzb() != null) {
                zzbkw.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 == 0) {
            return zzbkuVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i10 != 1) {
            return i10 != 2 ? zzbkuVarZza.zzd(this.zza, (String) this.zzb) : zzbkuVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzbkuVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
    }
}
