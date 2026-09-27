package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgkd implements zzfyk {
    private final Context zza;
    private final zzgop zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzgkd(Context context, zzgco zzgcoVar, zzgop zzgopVar) {
        this.zza = context;
        this.zzc = zzgcoVar.zzd();
        this.zzd = zzgcoVar.zzl();
        this.zze = zzgcoVar.zzm();
        this.zzb = zzgopVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        String strZzb;
        zzayf zzayfVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            nj.t1 t1Var = (nj.t1) map.get("gs");
            strZzb = (t1Var == null || (Build.VERSION.SDK_INT >= 31 && !t1Var.isDone()) || (zzayfVar = (zzayf) t1Var.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzayfVar.zzb().length() <= 1) ? l3.a.S4 : zzayfVar.zzb();
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals(l3.a.S4)) {
            try {
                nj.t1 t1Var2 = (nj.t1) map.get("ai");
                if (t1Var2 != null) {
                    String str = (String) t1Var2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgtn.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
