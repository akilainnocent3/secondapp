package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgid extends zzgik {
    private final Context zza;

    public zzgid(zzaxf zzaxfVar, zzghg zzghgVar, Context context, zzgpu zzgpuVar) {
        super("Gw9By3kOjW1dlKqpMN9Ru+bAsi5RkhHpFGEM1BbgghZLy9dbjqQnjubzrMDb//Uh", "gb20XjpeCPjPPPz5rLevwoV0OQNDhI+r1LgAZVFNL3Y=", zzaxfVar, zzghgVar, zzgpuVar.zza(119));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzaxfVar) {
            zzaxfVar.zzc(((Long) objArr[0]).longValue());
            zzaxfVar.zzP(((Long) objArr[1]).longValue());
        }
    }
}
