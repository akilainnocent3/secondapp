package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Dd extends C4518t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Dd f58777d = new Dd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4509sb f58778b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4509sb f58779c = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f58780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f58781b;

        public a(boolean z10, AdInfo adInfo) {
            this.f58780a = z10;
            this.f58781b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58778b;
            if (interfaceC4509sb != null) {
                if (!this.f58780a) {
                    ((InterfaceC4526tb) interfaceC4509sb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4526tb) interfaceC4509sb).d(dd2.a(this.f58781b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Dd.this.a(this.f58781b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4298gd f58783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f58784b;

        public b(C4298gd c4298gd, AdInfo adInfo) {
            this.f58783a = c4298gd;
            this.f58784b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58779c;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.b(this.f58783a, dd2.a(this.f58784b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f58783a + ", adInfo = " + Dd.this.a(this.f58784b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4298gd f58786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f58787b;

        public c(C4298gd c4298gd, AdInfo adInfo) {
            this.f58786a = c4298gd;
            this.f58787b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58778b;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.b(this.f58786a, dd2.a(this.f58787b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f58786a + ", adInfo = " + Dd.this.a(this.f58787b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f58789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f58790b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f58789a = ironSourceError;
            this.f58790b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58779c;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.a(this.f58789a, dd2.a(this.f58790b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Dd.this.a(this.f58790b) + ", error = " + this.f58789a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f58792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f58793b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f58792a = ironSourceError;
            this.f58793b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58778b;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.a(this.f58792a, dd2.a(this.f58793b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Dd.this.a(this.f58793b) + ", error = " + this.f58792a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4298gd f58795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f58796b;

        public f(C4298gd c4298gd, AdInfo adInfo) {
            this.f58795a = c4298gd;
            this.f58796b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58779c;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.a(this.f58795a, dd2.a(this.f58796b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f58795a + ", adInfo = " + Dd.this.a(this.f58796b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4298gd f58798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f58799b;

        public g(C4298gd c4298gd, AdInfo adInfo) {
            this.f58798a = c4298gd;
            this.f58799b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58778b;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.a(this.f58798a, dd2.a(this.f58799b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f58798a + ", adInfo = " + Dd.this.a(this.f58799b));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f58801a;

        public h(AdInfo adInfo) {
            this.f58801a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58779c;
            if (interfaceC4509sb != null) {
                ((InterfaceC4543ub) interfaceC4509sb).a(dd2.a(this.f58801a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Dd.this.a(this.f58801a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f58803a;

        public i(AdInfo adInfo) {
            this.f58803a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58778b;
            if (interfaceC4509sb != null) {
                ((InterfaceC4543ub) interfaceC4509sb).a(dd2.a(this.f58803a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Dd.this.a(this.f58803a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f58805a;

        public j(IronSourceError ironSourceError) {
            this.f58805a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4509sb interfaceC4509sb = Dd.this.f58779c;
            if (interfaceC4509sb != null) {
                ((InterfaceC4543ub) interfaceC4509sb).b(this.f58805a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f58805a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f58807a;

        public k(IronSourceError ironSourceError) {
            this.f58807a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4509sb interfaceC4509sb = Dd.this.f58778b;
            if (interfaceC4509sb != null) {
                ((InterfaceC4543ub) interfaceC4509sb).b(this.f58807a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f58807a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f58809a;

        public l(AdInfo adInfo) {
            this.f58809a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58779c;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.c(dd2.a(this.f58809a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Dd.this.a(this.f58809a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f58811a;

        public m(AdInfo adInfo) {
            this.f58811a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58778b;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.c(dd2.a(this.f58811a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Dd.this.a(this.f58811a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f58813a;

        public n(AdInfo adInfo) {
            this.f58813a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58779c;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.b(dd2.a(this.f58813a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Dd.this.a(this.f58813a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f58815a;

        public o(AdInfo adInfo) {
            this.f58815a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58778b;
            if (interfaceC4509sb != null) {
                interfaceC4509sb.b(dd2.a(this.f58815a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Dd.this.a(this.f58815a));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f58817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f58818b;

        public p(boolean z10, AdInfo adInfo) {
            this.f58817a = z10;
            this.f58818b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Dd dd2 = Dd.this;
            InterfaceC4509sb interfaceC4509sb = dd2.f58779c;
            if (interfaceC4509sb != null) {
                if (!this.f58817a) {
                    ((InterfaceC4526tb) interfaceC4509sb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4526tb) interfaceC4509sb).d(dd2.a(this.f58818b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Dd.this.a(this.f58818b));
            }
        }
    }

    private Dd() {
    }

    public static Dd a() {
        return f58777d;
    }

    public void b() {
    }

    public void c() {
    }

    public void d(AdInfo adInfo) {
        if (this.f58779c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC4509sb interfaceC4509sb = this.f58778b;
        if (interfaceC4509sb == null || !(interfaceC4509sb instanceof InterfaceC4543ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC4509sb interfaceC4509sb) {
        this.f58778b = interfaceC4509sb;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f58779c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC4509sb interfaceC4509sb = this.f58778b;
        if (interfaceC4509sb == null || !(interfaceC4509sb instanceof InterfaceC4543ub)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(InterfaceC4509sb interfaceC4509sb) {
        this.f58779c = interfaceC4509sb;
    }

    public void c(AdInfo adInfo) {
        if (this.f58779c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f58778b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f58779c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f58778b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(boolean z10, AdInfo adInfo) {
        if (this.f58779c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z10, adInfo));
            return;
        }
        InterfaceC4509sb interfaceC4509sb = this.f58778b;
        if (interfaceC4509sb == null || !(interfaceC4509sb instanceof InterfaceC4526tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z10, adInfo));
    }

    public void b(C4298gd c4298gd, AdInfo adInfo) {
        if (this.f58779c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c4298gd, adInfo));
        } else if (this.f58778b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c4298gd, adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f58779c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.f58778b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C4298gd c4298gd, AdInfo adInfo) {
        if (this.f58779c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c4298gd, adInfo));
        } else if (this.f58778b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c4298gd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
