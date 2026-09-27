package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzidb {
    static final zzidb zza = new zzidb(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzidb zzd;
    private final Map zze;

    public zzidb() {
        this.zze = new HashMap();
    }

    public static zzidb zza() {
        int i10 = zzica.zza;
        return zza;
    }

    public static zzidb zzb() {
        zzidb zzidbVar = zzd;
        if (zzidbVar != null) {
            return zzidbVar;
        }
        synchronized (zzidb.class) {
            try {
                zzidb zzidbVar2 = zzd;
                if (zzidbVar2 != null) {
                    return zzidbVar2;
                }
                int i10 = zzica.zza;
                zzidb zzidbVarZzb = zzidj.zzb(zzidb.class);
                zzd = zzidbVarZzb;
                return zzidbVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzidp zzc(zzifc zzifcVar, int i10) {
        return (zzidp) this.zze.get(new zzida(zzifcVar, i10));
    }

    public zzidb(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }
}
