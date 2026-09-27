package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfvw {
    private JSONObject zza;
    private final zzfwf zzb;

    public zzfvw(zzfwf zzfwfVar) {
        this.zzb = zzfwfVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfwi(this, hashSet, jSONObject, j10));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zza(new zzfwh(this, hashSet, jSONObject, j10));
    }

    public final void zzc() {
        this.zzb.zza(new zzfwg(this));
    }

    @k.h1
    public final JSONObject zzd() {
        return this.zza;
    }

    @k.h1
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
