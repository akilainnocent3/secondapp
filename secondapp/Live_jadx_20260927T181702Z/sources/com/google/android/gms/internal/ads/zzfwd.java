package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfwd extends zzfwe {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfwd(zzfvw zzfvwVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfvwVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
