package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4945bg implements Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5048fg f97019a;

    public C4945bg(C5048fg c5048fg) {
        this.f97019a = c5048fg;
    }

    @Override // io.appmetrica.analytics.impl.Xf
    @k.i1
    public final void a() {
        C5048fg c5048fg = this.f97019a;
        ArrayList arrayList = c5048fg.f97379g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C5278og c5278og = (C5278og) obj;
            c5048fg.f97375c.getClass();
            String str = c5278og != null ? c5278og.f98074a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(obj);
            }
        }
        c5048fg.a(c5048fg.f97375c.a(fr.r0.x2(arrayList2)));
    }
}
