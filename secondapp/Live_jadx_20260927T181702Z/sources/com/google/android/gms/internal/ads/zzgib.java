package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgib extends zzgik {
    private final Map zza;

    public zzgib(zzaxf zzaxfVar, zzghg zzghgVar, Map map, zzgpu zzgpuVar) {
        super("tbIKq6FOiOfxdW8ZfvJyrn0iZTQEuEsM8aeex4vhphuLvDBk2MG5LCqWKXzBm1MV", "oRl8qE5oXqOacbiOMIzOiRlot6BynopML8fxeJkSvog=", zzaxfVar, zzghgVar, zzgpuVar.zza(118));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (zzaxfVar) {
            try {
                zzaxfVar.zzf(((Long) objArr[0]).longValue());
                long jLongValue = ((Long) objArr[1]).longValue();
                if (jLongValue >= 0) {
                    zzaxfVar.zzW(jLongValue);
                }
                long jLongValue2 = ((Long) objArr[2]).longValue();
                if (jLongValue2 >= 0) {
                    zzaxfVar.zzX(jLongValue2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
