package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Tb implements Qb, ToggleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f96507a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f96508b = C5272oa.k().w().b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ln f96509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f96510d;

    public final void a(@oy.m Toggle toggle) {
        Ln ln2 = new Ln(toggle);
        this.f96509c = ln2;
        ln2.f96123c.registerObserver(this, true);
    }

    public final void b(@oy.l Object obj) {
        Ln ln2 = this.f96509c;
        if (ln2 == null) {
            kotlin.jvm.internal.m0.S("togglesHolder");
            ln2 = null;
        }
        ln2.f96122b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z10) {
        this.f96508b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.qp
            @Override // java.lang.Runnable
            public final void run() {
                Tb.a(this.f98210b, z10);
            }
        });
    }

    public final void a(@oy.l final LocationControllerObserver locationControllerObserver, final boolean z10) {
        this.f96508b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.rp
            @Override // java.lang.Runnable
            public final void run() {
                Tb.a(this.f98249b, locationControllerObserver, z10);
            }
        });
    }

    public static final void a(Tb tb2, LocationControllerObserver locationControllerObserver, boolean z10) {
        tb2.f96507a.add(locationControllerObserver);
        if (z10) {
            if (tb2.f96510d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Tb tb2, boolean z10) {
        if (tb2.f96510d != z10) {
            tb2.f96510d = z10;
            ds.l lVar = z10 ? Rb.f96409a : Sb.f96452a;
            Iterator it = tb2.f96507a.iterator();
            while (it.hasNext()) {
                lVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(@oy.l Object obj) {
        Ln ln2 = this.f96509c;
        if (ln2 == null) {
            kotlin.jvm.internal.m0.S("togglesHolder");
            ln2 = null;
        }
        ln2.f96122b.a(obj);
    }

    public final void a(boolean z10) {
        Ln ln2 = this.f96509c;
        if (ln2 == null) {
            kotlin.jvm.internal.m0.S("togglesHolder");
            ln2 = null;
        }
        ln2.f96121a.a(z10);
    }
}
