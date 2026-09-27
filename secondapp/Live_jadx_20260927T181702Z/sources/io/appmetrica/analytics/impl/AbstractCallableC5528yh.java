package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractCallableC5528yh implements Callable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final C5503xh f98679d = new C5503xh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5287p0 f98680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4924al f98681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98682c;

    public AbstractCallableC5528yh(C5287p0 c5287p0, InterfaceC4924al interfaceC4924al) {
        this.f98680a = c5287p0;
        this.f98681b = interfaceC4924al;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(@oy.m Throwable th2) {
    }

    @oy.l
    public final C5287p0 b() {
        return this.f98680a;
    }

    public boolean c() {
        C5287p0 c5287p0 = this.f98680a;
        synchronized (c5287p0) {
            try {
                if (c5287p0.f98094d == null) {
                    c5287p0.f98095e = new CountDownLatch(1);
                    Intent intentA = c5287p0.f98098h.a(c5287p0.f98091a);
                    try {
                        c5287p0.f98097g.b(c5287p0.f98091a);
                        c5287p0.f98091a.bindService(intentA, c5287p0.f98100j, 1);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f98680a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return dr.w2.f79517a;
    }

    public final boolean d() {
        return this.f98682c;
    }

    public final void a(boolean z10) {
        this.f98682c = z10;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f98682c) {
                return;
            }
            this.f98682c = true;
            int i10 = 0;
            do {
                C5287p0 c5287p0 = this.f98680a;
                synchronized (c5287p0) {
                    iAppMetricaService = c5287p0.f98094d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC4924al interfaceC4924al = this.f98681b;
                        if (interfaceC4924al != null && !((C5153ji) interfaceC4924al).a()) {
                            return;
                        }
                        this.f98680a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i10++;
                if (!c() || P1.f96306e.get()) {
                    return;
                }
            } while (i10 < 3);
        } catch (Throwable th2) {
            a(th2);
        }
    }
}
