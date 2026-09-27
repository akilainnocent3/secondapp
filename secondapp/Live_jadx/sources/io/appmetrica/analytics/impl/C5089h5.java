package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5089h5 implements Co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f97487a;

    public C5089h5(@oy.l List<? extends dr.z0<String, ? extends Co>> list) {
        this.f97487a = list;
    }

    @Override // io.appmetrica.analytics.impl.Co
    @oy.m
    public final String a() {
        Iterator it = this.f97487a.iterator();
        while (it.hasNext()) {
            String strA = ((Co) ((dr.z0) it.next()).k()).a();
            if (strA != null && strA.length() > 0) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@oy.l String str) {
        Iterator it = this.f97487a.iterator();
        while (it.hasNext()) {
            ((Co) ((dr.z0) it.next()).k()).a(str);
        }
    }
}
