package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbtk implements zzbsb, zzbtj {
    private final zzbtj zza;
    private final HashSet zzb = new HashSet();

    public zzbtk(zzbtj zzbtjVar) {
        this.zza = zzbtjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsb, com.google.android.gms.internal.ads.zzbsm
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsb, com.google.android.gms.internal.ads.zzbsm
    public /* synthetic */ void zzb(String str, JSONObject jSONObject) {
        g0.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsb, com.google.android.gms.internal.ads.zzbsm
    public /* synthetic */ void zzc(String str, String str2) {
        g0.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsb, com.google.android.gms.internal.ads.zzbsa
    public /* synthetic */ void zzd(String str, JSONObject jSONObject) {
        g0.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsb, com.google.android.gms.internal.ads.zzbsa
    public /* synthetic */ void zze(String str, Map map) {
        g0.d(this, str, map);
    }

    public final void zzf() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.zzb;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbpe) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbpe) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzm(String str, zzbpe zzbpeVar) {
        this.zza.zzm(str, zzbpeVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbpeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzn(String str, zzbpe zzbpeVar) {
        this.zza.zzn(str, zzbpeVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbpeVar));
    }
}
