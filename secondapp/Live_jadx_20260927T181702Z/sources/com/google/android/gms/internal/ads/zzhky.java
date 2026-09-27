package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhky {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzhky(Map map, Map map2, byte[] bArr) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzhkx zza() {
        return new zzhkx(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r10 = (Enum) this.zzb.get(obj);
        if (r10 != null) {
            return r10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r10) throws GeneralSecurityException {
        Object obj = this.zza.get(r10);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r10)));
    }
}
