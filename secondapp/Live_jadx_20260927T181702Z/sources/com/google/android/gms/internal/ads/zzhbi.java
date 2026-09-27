package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhbi extends zzhbk {
    public static nj.t1 zza(Object obj) {
        return obj == null ? zzhbm.zza : new zzhbm(obj);
    }

    public static nj.t1 zzb() {
        return zzhbm.zza;
    }

    public static nj.t1 zzc(Throwable th2) {
        th2.getClass();
        return new zzhbl(th2);
    }

    public static nj.t1 zzd(Callable callable, Executor executor) {
        zzhch zzhchVar = new zzhch(callable);
        executor.execute(zzhchVar);
        return zzhchVar;
    }

    public static nj.t1 zze(Runnable runnable, Executor executor) {
        zzhch zzhchVarZze = zzhch.zze(runnable, null);
        executor.execute(zzhchVarZze);
        return zzhchVarZze;
    }

    public static nj.t1 zzf(zzhap zzhapVar, Executor executor) {
        zzhch zzhchVar = new zzhch(zzhapVar);
        executor.execute(zzhchVar);
        return zzhchVar;
    }

    public static nj.t1 zzg(nj.t1 t1Var, Class cls, zzgsn zzgsnVar, Executor executor) {
        int i10 = zzhaa.zzd;
        zzgzz zzgzzVar = new zzgzz(t1Var, cls, zzgsnVar);
        t1Var.addListener(zzgzzVar, zzhbz.zzd(executor, zzgzzVar));
        return zzgzzVar;
    }

    public static nj.t1 zzh(nj.t1 t1Var, Class cls, zzhaq zzhaqVar, Executor executor) {
        int i10 = zzhaa.zzd;
        zzgzy zzgzyVar = new zzgzy(t1Var, cls, zzhaqVar);
        t1Var.addListener(zzgzyVar, zzhbz.zzd(executor, zzgzyVar));
        return zzgzyVar;
    }

    public static nj.t1 zzi(nj.t1 t1Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return t1Var.isDone() ? t1Var : zzhce.zze(t1Var, j10, timeUnit, scheduledExecutorService);
    }

    public static nj.t1 zzj(nj.t1 t1Var, zzhaq zzhaqVar, Executor executor) {
        int i10 = zzhah.zzc;
        zzhaf zzhafVar = new zzhaf(t1Var, zzhaqVar);
        t1Var.addListener(zzhafVar, zzhbz.zzd(executor, zzhafVar));
        return zzhafVar;
    }

    public static nj.t1 zzk(nj.t1 t1Var, zzgsn zzgsnVar, Executor executor) {
        int i10 = zzhah.zzc;
        zzhag zzhagVar = new zzhag(t1Var, zzgsnVar);
        t1Var.addListener(zzhagVar, zzhbz.zzd(executor, zzhagVar));
        return zzhagVar;
    }

    @SafeVarargs
    public static nj.t1 zzl(nj.t1... t1VarArr) {
        return new zzhar(zzgvz.zzr(t1VarArr), true);
    }

    public static nj.t1 zzm(Iterable iterable) {
        return new zzhar(zzgvz.zzp(iterable), true);
    }

    public static zzhbh zzn(Iterable iterable) {
        return new zzhbh(false, zzgvz.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzhbh zzo(nj.t1... t1VarArr) {
        return new zzhbh(true, zzgvz.zzr(t1VarArr), null);
    }

    public static zzhbh zzp(Iterable iterable) {
        return new zzhbh(true, zzgvz.zzp(iterable), null);
    }

    @SafeVarargs
    public static nj.t1 zzq(nj.t1... t1VarArr) {
        return new zzhar(zzgvz.zzr(t1VarArr), false);
    }

    public static void zzr(nj.t1 t1Var, zzhbf zzhbfVar, Executor executor) {
        zzhbfVar.getClass();
        t1Var.addListener(new zzhbg(t1Var, zzhbfVar), executor);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhcj.zza(future);
        }
        throw new IllegalStateException(zzgtn.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhcj.zza(future);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new zzhay((Error) e10.getCause());
            }
            throw new zzhci(e10.getCause());
        }
    }
}
