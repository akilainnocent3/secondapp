package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class w2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f7441l = "TooltipCompatHandler";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f7442m = 2500;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f7443n = 15000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f7444o = 3000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static w2 f7445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static w2 f7446q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f7447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f7448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f7450e = new Runnable() { // from class: androidx.appcompat.widget.u2
        @Override // java.lang.Runnable
        public final void run() {
            this.f7411b.h(false);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f7451f = new Runnable() { // from class: androidx.appcompat.widget.v2
        @Override // java.lang.Runnable
        public final void run() {
            this.f7424b.d();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x2 f7454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7456k;

    public w2(View view, CharSequence charSequence) {
        this.f7447b = view;
        this.f7448c = charSequence;
        this.f7449d = f2.d2.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void f(w2 w2Var) {
        w2 w2Var2 = f7445p;
        if (w2Var2 != null) {
            w2Var2.b();
        }
        f7445p = w2Var;
        if (w2Var != null) {
            w2Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        w2 w2Var = f7445p;
        if (w2Var != null && w2Var.f7447b == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new w2(view, charSequence);
            return;
        }
        w2 w2Var2 = f7446q;
        if (w2Var2 != null && w2Var2.f7447b == view) {
            w2Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.f7447b.removeCallbacks(this.f7450e);
    }

    public final void c() {
        this.f7456k = true;
    }

    public void d() {
        if (f7446q == this) {
            f7446q = null;
            x2 x2Var = this.f7454i;
            if (x2Var != null) {
                x2Var.c();
                this.f7454i = null;
                c();
                this.f7447b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f7441l, "sActiveHandler.mPopup == null");
            }
        }
        if (f7445p == this) {
            f(null);
        }
        this.f7447b.removeCallbacks(this.f7451f);
    }

    public final void e() {
        this.f7447b.postDelayed(this.f7450e, ViewConfiguration.getLongPressTimeout());
    }

    public void h(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f7447b.isAttachedToWindow()) {
            f(null);
            w2 w2Var = f7446q;
            if (w2Var != null) {
                w2Var.d();
            }
            f7446q = this;
            this.f7455j = z10;
            x2 x2Var = new x2(this.f7447b.getContext());
            this.f7454i = x2Var;
            x2Var.e(this.f7447b, this.f7452g, this.f7453h, this.f7455j, this.f7448c);
            this.f7447b.addOnAttachStateChangeListener(this);
            if (this.f7455j) {
                j11 = f7442m;
            } else {
                if ((f2.z1.F0(this.f7447b) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f7447b.removeCallbacks(this.f7451f);
            this.f7447b.postDelayed(this.f7451f, j11);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f7456k && Math.abs(x10 - this.f7452g) <= this.f7449d && Math.abs(y10 - this.f7453h) <= this.f7449d) {
            return false;
        }
        this.f7452g = x10;
        this.f7453h = y10;
        this.f7456k = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f7454i != null && this.f7455j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f7447b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f7447b.isEnabled() && this.f7454i == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f7452g = view.getWidth() / 2;
        this.f7453h = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
