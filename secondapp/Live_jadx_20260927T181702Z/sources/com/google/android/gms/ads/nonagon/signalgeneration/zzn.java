package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzn extends LinkedHashMap {
    final /* synthetic */ zzq zza;

    public zzn(zzq zzqVar) {
        Objects.requireNonNull(zzqVar);
        this.zza = zzqVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        zzq zzqVar = this.zza;
        synchronized (zzqVar) {
            try {
                if (size() <= zzqVar.zzg()) {
                    return false;
                }
                zzqVar.zzh().add(new Pair((String) entry.getKey(), ((zzo) entry.getValue()).zzb));
                return size() > zzqVar.zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
