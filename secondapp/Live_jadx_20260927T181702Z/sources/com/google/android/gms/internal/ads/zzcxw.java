package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxw {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final nj.t1 zzc;
    private volatile boolean zzd = true;

    public zzcxw(Executor executor, ScheduledExecutorService scheduledExecutorService, nj.t1 t1Var) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = t1Var;
    }

    public final void zza(zzhbf zzhbfVar) {
        zzhbi.zzr(this.zzc, new zzcxq(this, zzhbfVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ nj.t1 zzc(zzhbf zzhbfVar, nj.t1 t1Var, zzcxh zzcxhVar) {
        if (zzcxhVar != null) {
            zzhbfVar.zzb(zzcxhVar);
        }
        return zzhbi.zzi(t1Var, ((Long) zzbks.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final /* synthetic */ void zze(List list, final zzhbf zzhbfVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzhbfVar.zza(new zzedr(3));
                }
            });
            return;
        }
        nj.t1 t1VarZza = zzhbi.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final nj.t1 t1Var = (nj.t1) it.next();
            zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcxs
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ nj.t1 zza(Object obj) {
                    zzhbfVar.zza((Throwable) obj);
                    return zzhbi.zza(null);
                }
            };
            Executor executor = this.zza;
            t1VarZza = zzhbi.zzj(zzhbi.zzh(t1VarZza, Throwable.class, zzhaqVar, executor), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcxt
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ nj.t1 zza(Object obj) {
                    return this.zza.zzc(zzhbfVar, t1Var, (zzcxh) obj);
                }
            }, executor);
        }
        zzhbi.zzr(t1VarZza, new zzcxr(this, zzhbfVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzcff.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
