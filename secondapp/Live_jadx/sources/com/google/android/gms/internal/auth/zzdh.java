package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzdh implements Serializable {
    public static zzdh zzc() {
        return zzdf.zza;
    }

    public static zzdh zzd(Object obj) {
        return new zzdi(obj);
    }

    public abstract Object zza();

    public abstract boolean zzb();
}
