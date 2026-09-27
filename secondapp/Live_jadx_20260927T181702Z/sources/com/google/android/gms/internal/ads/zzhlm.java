package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhlm {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhlm(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhlm zzd(zzhll zzhllVar, Class cls, Class cls2) {
        return new zzhlk(cls, cls2, zzhllVar);
    }

    public abstract zzhnj zza(zzhdc zzhdcVar, @zq.h zzhdx zzhdxVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
