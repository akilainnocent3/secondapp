package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdr {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhdq zza(String str) throws GeneralSecurityException {
        for (zzhdq zzhdqVar : zza) {
            if (zzhdqVar.zza()) {
                return zzhdqVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
