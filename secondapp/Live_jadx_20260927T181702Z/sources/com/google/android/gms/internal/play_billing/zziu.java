package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zziu {
    public static final /* synthetic */ int zza = 0;
    private static final zziu zzb = new zziu();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zziy zzc = new zzie();

    private zziu() {
    }

    public static zziu zza() {
        return zzb;
    }

    public final zzix zzb(Class cls) {
        zzhp.zzc(cls, "messageType");
        zzix zzixVar = (zzix) this.zzd.get(cls);
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzixVarZza = this.zzc.zza(cls);
        zzhp.zzc(cls, "messageType");
        zzix zzixVar2 = (zzix) this.zzd.putIfAbsent(cls, zzixVarZza);
        return zzixVar2 == null ? zzixVarZza : zzixVar2;
    }
}
