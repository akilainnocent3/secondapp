package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4339j1 {

    /* JADX INFO: renamed from: com.ironsource.j1$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final C0580a f62047a = new C0580a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0580a {
            public /* synthetic */ C0580a(kotlin.jvm.internal.x xVar) {
                this();
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l C4393m1.j errorCode, @oy.l C4393m1.k errorReason) {
                kotlin.jvm.internal.m0.p(errorCode, "errorCode");
                kotlin.jvm.internal.m0.p(errorReason, "errorReason");
                return new b(403, fr.h0.U(errorCode, errorReason));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 b(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(404, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 c(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(409, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 d(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(401, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 e(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(408, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 f(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(405, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }

            private C0580a() {
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a() {
                return new b(406, new ArrayList());
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(407, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(boolean z10) {
                if (z10) {
                    return new b(410, new ArrayList());
                }
                return new b(411, new ArrayList());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.j1$a$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final b f62048a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f62049b = 401;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f62050c = 403;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f62051d = 404;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f62052e = 405;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f62053f = 406;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f62054g = 407;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f62055h = 408;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f62056i = 409;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f62057j = 410;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f62058k = 411;

            private b() {
            }
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a() {
            return f62047a.a();
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 b(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62047a.b(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 c(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62047a.c(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 d(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62047a.d(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 e(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62047a.e(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 f(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62047a.f(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62047a.a(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(boolean z10) {
            return f62047a.a(z10);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l C4393m1.j jVar, @oy.l C4393m1.k kVar) {
            return f62047a.a(jVar, kVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements InterfaceC4339j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        private final List<InterfaceC4413n1> f62060b;

        public b(int i10, @oy.l List<InterfaceC4413n1> arrayList) {
            kotlin.jvm.internal.m0.p(arrayList, "arrayList");
            this.f62059a = i10;
            this.f62060b = arrayList;
        }

        @Override // com.ironsource.InterfaceC4339j1
        public void a(@oy.l InterfaceC4466q1 analytics) {
            kotlin.jvm.internal.m0.p(analytics, "analytics");
            analytics.a(this.f62059a, this.f62060b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f62061a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$c$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a() {
                return new b(201, new ArrayList());
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 b() {
                return new b(206, new ArrayList());
            }

            private a() {
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l C4393m1.l ext1) {
                kotlin.jvm.internal.m0.p(ext1, "ext1");
                return new b(207, fr.h0.U(ext1));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l InterfaceC4413n1 duration) {
                kotlin.jvm.internal.m0.p(duration, "duration");
                return new b(202, fr.h0.U(duration));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l C4393m1.j errorCode, @oy.l C4393m1.k errorReason, @oy.l C4393m1.f duration) {
                kotlin.jvm.internal.m0.p(errorCode, "errorCode");
                kotlin.jvm.internal.m0.p(errorReason, "errorReason");
                kotlin.jvm.internal.m0.p(duration, "duration");
                return new b(203, fr.h0.U(errorCode, errorReason, duration));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(204, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.j1$c$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final b f62062a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f62063b = 201;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f62064c = 202;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f62065d = 203;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f62066e = 204;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f62067f = 205;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f62068g = 206;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f62069h = 207;

            private b() {
            }
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62061a.a(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 b() {
            return f62061a.b();
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a() {
            return f62061a.a();
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l C4393m1.j jVar, @oy.l C4393m1.k kVar, @oy.l C4393m1.f fVar) {
            return f62061a.a(jVar, kVar, fVar);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l InterfaceC4413n1 interfaceC4413n1) {
            return f62061a.a(interfaceC4413n1);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l C4393m1.l lVar) {
            return f62061a.a(lVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j1$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f62070a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.j1$d$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a() {
                return new b(101, new ArrayList());
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 b(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(110, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }

            @oy.l
            @cs.o
            public final b c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l InterfaceC4413n1... entity) {
                kotlin.jvm.internal.m0.p(entity, "entity");
                return new b(102, fr.h0.U(Arrays.copyOf(entity, entity.length)));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 b() {
                return new b(112, new ArrayList());
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l C4393m1.f duration) {
                kotlin.jvm.internal.m0.p(duration, "duration");
                return new b(103, fr.h0.U(duration));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l C4393m1.j errorCode, @oy.l C4393m1.k errorReason, @oy.l C4393m1.f duration, @oy.l C4393m1.l loaderState) {
                kotlin.jvm.internal.m0.p(errorCode, "errorCode");
                kotlin.jvm.internal.m0.p(errorReason, "errorReason");
                kotlin.jvm.internal.m0.p(duration, "duration");
                kotlin.jvm.internal.m0.p(loaderState, "loaderState");
                return new b(104, fr.h0.U(errorCode, errorReason, duration, loaderState));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l C4393m1.j errorCode, @oy.l C4393m1.k errorReason) {
                kotlin.jvm.internal.m0.p(errorCode, "errorCode");
                kotlin.jvm.internal.m0.p(errorReason, "errorReason");
                return new b(109, fr.h0.U(errorCode, errorReason));
            }

            @oy.l
            @cs.o
            public final InterfaceC4339j1 a(@oy.l InterfaceC4413n1 ext1) {
                kotlin.jvm.internal.m0.p(ext1, "ext1");
                return new b(111, fr.h0.U(ext1));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.j1$d$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final b f62071a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f62072b = 101;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f62073c = 102;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f62074d = 103;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f62075e = 104;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f62076f = 105;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f62077g = 109;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f62078h = 110;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f62079i = 111;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f62080j = 112;

            private b() {
            }
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a() {
            return f62070a.a();
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 b() {
            return f62070a.b();
        }

        @oy.l
        @cs.o
        public static final b c() {
            return f62070a.c();
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62070a.a(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 b(@oy.l InterfaceC4413n1... interfaceC4413n1Arr) {
            return f62070a.b(interfaceC4413n1Arr);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l C4393m1.j jVar, @oy.l C4393m1.k kVar) {
            return f62070a.a(jVar, kVar);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l C4393m1.j jVar, @oy.l C4393m1.k kVar, @oy.l C4393m1.f fVar, @oy.l C4393m1.l lVar) {
            return f62070a.a(jVar, kVar, fVar, lVar);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l InterfaceC4413n1 interfaceC4413n1) {
            return f62070a.a(interfaceC4413n1);
        }

        @oy.l
        @cs.o
        public static final InterfaceC4339j1 a(@oy.l C4393m1.f fVar) {
            return f62070a.a(fVar);
        }
    }

    void a(@oy.l InterfaceC4466q1 interfaceC4466q1);
}
