package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgaj {

    @oy.l
    private final zzgaf zza;

    @dr.f1
    public final /* synthetic */ zzgah zza() {
        zzidr zzidrVarZzbu = this.zza.zzbu();
        kotlin.jvm.internal.m0.o(zzidrVarZzbu, "build(...)");
        return (zzgah) zzidrVarZzbu;
    }

    @cs.j(name = "getQueryIdToAdQualityDataMapMap")
    public final /* synthetic */ zzigx zzb() {
        Map mapZzb = this.zza.zzb();
        kotlin.jvm.internal.m0.o(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzigx(mapZzb);
    }

    @cs.j(name = "putQueryIdToAdQualityDataMap")
    public final void zzc(@oy.l zzigx zzigxVar, @oy.l String key, @oy.l zzgad value) {
        kotlin.jvm.internal.m0.p(zzigxVar, "<this>");
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(value, "value");
        this.zza.zzc(key, value);
    }

    @cs.j(name = "removeQueryIdToAdQualityDataMap")
    public final /* synthetic */ void zzd(zzigx zzigxVar, String key) {
        kotlin.jvm.internal.m0.p(zzigxVar, "<this>");
        kotlin.jvm.internal.m0.p(key, "key");
        this.zza.zza(key);
    }
}
