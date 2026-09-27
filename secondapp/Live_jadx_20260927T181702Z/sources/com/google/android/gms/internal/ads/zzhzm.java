package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhzm {
    public static final zzhzm zza = new zzhzm(new zzhzn());
    public static final zzhzm zzb = new zzhzm(new zzhzr());
    public static final zzhzm zzc = new zzhzm(new zzhzt());
    public static final zzhzm zzd = new zzhzm(new zzhzs());
    public static final zzhzm zze;
    public static final zzhzm zzf;
    private final zzhzl zzg;

    static {
        new zzhzm(new zzhzo());
        zze = new zzhzm(new zzhzq());
        zzf = new zzhzm(new zzhzp());
    }

    public zzhzm(zzhzu zzhzuVar) {
        this.zzg = !zzhki.zza() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzhzi(zzhzuVar, null) : new zzhzj(zzhzuVar, null) : new zzhzk(zzhzuVar, null);
    }

    public static List zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zzb(String str) throws GeneralSecurityException {
        return this.zzg.zza(str);
    }
}
