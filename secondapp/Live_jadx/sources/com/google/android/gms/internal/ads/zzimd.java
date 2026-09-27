package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzimd {
    final LinkedHashMap zza;

    public zzimd(int i10) {
        this.zza = zzimf.zzc(i10);
    }

    public final zzimd zza(Object obj, zzimr zzimrVar) {
        zzimq.zza(obj, "key");
        zzimq.zza(zzimrVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzimrVar);
        return this;
    }
}
