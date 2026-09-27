package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f95427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.l f95428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f95430d;

    public f(e eVar, ds.l lVar, String str, SafePackageManager safePackageManager) {
        this.f95427a = eVar;
        this.f95428b = lVar;
        this.f95429c = str;
        this.f95430d = safePackageManager;
    }

    public final Object a(Context context) throws g {
        IBinder iBinder;
        if (this.f95430d.resolveService(context, this.f95427a.f95424a, 0) == null) {
            throw new l("could not resolve " + this.f95429c + " services");
        }
        try {
            e eVar = this.f95427a;
            if (context.bindService(eVar.f95424a, eVar, 1)) {
                e eVar2 = this.f95427a;
                if (eVar2.f95425b == null) {
                    synchronized (eVar2.f95426c) {
                        if (eVar2.f95425b == null) {
                            try {
                                eVar2.f95426c.wait(3000L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
                iBinder = eVar2.f95425b;
            } else {
                iBinder = null;
            }
        } catch (Throwable unused2) {
        }
        if (iBinder != null) {
            return this.f95428b.invoke(iBinder);
        }
        throw new g("could not bind to " + this.f95429c + " services");
    }

    public final void b(Context context) {
        try {
            this.f95427a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, ds.l lVar, String str) {
        this(new e(intent, str), lVar, str, new SafePackageManager());
    }
}
