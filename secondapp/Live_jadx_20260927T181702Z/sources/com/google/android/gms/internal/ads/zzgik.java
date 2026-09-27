package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgik implements zzgij {
    private final String zza;
    private final String zzb;
    private final zzghg zzc;
    private final zzaxf zzd;
    private final zzgps zze;

    public zzgik(String str, String str2, zzaxf zzaxfVar, zzghg zzghgVar, zzgps zzgpsVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzaxfVar;
        this.zzc = zzghgVar;
        this.zze = zzgpsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th2) {
            try {
                this.zze.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                this.zze.zzc();
                throw th3;
            }
        }
    }

    public abstract void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException;
}
