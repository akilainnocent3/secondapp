package com.appsflyer.internal;

import defpackage.hwr;
import defpackage.qlr;
import defpackage.ttr;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1jSDK {
    private static final ttr getMonetizationNetwork = hwr.b(AnonymousClass4.getMonetizationNetwork);

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1jSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getMonetizationNetwork", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends qlr implements Function0<ExecutorService> {
        public static final AnonymousClass4 getMonetizationNetwork = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    public static final ExecutorService AFAdRevenueData() {
        AFc1kSDK aFc1kSDK = new AFc1kSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1kSDK.allowCoreThreadTimeOut(true);
        return aFc1kSDK;
    }

    public static final ExecutorService getCurrencyIso4217Code() {
        Object value = getMonetizationNetwork.getValue();
        value.getClass();
        return (ExecutorService) value;
    }

    public static final ScheduledExecutorService getMediationNetwork() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static final ScheduledExecutorService getMonetizationNetwork() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        return scheduledExecutorServiceNewScheduledThreadPool;
    }
}
