package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    private static String G = "NativeAdvancedProvider";
    private boolean A;
    private boolean B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f64784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f64785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f64786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f64787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f64788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f64789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f64790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f64791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f64792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f64793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f64794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f64795n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private JSONObject f64805x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f64807z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f64796o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f64797p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f64798q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f64799r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f64800s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f64801t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f64802u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f64803v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f64804w = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f64806y = false;
    private boolean D = true;
    public boolean E = false;
    private ViewTreeObserver.OnScrollChangedListener F = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC0605a implements Runnable {
            public RunnableC0605a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D = true;
            }
        }

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.D) {
                c.this.D = false;
                if (c.this.f64807z != null) {
                    c.this.f64807z.postDelayed(new RunnableC0605a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    q0.b(c.G, e10.getMessage());
                }
            }
        }
    }

    public c(String str, String str2, Activity activity) {
        this.f64783b = TextUtils.isEmpty(str) ? "" : str;
        this.f64782a = str2;
        this.f64784c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f64791j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f64791j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f64791j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            q0.a(G, th2.getMessage());
        }
    }

    private void j() {
        a(this.f64796o);
        c(this.f64798q);
        g(this.f64800s);
        a(this.f64805x);
        e(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f64807z;
    }

    public int f() {
        return this.f64796o;
    }

    public boolean g() {
        return this.f64794m;
    }

    public void h(int i10) {
        this.f64801t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.C) {
                        return;
                    } else {
                        this.C = true;
                    }
                }
            } else if (this.B) {
                return;
            } else {
                this.B = true;
            }
        } else if (this.A) {
            return;
        } else {
            this.A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            q0.b(G, e10.getMessage());
        }
    }

    private void g(int i10) {
        if (this.f64801t) {
            this.f64800s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f64791j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f64791j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    public void b(JSONObject jSONObject) {
        this.f64806y = true;
        a(jSONObject);
    }

    public void c(String str) throws Throwable {
        b bVar = new b(this, this.f64784c);
        this.f64787f = bVar;
        bVar.a(this.f64788g);
        this.f64787f.a(str);
        a(str, 2);
    }

    public void d(String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f64788g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f64784c, "bid  token is null or empty");
        }
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2) {
            this.B = false;
        } else if (i10 == 3) {
            this.C = false;
        }
        h();
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f64786e;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void a(boolean z10) {
        this.f64794m = z10;
    }

    public boolean b(String str) {
        return (this.f64807z == null || com.mbridge.msdk.advanced.manager.d.a(this.f64790i, this.f64783b, this.f64782a, str, this.f64796o, false, true) == null) ? false : true;
    }

    private void a(JSONObject jSONObject) {
        if (this.f64806y) {
            this.f64805x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f64791j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f64791j, "setStyleList", "", jSONObject);
        }
    }

    public void b(int i10) {
        this.f64797p = true;
        a(i10);
    }

    private void c(int i10) {
        if (this.f64799r) {
            this.f64798q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f64791j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f64791j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
        }
    }

    public void d(int i10) {
        this.f64799r = true;
        c(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public String e() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f64786e;
            if (cVar != null) {
                return cVar.c();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f64785d;
        if (bVar != null) {
            return bVar.d();
        }
        return "";
    }

    public void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (this.f64793l == null) {
                this.f64793l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f64782a);
            }
            this.f64789h = new d(this, this.f64788g, campaignEx);
            q0.a(G, "show start");
            if (this.f64802u != 0 && this.f64803v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f64789h;
            if (dVar != null) {
                dVar.a(this.f64784c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.A && this.B && this.C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f64790i, this.f64783b, this.f64782a, "", this.f64796o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f64786e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f64788g = nativeAdvancedAdListener;
    }

    private void a(int i10) {
        if (this.f64797p) {
            this.f64796o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f64791j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f64796o;
            if (i11 == 1) {
                this.f64786e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f64791j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f64786e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f64791j, "hideCloseButton", "", null);
            }
        }
    }

    public String c() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f64786e;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f64785d;
        if (bVar != null) {
            return bVar.c();
        }
        return "";
    }

    public void b() {
        if (this.f64788g != null) {
            this.f64788g = null;
        }
        if (this.f64787f != null) {
            this.f64787f = null;
        }
        if (this.f64789h != null) {
            this.f64789h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f64785d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f64785d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f64786e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f64790i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f64783b + this.f64782a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f64792k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f64807z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.F);
            this.f64807z.removeAllViews();
            this.f64807z = null;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10) {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f64807z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.f64793l == null) {
                this.f64793l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f64782a);
            }
            this.f64789h = new d(this, this.f64788g, campaignEx);
        }
        if (this.f64786e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f64783b, this.f64782a);
            this.f64786e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f64790i, campaignEx, this.f64783b, this.f64782a)) {
            this.f64786e.a(this.f64789h);
            q0.b(G, "start show process");
            this.f64786e.a(campaignEx, this.f64790i, true);
        }
    }

    private void a(String str, int i10) throws Throwable {
        boolean zB;
        this.D = true;
        synchronized (this.f64804w) {
            try {
                if (this.f64794m) {
                    if (this.f64787f != null) {
                        this.f64787f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f64794m = true;
                    }
                    return;
                }
                this.f64794m = true;
                if (this.f64802u != 0 && this.f64803v != 0) {
                    if (this.f64790i == null) {
                        if (this.f64787f != null) {
                            this.f64787f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                            return;
                        }
                        return;
                    }
                    try {
                        zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                    } catch (Exception e10) {
                        q0.b(G, e10.getMessage());
                        zB = false;
                    }
                    if (!zB) {
                        if (this.f64787f != null) {
                            this.f64787f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f64790i.clearResStateAndRemoveClose();
                    l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f64782a);
                    this.f64793l = lVarA;
                    if (lVarA == null) {
                        this.f64793l = l.k(this.f64782a);
                    }
                    if (this.f64785d == null) {
                        this.f64785d = new com.mbridge.msdk.advanced.manager.b(this.f64783b, this.f64782a, 0L);
                    }
                    b bVar = this.f64787f;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f64785d.a(this.f64787f);
                    }
                    this.f64790i.resetLoadState();
                    this.f64785d.a(this.f64790i);
                    this.f64785d.a(this.f64793l);
                    this.f64785d.a(this.f64802u, this.f64803v);
                    this.f64785d.a(this.f64796o);
                    this.f64785d.b(str, i10);
                    return;
                }
                if (this.f64787f != null) {
                    this.f64787f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        Context context;
        if (this.f64786e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f64783b, this.f64782a);
            this.f64786e = cVar;
            cVar.a(this);
        }
        if (this.f64791j == null) {
            try {
                this.f64791j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(G, e10.getMessage());
            }
            if (this.f64792k == null) {
                try {
                    this.f64792k = new com.mbridge.msdk.advanced.view.a(this.f64782a, this.f64786e.b(), this);
                } catch (Exception e11) {
                    q0.b(G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f64791j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f64792k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f64790i == null) {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (activity == null) {
                context = activity;
                context = contextD;
            }
            context = activity;
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(context);
            this.f64790i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f64791j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f64791j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f64790i.addView(this.f64791j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f64807z == null) {
            this.f64807z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.n().d());
            if (this.f64802u != 0 && this.f64803v != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f64802u, this.f64803v);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f64807z.setLayoutParams(layoutParams);
            this.f64807z.setProvider(this);
            this.f64807z.addView(this.f64790i);
            this.f64807z.getViewTreeObserver().addOnScrollChangedListener(this.F);
        }
        if (this.f64795n == null) {
            this.f64795n = new j();
        }
        this.f64795n.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f64782a);
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f64785d;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f64803v = i10;
        this.f64802u = i11;
        this.f64807z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }
}
