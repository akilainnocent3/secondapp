package com.chartboost.sdk.impl;

import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface x6 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.x6$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0412a extends rr.d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f41518b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f41519c;

            public C0412a(or.f fVar) {
                super(fVar);
            }

            @Override // rr.a
            public final Object invokeSuspend(Object obj) {
                this.f41518b = obj;
                this.f41519c |= Integer.MIN_VALUE;
                Object objA = a.a(null, null, this);
                return objA == qr.d.l() ? objA : dr.i1.a(objA);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static Object a(x6 x6Var, URL url, or.f fVar) {
            C0412a c0412a;
            if (fVar instanceof C0412a) {
                c0412a = (C0412a) fVar;
                int i10 = c0412a.f41519c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0412a.f41519c = i10 - Integer.MIN_VALUE;
                } else {
                    c0412a = new C0412a(fVar);
                }
            } else {
                c0412a = new C0412a(fVar);
            }
            Object obj = c0412a.f41518b;
            Object objL = qr.d.l();
            int i11 = c0412a.f41519c;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dr.j1.n(obj);
                return ((dr.i1) obj).l();
            }
            dr.j1.n(obj);
            c0412a.f41519c = 1;
            Object objA = x6Var.a(url, -1L, c0412a);
            return objA == objL ? objL : objA;
        }
    }

    Object a(URL url, long j10, or.f fVar);

    Object a(URL url, or.f fVar);

    nv.i a(URL url);
}
