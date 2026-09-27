package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5207lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5181kk f97847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A9 f97848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A9 f97849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile A9 f97850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile A9 f97851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile A9 f97852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile A9 f97853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ExecutorC5155jk f97854h;

    public C5207lk() {
        this(new C5181kk());
    }

    public final IHandlerExecutor a() {
        if (this.f97853g == null) {
            synchronized (this) {
                try {
                    if (this.f97853g == null) {
                        this.f97847a.getClass();
                        HandlerThreadC4992db handlerThreadC4992dbA = A9.a("IAA-SDE");
                        this.f97853g = new A9(handlerThreadC4992dbA, handlerThreadC4992dbA.getLooper(), new Handler(handlerThreadC4992dbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f97853g;
    }

    public final IHandlerExecutor b() {
        if (this.f97850d == null) {
            synchronized (this) {
                try {
                    if (this.f97850d == null) {
                        this.f97847a.getClass();
                        HandlerThreadC4992db handlerThreadC4992dbA = A9.a("IAA-SMH-1");
                        this.f97850d = new A9(handlerThreadC4992dbA, handlerThreadC4992dbA.getLooper(), new Handler(handlerThreadC4992dbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f97850d;
    }

    public final IHandlerExecutor c() {
        if (this.f97851e == null) {
            synchronized (this) {
                try {
                    if (this.f97851e == null) {
                        this.f97847a.getClass();
                        HandlerThreadC4992db handlerThreadC4992dbA = A9.a("IAA-SNTPE");
                        this.f97851e = new A9(handlerThreadC4992dbA, handlerThreadC4992dbA.getLooper(), new Handler(handlerThreadC4992dbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f97851e;
    }

    public final IHandlerExecutor d() {
        if (this.f97849c == null) {
            synchronized (this) {
                try {
                    if (this.f97849c == null) {
                        this.f97847a.getClass();
                        HandlerThreadC4992db handlerThreadC4992dbA = A9.a("IAA-STE");
                        this.f97849c = new A9(handlerThreadC4992dbA, handlerThreadC4992dbA.getLooper(), new Handler(handlerThreadC4992dbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f97849c;
    }

    public C5207lk(C5181kk c5181kk) {
        new HashMap();
        this.f97847a = c5181kk;
    }
}
