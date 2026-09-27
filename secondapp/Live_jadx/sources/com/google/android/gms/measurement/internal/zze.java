package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zze {
    private final zzji zza;

    public zze(zzji zzjiVar) {
        this.zza = zzjiVar;
    }

    public static zze zzc(String str) {
        return new zze((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : zzjl.zzj(str.charAt(0)));
    }

    public final zzji zza() {
        return this.zza;
    }

    public final String zzb() {
        return String.valueOf(zzjl.zzm(this.zza));
    }
}
