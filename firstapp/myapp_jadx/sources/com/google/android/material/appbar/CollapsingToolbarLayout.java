package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.sportybet.android.gp.tz.R;
import defpackage.cdv;
import defpackage.dj0;
import defpackage.ecv;
import defpackage.f6w;
import defpackage.g9i0;
import defpackage.gof0;
import defpackage.hxa;
import defpackage.iyd0;
import defpackage.jwf;
import defpackage.l8j0;
import defpackage.pae;
import defpackage.pk30;
import defpackage.q38;
import defpackage.r38;
import defpackage.r6i0;
import defpackage.tcv;
import defpackage.vbv;
import defpackage.x8i0;
import defpackage.zmy;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public final q38 A;
    public final q38 B;
    public final jwf C;
    public boolean D;
    public boolean E;
    public final int F;
    public Drawable G;
    public Drawable H;
    public int I;
    public boolean J;
    public ValueAnimator K;
    public long L;
    public final TimeInterpolator M;
    public final TimeInterpolator N;
    public int O;
    public b P;
    public int Q;
    public int R;
    public int S;
    public l8j0 T;
    public int U;
    public boolean V;
    public int W;
    public boolean a;
    public int a0;
    public final int b;
    public boolean b0;
    public ViewGroup c;
    public int c0;
    public View d;
    public View e;
    public int f;
    public int i;
    public int v;
    public int w;
    public int y;
    public final Rect z;

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public int a;
        public float b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            this.b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pk30.o);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            this.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements zmy {
        public a() {
        }

        @Override // defpackage.zmy
        public final l8j0 b(View view, l8j0 l8j0Var) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            l8j0 l8j0Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? l8j0Var : null;
            if (!Objects.equals(collapsingToolbarLayout.T, l8j0Var2)) {
                collapsingToolbarLayout.T = l8j0Var2;
                collapsingToolbarLayout.requestLayout();
            }
            return l8j0Var.a.c();
        }
    }

    public class b implements AppBarLayout.g {
        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void a(int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            q38 q38Var = collapsingToolbarLayout.B;
            q38 q38Var2 = collapsingToolbarLayout.A;
            collapsingToolbarLayout.Q = i;
            l8j0 l8j0Var = collapsingToolbarLayout.T;
            int iD = l8j0Var != null ? l8j0Var.d() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = collapsingToolbarLayout.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                x8i0 x8i0VarB = CollapsingToolbarLayout.b(childAt);
                int i3 = layoutParams.a;
                if (i3 == 1) {
                    x8i0VarB.b(cdv.b(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).bottomMargin));
                } else if (i3 == 2) {
                    x8i0VarB.b(Math.round((-i) * layoutParams.b));
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.H != null && iD > 0) {
                collapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height = collapsingToolbarLayout.getHeight();
            int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iD;
            int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
            int i4 = collapsingToolbarLayout.Q + minimumHeight;
            float f = minimumHeight;
            float fAbs = Math.abs(i) / f;
            float f2 = scrimVisibleHeightTrigger / f;
            float fMin = Math.min(1.0f, f2);
            q38Var2.d = fMin;
            q38Var2.e = hxa.a(1.0f, fMin, 0.5f, fMin);
            q38Var2.f = i4;
            q38Var2.A(fAbs);
            float fMin2 = Math.min(1.0f, f2);
            q38Var.d = fMin2;
            q38Var.e = hxa.a(1.0f, fMin2, 0.5f, fMin2);
            q38Var.f = i4;
            q38Var.A(fAbs);
        }
    }

    public interface c extends iyd0 {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        super(tcv.a(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        this.a = true;
        this.z = new Rect();
        this.O = -1;
        this.U = 0;
        this.W = 0;
        this.a0 = 0;
        this.c0 = 0;
        Context context2 = getContext();
        this.R = getResources().getConfiguration().orientation;
        q38 q38Var = new q38(this);
        this.A = q38Var;
        DecelerateInterpolator decelerateInterpolator = dj0.e;
        q38Var.X = decelerateInterpolator;
        q38Var.l(false);
        q38Var.K = false;
        this.C = new jwf(context2);
        gof0.a(context2, attributeSet, i, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = pk30.n;
        gof0.b(context2, attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar);
        int i2 = typedArrayObtainStyledAttributes.getInt(9, 8388691);
        int i3 = typedArrayObtainStyledAttributes.getInt(2, 8388627);
        this.F = typedArrayObtainStyledAttributes.getInt(3, 1);
        q38Var.x(i2);
        q38Var.s(i3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.w = dimensionPixelSize;
        this.v = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(28, true);
        setTitle(typedArrayObtainStyledAttributes.getText(26));
        q38Var.w(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        q38Var.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            q38Var.w(typedArrayObtainStyledAttributes.getResourceId(16, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            q38Var.q(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(31)) {
            int i4 = typedArrayObtainStyledAttributes.getInt(31, -1);
            setTitleEllipsize(i4 != 0 ? i4 != 1 ? i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17) && q38Var.o != (colorStateListA2 = ecv.a(17, context2, typedArrayObtainStyledAttributes))) {
            q38Var.o = colorStateListA2;
            q38Var.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            q38Var.r(ecv.a(5, context2, typedArrayObtainStyledAttributes));
        }
        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (typedArrayObtainStyledAttributes.hasValue(29)) {
            q38Var.v(typedArrayObtainStyledAttributes.getInt(29, 1));
        } else if (typedArrayObtainStyledAttributes.hasValue(20)) {
            q38Var.v(typedArrayObtainStyledAttributes.getInt(20, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            q38Var.W = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0));
            q38Var.l(false);
        }
        q38 q38Var2 = new q38(this);
        this.B = q38Var2;
        q38Var2.X = decelerateInterpolator;
        q38Var2.l(false);
        q38Var2.K = false;
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            setSubtitle(typedArrayObtainStyledAttributes.getText(24));
        }
        q38Var2.x(i2);
        q38Var2.s(i3);
        q38Var2.w(R.style.TextAppearance_AppCompat_Headline);
        q38Var2.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            q38Var2.w(typedArrayObtainStyledAttributes.getResourceId(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            q38Var2.q(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8) && q38Var2.o != (colorStateListA = ecv.a(8, context2, typedArrayObtainStyledAttributes))) {
            q38Var2.o = colorStateListA;
            q38Var2.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            q38Var2.r(ecv.a(1, context2, typedArrayObtainStyledAttributes));
        }
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            q38Var2.v(typedArrayObtainStyledAttributes.getInt(25, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            q38Var2.W = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0));
            q38Var2.l(false);
        }
        this.L = typedArrayObtainStyledAttributes.getInt(21, 600);
        this.M = f6w.c(context2, R.attr.motionEasingStandardInterpolator, dj0.c);
        this.N = f6w.c(context2, R.attr.motionEasingStandardInterpolator, dj0.d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(6));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(23));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(27, 0));
        this.b = typedArrayObtainStyledAttributes.getResourceId(32, -1);
        this.V = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.b0 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        a aVar = new a();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(this, aVar);
    }

    public static x8i0 b(View view) {
        x8i0 x8i0Var = (x8i0) view.getTag(R.id.view_offset_helper);
        if (x8i0Var != null) {
            return x8i0Var;
        }
        x8i0 x8i0Var2 = new x8i0(view);
        view.setTag(R.id.view_offset_helper, x8i0Var2);
        return x8i0Var2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListE = vbv.e(getContext(), R.attr.colorSurfaceContainer);
        if (colorStateListE != null) {
            return colorStateListE.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        jwf jwfVar = this.C;
        return jwfVar.a(jwfVar.d, dimension);
    }

    public final void a() {
        View view;
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.D && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.D || this.c == null) {
            return;
        }
        View view2 = this.e;
        if (view2 == null) {
            view2 = new View(getContext());
            this.e = view2;
        }
        if (view2.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        if (this.G == null && this.H == null) {
            return;
        }
        setScrimsShown(getHeight() + this.Q < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.G) != null && this.I > 0) {
            drawable.mutate().setAlpha(this.I);
            this.G.draw(canvas);
        }
        if (this.D && this.E) {
            ViewGroup viewGroup = this.c;
            q38 q38Var = this.B;
            q38 q38Var2 = this.A;
            if (viewGroup == null || this.G == null || this.I <= 0 || this.S != 1 || q38Var2.b >= q38Var2.e) {
                q38Var2.f(canvas);
                q38Var.f(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.G.getBounds(), Region.Op.DIFFERENCE);
                q38Var2.f(canvas);
                q38Var.f(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.H == null || this.I <= 0) {
            return;
        }
        l8j0 l8j0Var = this.T;
        int iD = l8j0Var != null ? l8j0Var.d() : 0;
        if (iD > 0) {
            this.H.setBounds(0, -this.Q, getWidth(), iD - this.Q);
            this.H.mutate().setAlpha(this.I);
            this.H.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.G;
        if (drawable == null || this.I <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.S == 1 && view != null && this.D) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.G.mutate().setAlpha(this.I);
            this.G.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.G;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        q38 q38Var = this.A;
        if (q38Var != null) {
            q38Var.S = drawableState;
            ColorStateList colorStateList2 = q38Var.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = q38Var.o) != null && colorStateList.isStateful())) {
                q38Var.l(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.D || (view = this.e) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.e.getVisibility() == 0;
        this.E = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
            View view3 = this.e;
            Rect rect = this.z;
            pae.a(this, view3, rect);
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.right - (z3 ? titleMarginStart : titleMarginEnd);
            int i7 = rect.top + height + titleMarginTop;
            int i8 = (rect.bottom + height) - titleMarginBottom;
            q38 q38Var = this.B;
            TextPaint textPaint = q38Var.V;
            textPaint.setTextSize(q38Var.n);
            textPaint.setTypeface(q38Var.x);
            textPaint.setLetterSpacing(q38Var.g0);
            int iDescent = (int) (i8 - (textPaint.descent() + (-textPaint.ascent())));
            q38 q38Var2 = this.A;
            TextPaint textPaint2 = q38Var2.V;
            textPaint2.setTextSize(q38Var2.n);
            textPaint2.setTypeface(q38Var2.x);
            textPaint2.setLetterSpacing(q38Var2.g0);
            int iDescent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i7);
            if (TextUtils.isEmpty(q38Var.H)) {
                q38Var2.o(i5, i7, i6, i8);
            } else {
                q38Var2.o(i5, i7, i6, iDescent);
                q38Var.o(i5, iDescent2, i6, i8);
            }
            if (this.F == 0) {
                pae.a(this, this, rect);
                int i9 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
                int i10 = rect.right;
                if (!z3) {
                    titleMarginStart = titleMarginEnd;
                }
                int i11 = i10 - titleMarginStart;
                if (TextUtils.isEmpty(q38Var.H)) {
                    q38Var2.p(i9, i7, i11, i8);
                } else {
                    q38Var2.p(i9, i7, i11, iDescent);
                    q38Var.p(i9, iDescent2, i11, i8);
                }
            }
            int i12 = z3 ? this.v : this.f;
            int i13 = rect.top + this.i;
            int i14 = (i3 - i) - (z3 ? this.f : this.v);
            int i15 = (i4 - i2) - this.w;
            boolean zIsEmpty = TextUtils.isEmpty(q38Var.H);
            q38 q38Var3 = this.A;
            if (zIsEmpty) {
                q38Var3.u(true, i12, i13, i14, i15);
                q38Var2.l(z);
            } else {
                q38Var3.u(false, i12, i13, i14, (int) ((i15 - (q38Var.i() + this.a0)) - this.y));
                this.B.u(false, i12, (int) (q38Var2.i() + this.W + i13 + this.y), i14, i15);
                q38Var2.l(z);
                q38Var.l(z);
            }
        }
    }

    public final void f() {
        CharSequence title;
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || !this.D) {
            return;
        }
        CharSequence subtitle = null;
        if (viewGroup instanceof Toolbar) {
            title = ((Toolbar) viewGroup).getTitle();
        } else {
            title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        }
        if (TextUtils.isEmpty(this.A.H) && !TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 instanceof Toolbar) {
            subtitle = ((Toolbar) viewGroup2).getSubtitle();
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            subtitle = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.B.H) || TextUtils.isEmpty(subtitle)) {
            return;
        }
        setSubtitle(subtitle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = 0;
        layoutParams.b = 0.5f;
        return layoutParams;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.a = 0;
        layoutParams2.b = 0.5f;
        return layoutParams2;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.B.n;
    }

    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.B.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.A.l;
    }

    public float getCollapsedTitleTextSize() {
        return this.A.n;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.G;
    }

    public float getExpandedSubtitleTextSize() {
        return this.B.m;
    }

    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.B.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.A.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.w;
    }

    public int getExpandedTitleMarginEnd() {
        return this.v;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.i;
    }

    public int getExpandedTitleSpacing() {
        return this.y;
    }

    public float getExpandedTitleTextSize() {
        return this.A.m;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.A.s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.A.j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.A.j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.A.j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.A.o0;
    }

    public int getScrimAlpha() {
        return this.I;
    }

    public long getScrimAnimationDuration() {
        return this.L;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.O;
        if (i >= 0) {
            return i + this.U + this.W + this.a0 + this.c0;
        }
        l8j0 l8j0Var = this.T;
        int iD = l8j0Var != null ? l8j0Var.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.H;
    }

    public CharSequence getSubtitle() {
        if (this.D) {
            return this.B.H;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.D) {
            return this.A.H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.S;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.A.W;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.A.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.S == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            b bVar = this.P;
            if (bVar == null) {
                bVar = new b();
                this.P = bVar;
            }
            appBarLayout.a(bVar);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q38 q38Var = this.A;
        q38Var.k(configuration);
        if (this.R != configuration.orientation && this.b0 && q38Var.b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.R = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        b bVar = this.P;
        if (bVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).v) != null) {
            arrayList.remove(bVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        l8j0 l8j0Var = this.T;
        if (l8j0Var != null) {
            int iD = l8j0Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            x8i0 x8i0VarB = b(getChildAt(i6));
            View view = x8i0VarB.a;
            x8i0VarB.b = view.getTop();
            x8i0VarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        l8j0 l8j0Var = this.T;
        int iD = l8j0Var != null ? l8j0Var.d() : 0;
        if ((mode == 0 || this.V) && iD > 0) {
            this.U = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        f();
        if (this.D) {
            q38 q38Var = this.A;
            if (TextUtils.isEmpty(q38Var.H)) {
                collapsingToolbarLayout = this;
            } else {
                int measuredHeight3 = getMeasuredHeight();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(true, 0, 0, getMeasuredWidth(), measuredHeight3);
                float fI = q38Var.i() + collapsingToolbarLayout.U + collapsingToolbarLayout.i;
                q38 q38Var2 = collapsingToolbarLayout.B;
                int i3 = (int) (fI + (TextUtils.isEmpty(q38Var2.H) ? 0.0f : collapsingToolbarLayout.y + q38Var2.i()) + collapsingToolbarLayout.w);
                if (i3 > measuredHeight3) {
                    collapsingToolbarLayout.c0 = i3 - measuredHeight3;
                } else {
                    collapsingToolbarLayout.c0 = 0;
                }
                if (collapsingToolbarLayout.b0) {
                    if (q38Var.o0 > 1) {
                        int i4 = q38Var.q;
                        if (i4 > 1) {
                            collapsingToolbarLayout.W = (i4 - 1) * Math.round(q38Var.i());
                        } else {
                            collapsingToolbarLayout.W = 0;
                        }
                    }
                    if (q38Var2.o0 > 1) {
                        int i5 = q38Var2.q;
                        if (i5 > 1) {
                            collapsingToolbarLayout.a0 = (i5 - 1) * Math.round(q38Var2.i());
                        } else {
                            collapsingToolbarLayout.a0 = 0;
                        }
                    }
                }
                int i6 = collapsingToolbarLayout.c0;
                int i7 = collapsingToolbarLayout.W;
                int i8 = collapsingToolbarLayout.a0;
                if (i6 + i7 + i8 > 0) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight3 + i6 + i7 + i8, 1073741824));
                }
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.d;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            collapsingToolbarLayout.setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.G;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.S == 1 && viewGroup != null && this.D) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.B.q(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f) {
        q38 q38Var = this.B;
        if (q38Var.n != f) {
            q38Var.n = f;
            q38Var.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        q38 q38Var = this.B;
        if (q38Var.t(typeface)) {
            q38Var.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.A.s(i);
        this.B.s(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A.q(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        q38 q38Var = this.A;
        if (q38Var.n != f) {
            q38Var.n = f;
            q38Var.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        q38 q38Var = this.A;
        if (q38Var.t(typeface)) {
            q38Var.l(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.G = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.S == 1 && viewGroup != null && this.D) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.G.setCallback(this);
                this.G.setAlpha(this.I);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.B.w(i);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        q38 q38Var = this.B;
        if (q38Var.o != colorStateList) {
            q38Var.o = colorStateList;
            q38Var.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f) {
        this.B.y(f);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        q38 q38Var = this.B;
        if (q38Var.z(typeface)) {
            q38Var.l(false);
        }
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.A.x(i);
        this.B.x(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f = i;
        this.i = i2;
        this.v = i3;
        this.w = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.w = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.v = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.y = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A.w(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        q38 q38Var = this.A;
        if (q38Var.o != colorStateList) {
            q38Var.o = colorStateList;
            q38Var.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        this.A.y(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        q38 q38Var = this.A;
        if (q38Var.z(typeface)) {
            q38Var.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.b0 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.V = z;
    }

    public void setHyphenationFrequency(int i) {
        this.A.s0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.A.q0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.A.r0 = f;
    }

    public void setMaxLines(int i) {
        this.A.v(i);
        this.B.v(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.A.K = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.I) {
            if (this.G != null && (viewGroup = this.c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.I = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.L = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.O != i) {
            this.O = i;
            d();
        }
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.J != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.K;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.K = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.I ? this.M : this.N);
                    this.K.addUpdateListener(new r38(this));
                } else if (valueAnimator.isRunning()) {
                    this.K.cancel();
                }
                this.K.setDuration(this.L);
                this.K.setIntValues(this.I, i);
                this.K.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.J = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(c cVar) {
        q38 q38Var = this.A;
        q38Var.getClass();
        if (cVar != null) {
            q38Var.l(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.H;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.H = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.H.setState(getDrawableState());
                }
                this.H.setLayoutDirection(getLayoutDirection());
                this.H.setVisible(getVisibility() == 0, false);
                this.H.setCallback(this);
                this.H.setAlpha(this.I);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.B.B(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.A.B(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.S = i;
        boolean z = i == 1;
        this.A.c = z;
        this.B.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.S == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.G == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        q38 q38Var = this.A;
        q38Var.G = truncateAt;
        q38Var.l(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.D) {
            this.D = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        q38 q38Var = this.A;
        q38Var.W = timeInterpolator;
        q38Var.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.H;
        if (drawable != null && drawable.isVisible() != z) {
            this.H.setVisible(z, false);
        }
        Drawable drawable2 = this.G;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.G.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G || drawable == this.H;
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.B.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.A.r(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = 0;
        layoutParams.b = 0.5f;
        return layoutParams;
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, isLaidOut() && !isInEditMode());
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
