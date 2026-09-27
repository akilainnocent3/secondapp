package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nWaterfall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Waterfall.kt\ncom/unity3d/mediation/internal/ads/controllers/adunits/waterfall/Waterfall\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1855#2,2:179\n766#2:181\n857#2,2:182\n*S KotlinDebug\n*F\n+ 1 Waterfall.kt\ncom/unity3d/mediation/internal/ads/controllers/adunits/waterfall/Waterfall\n*L\n164#1:179,2\n174#1:181\n174#1:182,2\n*E\n"})
public final class tg implements F, Dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final W0 f64174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final AbstractC4566w0 f64175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final Bg f64176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private final Kg f64177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private final wg f64178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private G f64179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.m
    private Eg f64180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    private final List<A> f64181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    private A f64182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f64183j;

    public tg(@oy.l W0 adTools, @oy.l AbstractC4566w0 adUnitData, boolean z10, @oy.l Bg listener) {
        kotlin.jvm.internal.m0.p(adTools, "adTools");
        kotlin.jvm.internal.m0.p(adUnitData, "adUnitData");
        kotlin.jvm.internal.m0.p(listener, "listener");
        this.f64174a = adTools;
        this.f64175b = adUnitData;
        this.f64176c = listener;
        this.f64177d = Kg.a.f59379a.a(z10, this);
        this.f64178e = wg.f64409d.a(adTools, adUnitData);
        this.f64181h = new ArrayList();
    }

    private final List<A> f() {
        G.c cVarC;
        List<A> listD;
        G g10 = this.f64179f;
        return (g10 == null || (cVarC = g10.c()) == null || (listD = cVarC.d()) == null) ? fr.h0.J() : listD;
    }

    private final boolean i() {
        return this.f64182i != null;
    }

    private final void j() {
        G g10 = this.f64179f;
        G.b bVarD = g10 != null ? g10.d() : null;
        if (bVarD == null || bVarD.e()) {
            this.f64176c.a(509, "Mediation No fill");
            return;
        }
        if (!bVarD.f()) {
            Iterator<A> it = bVarD.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        } else {
            Eg eg2 = this.f64180g;
            if (eg2 != null) {
                eg2.a();
            }
        }
    }

    public final void c() {
        this.f64177d.a();
    }

    public final void d() {
        this.f64183j = true;
        A a10 = this.f64182i;
        if (a10 != null) {
            a10.b();
        }
    }

    @oy.m
    public final A e() {
        G.c cVarC;
        G g10 = this.f64179f;
        if (g10 == null || (cVarC = g10.c()) == null) {
            return null;
        }
        return cVarC.c();
    }

    @oy.l
    public final Ed g() {
        return this.f64177d.b();
    }

    public final boolean h() {
        Iterator<A> it = this.f64181h.iterator();
        while (it.hasNext()) {
            if (it.next().z()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements xg {
        public a() {
        }

        @Override // com.ironsource.xg
        public void a(@oy.l yg waterfallInstances) {
            kotlin.jvm.internal.m0.p(waterfallInstances, "waterfallInstances");
            if (tg.this.f64183j) {
                return;
            }
            tg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.xg
        public void a(int i10, @oy.l String errorReason) {
            kotlin.jvm.internal.m0.p(errorReason, "errorReason");
            if (tg.this.f64183j) {
                return;
            }
            tg.this.f64176c.a(i10, errorReason);
        }
    }

    @Override // com.ironsource.F
    public void b(@oy.l A instance) {
        kotlin.jvm.internal.m0.p(instance, "instance");
        if (this.f64183j || i()) {
            instance.c();
            return;
        }
        Eg eg2 = this.f64180g;
        if (eg2 != null) {
            eg2.a(instance);
        }
        this.f64181h.add(instance);
        if (this.f64181h.size() == 1) {
            Eg eg3 = this.f64180g;
            if (eg3 != null) {
                eg3.b(instance);
            }
            this.f64176c.b(instance);
            return;
        }
        G g10 = this.f64179f;
        if (g10 == null || !g10.a(instance)) {
            return;
        }
        this.f64176c.a(instance);
    }

    public final void c(@oy.l A instance) {
        kotlin.jvm.internal.m0.p(instance, "instance");
        Eg eg2 = this.f64180g;
        if (eg2 != null) {
            eg2.a(instance, this.f64175b.l(), this.f64175b.o());
        }
    }

    public final void a(@oy.l D adInstanceFactory) {
        kotlin.jvm.internal.m0.p(adInstanceFactory, "adInstanceFactory");
        this.f64178e.a(adInstanceFactory, new a());
    }

    public final void a(@oy.l J adInstancePresenter, boolean z10) {
        Eg eg2;
        kotlin.jvm.internal.m0.p(adInstancePresenter, "adInstancePresenter");
        A aC = this.f64177d.c();
        if (aC != null) {
            this.f64177d.a(aC);
            if (!z10 && (eg2 = this.f64180g) != null) {
                eg2.a(aC, f());
            }
            aC.a(adInstancePresenter);
        }
    }

    @Override // com.ironsource.F
    public void a(@oy.l IronSourceError error, @oy.l A instance) {
        kotlin.jvm.internal.m0.p(error, "error");
        kotlin.jvm.internal.m0.p(instance, "instance");
        if (this.f64183j) {
            return;
        }
        j();
    }

    @Override // com.ironsource.Dg
    public boolean b() {
        return !this.f64181h.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(yg ygVar) {
        G gA = G.f58982c.a(this.f64175b, ygVar);
        this.f64179f = gA;
        this.f64180g = Eg.f58922c.a(this.f64174a, this.f64175b, this.f64178e.a(), ygVar, gA);
        j();
    }

    @Override // com.ironsource.Dg
    public void a(@oy.l A instance) {
        kotlin.jvm.internal.m0.p(instance, "instance");
        this.f64182i = instance;
        this.f64181h.remove(instance);
    }

    @Override // com.ironsource.Dg
    public void a() {
        IronLog.INTERNAL.verbose(C4430o0.a(this.f64174a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        if (this.f64181h.isEmpty()) {
            return;
        }
        Iterator<T> it = this.f64181h.iterator();
        while (it.hasNext()) {
            ((A) it.next()).c();
        }
        this.f64181h.clear();
        this.f64174a.e().h().a();
    }

    @Override // com.ironsource.Dg
    @oy.m
    public A a(int i10) {
        List<A> listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((A) obj).w()) {
                arrayList.add(obj);
            }
        }
        return (A) fr.r0.b3(arrayList, i10);
    }
}
