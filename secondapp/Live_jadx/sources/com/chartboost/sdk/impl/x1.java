package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class x1 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue f41411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f41416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f41417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f41418i;

    public x1(ue ueVar, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference atomicReference, AtomicInteger atomicInteger2, String str4) {
        this.f41411b = ueVar;
        this.f41412c = str;
        this.f41413d = str2;
        this.f41414e = str3;
        this.f41416g = atomicInteger;
        this.f41417h = atomicReference;
        this.f41418i = atomicInteger2;
        this.f41415f = str4;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1 x1Var) {
        return this.f41411b.b() - x1Var.f41411b.b();
    }

    public void a(Executor executor, boolean z10) {
        t1 t1Var;
        if ((this.f41416g.decrementAndGet() == 0 || !z10) && (t1Var = (t1) this.f41417h.getAndSet(null)) != null) {
            executor.execute(new u1(t1Var, z10, this.f41418i.get()));
        }
    }
}
