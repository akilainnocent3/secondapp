package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class C5235mn implements InterfaceC5232mk, InterfaceC5470w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fa f97919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ll f97920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f97921c = new AtomicBoolean(false);

    public C5235mn(@oy.l Fa fa2, @oy.l Ll ll2) {
        this.f97919a = fa2;
        this.f97920b = ll2;
        Objects.toString(fa2.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f97921c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f97921c.get()) {
            return;
        }
        f();
        a();
    }

    @oy.l
    public final Fa d() {
        return this.f97919a;
    }

    public final boolean e() {
        return this.f97921c.get();
    }

    public void f() {
        this.f97920b.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5232mk
    public final void onCreate() {
        this.f97921c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5232mk
    public final void onDestroy() {
        if (this.f97921c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(@oy.l NetworkTask networkTask) {
        C5272oa.I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }

    public void g() {
    }
}
