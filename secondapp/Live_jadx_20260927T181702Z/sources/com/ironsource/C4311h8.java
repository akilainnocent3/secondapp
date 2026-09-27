package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4311h8 extends C4518t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4311h8 f61915d = new C4311h8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4314hb f61916b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4314hb f61917c = null;

    /* JADX INFO: renamed from: com.ironsource.h8$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61918a;

        public a(AdInfo adInfo) {
            this.f61918a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61916b;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.e(c4311h8.a(this.f61918a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4311h8.this.a(this.f61918a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f61920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f61921b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f61920a = ironSourceError;
            this.f61921b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61917c;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.a(this.f61920a, c4311h8.a(this.f61921b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4311h8.this.a(this.f61921b) + ", error = " + this.f61920a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f61923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f61924b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f61923a = ironSourceError;
            this.f61924b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61916b;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.a(this.f61923a, c4311h8.a(this.f61924b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4311h8.this.a(this.f61924b) + ", error = " + this.f61923a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61926a;

        public d(AdInfo adInfo) {
            this.f61926a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61917c;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.d(c4311h8.a(this.f61926a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4311h8.this.a(this.f61926a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$e */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61928a;

        public e(AdInfo adInfo) {
            this.f61928a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61916b;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.d(c4311h8.a(this.f61928a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4311h8.this.a(this.f61928a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$f */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61930a;

        public f(AdInfo adInfo) {
            this.f61930a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61917c;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.a(c4311h8.a(this.f61930a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4311h8.this.a(this.f61930a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$g */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61932a;

        public g(AdInfo adInfo) {
            this.f61932a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61916b;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.a(c4311h8.a(this.f61932a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4311h8.this.a(this.f61932a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$h */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f61934a;

        public h(IronSourceError ironSourceError) {
            this.f61934a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4314hb interfaceC4314hb = C4311h8.this.f61917c;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.b(this.f61934a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f61934a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$i */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f61936a;

        public i(IronSourceError ironSourceError) {
            this.f61936a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4314hb interfaceC4314hb = C4311h8.this.f61916b;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.b(this.f61936a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f61936a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$j */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61938a;

        public j(AdInfo adInfo) {
            this.f61938a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61917c;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.c(c4311h8.a(this.f61938a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4311h8.this.a(this.f61938a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$k */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61940a;

        public k(AdInfo adInfo) {
            this.f61940a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61916b;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.c(c4311h8.a(this.f61940a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4311h8.this.a(this.f61940a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$l */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61942a;

        public l(AdInfo adInfo) {
            this.f61942a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61917c;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.b(c4311h8.a(this.f61942a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4311h8.this.a(this.f61942a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$m */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61944a;

        public m(AdInfo adInfo) {
            this.f61944a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61916b;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.b(c4311h8.a(this.f61944a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4311h8.this.a(this.f61944a));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$n */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f61946a;

        public n(AdInfo adInfo) {
            this.f61946a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4311h8 c4311h8 = C4311h8.this;
            InterfaceC4314hb interfaceC4314hb = c4311h8.f61917c;
            if (interfaceC4314hb != null) {
                interfaceC4314hb.e(c4311h8.a(this.f61946a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4311h8.this.a(this.f61946a));
            }
        }
    }

    private C4311h8() {
    }

    public static synchronized C4311h8 a() {
        return f61915d;
    }

    public void d(AdInfo adInfo) {
        if (this.f61917c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.f61916b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.f61917c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.f61916b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.f61917c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.f61916b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(InterfaceC4314hb interfaceC4314hb) {
        this.f61916b = interfaceC4314hb;
    }

    public synchronized void b(InterfaceC4314hb interfaceC4314hb) {
        this.f61917c = interfaceC4314hb;
    }

    public void c(AdInfo adInfo) {
        if (this.f61917c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.f61916b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.f61917c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.f61916b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.f61917c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.f61916b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f61917c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.f61916b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
