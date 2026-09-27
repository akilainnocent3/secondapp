package androidx.leanback.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class h extends FrameLayout {
    public static final int A = 2;
    public static final int B = 4;
    public static final int[] C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f12545s = "BaseCardView";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f12546t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f12547u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f12548v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12549w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f12550x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f12551y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f12552z = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<View> f12556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<View> f12557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<View> f12558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f12563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f12564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f12565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f12566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f12567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Animation f12568q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Runnable f12569r;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.c(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends Animation {
        public e() {
        }

        @k.h1
        public final void a() {
            applyTransformation(1.0f, null);
            h.this.f();
        }

        @k.h1
        public final void b() {
            getTransformation(0L, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class f extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f12575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f12576d;

        public f(float f10, float f11) {
            super();
            this.f12575c = f10;
            this.f12576d = f11 - f10;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            h.this.f12567p = this.f12575c + (f10 * this.f12576d);
            for (int i10 = 0; i10 < h.this.f12557f.size(); i10++) {
                h.this.f12557f.get(i10).setAlpha(h.this.f12567p);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class g extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f12578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f12579d;

        public g(float f10, float f11) {
            super();
            this.f12578c = f10;
            this.f12579d = f11 - f10;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            h hVar = h.this;
            hVar.f12566o = this.f12578c + (f10 * this.f12579d);
            hVar.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class C0084h extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f12581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f12582d;

        public C0084h(float f10, float f11) {
            super();
            this.f12581c = f10;
            this.f12582d = f11 - f10;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            h hVar = h.this;
            hVar.f12565n = this.f12581c + (f10 * this.f12582d);
            hVar.requestLayout();
        }
    }

    public h(Context context) {
        this(context, null);
    }

    private void setInfoViewVisibility(boolean z10) {
        int i10 = this.f12553b;
        if (i10 != 3) {
            if (i10 != 2) {
                if (i10 == 1) {
                    a(z10);
                    return;
                }
                return;
            } else {
                if (this.f12554c == 2) {
                    b(z10);
                    return;
                }
                for (int i11 = 0; i11 < this.f12557f.size(); i11++) {
                    this.f12557f.get(i11).setVisibility(z10 ? 0 : 8);
                }
                return;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < this.f12557f.size(); i12++) {
                this.f12557f.get(i12).setVisibility(0);
            }
            return;
        }
        for (int i13 = 0; i13 < this.f12557f.size(); i13++) {
            this.f12557f.get(i13).setVisibility(8);
        }
        for (int i14 = 0; i14 < this.f12558g.size(); i14++) {
            this.f12558g.get(i14).setVisibility(8);
        }
        this.f12565n = 0.0f;
    }

    public final void a(boolean z10) {
        f();
        if (z10) {
            for (int i10 = 0; i10 < this.f12557f.size(); i10++) {
                this.f12557f.get(i10).setVisibility(0);
            }
        }
        if ((z10 ? 1.0f : 0.0f) == this.f12567p) {
            return;
        }
        f fVar = new f(this.f12567p, z10 ? 1.0f : 0.0f);
        this.f12568q = fVar;
        fVar.setDuration(this.f12563l);
        this.f12568q.setInterpolator(new DecelerateInterpolator());
        this.f12568q.setAnimationListener(new d());
        startAnimation(this.f12568q);
    }

    public final void b(boolean z10) {
        f();
        if (z10) {
            for (int i10 = 0; i10 < this.f12557f.size(); i10++) {
                this.f12557f.get(i10).setVisibility(0);
            }
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (this.f12566o == f10) {
            return;
        }
        g gVar = new g(this.f12566o, f10);
        this.f12568q = gVar;
        gVar.setDuration(this.f12564m);
        this.f12568q.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f12568q.setAnimationListener(new c());
        startAnimation(this.f12568q);
    }

    public void c(boolean z10) {
        f();
        int i10 = 0;
        if (z10) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f12559h, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMax = 0;
            for (int i11 = 0; i11 < this.f12558g.size(); i11++) {
                View view = this.f12558g.get(i11);
                view.setVisibility(0);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredHeight());
            }
            i10 = iMax;
        }
        C0084h c0084h = new C0084h(this.f12565n, z10 ? i10 : 0.0f);
        this.f12568q = c0084h;
        c0084h.setDuration(this.f12564m);
        this.f12568q.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f12568q.setAnimationListener(new b());
        startAnimation(this.f12568q);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i;
    }

    public final void d() {
        int i10;
        if (l() && (i10 = this.f12554c) == 1) {
            setInfoViewVisibility(n(i10));
        }
    }

    public final void e(boolean z10) {
        removeCallbacks(this.f12569r);
        if (this.f12553b != 3) {
            if (this.f12554c == 2) {
                setInfoViewVisibility(z10);
            }
        } else if (!z10) {
            c(false);
        } else if (this.f12561j) {
            postDelayed(this.f12569r, this.f12562k);
        } else {
            post(this.f12569r);
            this.f12561j = true;
        }
    }

    public void f() {
        Animation animation = this.f12568q;
        if (animation != null) {
            animation.cancel();
            this.f12568q = null;
            clearAnimation();
        }
    }

    public final void g() {
        this.f12556e.clear();
        this.f12557f.clear();
        this.f12558g.clear();
        int childCount = getChildCount();
        boolean z10 = l() && m(this.f12554c);
        boolean z11 = k() && this.f12565n > 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                int i11 = ((i) childAt.getLayoutParams()).f12587a;
                if (i11 == 1) {
                    childAt.setAlpha(this.f12567p);
                    this.f12557f.add(childAt);
                    childAt.setVisibility(z10 ? 0 : 8);
                } else if (i11 == 2) {
                    this.f12558g.add(childAt);
                    childAt.setVisibility(z11 ? 0 : 8);
                } else {
                    this.f12556e.add(childAt);
                    childAt.setVisibility(0);
                }
            }
        }
    }

    public int getCardType() {
        return this.f12553b;
    }

    @Deprecated
    public int getExtraVisibility() {
        return this.f12555d;
    }

    public final float getFinalInfoAlpha() {
        return (this.f12553b == 1 && this.f12554c == 2 && !isSelected()) ? 0.0f : 1.0f;
    }

    public final float getFinalInfoVisFraction() {
        return (this.f12553b == 2 && this.f12554c == 2 && !isSelected()) ? 0.0f : 1.0f;
    }

    public int getInfoVisibility() {
        return this.f12554c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i generateDefaultLayoutParams() {
        return new i(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public i generateLayoutParams(AttributeSet attributeSet) {
        return new i(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public i generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i ? new i((i) layoutParams) : new i(layoutParams);
    }

    public final boolean k() {
        return this.f12553b == 3;
    }

    public final boolean l() {
        return this.f12553b != 0;
    }

    public final boolean m(int i10) {
        if (i10 == 0) {
            return true;
        }
        if (i10 == 1) {
            return isActivated();
        }
        if (i10 != 2) {
            return false;
        }
        if (this.f12553b == 2) {
            return this.f12566o > 0.0f;
        }
        return isSelected();
    }

    public final boolean n(int i10) {
        if (i10 == 0) {
            return true;
        }
        if (i10 == 1) {
            return isActivated();
        }
        if (i10 != 2) {
            return false;
        }
        return isSelected();
    }

    public boolean o() {
        return this.f12561j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 : super.onCreateDrawableState(i10)) {
            if (i11 == 16842919) {
                z10 = true;
            }
            if (i11 == 16842910) {
                z11 = true;
            }
        }
        if (z10 && z11) {
            return View.PRESSED_ENABLED_STATE_SET;
        }
        if (z10) {
            return C;
        }
        return z11 ? View.ENABLED_STATE_SET : View.EMPTY_STATE_SET;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f12569r);
        f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < this.f12556e.size(); i14++) {
            View view = this.f12556e.get(i14);
            if (view.getVisibility() != 8) {
                view.layout(getPaddingLeft(), (int) paddingTop, this.f12559h + getPaddingLeft(), (int) (view.getMeasuredHeight() + paddingTop));
                paddingTop += view.getMeasuredHeight();
            }
        }
        if (l()) {
            float measuredHeight = 0.0f;
            for (int i15 = 0; i15 < this.f12557f.size(); i15++) {
                measuredHeight += this.f12557f.get(i15).getMeasuredHeight();
            }
            int i16 = this.f12553b;
            if (i16 == 1) {
                paddingTop -= measuredHeight;
                if (paddingTop < 0.0f) {
                    paddingTop = 0.0f;
                }
            } else if (i16 != 2) {
                paddingTop -= this.f12565n;
            } else if (this.f12554c == 2) {
                measuredHeight *= this.f12566o;
            }
            for (int i17 = 0; i17 < this.f12557f.size(); i17++) {
                View view2 = this.f12557f.get(i17);
                if (view2.getVisibility() != 8) {
                    int measuredHeight2 = view2.getMeasuredHeight();
                    if (measuredHeight2 > measuredHeight) {
                        measuredHeight2 = (int) measuredHeight;
                    }
                    float f10 = measuredHeight2;
                    paddingTop += f10;
                    view2.layout(getPaddingLeft(), (int) paddingTop, this.f12559h + getPaddingLeft(), (int) paddingTop);
                    measuredHeight -= f10;
                    if (measuredHeight <= 0.0f) {
                        break;
                    }
                }
            }
            if (k()) {
                for (int i18 = 0; i18 < this.f12558g.size(); i18++) {
                    View view3 = this.f12558g.get(i18);
                    if (view3.getVisibility() != 8) {
                        view3.layout(getPaddingLeft(), (int) paddingTop, this.f12559h + getPaddingLeft(), (int) (view3.getMeasuredHeight() + paddingTop));
                        paddingTop += view3.getMeasuredHeight();
                    }
                }
            }
        }
        onSizeChanged(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        int measuredHeight2;
        boolean z10 = false;
        this.f12559h = 0;
        this.f12560i = 0;
        g();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int measuredHeight3 = 0;
        int iCombineMeasuredStates = 0;
        for (int i12 = 0; i12 < this.f12556e.size(); i12++) {
            View view = this.f12556e.get(i12);
            if (view.getVisibility() != 8) {
                measureChild(view, iMakeMeasureSpec, iMakeMeasureSpec);
                this.f12559h = Math.max(this.f12559h, view.getMeasuredWidth());
                measuredHeight3 += view.getMeasuredHeight();
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
            }
        }
        setPivotX(this.f12559h / 2);
        setPivotY(measuredHeight3 / 2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f12559h, 1073741824);
        if (l()) {
            measuredHeight = 0;
            for (int i13 = 0; i13 < this.f12557f.size(); i13++) {
                View view2 = this.f12557f.get(i13);
                if (view2.getVisibility() != 8) {
                    measureChild(view2, iMakeMeasureSpec2, iMakeMeasureSpec);
                    if (this.f12553b != 1) {
                        measuredHeight += view2.getMeasuredHeight();
                    }
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                }
            }
            if (k()) {
                measuredHeight2 = 0;
                for (int i14 = 0; i14 < this.f12558g.size(); i14++) {
                    View view3 = this.f12558g.get(i14);
                    if (view3.getVisibility() != 8) {
                        measureChild(view3, iMakeMeasureSpec2, iMakeMeasureSpec);
                        measuredHeight2 += view3.getMeasuredHeight();
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                    }
                }
            } else {
                measuredHeight2 = 0;
            }
        } else {
            measuredHeight = 0;
            measuredHeight2 = 0;
        }
        if (l() && this.f12554c == 2) {
            z10 = true;
        }
        float f10 = measuredHeight3;
        float f11 = measuredHeight;
        if (z10) {
            f11 *= this.f12566o;
        }
        this.f12560i = (int) (((f10 + f11) + measuredHeight2) - (z10 ? 0.0f : this.f12565n));
        setMeasuredDimension(View.resolveSizeAndState(this.f12559h + getPaddingLeft() + getPaddingRight(), i10, iCombineMeasuredStates), View.resolveSizeAndState(this.f12560i + getPaddingTop() + getPaddingBottom(), i11, iCombineMeasuredStates << 16));
    }

    @Override // android.view.View
    public void setActivated(boolean z10) {
        if (z10 != isActivated()) {
            super.setActivated(z10);
            d();
        }
    }

    public void setCardType(int i10) {
        if (this.f12553b != i10) {
            if (i10 < 0 || i10 >= 4) {
                Log.e(f12545s, "Invalid card type specified: " + i10 + ". Defaulting to type CARD_TYPE_MAIN_ONLY.");
                this.f12553b = 0;
            } else {
                this.f12553b = i10;
            }
            requestLayout();
        }
    }

    @Deprecated
    public void setExtraVisibility(int i10) {
        if (this.f12555d != i10) {
            this.f12555d = i10;
        }
    }

    public void setInfoVisibility(int i10) {
        if (this.f12554c != i10) {
            f();
            this.f12554c = i10;
            this.f12566o = getFinalInfoVisFraction();
            requestLayout();
            float finalInfoAlpha = getFinalInfoAlpha();
            if (finalInfoAlpha != this.f12567p) {
                this.f12567p = finalInfoAlpha;
                for (int i11 = 0; i11 < this.f12557f.size(); i11++) {
                    this.f12557f.get(i11).setAlpha(this.f12567p);
                }
            }
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        if (z10 != isSelected()) {
            super.setSelected(z10);
            e(isSelected());
        }
    }

    public void setSelectedAnimationDelayed(boolean z10) {
        this.f12561j = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public String toString() {
        return super.toString();
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s3.a.c.f128411e);
    }

    @SuppressLint({"CustomViewStyleable"})
    public h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12569r = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s3.a.n.N1, i10, 0);
        try {
            this.f12553b = typedArrayObtainStyledAttributes.getInteger(s3.a.n.R1, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(s3.a.n.Q1);
            if (drawable != null) {
                setForeground(drawable);
            }
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(s3.a.n.P1);
            if (drawable2 != null) {
                setBackground(drawable2);
            }
            this.f12554c = typedArrayObtainStyledAttributes.getInteger(s3.a.n.T1, 1);
            int integer = typedArrayObtainStyledAttributes.getInteger(s3.a.n.S1, 2);
            this.f12555d = integer;
            int i11 = this.f12554c;
            if (integer < i11) {
                this.f12555d = i11;
            }
            this.f12562k = typedArrayObtainStyledAttributes.getInteger(s3.a.n.U1, getResources().getInteger(s3.a.i.f128795e));
            this.f12564m = typedArrayObtainStyledAttributes.getInteger(s3.a.n.V1, getResources().getInteger(s3.a.i.f128796f));
            this.f12563l = typedArrayObtainStyledAttributes.getInteger(s3.a.n.O1, getResources().getInteger(s3.a.i.f128794d));
            typedArrayObtainStyledAttributes.recycle();
            this.f12561j = true;
            this.f12556e = new ArrayList<>();
            this.f12557f = new ArrayList<>();
            this.f12558g = new ArrayList<>();
            this.f12565n = 0.0f;
            this.f12566o = getFinalInfoVisFraction();
            this.f12567p = getFinalInfoAlpha();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f12584b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12585c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f12586d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty(category = "layout", mapping = {@ViewDebug.IntToString(from = 0, to = "MAIN"), @ViewDebug.IntToString(from = 1, to = "INFO"), @ViewDebug.IntToString(from = 2, to = "EXTRA")})
        public int f12587a;

        @SuppressLint({"CustomViewStyleable"})
        public i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12587a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s3.a.n.W1);
            this.f12587a = typedArrayObtainStyledAttributes.getInt(s3.a.n.X1, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public i(int i10, int i11) {
            super(i10, i11);
            this.f12587a = 0;
        }

        public i(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12587a = 0;
        }

        public i(i iVar) {
            super((ViewGroup.MarginLayoutParams) iVar);
            this.f12587a = 0;
            this.f12587a = iVar.f12587a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (h.this.f12565n == 0.0f) {
                for (int i10 = 0; i10 < h.this.f12558g.size(); i10++) {
                    h.this.f12558g.get(i10).setVisibility(8);
                }
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (h.this.f12566o == 0.0f) {
                for (int i10 = 0; i10 < h.this.f12557f.size(); i10++) {
                    h.this.f12557f.get(i10).setVisibility(8);
                }
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Animation.AnimationListener {
        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (h.this.f12567p == 0.0d) {
                for (int i10 = 0; i10 < h.this.f12557f.size(); i10++) {
                    h.this.f12557f.get(i10).setVisibility(8);
                }
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
