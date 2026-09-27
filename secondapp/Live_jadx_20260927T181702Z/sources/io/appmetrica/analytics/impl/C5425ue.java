package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5425ue implements T8, InterfaceC5450ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f98412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f98413b;

    public C5425ue(@oy.l M6 m10) {
        this.f98412a = m10;
        this.f98413b = new AtomicLong(m10.b());
        m10.a(this);
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a(@oy.l List<Integer> list) {
        this.f98413b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void b(@oy.l List<Integer> list) {
        this.f98413b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a() {
        this.f98413b.set(this.f98412a.b());
    }

    public final long b() {
        return this.f98413b.get();
    }
}
