package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class ohk extends ViewGroup implements lhk {
    public static final /* synthetic */ int i = 0;
    public ViewGroup a;
    public View b;
    public final View c;
    public int d;
    public Matrix e;
    public final a f;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            ohk ohkVar = ohk.this;
            ohkVar.postInvalidateOnAnimation();
            ViewGroup viewGroup = ohkVar.a;
            if (viewGroup == null || (view = ohkVar.b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            ohkVar.a.postInvalidateOnAnimation();
            ohkVar.a = null;
            ohkVar.b = null;
            return true;
        }
    }

    public ohk(View view) {
        super(view.getContext());
        this.f = new a();
        this.c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // defpackage.lhk
    public final void a(View view, ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.c;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f);
        hai0.c(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f);
        hai0.c(view, 0);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        uc6.a(canvas, true);
        canvas.setMatrix(this.e);
        View view = this.c;
        hai0.c(view, 0);
        view.invalidate();
        hai0.c(view, 4);
        drawChild(canvas, view, getDrawingTime());
        uc6.a(canvas, false);
    }

    @Override // android.view.View, defpackage.lhk
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.c;
        if (((ohk) view.getTag(R.id.ghost_view)) == this) {
            hai0.c(view, i2 == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
