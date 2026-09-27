package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcdq implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcdt zza;
    private final String zzb;

    public zzcdq(zzcdt zzcdtVar, String str) {
        Objects.requireNonNull(zzcdtVar);
        this.zza = zzcdtVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcdt zzcdtVar = this.zza;
        synchronized (zzcdtVar) {
            try {
                Iterator it = zzcdtVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzcdr) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
