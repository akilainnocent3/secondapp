package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class FutureResult<T> implements Future<T> {

    @l
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FutureResult.class.getSimpleName();

    @m
    private final Future<T> future;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        public final String getTAG() {
            return FutureResult.TAG;
        }

        private Companion() {
        }
    }

    public FutureResult(@m Future<T> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Future<T> future = this.future;
        if (future != null) {
            return future.cancel(z10);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    @m
    public T get() {
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            m0.o(TAG2, "TAG");
            companion.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e10) {
            Logger.Companion companion2 = Logger.Companion;
            String TAG3 = TAG;
            m0.o(TAG3, "TAG");
            companion2.e(TAG3, "error on execution", e10);
            return null;
        }
    }

    @m
    public final Future<T> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    @m
    public T get(long j10, @l TimeUnit unit) {
        m0.p(unit, "unit");
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get(j10, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            m0.o(TAG2, "TAG");
            companion.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e10) {
            Logger.Companion companion2 = Logger.Companion;
            String TAG3 = TAG;
            m0.o(TAG3, "TAG");
            companion2.e(TAG3, "error on execution", e10);
            return null;
        } catch (TimeoutException e11) {
            Logger.Companion companion3 = Logger.Companion;
            String TAG4 = TAG;
            m0.o(TAG4, "TAG");
            companion3.e(TAG4, "error on timeout", e11);
            m0.o(TAG4, "TAG");
            companion3.w(TAG4, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
