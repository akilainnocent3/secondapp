package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f71544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.setting.c f71545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f71546l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f71535a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f71536b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f71537c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f71538d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f71539e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f71540f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f71541g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f71542h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f71543i = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.mbridge.msdk.video.signal.a.InterfaceC0714a f71547m = new C0715a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f71548n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f71549o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdSession f71550p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MediaEvents f71551q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdEvents f71552r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0715a implements com.mbridge.msdk.video.signal.a.InterfaceC0714a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0714a
        public void a(boolean z10) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0714a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0714a
        public void a(int i10, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0714a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f71536b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f71537c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f71539e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        q0.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f71542h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f71538d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f71548n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f71543i;
    }

    public AdEvents j() {
        return this.f71552r;
    }

    public AdSession k() {
        return this.f71550p;
    }

    public int l() {
        if (this.f71537c == 0 && this.f71536b) {
            this.f71537c = 1;
        }
        return this.f71537c;
    }

    public int m() {
        if (this.f71538d == 0 && this.f71536b) {
            this.f71538d = 1;
        }
        return this.f71538d;
    }

    public int n() {
        if (this.f71539e == 0 && this.f71536b) {
            this.f71539e = 1;
        }
        return this.f71539e;
    }

    public MediaEvents o() {
        return this.f71551q;
    }

    public boolean p() {
        return this.f71536b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f71546l;
        if (aVar != null) {
            aVar.a(false);
            this.f71546l.a((NativeListener.NativeTrackingListener) null);
            this.f71546l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.f71552r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.f71550p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f71545k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        q0.a("DefaultJSCommon", "setUnitId:" + str);
        this.f71544j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f71551q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f71541g = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements com.mbridge.msdk.video.signal.a.InterfaceC0714a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f71553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.a.InterfaceC0714a f71554b;

        public b(com.mbridge.msdk.video.signal.d dVar, com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a) {
            this.f71553a = dVar;
            this.f71554b = interfaceC0714a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0714a
        public void a(boolean z10) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f71553a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0714a
        public void onInitSuccess() {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            return interfaceC0714a != null && interfaceC0714a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f71553a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0714a
        public void a(int i10, String str) {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0714a
        public void a() {
            com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a = this.f71554b;
            if (interfaceC0714a != null) {
                interfaceC0714a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f71541g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f71535a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f71535a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.f71542h);
        return this.f71542h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(com.mbridge.msdk.video.signal.a.InterfaceC0714a interfaceC0714a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0714a);
        this.f71547m = interfaceC0714a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f71543i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }
}
