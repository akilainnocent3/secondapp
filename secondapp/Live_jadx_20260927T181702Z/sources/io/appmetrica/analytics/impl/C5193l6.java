package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5193l6 implements Ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f97797a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(@oy.m Throwable th2, @oy.l V v10) {
        Iterator it = this.f97797a.iterator();
        while (it.hasNext()) {
            ((Ga) it.next()).a(th2, v10);
        }
    }

    public final void a(@oy.l Ga... gaArr) {
        fr.m0.u0(this.f97797a, gaArr);
    }

    public final void a(@oy.l List<? extends Ga> list) {
        this.f97797a.addAll(list);
    }

    public final void a() {
        this.f97797a.clear();
    }
}
