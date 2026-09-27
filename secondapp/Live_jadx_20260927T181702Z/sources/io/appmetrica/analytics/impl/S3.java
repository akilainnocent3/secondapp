package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R3 f96437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A9 f96438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A9 f96439c;

    public S3() {
        this(new R3());
    }

    public final IHandlerExecutor a() {
        if (this.f96438b == null) {
            synchronized (this) {
                try {
                    if (this.f96438b == null) {
                        this.f96437a.getClass();
                        HandlerThreadC4992db handlerThreadC4992dbA = A9.a("IAA-CDE");
                        this.f96438b = new A9(handlerThreadC4992dbA, handlerThreadC4992dbA.getLooper(), new Handler(handlerThreadC4992dbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f96438b;
    }

    public final ICommonExecutor b() {
        if (this.f96439c == null) {
            synchronized (this) {
                try {
                    if (this.f96439c == null) {
                        this.f96437a.getClass();
                        HandlerThreadC4992db handlerThreadC4992dbA = A9.a("IAA-CRS");
                        this.f96439c = new A9(handlerThreadC4992dbA, handlerThreadC4992dbA.getLooper(), new Handler(handlerThreadC4992dbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f96439c;
    }

    public S3(R3 r10) {
        this.f96437a = r10;
    }
}
