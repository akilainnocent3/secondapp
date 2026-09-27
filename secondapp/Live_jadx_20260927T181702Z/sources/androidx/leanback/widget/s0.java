package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends c2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f13017g = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f13018h = new Rect();

    @Override // androidx.leanback.widget.c2
    public void d(View view) {
        b().addView(view);
    }

    @Override // androidx.leanback.widget.c2
    public void e(View view) {
        int width = b().getWidth() - b().getPaddingRight();
        int paddingLeft = b().getPaddingLeft();
        view.measure(0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z10 = view.getLayoutDirection() == 1;
        if (!z10 && this.f13015e + view.getMeasuredWidth() > width) {
            marginLayoutParams.leftMargin = width - view.getMeasuredWidth();
        } else if (z10 && this.f13015e < paddingLeft) {
            marginLayoutParams.leftMargin = paddingLeft;
        } else if (z10) {
            marginLayoutParams.leftMargin = this.f13016f - view.getMeasuredWidth();
        } else {
            marginLayoutParams.leftMargin = this.f13015e;
        }
        view.requestLayout();
    }

    public void k(HorizontalGridView horizontalGridView, View view, Object obj) {
        ViewGroup viewGroupB = b();
        horizontalGridView.f(view, this.f13017g);
        this.f13018h.set(0, 0, view.getWidth(), view.getHeight());
        viewGroupB.offsetDescendantRectToMyCoords(view, this.f13018h);
        Rect rect = this.f13018h;
        int i10 = rect.left;
        int i11 = this.f13017g[0];
        this.f13015e = i10 - i11;
        this.f13016f = rect.right - i11;
        f(obj);
    }
}
