package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgeo {
    private final zzimc zza;
    private final zzimc zzb;
    private final ExecutorService zzc;
    private final zzimc zzd;
    private nj.t1 zze = null;

    public zzgeo(zzimc zzimcVar, zzimc zzimcVar2, ExecutorService executorService, zzimc zzimcVar3) {
        this.zza = zzimcVar;
        this.zzb = zzimcVar2;
        this.zzc = executorService;
        this.zzd = zzimcVar3;
    }

    public final synchronized nj.t1 zza() {
        try {
            nj.t1 t1Var = this.zze;
            if (t1Var != null) {
                return t1Var;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzgem) it.next()).zza());
            }
            zzgpu zzgpuVar = (zzgpu) this.zzd.zzb();
            nj.t1 t1VarZzk = zzhbi.zzk(zzhbi.zzm(arrayList), zzgen.zza, this.zzc);
            zzgpuVar.zze(2, t1VarZzk);
            this.zze = t1VarZzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzgem) it2.next()).zza();
            }
            nj.t1 t1Var2 = this.zze;
            if (t1Var2 != null) {
                return t1Var2;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized nj.t1 zzb() {
        nj.t1 t1Var;
        t1Var = this.zze;
        if (t1Var == null) {
            throw null;
        }
        return t1Var;
    }
}
