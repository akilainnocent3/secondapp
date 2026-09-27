package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhmn {
    private final zziam zza;
    private final Class zzb;

    public /* synthetic */ zzhmn(zziam zziamVar, Class cls, byte[] bArr) {
        this.zza = zziamVar;
        this.zzb = cls;
    }

    public static zzhmn zzd(zzhmm zzhmmVar, zziam zziamVar, Class cls) {
        return new zzhml(zziamVar, cls, zzhmmVar);
    }

    public abstract zzhdt zza(zzhnj zzhnjVar) throws GeneralSecurityException;

    public final zziam zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
