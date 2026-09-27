package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzghv extends zzgik {
    private final Context zza;

    public zzghv(zzaxf zzaxfVar, zzghg zzghgVar, Context context, zzgpu zzgpuVar) {
        super("BTx4gmr6iqVvyaR358mezAtZCPvtStL7BPHGGOJ4OcKHl+Vljn9A2vv4NNBM0FZk", "84FqTQQSJD5YjosrKgct4ZY3fp+nQq6NhxB6H7N7GBg=", zzaxfVar, zzghgVar, zzgpuVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        int i10 = 1;
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzaxfVar) {
            try {
                zzaxfVar.zzO(((Integer) objArr[0]).intValue());
                zzaxfVar.zzd(((Integer) objArr[1]).intValue());
                zzaxfVar.zze(((Integer) objArr[2]).intValue());
                zzaxfVar.zzab(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zzaxfVar.zzaf(3);
                } else {
                    zzaxfVar.zzaf(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zzaxfVar.zzae(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i10 = 2;
                    }
                    zzaxfVar.zzae(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
