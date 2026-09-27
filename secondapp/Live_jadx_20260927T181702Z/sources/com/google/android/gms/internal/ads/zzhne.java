package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhne implements zzhnj {
    private final String zza;
    private final zziam zzb;
    private final zzicn zzc;
    private final zzhse zzd;
    private final zzhtb zze;

    @zq.h
    private final Integer zzf;

    private zzhne(String str, zziam zziamVar, zzicn zzicnVar, zzhse zzhseVar, zzhtb zzhtbVar, @zq.h Integer num) {
        this.zza = str;
        this.zzb = zziamVar;
        this.zzc = zzicnVar;
        this.zzd = zzhseVar;
        this.zze = zzhtbVar;
        this.zzf = num;
    }

    public static zzhne zza(String str, zzicn zzicnVar, zzhse zzhseVar, zzhtb zzhtbVar, @zq.h Integer num) throws GeneralSecurityException {
        if (zzhtbVar == zzhtb.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzhne(str, zzhnq.zzb(str), zzicnVar, zzhseVar, zzhtbVar, num);
    }

    public final zzicn zzb() {
        return this.zzc;
    }

    public final zzhse zzc() {
        return this.zzd;
    }

    public final zzhtb zzd() {
        return this.zze;
    }

    @zq.h
    public final Integer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhnj
    public final zziam zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zza;
    }
}
