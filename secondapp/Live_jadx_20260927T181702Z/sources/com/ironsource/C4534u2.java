package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4534u2 extends C4518t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4534u2 f64220d = new C4534u2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ga f64221b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Ga f64222c = null;

    /* JADX INFO: renamed from: com.ironsource.u2$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64223a;

        public a(AdInfo adInfo) {
            this.f64223a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64221b;
            if (ga2 != null) {
                ga2.g(c4534u2.a(this.f64223a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4534u2.this.a(this.f64223a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64225a;

        public b(AdInfo adInfo) {
            this.f64225a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64222c;
            if (ga2 != null) {
                ga2.d(c4534u2.a(this.f64225a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4534u2.this.a(this.f64225a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64227a;

        public c(AdInfo adInfo) {
            this.f64227a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64221b;
            if (ga2 != null) {
                ga2.d(c4534u2.a(this.f64227a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4534u2.this.a(this.f64227a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64229a;

        public d(AdInfo adInfo) {
            this.f64229a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64222c;
            if (ga2 != null) {
                ga2.e(c4534u2.a(this.f64229a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4534u2.this.a(this.f64229a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$e */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64231a;

        public e(AdInfo adInfo) {
            this.f64231a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64221b;
            if (ga2 != null) {
                ga2.e(c4534u2.a(this.f64231a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4534u2.this.a(this.f64231a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$f */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f64233a;

        public f(IronSourceError ironSourceError) {
            this.f64233a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ga ga2 = C4534u2.this.f64222c;
            if (ga2 != null) {
                ga2.b(this.f64233a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f64233a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$g */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f64235a;

        public g(IronSourceError ironSourceError) {
            this.f64235a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ga ga2 = C4534u2.this.f64221b;
            if (ga2 != null) {
                ga2.b(this.f64235a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f64235a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$h */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64237a;

        public h(AdInfo adInfo) {
            this.f64237a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64222c;
            if (ga2 != null) {
                ga2.h(c4534u2.a(this.f64237a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4534u2.this.a(this.f64237a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$i */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64239a;

        public i(AdInfo adInfo) {
            this.f64239a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64221b;
            if (ga2 != null) {
                ga2.h(c4534u2.a(this.f64239a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4534u2.this.a(this.f64239a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$j */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64241a;

        public j(AdInfo adInfo) {
            this.f64241a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64222c;
            if (ga2 != null) {
                ga2.f(c4534u2.a(this.f64241a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4534u2.this.a(this.f64241a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$k */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64243a;

        public k(AdInfo adInfo) {
            this.f64243a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64221b;
            if (ga2 != null) {
                ga2.f(c4534u2.a(this.f64243a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4534u2.this.a(this.f64243a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u2$l */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f64245a;

        public l(AdInfo adInfo) {
            this.f64245a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4534u2 c4534u2 = C4534u2.this;
            Ga ga2 = c4534u2.f64222c;
            if (ga2 != null) {
                ga2.g(c4534u2.a(this.f64245a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4534u2.this.a(this.f64245a));
            }
        }
    }

    private C4534u2() {
    }

    public static C4534u2 a() {
        return f64220d;
    }

    public void d(AdInfo adInfo) {
        if (this.f64222c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f64221b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f64222c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f64221b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f64222c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.f64221b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void a(Ga ga2) {
        this.f64221b = ga2;
    }

    public void b(Ga ga2) {
        this.f64222c = ga2;
    }

    public void c(AdInfo adInfo) {
        if (this.f64222c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f64221b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f64222c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.f64221b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public Ga b() {
        return this.f64221b;
    }

    public void b(AdInfo adInfo) {
        if (this.f64222c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.f64221b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
