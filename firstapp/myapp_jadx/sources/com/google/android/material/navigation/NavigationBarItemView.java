package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.a;
import com.google.android.material.internal.BaselineLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import defpackage.bbv;
import defpackage.bkx;
import defpackage.c7;
import defpackage.dj0;
import defpackage.dl30;
import defpackage.e0g0;
import defpackage.ecv;
import defpackage.f6w;
import defpackage.ujx;
import defpackage.yt50;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NavigationBarItemView extends FrameLayout implements bkx {
    public float A;
    public float B;
    public int C;
    public boolean D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final View G;
    public final FrameLayout H;
    public final ImageView I;
    public final BaselineLayout J;
    public final TextView K;
    public final TextView L;
    public final BaselineLayout M;
    public final TextView N;
    public final TextView O;
    public BaselineLayout P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public ColorStateList V;
    public boolean W;
    public boolean a;
    public h a0;
    public ColorStateList b;
    public ColorStateList b0;
    public Drawable c;
    public Drawable c0;
    public int d;
    public Drawable d0;
    public int e;
    public ValueAnimator e0;
    public int f;
    public b f0;
    public float g0;
    public boolean h0;
    public int i;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public int n0;
    public int o0;
    public com.google.android.material.badge.a p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public boolean u0;
    public float v;
    public boolean v0;
    public float w;
    public boolean w0;
    public Rect x0;
    public float y;
    public float z;
    public static final int[] y0 = {R.attr.state_checked};
    public static final b z0 = new b();
    public static final c A0 = new c();

    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NavigationBarItemView.this.j(this.a);
        }
    }

    public static class b {
        public float a(float f) {
            return 1.0f;
        }
    }

    public static class c extends b {
        @Override // com.google.android.material.navigation.NavigationBarItemView.b
        public final float a(float f) {
            return dj0.a(0.4f, 1.0f, f);
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.a = false;
        this.Q = -1;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.W = false;
        this.f0 = z0;
        this.g0 = 0.0f;
        this.h0 = false;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = -2;
        this.l0 = 0;
        this.m0 = false;
        this.n0 = 0;
        this.o0 = 0;
        this.r0 = 0;
        this.s0 = 49;
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.w0 = false;
        this.x0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.E = (LinearLayout) findViewById(com.sportybet.android.gp.tz.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.sportybet.android.gp.tz.R.id.navigation_bar_item_inner_content_container);
        this.F = linearLayout;
        this.G = findViewById(com.sportybet.android.gp.tz.R.id.navigation_bar_item_active_indicator_view);
        this.H = (FrameLayout) findViewById(com.sportybet.android.gp.tz.R.id.navigation_bar_item_icon_container);
        this.I = (ImageView) findViewById(com.sportybet.android.gp.tz.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.sportybet.android.gp.tz.R.id.navigation_bar_item_labels_group);
        this.J = baselineLayout;
        TextView textView = (TextView) findViewById(com.sportybet.android.gp.tz.R.id.navigation_bar_item_small_label_view);
        this.K = textView;
        TextView textView2 = (TextView) findViewById(com.sportybet.android.gp.tz.R.id.navigation_bar_item_large_label_view);
        this.L = textView2;
        float dimension = getResources().getDimension(com.sportybet.android.gp.tz.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.sportybet.android.gp.tz.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.M = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.M.setDuplicateParentStateEnabled(true);
        this.M.setMeasurePaddingFromBaseline(this.v0);
        TextView textView3 = new TextView(getContext());
        this.N = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.N;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.N.setDuplicateParentStateEnabled(true);
        this.N.setIncludeFontPadding(false);
        this.N.setGravity(16);
        this.N.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.O = textView5;
        textView5.setMaxLines(1);
        this.O.setEllipsize(truncateAt);
        this.O.setDuplicateParentStateEnabled(true);
        this.O.setVisibility(4);
        this.O.setIncludeFontPadding(false);
        this.O.setGravity(16);
        this.O.setTextSize(dimension2);
        this.M.addView(this.N);
        this.M.addView(this.O);
        this.P = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.e = baselineLayout.getPaddingBottom();
        this.f = 0;
        this.i = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.N.setImportantForAccessibility(2);
        this.O.setImportantForAccessibility(2);
        setFocusable(true);
        a();
        this.l0 = getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tjx
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                boolean z;
                a aVar;
                int[] iArr = NavigationBarItemView.y0;
                NavigationBarItemView navigationBarItemView = this.a;
                View view2 = navigationBarItemView.G;
                ImageView imageView = navigationBarItemView.I;
                if (imageView.getVisibility() == 0 && (aVar = navigationBarItemView.p0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.j(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) navigationBarItemView.F.getLayoutParams();
                int i9 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i10 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z2 = true;
                if (navigationBarItemView.q0 == 1 && navigationBarItemView.k0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (navigationBarItemView.k0 != -2 || view2.getMeasuredWidth() == i9) {
                        z = false;
                    } else {
                        layoutParams2.width = Math.max(i9, Math.min(navigationBarItemView.i0, navigationBarItemView.getMeasuredWidth() - (navigationBarItemView.n0 * 2)));
                        z = true;
                    }
                    if (view2.getMeasuredHeight() < i10) {
                        layoutParams2.height = i10;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        view2.setLayoutParams(layoutParams2);
                    }
                }
            }
        });
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.p0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.p0.e.b.L.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.H.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.I.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(int i, int i2, int i3, View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void a() {
        float textSize = this.K.getTextSize();
        float textSize2 = this.L.getTextSize();
        this.v = textSize - textSize2;
        this.w = (textSize2 * 1.0f) / textSize;
        this.y = (textSize * 1.0f) / textSize2;
        float textSize3 = this.N.getTextSize();
        float textSize4 = this.O.getTextSize();
        this.z = textSize3 - textSize4;
        this.A = (textSize4 * 1.0f) / textSize3;
        this.B = (textSize3 * 1.0f) / textSize4;
    }

    public final void b() {
        Drawable rippleDrawable = this.c;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (this.b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.h0 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(yt50.c(this.b), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(yt50.a(this.b), null, null);
            }
        }
        FrameLayout frameLayout = this.H;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable2);
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.a0 = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.e);
        setId(hVar.a);
        if (!TextUtils.isEmpty(hVar.q)) {
            setContentDescription(hVar.q);
        }
        e0g0.a(this, !TextUtils.isEmpty(hVar.r) ? hVar.r : hVar.e);
        l();
        this.a = true;
    }

    public final void d(float f, float f2) {
        b bVar = this.f0;
        bVar.getClass();
        float fA = dj0.a(0.4f, 1.0f, f);
        View view = this.G;
        view.setScaleX(fA);
        view.setScaleY(bVar.a(f));
        view.setAlpha(dj0.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.g0 = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.h0) {
            this.H.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i = this.I.getLayoutParams().width > 0 ? this.i : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.M.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f, float f2) {
        i(this.q0 == 0 ? (int) (this.d + f2) : 0, 0, this.s0, this.E);
        int i = this.q0;
        i(i == 0 ? 0 : this.x0.top, i == 0 ? 0 : this.x0.bottom, i == 0 ? 17 : 8388627, this.F);
        int i2 = this.e;
        BaselineLayout baselineLayout = this.J;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i2);
        this.P.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f);
        textView2.setScaleY(f);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i = this.d;
        i(i, i, this.q0 == 0 ? 17 : this.s0, this.E);
        i(0, 0, 17, this.F);
        BaselineLayout baselineLayout = this.J;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.P.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.G.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.p0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.M;
    }

    public int getItemBackgroundResId() {
        return com.sportybet.android.gp.tz.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.a0;
    }

    public int getItemDefaultMarginResId() {
        return com.sportybet.android.gp.tz.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.Q;
    }

    public BaselineLayout getLabelGroup() {
        return this.J;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.E;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.q0 == 1) {
            LinearLayout linearLayout = this.F;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.J;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void h(TextView textView, int i) {
        int iRound;
        if (this.w0) {
            textView.setTextAppearance(i);
            return;
        }
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, dl30.z);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i2 = typedValue.data;
                iRound = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public final void j(int i) {
        if (i > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.i0, i - (this.n0 * 2));
            int iMax = this.j0;
            if (this.q0 == 1) {
                int measuredWidth = i - (this.o0 * 2);
                int i2 = this.k0;
                if (i2 != -1) {
                    measuredWidth = i2 == -2 ? this.E.getMeasuredWidth() : Math.min(i2, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.l0, this.F.getMeasuredHeight());
            }
            View view = this.G;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.m0 && this.C == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void k(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(ecv.e(textView.getContext(), i));
        ColorStateList colorStateList = this.V;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.L;
        textView2.setTypeface(textView2.getTypeface(), this.W ? 1 : 0);
        TextView textView3 = this.O;
        textView3.setTypeface(textView3.getTypeface(), this.W ? 1 : 0);
    }

    public final void l() {
        h hVar = this.a0;
        if (hVar != null) {
            setVisibility((!hVar.isVisible() || (!this.t0 && this.u0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.a0;
        if (hVar != null && hVar.isCheckable() && this.a0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.p0;
        if (aVar != null && aVar.isVisible()) {
            h hVar = this.a0;
            CharSequence charSequence = hVar.e;
            if (!TextUtils.isEmpty(hVar.q)) {
                charSequence = this.a0.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.p0.d()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c7.f.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c7.a.g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.sportybet.android.gp.tz.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new a(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.G.setBackground(drawable);
        b();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.h0 = z;
        b();
        this.G.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.l0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.o0 = i;
        if (this.q0 == 1) {
            setPadding(i, 0, i, 0);
        }
        j(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.x0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.k0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.j0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f != i) {
            this.f = i;
            ((LinearLayout.LayoutParams) this.J.getLayoutParams()).topMargin = i;
            BaselineLayout baselineLayout = this.M;
            if (baselineLayout.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.n0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.m0 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.i0 = i;
        j(getWidth());
    }

    public void setBadge(com.google.android.material.badge.a aVar) {
        com.google.android.material.badge.a aVar2 = this.p0;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.I;
        if (aVar2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.p0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.a aVar3 = this.p0;
                if (aVar3 != null) {
                    if (aVar3.e() != null) {
                        aVar3.e().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.p0 = null;
            }
        }
        this.p0 = aVar;
        int i = this.r0;
        BadgeState badgeState = aVar.e;
        if (badgeState.l != i) {
            badgeState.l = i;
            aVar.k();
        }
        if (imageView == null || this.p0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        com.google.android.material.badge.a aVar4 = this.p0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar4.setBounds(rect);
        aVar4.j(imageView, null);
        if (aVar4.e() != null) {
            aVar4.e().setForeground(aVar4);
        } else {
            imageView.getOverlay().add(aVar4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.L;
        setLabelPivots(textView);
        TextView textView2 = this.K;
        setLabelPivots(textView2);
        TextView textView3 = this.O;
        setLabelPivots(textView3);
        TextView textView4 = this.N;
        setLabelPivots(textView4);
        float f = z ? 1.0f : 0.0f;
        if (this.h0 && this.a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.g0, f);
            this.e0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ujx(this, f));
            this.e0.setInterpolator(f6w.c(getContext(), com.sportybet.android.gp.tz.R.attr.motionEasingEmphasizedInterpolator, dj0.b));
            this.e0.setDuration(bbv.c(getContext(), com.sportybet.android.gp.tz.R.attr.motionDurationLong2, getResources().getInteger(com.sportybet.android.gp.tz.R.integer.material_motion_duration_long_1)));
            this.e0.start();
        } else {
            d(f, f);
        }
        float f2 = this.v;
        float f3 = this.w;
        float f4 = this.y;
        if (this.q0 == 1) {
            f2 = this.z;
            f3 = this.A;
            f4 = this.B;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.C;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        g();
                    }
                } else if (z) {
                    f(textView, textView2, f3, f2);
                } else {
                    f(textView2, textView, f4, 0.0f);
                }
            } else if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (this.D) {
            if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (z) {
            f(textView, textView2, f3, f2);
        } else {
            f(textView2, textView, f4, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.K.setEnabled(z);
        this.L.setEnabled(z);
        this.N.setEnabled(z);
        this.O.setEnabled(z);
        this.I.setEnabled(z);
    }

    @Override // defpackage.bkx
    public void setExpanded(boolean z) {
        this.t0 = z;
        l();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.T = i;
        if (i == 0) {
            i = this.R;
        }
        k(this.O, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.U = i;
        if (i == 0) {
            i = this.S;
        }
        TextView textView = this.N;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(ecv.e(textView.getContext(), i));
        ColorStateList colorStateList = this.V;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.c0) {
            return;
        }
        this.c0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.d0 = drawable;
            ColorStateList colorStateList = this.b0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.I.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.i != i) {
            this.i = i;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.I;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.b0 = colorStateList;
        if (this.a0 == null || (drawable = this.d0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.d0.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.c = drawable;
        b();
    }

    public void setItemGravity(int i) {
        this.s0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.q0 != i) {
            this.q0 = i;
            this.r0 = 0;
            BaselineLayout baselineLayout = this.J;
            this.P = baselineLayout;
            BaselineLayout baselineLayout2 = this.M;
            LinearLayout linearLayout = this.F;
            int i8 = 8;
            if (i == 1) {
                if (baselineLayout2.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(baselineLayout2, layoutParams);
                    e();
                }
                Rect rect = this.x0;
                int i9 = rect.left;
                int i10 = rect.right;
                int i11 = rect.top;
                i2 = rect.bottom;
                this.r0 = 1;
                int i12 = this.o0;
                this.P = baselineLayout2;
                i6 = i11;
                i5 = i10;
                i4 = i9;
                i3 = i12;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            baselineLayout2.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.E.getLayoutParams()).gravity = this.s0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = i6;
            layoutParams2.bottomMargin = i2;
            setPadding(i3, 0, i3, 0);
            j(getWidth());
            b();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.e != i) {
            this.e = i;
            h hVar = this.a0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.d != i) {
            this.d = i;
            h hVar = this.a0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.Q = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.b = colorStateList;
        b();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.w0 = z;
        setTextAppearanceActive(this.R);
        setTextAppearanceInactive(this.S);
        setHorizontalTextAppearanceActive(this.T);
        setHorizontalTextAppearanceInactive(this.U);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.K;
        textView.setMaxLines(i);
        TextView textView2 = this.L;
        textView2.setMaxLines(i);
        this.N.setMaxLines(i);
        this.O.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.C != i) {
            this.C = i;
            if (this.m0 && i == 2) {
                this.f0 = A0;
            } else {
                this.f0 = z0;
            }
            j(getWidth());
            h hVar = this.a0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.v0 = z;
        this.J.setMeasurePaddingFromBaseline(z);
        this.K.setIncludeFontPadding(z);
        this.L.setIncludeFontPadding(z);
        this.M.setMeasurePaddingFromBaseline(z);
        this.N.setIncludeFontPadding(z);
        this.O.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // defpackage.bkx
    public void setOnlyShowWhenExpanded(boolean z) {
        this.u0 = z;
        l();
    }

    public void setShifting(boolean z) {
        if (this.D != z) {
            this.D = z;
            h hVar = this.a0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShortcut(boolean z, char c2) {
    }

    public void setTextAppearanceActive(int i) {
        this.R = i;
        k(this.L, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.W = z;
        setTextAppearanceActive(this.R);
        setHorizontalTextAppearanceActive(this.T);
        TextView textView = this.L;
        textView.setTypeface(textView.getTypeface(), this.W ? 1 : 0);
        TextView textView2 = this.O;
        textView2.setTypeface(textView2.getTypeface(), this.W ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        this.S = i;
        TextView textView = this.K;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(ecv.e(textView.getContext(), i));
        ColorStateList colorStateList = this.V;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.V = colorStateList;
        if (colorStateList != null) {
            this.K.setTextColor(colorStateList);
            this.L.setTextColor(colorStateList);
            this.N.setTextColor(colorStateList);
            this.O.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
        this.L.setText(charSequence);
        this.N.setText(charSequence);
        this.O.setText(charSequence);
        h hVar = this.a0;
        if (hVar == null || TextUtils.isEmpty(hVar.q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.a0;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.r)) {
            charSequence = this.a0.r;
        }
        e0g0.a(this, charSequence);
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}
