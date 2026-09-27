package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5090h6 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f97488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vg f97489b;

    public C5090h6(@oy.l Context context, @oy.l InterfaceC5012e6 interfaceC5012e6, @oy.l EnumC4966cb enumC4966cb, @oy.l InterfaceC4950bl interfaceC4950bl, @oy.l Executor executor, @oy.l String str) {
        this.f97488a = executor;
        this.f97489b = new Vg(context, interfaceC5012e6, enumC4966cb, interfaceC4950bl);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@oy.m File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f97488a;
        Vg vg2 = this.f97489b;
        C5273ob c5273ob = vg2.f96621c;
        Consumer consumer = vg2.f96623e;
        Context context = vg2.f96619a;
        if (C4913aa.f96935c == null) {
            synchronized (kotlin.jvm.internal.m1.d(C4913aa.class)) {
                try {
                    if (C4913aa.f96935c == null) {
                        C4913aa.f96935c = new C4913aa(context);
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C4913aa c4913aa = C4913aa.f96935c;
        if (c4913aa == null) {
            kotlin.jvm.internal.m0.S("INSTANCE");
            c4913aa = null;
        }
        executor.execute(new Uf(file, c5273ob, c5273ob, consumer, c4913aa, vg2.f96620b));
    }
}
