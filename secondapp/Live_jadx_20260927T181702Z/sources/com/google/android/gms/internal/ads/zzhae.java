package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhae extends AbstractExecutorService implements zzhbs, AutoCloseable {
    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        v1.h.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhch.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhbs
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (nj.t1) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final nj.t1 zza(Runnable runnable) {
        return (nj.t1) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final nj.t1 zzb(Runnable runnable, Object obj) {
        return (nj.t1) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final nj.t1 zzc(Callable callable) {
        return (nj.t1) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzhch(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhbs
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (nj.t1) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhbs
    public final /* synthetic */ Future submit(Callable callable) {
        return (nj.t1) super.submit(callable);
    }
}
