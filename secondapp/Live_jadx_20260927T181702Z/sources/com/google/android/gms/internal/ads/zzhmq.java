package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhmq {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhmq(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhmq zzd(zzhmp zzhmpVar, Class cls, Class cls2) {
        return new zzhmo(cls, cls2, zzhmpVar);
    }

    public abstract zzhnj zza(zzhdt zzhdtVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
