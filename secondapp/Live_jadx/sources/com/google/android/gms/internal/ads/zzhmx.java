package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhmx {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhmx(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhmx zzd(zzhmw zzhmwVar, Class cls, Class cls2) {
        return new zzhmv(cls, cls2, zzhmwVar);
    }

    public abstract Object zza(zzhdc zzhdcVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
