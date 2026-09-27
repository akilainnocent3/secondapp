package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mq extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final og0 f152601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij1 f152602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f152604d;

    public mq(Context context, og0 og0Var, ij1 ij1Var) {
        super(context);
        this.f152601a = og0Var;
        this.f152602b = ij1Var;
        og0Var.getClass();
        this.f152603c = og0.a(context, 0.5f);
        this.f152604d = new Paint();
        a(context);
    }

    public final void a(Context context) {
        this.f152601a.getClass();
        int iA = og0.a(context, 1.0f);
        this.f152604d.setStyle(Paint.Style.STROKE);
        this.f152604d.setStrokeWidth(iA);
        this.f152604d.setColor(p1.a.f120313c);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f152603c;
        canvas.drawRect(f10, f10, getWidth() - this.f152603c, getHeight() - this.f152603c, this.f152604d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z10, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f152602b.a(i10, i11);
        super.onMeasure(hj1VarA.f150155a, hj1VarA.f150156b);
    }

    public final void setColor(int i10) {
        if (this.f152604d.getColor() != i10) {
            this.f152604d.setColor(i10);
            requestLayout();
        }
    }
}
