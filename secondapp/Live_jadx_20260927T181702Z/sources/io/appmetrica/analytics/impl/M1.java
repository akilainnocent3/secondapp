package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class M1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static B1 f96129d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A1 f96131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BinderC5537z1 f96132c;

    public M1(@oy.l Context context, @oy.l A1 a10) {
        this.f96130a = context;
        this.f96131b = a10;
    }

    public final void b() {
        C5272oa.a(this.f96130a);
        PublicLogger.Companion.init(this.f96130a);
        Context context = this.f96130a;
        A1 a10 = this.f96131b;
        if (f96129d == null) {
            C1 c10 = new C1(context, a10, new C5011e5(context));
            C5052fk c5052fk = C5272oa.I.f98053v;
            F1 f10 = new F1(c10);
            LinkedHashMap linkedHashMap = c5052fk.f97387a;
            Object arrayList = linkedHashMap.get(1);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(1, arrayList);
            }
            ((List) arrayList).add(f10);
            f96129d = c10;
        }
        B1 b10 = f96129d;
        if (b10 != null) {
            this.f96132c = new BinderC5537z1(b10);
            C5272oa c5272oa = C5272oa.I;
            c5272oa.f98037f = new C5256nj(c5272oa.f98032a, new C5281oj(b10));
            ((C1) b10).onCreate();
        }
    }

    public final boolean c(@oy.l Intent intent) {
        B1 b10 = f96129d;
        if (b10 != null) {
            ((C1) b10).b(intent);
        }
        String action = intent.getAction();
        return (action == null || !cv.k0.J2(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, null)) && intent.getData() == null;
    }

    @k.h1
    public final void d() {
        f96129d = null;
    }

    public final void a(@oy.l Intent intent, int i10) {
        B1 b10 = f96129d;
        if (b10 != null) {
            ((C5411u0) ((C1) b10).f95655c).f98386a.stopSelf(i10);
        }
    }

    public final void c() {
        B1 b10 = f96129d;
        if (b10 != null) {
            ((C1) b10).onDestroy();
        }
    }

    public final int a(@oy.l Intent intent, int i10, int i11) {
        B1 b10 = f96129d;
        if (b10 == null) {
            return 2;
        }
        ((C5411u0) ((C1) b10).f95655c).f98386a.stopSelf(i11);
        return 2;
    }

    @oy.l
    public final IBinder a(@oy.l Intent intent) {
        B1 b10 = f96129d;
        if (b10 != null) {
            ((C1) b10).a(intent);
        }
        String action = intent.getAction();
        if (action != null && cv.k0.J2(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false, 2, null)) {
            return new Do();
        }
        BinderC5537z1 binderC5537z1 = this.f96132c;
        if (binderC5537z1 != null) {
            return binderC5537z1;
        }
        kotlin.jvm.internal.m0.S("coreBinder");
        return null;
    }

    public final void a(@oy.l Configuration configuration) {
        if (f96129d != null) {
            C5272oa.I.v().a(configuration);
        }
    }

    public final void b(@oy.l Intent intent) {
        B1 b10 = f96129d;
        if (b10 != null) {
            ((C1) b10).c(intent);
        }
    }
}
