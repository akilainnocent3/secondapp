package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfoq {
    private static final nj.t1 zza = zzhbi.zza(null);
    private final zzhbs zzb;
    private final ScheduledExecutorService zzc;
    private final zzfor zzd;

    public zzfoq(zzhbs zzhbsVar, ScheduledExecutorService scheduledExecutorService, zzfor zzforVar) {
        this.zzb = zzhbsVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzforVar;
    }

    public final zzfop zza(Object obj, nj.t1 t1Var) {
        return new zzfop(this, obj, null, t1Var, Collections.singletonList(t1Var), t1Var, null);
    }

    public final zzfoh zzb(Object obj, nj.t1... t1VarArr) {
        return new zzfoh(this, obj, Arrays.asList(t1VarArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzhbs zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfor zzg() {
        return this.zzd;
    }
}
