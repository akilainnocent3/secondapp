package androidx.leanback.app;

import android.R;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f11327i = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f11329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f11330c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11334g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11328a = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f11331d = new Handler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11332e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Runnable f11335h = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0 e0Var = e0.this;
            if (e0Var.f11332e) {
                boolean z10 = e0Var.f11333f;
                if ((z10 || e0Var.f11329b != null) && e0Var.f11334g) {
                    View view = e0Var.f11330c;
                    if (view != null) {
                        if (z10) {
                            view.setVisibility(0);
                        }
                    } else {
                        e0Var.f11330c = new ProgressBar(e0.this.f11329b.getContext(), null, R.attr.progressBarStyleLarge);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        e0 e0Var2 = e0.this;
                        e0Var2.f11329b.addView(e0Var2.f11330c, layoutParams);
                    }
                }
            }
        }
    }

    public void a() {
        this.f11332e = false;
    }

    public void b() {
        this.f11332e = true;
    }

    public long c() {
        return this.f11328a;
    }

    public void d() {
        this.f11334g = false;
        if (this.f11333f) {
            this.f11330c.setVisibility(4);
        } else {
            View view = this.f11330c;
            if (view != null) {
                this.f11329b.removeView(view);
                this.f11330c = null;
            }
        }
        this.f11331d.removeCallbacks(this.f11335h);
    }

    public void e(long j10) {
        this.f11328a = j10;
    }

    public void f(View view) {
        if (view != null && view.getParent() == null) {
            throw new IllegalArgumentException("Must have a parent");
        }
        this.f11330c = view;
        if (view != null) {
            view.setVisibility(4);
            this.f11333f = true;
        }
    }

    public void g(ViewGroup viewGroup) {
        this.f11329b = viewGroup;
    }

    public void h() {
        if (this.f11332e) {
            this.f11334g = true;
            this.f11331d.postDelayed(this.f11335h, this.f11328a);
        }
    }
}
