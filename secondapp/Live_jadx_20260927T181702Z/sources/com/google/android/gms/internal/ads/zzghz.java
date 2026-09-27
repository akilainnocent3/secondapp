package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzghz extends zzgik {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzghz(zzaxf zzaxfVar, zzghg zzghgVar, zzgpu zzgpuVar) {
        super("gq7wVzpH4PA7QYqAIJHaD8z8vNhLTT1MWlA6dHiOlNZFVbInjfwqq07T3Yaw95dW", "MjrNeq7DqxoL90oV2N4Wjq8mKFeExL5fhG0EADlH1Ok=", zzaxfVar, zzghgVar, zzgpuVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l10 = (Long) method.invoke("", null);
                        if (l10 == null) {
                            throw null;
                        }
                        zza = l10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized (zzaxfVar) {
            try {
                if (zza != null) {
                    zzaxfVar.zzm(zza.longValue());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
