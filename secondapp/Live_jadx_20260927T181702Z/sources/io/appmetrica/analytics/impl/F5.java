package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5261o f95810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f95811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f95812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E5 f95813d;

    public F5(C5261o c5261o) {
        this(c5261o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f95812c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f95810a.a(applicationContext);
            this.f95810a.registerListener(this.f95813d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f95812c = applicationContext;
        }
    }

    public F5(C5261o c5261o, IReporter iReporter) {
        this.f95810a = c5261o;
        this.f95811b = iReporter;
        this.f95813d = new E5(this);
    }

    public /* synthetic */ F5(C5261o c5261o, int i10) {
        this(c5261o, AbstractC5512y1.a());
    }

    public final synchronized Context a() {
        return this.f95812c;
    }
}
