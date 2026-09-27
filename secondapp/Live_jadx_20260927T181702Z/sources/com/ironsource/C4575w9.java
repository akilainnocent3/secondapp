package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4575w9 implements InterfaceC4291g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private O9 f64377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private InterfaceC4195b0 f64378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private X1 f64379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private InterfaceC4466q1 f64380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private InterfaceC4386lc f64381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    private Tf f64382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    private P8 f64383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    private P8.a f64384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    private final Map<String, C4575w9> f64385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    private InterstitialAdInfo f64386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.m
    private InterfaceC4592x9 f64387k;

    public C4575w9(@oy.l O9 adInstance, @oy.l InterfaceC4195b0 adNetworkShow, @oy.l X1 auctionDataReporter, @oy.l InterfaceC4466q1 analytics, @oy.l InterfaceC4386lc networkDestroyAPI, @oy.l Tf threadManager, @oy.l P8 sessionDepthService, @oy.l P8.a sessionDepthServiceEditor, @oy.l Map<String, C4575w9> retainer) {
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        kotlin.jvm.internal.m0.p(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.m0.p(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.m0.p(analytics, "analytics");
        kotlin.jvm.internal.m0.p(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.m0.p(threadManager, "threadManager");
        kotlin.jvm.internal.m0.p(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.m0.p(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.m0.p(retainer, "retainer");
        this.f64377a = adInstance;
        this.f64378b = adNetworkShow;
        this.f64379c = auctionDataReporter;
        this.f64380d = analytics;
        this.f64381e = networkDestroyAPI;
        this.f64382f = threadManager;
        this.f64383g = sessionDepthService;
        this.f64384h = sessionDepthServiceEditor;
        this.f64385i = retainer;
        String strF = adInstance.f();
        kotlin.jvm.internal.m0.o(strF, "adInstance.instanceId");
        String strE = this.f64377a.e();
        kotlin.jvm.internal.m0.o(strE, "adInstance.id");
        this.f64386j = new InterstitialAdInfo(strF, strE);
        C4255e6 c4255e6 = new C4255e6();
        this.f64377a.a(c4255e6);
        c4255e6.a(this);
    }

    public final void a(@oy.l InterstitialAdInfo interstitialAdInfo) {
        kotlin.jvm.internal.m0.p(interstitialAdInfo, "<set-?>");
        this.f64386j = interstitialAdInfo;
    }

    @oy.l
    public final InterstitialAdInfo b() {
        return this.f64386j;
    }

    @oy.m
    public final InterfaceC4592x9 c() {
        return this.f64387k;
    }

    public final boolean d() {
        boolean zA = this.f64378b.a(this.f64377a);
        InterfaceC4339j1.a.f62047a.a(zA).a(this.f64380d);
        return zA;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC4291g6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC4339j1.a.f62047a.f(new InterfaceC4413n1[0]).a(this.f64380d);
    }

    @Override // com.ironsource.InterfaceC4291g6
    public void onAdInstanceDidClick() {
        InterfaceC4339j1.a.f62047a.a().a(this.f64380d);
        this.f64382f.a(new Runnable() { // from class: com.ironsource.wm
            @Override // java.lang.Runnable
            public final void run() {
                C4575w9.b(this.f64419b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4291g6
    public void onAdInstanceDidDismiss() {
        this.f64385i.remove(this.f64386j.getAdId());
        InterfaceC4339j1.a.f62047a.a(new InterfaceC4413n1[0]).a(this.f64380d);
        this.f64382f.a(new Runnable() { // from class: com.ironsource.vm
            @Override // java.lang.Runnable
            public final void run() {
                C4575w9.c(this.f64351b);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4291g6
    public void onAdInstanceDidShow() {
        P8 p10 = this.f64383g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC4339j1.a.f62047a.b(new C4393m1.w(p10.a(aVar))).a(this.f64380d);
        this.f64384h.b(aVar);
        this.f64379c.b("onAdInstanceDidShow");
        this.f64382f.a(new Runnable() { // from class: com.ironsource.xm
            @Override // java.lang.Runnable
            public final void run() {
                C4575w9.d(this.f64466b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4575w9 this$0) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        InterfaceC4592x9 interfaceC4592x9 = this$0.f64387k;
        if (interfaceC4592x9 != null) {
            interfaceC4592x9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4575w9 this$0) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        InterfaceC4592x9 interfaceC4592x9 = this$0.f64387k;
        if (interfaceC4592x9 != null) {
            interfaceC4592x9.onAdInstanceDidDismiss();
        }
    }

    public final void a(@oy.m InterfaceC4592x9 interfaceC4592x9) {
        this.f64387k = interfaceC4592x9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4575w9 this$0) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        InterfaceC4592x9 interfaceC4592x9 = this$0.f64387k;
        if (interfaceC4592x9 != null) {
            interfaceC4592x9.onAdInstanceDidShow();
        }
    }

    public final void a(@oy.l Activity activity) {
        kotlin.jvm.internal.m0.p(activity, "activity");
        this.f64385i.put(this.f64386j.getAdId(), this);
        if (!this.f64378b.a(this.f64377a)) {
            a(C4622z5.f64557a.t());
        } else {
            InterfaceC4339j1.a.f62047a.d(new InterfaceC4413n1[0]).a(this.f64380d);
            this.f64378b.a(activity, this.f64377a);
        }
    }

    @Override // com.ironsource.InterfaceC4291g6
    public void a(@oy.m String str) {
        a(C4622z5.f64557a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f64385i.remove(this.f64386j.getAdId());
        InterfaceC4339j1.a.f62047a.a(new C4393m1.j(ironSourceError.getErrorCode()), new C4393m1.k(ironSourceError.getErrorMessage())).a(this.f64380d);
        this.f64382f.a(new Runnable() { // from class: com.ironsource.ym
            @Override // java.lang.Runnable
            public final void run() {
                C4575w9.a(this.f64539b, ironSourceError);
            }
        });
    }

    public /* synthetic */ C4575w9(O9 o10, InterfaceC4195b0 interfaceC4195b0, X1 x10, InterfaceC4466q1 interfaceC4466q1, InterfaceC4386lc interfaceC4386lc, Tf tf2, P8 p10, P8.a aVar, Map map, int i10, kotlin.jvm.internal.x xVar) {
        this(o10, interfaceC4195b0, x10, interfaceC4466q1, (i10 & 16) != 0 ? new C4404mc() : interfaceC4386lc, (i10 & 32) != 0 ? V7.f60236a : tf2, (i10 & 64) != 0 ? Lb.f59407s.d().s() : p10, (i10 & 128) != 0 ? Lb.f59407s.a().h() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4575w9 this$0, IronSourceError error) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        kotlin.jvm.internal.m0.p(error, "$error");
        InterfaceC4592x9 interfaceC4592x9 = this$0.f64387k;
        if (interfaceC4592x9 != null) {
            interfaceC4592x9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        vj.a(this.f64382f, new Runnable() { // from class: com.ironsource.um
            @Override // java.lang.Runnable
            public final void run() {
                C4575w9.a(this.f64292b);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4575w9 this$0) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        InterfaceC4339j1.d.f62070a.b().a(this$0.f64380d);
        this$0.f64381e.a(this$0.f64377a);
    }

    @Override // com.ironsource.InterfaceC4291g6
    public void onAdInstanceDidReward(@oy.m String str, int i10) {
    }
}
