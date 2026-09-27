package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzghn extends zzgik {
    private final Activity zza;
    private final View zzb;

    public zzghn(zzaxf zzaxfVar, zzghg zzghgVar, View view, Activity activity, zzgpu zzgpuVar) {
        super("qGCVuShxHi5g5oTbZqgVVaJuUKd5rb8b1VKlKDgilb3gFEvhZMYJ189BaQpMBwgM", "9XpuTyqSOEOyEnWk9spV5pvYAc4fToDwGrqzwR+6M2Q=", zzaxfVar, zzghgVar, zzgpuVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        synchronized (zzaxfVar) {
            zzaxfVar.zzS(((Long) objArr[0]).longValue());
            zzaxfVar.zzT(((Long) objArr[1]).longValue());
            zzaxfVar.zzU((String) objArr[2]);
        }
    }
}
