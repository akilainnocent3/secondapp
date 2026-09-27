package yads;

import android.app.Activity;
import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ha2 implements fa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f150032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f150033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedCallback f150034c = new OnBackInvokedCallback() { // from class: yads.t14
        public final void onBackInvoked() {
            ha2.a(this.f155676a);
        }
    };

    public ha2(Activity activity, w1 w1Var) {
        this.f150032a = activity;
        this.f150033b = w1Var;
    }

    public static final void a(ha2 ha2Var) {
        w1 w1Var = ha2Var.f150033b;
        if (w1Var == null || !w1Var.f157163c.d()) {
            return;
        }
        ha2Var.f150032a.finish();
    }

    @Override // yads.fa2
    public final void destroy() {
        this.f150032a.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f150034c);
    }

    @Override // yads.fa2
    public final void a() {
        this.f150032a.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f150034c);
    }
}
