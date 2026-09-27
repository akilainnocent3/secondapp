package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2 f95853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5086h2 f95854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f95855c;

    public Gb(P2 p10, C5086h2 c5086h2) {
        ArrayList arrayList = new ArrayList();
        this.f95855c = arrayList;
        this.f95853a = p10;
        arrayList.add(p10);
        this.f95854b = c5086h2;
        arrayList.add(c5086h2);
    }

    public final synchronized void a() {
        Iterator it = this.f95855c.iterator();
        while (it.hasNext()) {
            ((InterfaceC5232mk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C5247na c5247na) {
        this.f95855c.add(c5247na);
    }
}
