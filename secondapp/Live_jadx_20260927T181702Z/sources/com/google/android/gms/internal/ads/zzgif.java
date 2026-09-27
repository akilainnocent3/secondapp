package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgif extends zzgik {
    private final Context zza;
    private final Map zzb;

    public zzgif(zzaxf zzaxfVar, zzghg zzghgVar, Map map, Context context, zzgpu zzgpuVar) {
        super("Pt5oy6vdiOsAlmK5xGhewpZDwiDaXWdHs0dIC271RZneoCnOgrDiN5S7yVnR6Ayj", "owbXqBqU1t9p5nhuPxNMyYbRZbmDif7k9HhYwz0h83Y=", zzaxfVar, zzghgVar, zzgpuVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l10 = (Long) method.invoke("", this.zza);
                if (l10 == null) {
                    throw null;
                }
                lValueOf = l10;
            } else {
                nj.t1 t1Var = (nj.t1) this.zzb.get("gs");
                if (t1Var != null && t1Var.isDone()) {
                    lValueOf = Long.valueOf(((zzayf) t1Var.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzaxfVar) {
            zzaxfVar.zzR(lValueOf.longValue());
        }
    }
}
