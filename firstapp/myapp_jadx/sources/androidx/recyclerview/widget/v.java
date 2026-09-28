package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import defpackage.hb5;

/* JADX INFO: loaded from: classes.dex */
public class v extends RecyclerView.y {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public v(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            hb5.a("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public final void c(int i, int i2, RecyclerView.y.a aVar) {
        if (this.b.C.K() == 0) {
            g();
            return;
        }
        int i3 = this.o;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.o = i4;
        int i5 = this.p;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.p = i7;
        if (i4 == 0 && i7 == 0) {
            PointF pointFA = a(this.a);
            if (pointFA != null) {
                float f = pointFA.x;
                if (f != 0.0f || pointFA.y != 0.0f) {
                    float f2 = pointFA.y;
                    float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                    float f3 = pointFA.x / fSqrt;
                    pointFA.x = f3;
                    float f4 = pointFA.y / fSqrt;
                    pointFA.y = f4;
                    this.k = pointFA;
                    this.o = (int) (f3 * 10000.0f);
                    this.p = (int) (f4 * 10000.0f);
                    aVar.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (l(10000) * 1.2f), this.i);
                    return;
                }
            }
            aVar.d = this.a;
            g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public final void d() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void e() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void f(View view, RecyclerView.y.a aVar) {
        int i = i(m(), view);
        int iJ = j(n(), view);
        int iCeil = (int) Math.ceil(((double) l((int) Math.sqrt((iJ * iJ) + (i * i)))) / 0.3356d);
        if (iCeil > 0) {
            aVar.b(-i, -iJ, iCeil, this.j);
        }
    }

    public int i(int i, View view) {
        RecyclerView.o oVar = this.c;
        if (oVar == null || !oVar.s()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return h(RecyclerView.o.P(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, RecyclerView.o.S(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, oVar.getPaddingLeft(), oVar.C - oVar.getPaddingRight(), i);
    }

    public int j(int i, View view) {
        RecyclerView.o oVar = this.c;
        if (oVar == null || !oVar.t()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return h(RecyclerView.o.T(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, RecyclerView.o.N(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, oVar.getPaddingTop(), oVar.D - oVar.getPaddingBottom(), i);
    }

    public float k(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int l(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = k(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public int m() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public int n() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }
}
