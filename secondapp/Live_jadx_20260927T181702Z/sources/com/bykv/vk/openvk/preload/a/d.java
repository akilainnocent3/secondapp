package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicLong f31650d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f31651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IN f31652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    OUT f31653c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f31654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f31655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f31656g;

    public abstract Object a(b<OUT> bVar, IN in2) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.f31656g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f31654e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f31655f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f31654e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f31655f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f31654e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f31655f, this);
    }

    public final OUT f() {
        return this.f31653c;
    }

    public final void a(b bVar, d dVar, IN in2, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f31655f = new m(bVar);
        this.f31651a = dVar;
        this.f31652b = in2;
        this.f31654e = aVar;
        if (dVar != null) {
            this.f31656g = dVar.f31656g;
        } else {
            long andIncrement = f31650d.getAndIncrement();
            this.f31656g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f31654e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f31655f, this, th2);
    }

    public final void c(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f31654e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f31655f, this, th2);
    }

    public final void d(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f31654e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f31655f, this, th2);
    }
}
