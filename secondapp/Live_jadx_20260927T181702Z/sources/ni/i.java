package ni;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f116724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f116725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScrollView f116726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f116727d = new int[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f116728e = new int[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f116729f = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            i.this.e();
        }
    }

    public i(View view, k kVar, ScrollView scrollView) {
        this.f116724a = view;
        this.f116725b = kVar;
        this.f116726c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.f116726c = scrollView;
    }

    public void b(k kVar) {
        this.f116725b = kVar;
    }

    public void c(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f116729f);
    }

    public void d(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f116729f);
    }

    public void e() {
        ScrollView scrollView = this.f116726c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        this.f116726c.getLocationInWindow(this.f116727d);
        this.f116726c.getChildAt(0).getLocationInWindow(this.f116728e);
        int top = (this.f116724a.getTop() - this.f116727d[1]) + this.f116728e[1];
        int height = this.f116724a.getHeight();
        int height2 = this.f116726c.getHeight();
        if (top < 0) {
            this.f116725b.q0(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            this.f116724a.invalidate();
            return;
        }
        int i10 = top + height;
        if (i10 > height2) {
            this.f116725b.q0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i10 - height2) / height))));
            this.f116724a.invalidate();
        } else if (this.f116725b.A() != 1.0f) {
            this.f116725b.q0(1.0f);
            this.f116724a.invalidate();
        }
    }
}
