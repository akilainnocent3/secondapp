package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5192l5 implements InterfaceC5345r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5470w9 f97793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f97794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f97796d;

    public C5192l5(@oy.l InterfaceC5470w9 interfaceC5470w9, @oy.l List<? extends G8> list, @oy.l List<? extends G8> list2, @oy.l R4 r10) {
        this.f97793a = interfaceC5470w9;
        this.f97794b = list;
        this.f97795c = list2;
        Objects.toString(r10);
        this.f97796d = new AtomicBoolean(true);
    }

    public final boolean a() {
        List list = this.f97795c;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((G8) it.next()).b()) {
                    return false;
                }
            }
        }
        List list2 = this.f97794b;
        if (list2.isEmpty() || list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((G8) it2.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.f97796d.set(false);
    }

    public final void c() {
        this.f97796d.set(true);
    }

    public final void d() {
        if (this.f97796d.get()) {
            List list = this.f97795c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((G8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C5235mn) this.f97793a).c();
        }
    }

    public final void e() {
        if (this.f97796d.get() && a()) {
            ((C5235mn) this.f97793a).c();
        }
    }

    public final void f() {
        if (this.f97796d.get() && a()) {
            ((C5235mn) this.f97793a).b();
        }
    }
}
