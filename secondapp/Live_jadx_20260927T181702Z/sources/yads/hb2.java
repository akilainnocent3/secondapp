package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class hb2 extends wo implements m11, vc2, ml3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f150041k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tn3 f150042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f150043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nl3 f150044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wc2 f150045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wz2 f150046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o11 f150047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n11 f150048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f150049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f150050j;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hb2(Context context, tn3 tn3Var, AttributeSet attributeSet, int i10) {
        tn3 tn3Var2 = (i10 & 2) != 0 ? new tn3() : tn3Var;
        attributeSet = (i10 & 4) != 0 ? null : attributeSet;
        Context applicationContext = context.getApplicationContext();
        this(context, tn3Var2, attributeSet, applicationContext, new nl3(), wc2.f157283h.a(applicationContext));
    }

    public final void a(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        int i10 = 1;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        Object obj = dw2.f148384j;
        cw2.a();
        synchronized (obj) {
        }
        int iOrdinal = this.f150042b.f155992a.ordinal();
        if (iOrdinal == 0) {
            i10 = -1;
        } else if (iOrdinal != 1) {
            i10 = 3;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new dr.o0();
                }
                i10 = 2;
            }
        }
        settings.setCacheMode(i10);
        WebSettings settings2 = getSettings();
        if (ub.a(21)) {
            settings2.setMixedContentMode(2);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new l11(this, cs2.b()));
        setWebChromeClient(new i11());
    }

    @Override // yads.wo
    public final String b() {
        return "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + sn3.a();
    }

    @Override // yads.wo
    public final void c() {
        setHtmlWebViewListener(null);
        super.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o11 o11Var;
        if (motionEvent != null && motionEvent.getAction() == 0 && (o11Var = this.f150047g) != null) {
            o11Var.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract void e();

    public final Context f() {
        return this.f150043c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f150050j = true;
        this.f150045e.a(this);
        this.f150044d.getClass();
        a(nl3.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f150050j = false;
        this.f150044d.getClass();
        a(nl3.a(this));
        this.f150045e.b(this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.f150044d.getClass();
        a(nl3.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f150044d.getClass();
        a(nl3.a(this));
    }

    public final void setHtmlWebViewErrorListener(@oy.m n11 n11Var) {
        this.f150048h = n11Var;
    }

    public void setHtmlWebViewListener(@oy.m o11 o11Var) {
        this.f150047g = o11Var;
    }

    public hb2(Context context, tn3 tn3Var, AttributeSet attributeSet, Context context2, nl3 nl3Var, wc2 wc2Var) {
        super(context2, attributeSet);
        this.f150042b = tn3Var;
        this.f150043c = context2;
        this.f150044d = nl3Var;
        this.f150045e = wc2Var;
        this.f150046f = new wz2();
        a(context);
        if (f150041k) {
            return;
        }
        f150041k = true;
    }

    public final void a(boolean z10) {
        if (this.f150049i != z10) {
            this.f150049i = z10;
            o11 o11Var = this.f150047g;
            if (o11Var != null) {
                o11Var.a(z10);
            }
        }
    }

    public void a(Context context, String str) {
        o11 o11Var = this.f150047g;
        if (o11Var != null) {
            o11Var.a(str);
        }
    }

    public void a() {
        wz2 wz2Var = this.f150046f;
        Runnable runnable = new Runnable() { // from class: yads.u14
            @Override // java.lang.Runnable
            public final void run() {
                hb2.a(this.f156222b);
            }
        };
        synchronized (wz2Var.f157590a) {
            if (wz2Var.f157591b) {
                return;
            }
            wz2Var.f157591b = true;
            dr.w2 w2Var = dr.w2.f79517a;
            runnable.run();
        }
    }

    public static final void a(hb2 hb2Var) {
        hb2Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    @Override // yads.vc2
    public final void a(rc2 rc2Var) {
        boolean z10;
        if (rc2Var == rc2.f154876c) {
            z10 = false;
        } else {
            this.f150044d.getClass();
            if (nl3.a(this) && this.f150045e.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        a(z10);
    }

    public void a(int i10) {
        n11 n11Var = this.f150048h;
        if (n11Var != null) {
            n11Var.a(i10);
        }
    }
}
