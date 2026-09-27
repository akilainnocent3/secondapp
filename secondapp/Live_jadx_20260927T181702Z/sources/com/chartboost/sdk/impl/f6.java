package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f6 {
    public static final bh.a a(c8 fileCaching, xe.c databaseProvider, xj cachePolicy, z3.b evictorCallback, bh.d evictor) {
        kotlin.jvm.internal.m0.p(fileCaching, "fileCaching");
        kotlin.jvm.internal.m0.p(databaseProvider, "databaseProvider");
        kotlin.jvm.internal.m0.p(cachePolicy, "cachePolicy");
        kotlin.jvm.internal.m0.p(evictorCallback, "evictorCallback");
        kotlin.jvm.internal.m0.p(evictor, "evictor");
        return new bh.v(fileCaching.b(), evictor, databaseProvider);
    }

    public static final File b(Context context) {
        kotlin.jvm.internal.m0.p(context, "<this>");
        File precacheDir = new r8(context.getCacheDir()).f40759h;
        kotlin.jvm.internal.m0.o(precacheDir, "precacheDir");
        return precacheDir;
    }

    public static final File c(Context context) {
        kotlin.jvm.internal.m0.p(context, "<this>");
        File precacheQueueDir = new r8(context.getCacheDir()).f40760i;
        kotlin.jvm.internal.m0.o(precacheQueueDir, "precacheQueueDir");
        return precacheQueueDir;
    }

    public static /* synthetic */ bh.a a(c8 c8Var, xe.c cVar, xj xjVar, z3.b bVar, bh.d dVar, int i10, Object obj) {
        z3.b bVar2;
        if ((i10 & 16) != 0) {
            bVar2 = bVar;
            dVar = new z3(xjVar.b(), bVar2, null, 4, null);
        } else {
            bVar2 = bVar;
        }
        return a(c8Var, cVar, xjVar, bVar2, dVar);
    }

    public static final bh.c.d a(bh.a cache, ah.q0.c httpDataSourceFactory) {
        kotlin.jvm.internal.m0.p(cache, "cache");
        kotlin.jvm.internal.m0.p(httpDataSourceFactory, "httpDataSourceFactory");
        bh.c.d dVarL = new bh.c.d().i(cache).o(httpDataSourceFactory).l(null);
        kotlin.jvm.internal.m0.o(dVarL, "setCacheWriteDataSinkFactory(...)");
        return dVarL;
    }

    public static final xe.c a(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        return new xe.d(new f8(context, null, null, 0, 14, null));
    }

    public static final xf.q a(Context context, xe.c databaseProvider, bh.a cache, ah.q0.c httpDataSourceFactory, xf.q.d listener, int i10, int i11) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(databaseProvider, "databaseProvider");
        kotlin.jvm.internal.m0.p(cache, "cache");
        kotlin.jvm.internal.m0.p(httpDataSourceFactory, "httpDataSourceFactory");
        kotlin.jvm.internal.m0.p(listener, "listener");
        xf.q qVar = new xf.q(context, databaseProvider, cache, httpDataSourceFactory, Executors.newFixedThreadPool(i10));
        qVar.E(i11);
        qVar.e(listener);
        return qVar;
    }

    public static /* synthetic */ xf.q a(Context context, xe.c cVar, bh.a aVar, ah.q0.c cVar2, xf.q.d dVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i10 = 2;
        }
        int i13 = i10;
        if ((i12 & 64) != 0) {
            i11 = 1;
        }
        return a(context, cVar, aVar, cVar2, dVar, i13, i11);
    }

    public static /* synthetic */ re.v2 a(int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 500;
        }
        if ((i12 & 2) != 0) {
            i11 = 50000;
        }
        return a(i10, i11);
    }

    public static final yf.e a(Context context, int i10) {
        kotlin.jvm.internal.m0.p(context, "context");
        if (eh.o1.f81142a >= 21) {
            return new yf.a(context, i10);
        }
        return null;
    }

    public static /* synthetic */ yf.e a(Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return a(context, i10);
    }

    public static final zf.l0.a a(ah.v.a aVar) {
        kotlin.jvm.internal.m0.p(aVar, "<this>");
        return new zf.p(aVar);
    }

    public static final void a() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(cookieManager);
    }

    public static final re.v2 a(int i10, int i11) {
        re.m mVarA = new re.m.a().d(i10, i11, i10, i10).a();
        kotlin.jvm.internal.m0.o(mVarA, "build(...)");
        return mVarA;
    }
}
