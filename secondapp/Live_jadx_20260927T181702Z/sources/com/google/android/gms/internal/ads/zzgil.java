package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgil extends zzgik {
    private final Map zza;
    private final zzgdl zzb;

    public zzgil(zzaxf zzaxfVar, zzghg zzghgVar, zzgdl zzgdlVar, Map map, zzgpu zzgpuVar) {
        super("iqNxrA39udYfZwL8ikj8QrH6GLNyDgn2xpJcGD9bSCzMyXQCZ9vm5NTDuXRD03vB", "Xa72p7jIVzvp+ti20aPtDwi/Mq1wVJXGo11cqYEjDFo=", zzaxfVar, zzghgVar, zzgpuVar.zza(122));
        this.zza = map;
        this.zzb = zzgdlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgik
    public final void zza(Method method, zzaxf zzaxfVar) throws IllegalAccessException, InvocationTargetException {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.zza;
        lArr[0] = (Long) zzgst.zza((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) zzgst.zza((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) zzgst.zza((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) zzgst.zza((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) zzgst.zza((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) zzgst.zza((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) zzgst.zza((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) zzgst.zza((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) zzgst.zza((Long) map.get("tst"), -1L);
        for (int i10 = 0; i10 < 9; i10++) {
            if (lArr[i10] == null) {
                lArr[i10] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        synchronized (zzaxfVar) {
            zzaxfVar.zzac(lArr2[0].longValue());
            zzaxfVar.zzs(lArr2[1].longValue());
            zzaxfVar.zzn(lArr2[2].longValue());
            zzaxfVar.zzk(lArr2[3].longValue());
            zzaxfVar.zzY(lArr2[4].longValue());
            zzaxfVar.zzZ(lArr2[5].longValue());
            zzaxfVar.zzF(lArr2[6].longValue());
            zzaxfVar.zzG(lArr2[7].longValue());
        }
    }
}
