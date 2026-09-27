package yads;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f156186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f156187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f156188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f156189d;

    public /* synthetic */ u10(View view, float f10, float f11, float f12, float f13) {
        this(view, f10, f11, f12, f13, new RectF(), new Path());
    }

    public static float[] a(float f10, float f11, float f12, float f13) {
        if (f10 > 0.0f || f11 > 0.0f || f12 > 0.0f || f13 > 0.0f) {
            return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
        }
        return null;
    }

    public final void a() {
        if (this.f156189d != null) {
            int measuredWidth = this.f156186a.getMeasuredWidth();
            int measuredHeight = this.f156186a.getMeasuredHeight();
            int paddingLeft = this.f156186a.getPaddingLeft();
            int paddingTop = this.f156186a.getPaddingTop();
            int paddingRight = measuredWidth - this.f156186a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f156186a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f156187b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f156188c.reset();
            this.f156188c.addRoundRect(this.f156187b, this.f156189d, Path.Direction.CW);
        }
    }

    public u10(View view, float f10, float f11, float f12, float f13, RectF rectF, Path path) {
        this.f156186a = view;
        this.f156187b = rectF;
        this.f156188c = path;
        this.f156189d = a(f10, f11, f12, f13);
    }
}
