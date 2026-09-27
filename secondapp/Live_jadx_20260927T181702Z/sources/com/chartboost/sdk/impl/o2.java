package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f40259a = new o2();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f40261b;

        public a(String prefix) {
            kotlin.jvm.internal.m0.p(prefix, "prefix");
            this.f40260a = prefix;
            this.f40261b = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            kotlin.jvm.internal.m0.p(r10, "r");
            return new Thread(r10, this.f40260a + this.f40261b.getAndIncrement());
        }
    }

    public static final ScheduledExecutorService a(int i10, String threadPrefix) {
        kotlin.jvm.internal.m0.p(threadPrefix, "threadPrefix");
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i10, new a(threadPrefix));
        scheduledThreadPoolExecutor.prestartAllCoreThreads();
        return scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ ScheduledExecutorService a(int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        if ((i11 & 2) != 0) {
            str = "CBAsync-";
        }
        return a(i10, str);
    }

    public static final ExecutorService a(int i10, long j10, TimeUnit timeUnit) {
        kotlin.jvm.internal.m0.p(timeUnit, "timeUnit");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, j10, timeUnit, new PriorityBlockingQueue());
        threadPoolExecutor.prestartAllCoreThreads();
        return threadPoolExecutor;
    }

    public static /* synthetic */ ExecutorService a(int i10, long j10, TimeUnit timeUnit, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = 10;
        }
        if ((i11 & 4) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        return a(i10, j10, timeUnit);
    }
}
