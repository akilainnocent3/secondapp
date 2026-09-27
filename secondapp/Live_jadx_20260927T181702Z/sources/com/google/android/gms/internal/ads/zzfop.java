package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfop {
    final /* synthetic */ zzfoq zza;
    private final Object zzb;

    @Nullable
    private final String zzc;
    private final nj.t1 zzd;
    private final List zze;
    private final nj.t1 zzf;

    public /* synthetic */ zzfop(zzfoq zzfoqVar, Object obj, String str, nj.t1 t1Var, List list, nj.t1 t1Var2, byte[] bArr) {
        this(zzfoqVar, obj, null, t1Var, list, t1Var2);
    }

    public final zzfop zza(String str) {
        return new zzfop(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfop zzb(final zzfny zzfnyVar) {
        return zzc(new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfoo
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ nj.t1 zza(Object obj) {
                return zzhbi.zza(zzfnyVar.zza(obj));
            }
        });
    }

    public final zzfop zzc(zzhaq zzhaqVar) {
        return zzd(zzhaqVar, this.zza.zze());
    }

    public final zzfop zzd(zzhaq zzhaqVar, Executor executor) {
        return new zzfop(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhbi.zzj(this.zzf, zzhaqVar, executor));
    }

    public final zzfop zze(final nj.t1 t1Var) {
        return zzd(new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfol
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ nj.t1 zza(Object obj) {
                return t1Var;
            }
        }, zzcff.zzh);
    }

    public final zzfop zzf(Class cls, final zzfny zzfnyVar) {
        return zzg(cls, new zzhaq(zzfnyVar) { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ nj.t1 zza(Object obj) {
                return zzhbi.zza("");
            }
        });
    }

    public final zzfop zzg(Class cls, zzhaq zzhaqVar) {
        zzfoq zzfoqVar = this.zza;
        zzhbs zzhbsVarZze = zzfoqVar.zze();
        return new zzfop(zzfoqVar, this.zzb, this.zzc, this.zzd, this.zze, zzhbi.zzh(this.zzf, cls, zzhaqVar, zzhbsVarZze));
    }

    public final zzfop zzh(long j10, TimeUnit timeUnit) {
        zzfoq zzfoqVar = this.zza;
        ScheduledExecutorService scheduledExecutorServiceZzf = zzfoqVar.zzf();
        return new zzfop(zzfoqVar, this.zzb, this.zzc, this.zzd, this.zze, zzhbi.zzi(this.zzf, j10, timeUnit, scheduledExecutorServiceZzf));
    }

    public final zzfof zzi() {
        Object obj = this.zzb;
        String strZzc = this.zzc;
        if (strZzc == null) {
            strZzc = this.zza.zzc(obj);
        }
        final zzfof zzfofVar = new zzfof(obj, strZzc, this.zzf);
        this.zza.zzg().zza(zzfofVar);
        nj.t1 t1Var = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfon
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzg().zzb(zzfofVar);
            }
        };
        zzhbs zzhbsVar = zzcff.zzh;
        t1Var.addListener(runnable, zzhbsVar);
        zzhbi.zzr(zzfofVar, new zzfok(this, zzfofVar), zzhbsVar);
        return zzfofVar;
    }

    public final zzfop zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }

    private zzfop(zzfoq zzfoqVar, Object obj, String str, nj.t1 t1Var, List list, nj.t1 t1Var2) {
        Objects.requireNonNull(zzfoqVar);
        this.zza = zzfoqVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = t1Var;
        this.zze = list;
        this.zzf = t1Var2;
    }
}
