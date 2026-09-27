package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC5388t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f98339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f98340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5413u2 f98341c;

    public RunnableC5388t2(C5413u2 c5413u2, Context context, Intent intent) {
        this.f98341c = c5413u2;
        this.f98339a = context;
        this.f98340b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f98341c.f98395a.consume(this.f98339a, this.f98340b);
    }
}
