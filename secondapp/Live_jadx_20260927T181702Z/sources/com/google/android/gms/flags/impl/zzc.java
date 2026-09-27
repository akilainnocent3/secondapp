package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzc implements Callable<Long> {
    final /* synthetic */ SharedPreferences zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Long zzc;

    public zzc(SharedPreferences sharedPreferences, String str, Long l10) {
        this.zza = sharedPreferences;
        this.zzb = str;
        this.zzc = l10;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.zza.getLong(this.zzb, this.zzc.longValue()));
    }
}
