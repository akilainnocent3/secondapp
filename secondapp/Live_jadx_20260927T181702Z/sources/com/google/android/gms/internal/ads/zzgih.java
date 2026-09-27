package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgih extends zzgik {
    private static final Long zza = -1L;
    private final zzgdl zzb;
    private final Context zzc;
    private final Map zzd;

    public zzgih(zzaxf zzaxfVar, zzghg zzghgVar, zzgdl zzgdlVar, Context context, Map map, zzgpu zzgpuVar) {
        super("XSwl76jY++LJvrRqZgjH4lZ2jFO5K8JgU9OdjTzzRCmkGCpw/GB5yLIlhp6BclQb", "+/3tZ5MRGKHAc7ucIqJjzsaLNcEh4NvqzRk0nWDZMBM=", zzaxfVar, zzghgVar, zzgpuVar.zza(121));
        this.zzb = zzgdlVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        zzgdl zzgdlVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzgdlVar.ordinal()), this.zzc, zzgst.zza(this.zzd.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (zzaxfVar) {
            try {
                if (zzgdlVar == zzgdl.QUERY) {
                    Object obj = objArr[0];
                    Long l10 = zza;
                    zzaxfVar.zzq(((Long) zzgst.zza(obj, l10)).longValue());
                    zzaxfVar.zzr(((Long) zzgst.zza(objArr[1], l10)).longValue());
                }
                zzaxfVar.zzg(((Long) objArr[2]).longValue());
                zzaxfVar.zzQ(((Long) objArr[3]).longValue());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
