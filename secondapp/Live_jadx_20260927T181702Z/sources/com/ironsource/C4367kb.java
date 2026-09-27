package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;

/* JADX INFO: renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4367kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4403mb f62222a;

    /* JADX INFO: renamed from: com.ironsource.kb$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private C4367kb f62223a = new C4367kb(null);

        @oy.l
        public final a a(@oy.l String adUnitId) {
            kotlin.jvm.internal.m0.p(adUnitId, "adUnitId");
            this.f62223a.a(adUnitId);
            return this;
        }

        @oy.l
        public final a b(@oy.l String placementName) {
            kotlin.jvm.internal.m0.p(placementName, "placementName");
            this.f62223a.b(placementName);
            return this;
        }

        @oy.l
        public final a a(@oy.l InterfaceC4441ob listener) {
            kotlin.jvm.internal.m0.p(listener, "listener");
            this.f62223a.a(listener);
            return this;
        }

        @oy.l
        public final C4367kb a() {
            return this.f62223a;
        }
    }

    public /* synthetic */ C4367kb(kotlin.jvm.internal.x xVar) {
        this();
    }

    @oy.m
    public final String c() {
        return this.f62222a.i();
    }

    @oy.m
    public final String d() {
        return this.f62222a.j();
    }

    @oy.m
    public final InterfaceC4385lb.a e() {
        return this.f62222a.k();
    }

    @oy.m
    public final AdapterNativeAdViewBinder f() {
        return this.f62222a.l();
    }

    @oy.m
    public final String g() {
        return this.f62222a.m();
    }

    public final void h() {
        this.f62222a.n();
    }

    private C4367kb() {
        this.f62222a = new C4403mb(C4624z7.f64565a.a(), this);
    }

    public final void a() {
        this.f62222a.f();
    }

    @oy.m
    public final String b() {
        return this.f62222a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f62222a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.f62222a.b(str);
    }

    public final void a(@oy.m InterfaceC4441ob interfaceC4441ob) {
        this.f62222a.a(interfaceC4441ob);
    }
}
