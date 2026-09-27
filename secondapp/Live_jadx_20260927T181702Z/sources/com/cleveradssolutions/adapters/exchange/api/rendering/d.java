package com.cleveradssolutions.adapters.exchange.api.rendering;

import android.R;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.cleveradssolutions.adapters.exchange.rendering.models.internal.g;
import com.cleveradssolutions.adapters.exchange.rendering.models.m;
import com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.n;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d extends com.cleveradssolutions.adapters.exchange.rendering.views.base.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f42030p = "zs";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.views.video.a f42031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f42032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f42033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m.a f42034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f42035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.views.a f42038o;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        UNDEFINED,
        PLAYBACK_NOT_STARTED,
        PLAYING,
        PAUSED_BY_USER,
        PAUSED_AUTO,
        PLAYBACK_FINISHED
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends com.cleveradssolutions.adapters.exchange.rendering.views.a {
        public b() {
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void d() {
            if (d.this.f42031h != null) {
                d.this.f42031h.c();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void e() {
            if (d.this.f42031h != null) {
                d.this.f42031h.g();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void f() {
            if (d.this.f42031h != null) {
                d.this.f42031h.a();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void g() {
            if (d.this.f42031h != null) {
                d.this.f42031h.e();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void h() {
            d.this.k();
            d.this.B(a.PLAYBACK_FINISHED);
            if (d.this.f42031h != null) {
                d.this.f42031h.f(d.this);
            }
            if (d.this.f42817b.r()) {
                d.this.i();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void j(View view) {
            if (d.this.f42817b.r() && d.this.f42031h != null) {
                d.this.f42031h.d(d.this);
            }
            d.this.removeAllViews();
            if (d.this.f42817b.K()) {
                d.this.l(view);
            } else {
                d.this.p(view);
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void k(com.cleveradssolutions.adapters.exchange.api.exceptions.a aVar) {
            d.this.A(aVar);
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void l(com.cleveradssolutions.adapters.exchange.rendering.models.d dVar) {
            if (d.this.f42031h != null) {
                d.this.f42031h.k(d.this, dVar);
            }
            d.this.B(a.PLAYBACK_NOT_STARTED);
            if (d.this.f42037n) {
                d.this.j();
            }
        }

        @Override // com.cleveradssolutions.adapters.exchange.rendering.views.a
        public void m(String str) {
            if (d.this.f42031h != null) {
                d.this.f42031h.b(d.this);
            }
            if (d.this.f42032i != null) {
                d.this.f42032i.onClick(d.this);
            }
        }
    }

    public d(Context context, com.cleveradssolutions.adapters.exchange.configuration.a aVar) throws com.cleveradssolutions.adapters.exchange.api.exceptions.a {
        super(context);
        this.f42034k = new m.a() { // from class: com.cleveradssolutions.adapters.exchange.api.rendering.b
            @Override // com.cleveradssolutions.adapters.exchange.rendering.models.m.a
            public final void a(com.cleveradssolutions.adapters.exchange.rendering.models.internal.f fVar) {
                this.f42028a.H(fVar);
            }
        };
        this.f42035l = a.UNDEFINED;
        this.f42037n = true;
        this.f42038o = new b();
        E(aVar);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.cleveradssolutions.adapters.exchange.a.c.f42013c, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewInflate.setLayoutParams(layoutParams);
        z(viewInflate, "WatchAgain button");
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.cleveradssolutions.adapters.exchange.api.rendering.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42029b.y(view);
            }
        });
        addView(viewInflate);
    }

    public void A(com.cleveradssolutions.adapters.exchange.api.exceptions.a aVar) {
        com.cleveradssolutions.adapters.exchange.rendering.views.video.a aVar2 = this.f42031h;
        if (aVar2 != null) {
            aVar2.i(this, aVar);
        }
    }

    public final void B(a aVar) {
        this.f42035l = aVar;
    }

    public final void E(com.cleveradssolutions.adapters.exchange.configuration.a aVar) {
        aVar.k(true);
        aVar.j(0.0f);
    }

    public void F(com.cleveradssolutions.adapters.exchange.configuration.a aVar, com.cleveradssolutions.adapters.exchange.rendering.bidding.d dVar) {
        this.f42817b.P(aVar, dVar);
    }

    public void G(com.cleveradssolutions.adapters.exchange.configuration.a aVar, String str) {
        k();
        B(a.UNDEFINED);
        this.f42817b.Q(aVar, str);
    }

    public final void H(com.cleveradssolutions.adapters.exchange.rendering.models.internal.f fVar) {
        boolean zA = fVar.a();
        if (!zA || !u()) {
            r(zA);
            return;
        }
        v();
        com.cleveradssolutions.adapters.exchange.b.h(f42030p, "handleVisibilityChange: auto show " + this.f42035l);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.base.b
    public void b(boolean z10) {
        com.cleveradssolutions.adapters.exchange.b.h(f42030p, "handleWindowFocusChange() called with: hasWindowFocus = [" + z10 + C4235d4.j.f61462e);
        if (this.f42037n) {
            return;
        }
        r(z10);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.base.b
    public void c() {
        super.c();
        k();
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.base.b
    public void d() throws com.cleveradssolutions.adapters.exchange.api.exceptions.a {
        try {
            super.d();
            w();
            setBackgroundColor(f1.d.getColor(getContext(), R.color.black));
            e();
        } catch (Exception e10) {
            throw new com.cleveradssolutions.adapters.exchange.api.exceptions.a("VideoAdView initialization failed: " + Log.getStackTraceString(e10));
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.base.b
    public void f(String str) {
        com.cleveradssolutions.adapters.exchange.rendering.views.video.a aVar;
        str.getClass();
        if (str.equals("com.cleveradssolutions.adapters.dsp.rendering.browser.close") && (aVar = this.f42031h) != null) {
            aVar.h(this);
        }
    }

    public void j() {
        k();
        m mVar = new m((View) this, new com.cleveradssolutions.adapters.exchange.rendering.models.internal.e(com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a.IMPRESSION), true);
        this.f42033j = mVar;
        mVar.o(this.f42034k);
        this.f42033j.l(getContext());
    }

    public void k() {
        m mVar = this.f42033j;
        if (mVar != null) {
            mVar.k();
        }
    }

    public final void l(View view) {
        n.a(view);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
    }

    public final boolean n(a aVar) {
        return this.f42035l == aVar;
    }

    public final void p(View view) {
        com.cleveradssolutions.adapters.exchange.rendering.video.d dVar = (com.cleveradssolutions.adapters.exchange.rendering.video.d) view;
        if (this.f42036m) {
            dVar.q();
        }
        dVar.i();
        z(dVar.getVolumeControlView(), "Volume button");
        addView(view);
    }

    public final void r(boolean z10) {
        String str;
        StringBuilder sb2;
        String str2;
        if (!z10 && t()) {
            this.f42817b.t();
            B(a.PAUSED_AUTO);
            str = f42030p;
            sb2 = new StringBuilder();
            str2 = "handleVisibilityChange: auto pause ";
        } else {
            if (!z10 || !n(a.PAUSED_AUTO)) {
                return;
            }
            this.f42817b.v();
            B(a.PLAYING);
            str = f42030p;
            sb2 = new StringBuilder();
            str2 = "handleVisibilityChange: auto resume ";
        }
        sb2.append(str2);
        sb2.append(this.f42035l);
        com.cleveradssolutions.adapters.exchange.b.h(str, sb2.toString());
    }

    public void setAutoPlay(boolean z10) {
        this.f42037n = z10;
        if (z10) {
            return;
        }
        k();
    }

    public void setOnClickVideoListener(View.OnClickListener onClickListener) {
        this.f42032i = onClickListener;
    }

    public void setVideoPlayerClick(boolean z10) {
        this.f42036m = z10;
    }

    public void setVideoViewListener(com.cleveradssolutions.adapters.exchange.rendering.views.video.a aVar) {
        this.f42031h = aVar;
    }

    public final boolean t() {
        return n(a.PLAYING);
    }

    public final boolean u() {
        return n(a.PLAYBACK_NOT_STARTED);
    }

    public void v() {
        if (u()) {
            B(a.PLAYING);
            this.f42817b.w();
            return;
        }
        com.cleveradssolutions.adapters.exchange.b.h(f42030p, "play() can't play " + this.f42035l);
    }

    public void w() {
        this.f42817b = new com.cleveradssolutions.adapters.exchange.rendering.views.d(getContext(), this.f42038o, this, this.f42818c);
    }

    public final /* synthetic */ void y(View view) {
        B(a.PLAYBACK_NOT_STARTED);
        j();
    }

    public final void z(View view, String str) {
        if (view == null) {
            return;
        }
        this.f42817b.R(new g(view, g.a.VIDEO_CONTROLS, str));
    }
}
