package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Tg implements InterfaceC5012e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4933b4 f96516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f96517c = C5272oa.k().w().d();

    public Tg(@oy.l Context context, @oy.l C4933b4 c4933b4) {
        this.f96515a = context;
        this.f96516b = c4933b4;
    }

    public final void a(@oy.l Q5 q10, @oy.m Bundle bundle) {
        if (q10.m()) {
            return;
        }
        this.f96517c.execute(new RunnableC5229mh(this.f96515a, q10, bundle, this.f96516b));
    }

    public final void a(@oy.l Q3 q10, @oy.l Q5 q11, @oy.l C5316q4 c5316q4) {
        this.f96516b.a(q10, c5316q4).a(q11, c5316q4);
        this.f96516b.a(q10.f96360b, q10.f96361c, q10.f96362d);
    }
}
