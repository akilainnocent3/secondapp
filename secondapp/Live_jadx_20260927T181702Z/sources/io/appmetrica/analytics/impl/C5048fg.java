package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5048fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5228mg f97373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Aa f97374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5502xg f97375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr.i0 f97376d = dr.k0.b(new C4971cg(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dr.i0 f97377e = dr.k0.b(new C4919ag(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dr.i0 f97378f = dr.k0.b(new C5022eg(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f97379g = new ArrayList();

    public C5048fg(C5228mg c5228mg, C5477wg c5477wg, Aa aa2, C5502xg c5502xg) {
        this.f97373a = c5228mg;
        this.f97374b = aa2;
        this.f97375c = c5502xg;
    }

    public static final Xf a(C5048fg c5048fg) {
        return (Xf) c5048fg.f97376d.getValue();
    }

    public static final void a(C5048fg c5048fg, C5278og c5278og, Xf xf2) {
        boolean zG;
        c5048fg.f97379g.add(c5278og);
        C5502xg c5502xg = c5048fg.f97375c;
        if (c5278og == null) {
            c5502xg.getClass();
        } else {
            SafePackageManager safePackageManager = c5502xg.f98582b;
            Context context = c5502xg.f98581a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = c5278og.f98077d.ordinal();
            if (iOrdinal == 1) {
                zG = kotlin.jvm.internal.m0.g(c5502xg.f98586f, installerPackageName);
            } else if (iOrdinal == 2) {
                zG = kotlin.jvm.internal.m0.g(c5502xg.f98587g, installerPackageName);
            }
            if (zG) {
                c5048fg.a(c5278og);
                return;
            }
        }
        xf2.a();
    }

    public final void a(C5278og c5278og) {
        C5228mg c5228mg = this.f97373a;
        synchronized (c5228mg) {
            c5228mg.f97908b = c5278og;
            c5228mg.f97909c = true;
            c5228mg.f97910d.a(c5278og);
            c5228mg.f97910d.d();
            c5228mg.a(c5228mg.f97908b);
        }
    }
}
