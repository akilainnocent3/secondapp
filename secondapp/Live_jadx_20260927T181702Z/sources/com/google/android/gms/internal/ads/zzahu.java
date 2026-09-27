package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzahu implements zzahl {
    public final String zza;

    private zzahu(String str) {
        this.zza = str;
    }

    public static zzahu zzb(zzes zzesVar) {
        return new zzahu(zzesVar.zzK(zzesVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final int zza() {
        return 1852994675;
    }
}
