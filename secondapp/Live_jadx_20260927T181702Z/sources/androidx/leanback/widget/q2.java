package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class q2 extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f12930l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f12931m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f12932n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Rect f12933o = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f12936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f12942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12943k;

    public q2(Context context) {
        this(context, null, 0);
    }

    public static void d(ViewGroup viewGroup) {
        y2.b(viewGroup);
    }

    public static boolean e() {
        return o2.c();
    }

    public static boolean f() {
        return y2.d();
    }

    public void a(int i10, boolean z10, int i11) {
        if (this.f12934b) {
            throw new IllegalStateException();
        }
        this.f12934b = true;
        this.f12941i = i11;
        this.f12937e = i11 > 0;
        this.f12938f = i10;
        if (i10 == 2) {
            this.f12935c = y2.a(this);
        } else if (i10 == 3) {
            this.f12935c = o2.a(this, this.f12939g, this.f12940h, i11);
        }
        if (!z10) {
            setWillNotDraw(true);
            this.f12942j = null;
            return;
        }
        setWillNotDraw(false);
        this.f12943k = 0;
        Paint paint = new Paint();
        this.f12942j = paint;
        paint.setColor(this.f12943k);
        this.f12942j.setStyle(Paint.Style.FILL);
    }

    @Deprecated
    public void b(boolean z10, boolean z11) {
        c(z10, z11, true);
    }

    @Deprecated
    public void c(boolean z10, boolean z11, boolean z12) {
        a(!z10 ? 1 : this.f12938f, z11, z12 ? getContext().getResources().getDimensionPixelSize(s3.a.e.f128534b3) : 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f12942j == null || this.f12943k == 0) {
            return;
        }
        canvas.drawRect(this.f12936d.getLeft(), this.f12936d.getTop(), this.f12936d.getRight(), this.f12936d.getBottom(), this.f12942j);
    }

    public void g() {
        h(getResources().getDimension(s3.a.e.N1), getResources().getDimension(s3.a.e.M1));
    }

    public int getShadowType() {
        return this.f12938f;
    }

    public View getWrappedView() {
        return this.f12936d;
    }

    public void h(float f10, float f11) {
        if (this.f12934b) {
            throw new IllegalStateException("Already initialized");
        }
        if (e()) {
            this.f12938f = 3;
            this.f12939g = f10;
            this.f12940h = f11;
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void i() {
        if (this.f12934b) {
            throw new IllegalStateException("Already initialized");
        }
        if (f()) {
            this.f12938f = 2;
        }
    }

    public void j(View view) {
        if (!this.f12934b || this.f12936d != null) {
            throw new IllegalStateException();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams.width = layoutParams.width == -1 ? -1 : -2;
            layoutParams.height = layoutParams.height == -1 ? -1 : -2;
            setLayoutParams(layoutParams);
            addView(view, layoutParams2);
        } else {
            addView(view);
        }
        if (this.f12937e && this.f12938f != 3) {
            f2.a(this, true);
        }
        this.f12936d = view;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || (view = this.f12936d) == null) {
            return;
        }
        Rect rect = f12933o;
        rect.left = (int) view.getPivotX();
        rect.top = (int) this.f12936d.getPivotY();
        offsetDescendantRectToMyCoords(this.f12936d, rect);
        setPivotX(rect.left);
        setPivotY(rect.top);
    }

    public void setOverlayColor(@k.k int i10) {
        Paint paint = this.f12942j;
        if (paint == null || i10 == this.f12943k) {
            return;
        }
        this.f12943k = i10;
        paint.setColor(i10);
        invalidate();
    }

    public void setShadowFocusLevel(float f10) {
        Object obj = this.f12935c;
        if (obj != null) {
            r2.m(obj, this.f12938f, f10);
        }
    }

    public q2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12938f = 1;
        i();
        g();
    }

    public q2(Context context, int i10, boolean z10, float f10, float f11, int i11) {
        super(context);
        this.f12938f = 1;
        this.f12939g = f10;
        this.f12940h = f11;
        a(i10, z10, i11);
    }
}
