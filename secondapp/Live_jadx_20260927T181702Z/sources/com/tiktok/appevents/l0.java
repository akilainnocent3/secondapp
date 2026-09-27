package com.tiktok.appevents;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class l0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76103a = f0.class.getCanonicalName();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Thread.UncaughtExceptionHandler {
        public a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable throwable) {
            c0.b(l0.f76103a, throwable, 3);
            if (dp.c.q() != null) {
                dp.c.q().a(thread, throwable);
            }
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r10) {
        Thread thread = new Thread(r10);
        thread.setUncaughtExceptionHandler(new a());
        return thread;
    }
}
