package com.cleveradssolutions.adapters.exchange.api.rendering;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import com.cleveradssolutions.adapters.exchange.rendering.models.internal.g;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.cleveradssolutions.adapters.exchange.rendering.views.base.b implements com.cleveradssolutions.adapters.exchange.rendering.interstitial.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f42023k = "zr";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.bidding.c f42024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.b f42025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.views.a f42026j;

    /* JADX INFO: renamed from: com.cleveradssolutions.adapters.exchange.api.rendering.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0422a extends com.cleveradssolutions.adapters.exchange.rendering.views.a {
        public C0422a() {
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void c() {
            com.cleveradssolutions.adapters.exchange.b.h(a.f42023k, "interstitialAdClosed");
            a.this.l();
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void i() {
            a.this.f42024h.g(a.this);
            com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.b bVar = a.this.f42025i;
            if (bVar == null || !bVar.T()) {
                return;
            }
            a.this.f42025i.B(0);
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void j(View view) {
            if (a.this.f42817b.r()) {
                a.this.f42024h.b(a.this);
            }
            a.this.removeAllViews();
            a.this.addView(view);
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void k(com.cleveradssolutions.adapters.exchange.api.exceptions.a aVar) {
            a.this.p(aVar);
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void l(com.cleveradssolutions.adapters.exchange.rendering.models.d dVar) {
            a.this.f42024h.l(a.this, dVar);
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void m(String str) {
            a.this.f42024h.f(a.this);
        }
    }

    public a(Context context) throws com.cleveradssolutions.adapters.exchange.api.exceptions.a {
        super(context);
        this.f42026j = new C0422a();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f42817b.q()) {
            this.f42817b.y();
        } else {
            this.f42817b.u();
            this.f42024h.i(this);
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.interstitial.a
    public void a() {
        this.f42817b.R(k());
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.base.b
    public void c() {
        super.c();
        com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.b bVar = this.f42025i;
        if (bVar != null) {
            bVar.hide();
            this.f42025i.cancel();
            this.f42025i.Q();
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.base.b
    public void d() throws com.cleveradssolutions.adapters.exchange.api.exceptions.a {
        try {
            super.d();
            g();
            e();
        } catch (Exception e10) {
            throw new com.cleveradssolutions.adapters.exchange.api.exceptions.a("AdView initialization failed: " + Log.getStackTraceString(e10));
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.base.b
    public void f(String str) {
        if ("com.cleveradssolutions.adapters.dsp.rendering.browser.close".equals(str)) {
            this.f42024h.p(this);
        }
    }

    public void g() {
        this.f42817b = new com.cleveradssolutions.adapters.exchange.rendering.views.d(getContext(), this.f42026j, this, this.f42818c);
    }

    public void j() {
        com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.b bVar = this.f42025i;
        if (bVar != null) {
            if (bVar.isShowing()) {
                this.f42025i.L();
            }
            this.f42025i = null;
        }
    }

    public g[] k() {
        View viewFindViewById = findViewById(j.f42535e);
        View viewFindViewById2 = findViewById(j.f42536f);
        View viewFindViewById3 = findViewById(com.cleveradssolutions.adapters.exchange.a.b.f42009e);
        View viewFindViewById4 = findViewById(com.cleveradssolutions.adapters.exchange.a.b.f42010f);
        g.a aVar = g.a.CLOSE_AD;
        g.a aVar2 = g.a.OTHER;
        return new g[]{new g(viewFindViewById, aVar, null), new g(viewFindViewById2, aVar, null), new g(viewFindViewById3, aVar2, "CountDownTimer"), new g(viewFindViewById4, aVar2, "Action button"), new g(viewFindViewById.getRootView().findViewById(R.id.navigationBarBackground), aVar2, "Bottom navigation bar")};
    }

    public void n(Activity activity) {
        this.f42818c.h(activity, this);
    }

    public void o(Activity activity, com.cleveradssolutions.adapters.exchange.configuration.a aVar) {
        com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.b bVar = new com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.b(activity, this, this.f42818c, Boolean.valueOf(aVar.h()));
        this.f42025i = bVar;
        bVar.W(true);
        this.f42025i.j0(this.f42817b.m());
        this.f42025i.D(this);
        this.f42025i.show();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        Activity ownerActivity;
        super.onConfigurationChanged(configuration);
        com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.b bVar = this.f42025i;
        if (bVar == null || (ownerActivity = bVar.getOwnerActivity()) == null) {
            return;
        }
        for (int i10 : j.f42538h) {
            View viewFindViewById = findViewById(i10);
            if (viewFindViewById != null) {
                com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.g.b(viewFindViewById);
                com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.g.f(viewFindViewById, ownerActivity);
            }
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.base.b, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        com.cleveradssolutions.adapters.exchange.rendering.views.interstitial.b bVar = this.f42025i;
        if (bVar != null) {
            if (z10) {
                bVar.R();
            } else {
                bVar.P();
            }
        }
    }

    public void p(com.cleveradssolutions.adapters.exchange.api.exceptions.a aVar) {
        com.cleveradssolutions.adapters.exchange.rendering.bidding.c cVar = this.f42024h;
        if (cVar != null) {
            cVar.h(this, aVar);
        }
    }

    public void q(com.cleveradssolutions.adapters.exchange.configuration.a aVar, com.cleveradssolutions.adapters.exchange.rendering.bidding.d dVar) {
        this.f42817b.P(aVar, dVar);
    }

    public void setInterstitialViewListener(com.cleveradssolutions.adapters.exchange.rendering.bidding.c cVar) {
        this.f42024h = cVar;
    }

    public void setPubBackGroundOpacity(float f10) {
        this.f42818c.d().b(f10);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.interstitial.a
    public void zz() {
        l();
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.interstitial.a
    public void zz(boolean z10) {
        if (z10) {
            this.f42817b.s();
        } else {
            this.f42817b.z();
        }
    }
}
