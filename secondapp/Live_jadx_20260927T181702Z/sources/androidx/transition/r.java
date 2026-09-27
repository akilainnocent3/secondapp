package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class r extends ViewGroup implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f19654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f19655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f19656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Matrix f19658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f19659g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            r.this.postInvalidateOnAnimation();
            r rVar = r.this;
            ViewGroup viewGroup = rVar.f19654b;
            if (viewGroup == null || (view = rVar.f19655c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            r.this.f19654b.postInvalidateOnAnimation();
            r rVar2 = r.this;
            rVar2.f19654b = null;
            rVar2.f19655c = null;
            return true;
        }
    }

    public r(View view) {
        super(view.getContext());
        this.f19659g = new a();
        this.f19656d = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static r b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i10;
        p pVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        p pVarB = p.b(viewGroup);
        r rVarE = e(view);
        if (rVarE == null || (pVar = (p) rVarE.getParent()) == pVarB) {
            i10 = 0;
        } else {
            i10 = rVarE.f19657e;
            pVar.removeView(rVarE);
            rVarE = null;
        }
        if (rVarE == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            rVarE = new r(view);
            rVarE.h(matrix);
            if (pVarB == null) {
                pVarB = new p(viewGroup);
            } else {
                pVarB.g();
            }
            d(viewGroup, pVarB);
            d(viewGroup, rVarE);
            pVarB.a(rVarE);
            rVarE.f19657e = i10;
        } else if (matrix != null) {
            rVarE.h(matrix);
        }
        rVarE.f19657e++;
        return rVarE;
    }

    public static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        d1.h(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        d1.i(viewGroup, matrix);
    }

    public static void d(View view, View view2) {
        d1.e(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    public static r e(View view) {
        return (r) view.getTag(a0.a.f19385a);
    }

    public static void f(View view) {
        r rVarE = e(view);
        if (rVarE != null) {
            int i10 = rVarE.f19657e - 1;
            rVarE.f19657e = i10;
            if (i10 <= 0) {
                ((p) rVarE.getParent()).removeView(rVarE);
            }
        }
    }

    public static void g(@NonNull View view, @Nullable r rVar) {
        view.setTag(a0.a.f19385a, rVar);
    }

    @Override // androidx.transition.o
    public void a(ViewGroup viewGroup, View view) {
        this.f19654b = viewGroup;
        this.f19655c = view;
    }

    public void h(@NonNull Matrix matrix) {
        this.f19658f = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f19656d, this);
        this.f19656d.getViewTreeObserver().addOnPreDrawListener(this.f19659g);
        d1.g(this.f19656d, 4);
        if (this.f19656d.getParent() != null) {
            ((View) this.f19656d.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f19656d.getViewTreeObserver().removeOnPreDrawListener(this.f19659g);
        d1.g(this.f19656d, 0);
        g(this.f19656d, null);
        if (this.f19656d.getParent() != null) {
            ((View) this.f19656d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        c.a(canvas, true);
        canvas.setMatrix(this.f19658f);
        d1.g(this.f19656d, 0);
        this.f19656d.invalidate();
        d1.g(this.f19656d, 4);
        drawChild(canvas, this.f19656d, getDrawingTime());
        c.a(canvas, false);
    }

    @Override // android.view.View, androidx.transition.o
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (e(this.f19656d) == this) {
            d1.g(this.f19656d, i10 == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
