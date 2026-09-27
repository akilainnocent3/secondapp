package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzght extends zzgik {
    public zzght(zzaxf zzaxfVar, zzghg zzghgVar, zzgpu zzgpuVar) {
        super("7N1N0HTBd0FX/DlFK+QEm49CjJk/0HuOUxvOOv1ySzbmqrH0/GjlE6wO1ZKfr7Hh", "F/OYjBO034TbLBQbPeCpbzYwooLGpTD8Jk82c4yVIIw=", zzaxfVar, zzghgVar, zzgpuVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzaxfVar) {
            zzaxfVar.zza(l3.a.S4);
            zzaxfVar.zzB(0L);
            zzaxfVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (zzaxfVar) {
            zzaxfVar.zza((String) objArr[0]);
            zzaxfVar.zzB(((Long) objArr[1]).longValue());
            zzaxfVar.zzV((String) objArr[2]);
        }
    }
}
