package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.protobuf.Reader;
import defpackage.bbv;
import defpackage.c220;
import defpackage.c7;
import defpackage.dj0;
import defpackage.dl30;
import defpackage.e0g0;
import defpackage.e220;
import defpackage.eai0;
import defpackage.ecv;
import defpackage.f6w;
import defpackage.fcv;
import defpackage.g9i0;
import defpackage.gcv;
import defpackage.gof0;
import defpackage.gr0;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.loz;
import defpackage.m58;
import defpackage.o0b;
import defpackage.pk30;
import defpackage.r6i0;
import defpackage.t8h;
import defpackage.tcv;
import defpackage.udf;
import defpackage.yt50;
import defpackage.zvf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    public static final e220 p0 = new e220(16);
    public ColorStateList A;
    public ColorStateList B;
    public ColorStateList C;
    public Drawable D;
    public int E;
    public final PorterDuff.Mode F;
    public final float G;
    public final float H;
    public final float I;
    public final int J;
    public int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int a;
    public boolean a0;
    public final ArrayList<g> b;
    public com.google.android.material.tabs.a b0;
    public g c;
    public final TimeInterpolator c0;
    public final f d;
    public c d0;
    public final int e;
    public final ArrayList<c> e0;
    public final int f;
    public i f0;
    public ValueAnimator g0;
    public ViewPager h0;
    public final int i;
    public loz i0;
    public e j0;
    public h k0;
    public b l0;
    public boolean m0;
    public int n0;
    public final c220 o0;
    public final int v;
    public final int w;
    public final int y;
    public final int z;

    public final class TabView extends LinearLayout {
        public static final /* synthetic */ int A = 0;
        public g a;
        public TextView b;
        public ImageView c;
        public View d;
        public com.google.android.material.badge.a e;
        public View f;
        public TextView i;
        public ImageView v;
        public Drawable w;
        public int y;

        public TabView(Context context) {
            super(context);
            this.y = 2;
            d(context);
            setPaddingRelative(TabLayout.this.e, TabLayout.this.f, TabLayout.this.i, TabLayout.this.v);
            setGravity(17);
            setOrientation(!TabLayout.this.T ? 1 : 0);
            setClickable(true);
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.f.a(this, systemIcon);
        }

        private com.google.android.material.badge.a getBadge() {
            return this.e;
        }

        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.e == null) {
                this.e = new com.google.android.material.badge.a(getContext(), null);
            }
            b();
            com.google.android.material.badge.a aVar = this.e;
            if (aVar != null) {
                return aVar;
            }
            ib5.a("Unable to create badge");
            return null;
        }

        public final void a() {
            if (this.e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.d;
                if (view != null) {
                    com.google.android.material.badge.a aVar = this.e;
                    if (aVar != null) {
                        if (aVar.e() != null) {
                            aVar.e().setForeground(null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.d = null;
                }
            }
        }

        public final void b() {
            g gVar;
            if (this.e != null) {
                if (this.f != null) {
                    a();
                    return;
                }
                ImageView imageView = this.c;
                if (imageView != null && (gVar = this.a) != null && gVar.b != null) {
                    if (this.d == imageView) {
                        c(imageView);
                        return;
                    }
                    a();
                    ImageView imageView2 = this.c;
                    if (this.e == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    com.google.android.material.badge.a aVar = this.e;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.j(imageView2, null);
                    if (aVar.e() != null) {
                        aVar.e().setForeground(aVar);
                    } else {
                        imageView2.getOverlay().add(aVar);
                    }
                    this.d = imageView2;
                    return;
                }
                TextView textView = this.b;
                if (textView == null || this.a == null) {
                    a();
                    return;
                }
                if (this.d == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.b;
                if (this.e == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                com.google.android.material.badge.a aVar2 = this.e;
                Rect rect2 = new Rect();
                textView2.getDrawingRect(rect2);
                aVar2.setBounds(rect2);
                aVar2.j(textView2, null);
                if (aVar2.e() != null) {
                    aVar2.e().setForeground(aVar2);
                } else {
                    textView2.getOverlay().add(aVar2);
                }
                this.d = textView2;
            }
        }

        public final void c(View view) {
            com.google.android.material.badge.a aVar = this.e;
            if (aVar == null || view != this.d) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.j(view, null);
        }

        public final void d(Context context) {
            GradientDrawable gradientDrawable;
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.J;
            if (i != 0) {
                Drawable drawableA = gr0.a(context, i);
                this.w = drawableA;
                if (drawableA != null && drawableA.isStateful()) {
                    this.w.setState(getDrawableState());
                }
            } else {
                this.w = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (tabLayout.C != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = yt50.a(tabLayout.C);
                boolean z = tabLayout.a0;
                if (z) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z ? null : gradientDrawable3);
            }
            setBackground(rippleDrawable);
            tabLayout.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.w;
            if ((drawable == null || !drawable.isStateful()) ? false : this.w.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            int i;
            ViewParent parent;
            g gVar = this.a;
            View view = gVar != null ? gVar.f : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f);
                    }
                    addView(view);
                }
                this.f = view;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.i = textView2;
                if (textView2 != null) {
                    this.y = textView2.getMaxLines();
                }
                this.v = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f;
                if (view3 != null) {
                    removeView(view3);
                    this.f = null;
                }
                this.i = null;
                this.v = null;
            }
            if (this.f == null) {
                if (this.c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.sportybet.android.gp.tz.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.sportybet.android.gp.tz.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.b = textView3;
                    addView(textView3);
                    this.y = this.b.getMaxLines();
                }
                TextView textView4 = this.b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.w);
                if (!isSelected() || (i = tabLayout.z) == -1) {
                    this.b.setTextAppearance(tabLayout.y);
                } else {
                    this.b.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.A;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                f(this.b, this.c, true);
                b();
                ImageView imageView3 = this.c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, imageView3));
                }
                TextView textView5 = this.b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, textView5));
                }
            } else {
                TextView textView6 = this.i;
                if (textView6 != null || this.v != null) {
                    f(textView6, this.v, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.d)) {
                return;
            }
            setContentDescription(gVar.d);
        }

        public final void f(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            g gVar = this.a;
            Drawable drawableMutate = (gVar == null || (drawable = gVar.b) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                drawableMutate.setTintList(tabLayout.B);
                PorterDuff.Mode mode = tabLayout.F;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            g gVar2 = this.a;
            CharSequence charSequence = gVar2 != null ? gVar2.c : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z2 = false;
                } else {
                    this.a.getClass();
                    z2 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iC = (z2 && imageView.getVisibility() == 0) ? (int) eai0.c(getContext(), 8) : 0;
                if (tabLayout.T) {
                    if (iC != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iC);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iC != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iC;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.a;
            CharSequence charSequence2 = gVar3 != null ? gVar3.d : null;
            if (zIsEmpty) {
                charSequence = charSequence2;
            }
            e0g0.a(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.b, this.c, this.f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.b, this.c, this.f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.a;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.e;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(this.e.d());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c7.f.a(0, 1, this.a.e, 1, false, isSelected()).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c7.a.g.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.sportybet.android.gp.tz.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.K, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.b != null) {
                float f = tabLayout.G;
                if (isSelected() && tabLayout.z != -1) {
                    f = tabLayout.H;
                }
                int i3 = this.y;
                ImageView imageView = this.c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.I;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int maxLines = this.b.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (tabLayout.S == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.b.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.b.setTextSize(0, f);
                    this.b.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.a.b();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.a) {
                this.a = gVar;
                e();
                g gVar2 = this.a;
                setSelected(gVar2 != null && gVar2.a());
            }
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {
        public boolean a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(ViewPager viewPager, loz lozVar, loz lozVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.h0 == viewPager) {
                tabLayout.t(lozVar2, this.a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void A0(T t);

        void G(T t);

        void g0(T t);
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.m();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.m();
        }
    }

    public class f extends LinearLayout {
        public static final /* synthetic */ int c = 0;
        public ValueAnimator a;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;

            public a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.c(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.n0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                com.google.android.material.tabs.a aVar = tabLayout.b0;
                Drawable drawable = tabLayout.D;
                aVar.getClass();
                RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, childAt);
                drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
                tabLayout.a = i;
            }
        }

        public final void b(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.D.getBounds();
            tabLayout.D.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.D;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.D.getBounds().bottom);
            } else {
                tabLayout.b0.b(tabLayout, view, view2, f, tabLayout.D);
            }
            postInvalidateOnAnimation();
        }

        public final void d(int i, int i2, boolean z) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.a == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.a = i;
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.a.removeAllUpdateListeners();
                this.a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.c0);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.D.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.D.getIntrinsicHeight();
            }
            int i = tabLayout.R;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.D.getBounds().width() > 0) {
                Rect bounds = tabLayout.D.getBounds();
                tabLayout.D.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.D.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.a;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            int selectedTabPosition = tabLayout.a;
            if (selectedTabPosition == -1) {
                selectedTabPosition = tabLayout.getSelectedTabPosition();
                tabLayout.a = selectedTabPosition;
            }
            a(selectedTabPosition);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.P == 1 || tabLayout.S == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) eai0.c(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    tabLayout.P = 0;
                    tabLayout.w(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public static class g {
        public Object a;
        public Drawable b;
        public CharSequence c;
        public CharSequence d;
        public View f;
        public TabLayout g;
        public TabView h;
        public int e = -1;
        public int i = -1;

        public final boolean a() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.e;
            }
            hb5.a("Tab not attached to a TabLayout");
            return false;
        }

        public final void b() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                tabLayout.s(this, true);
            } else {
                hb5.a("Tab not attached to a TabLayout");
            }
        }

        public final void c(View view) {
            this.f = view;
            f();
        }

        public final void d(Drawable drawable) {
            this.b = drawable;
            TabLayout tabLayout = this.g;
            if (tabLayout.P == 1 || tabLayout.S == 2) {
                tabLayout.w(true);
            }
            f();
        }

        public final void e(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.h.setContentDescription(charSequence);
            }
            this.c = charSequence;
            f();
        }

        public final void f() {
            TabView tabView = this.h;
            if (tabView != null) {
                tabView.e();
                g gVar = tabView.a;
                tabView.setSelected(gVar != null && gVar.a());
            }
        }
    }

    public static class h implements ViewPager.i {
        public final WeakReference<TabLayout> a;
        public int b;
        public int c;

        public h(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void H(float f, int i, int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z = true;
                if (i3 == 2 && this.b != 1) {
                    z = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z = false;
                }
                tabLayout.u(f, i, z, z, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void K0(int i) {
            this.b = this.c;
            this.c = i;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                tabLayout.n0 = this.c;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void N0(int i) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.c;
            tabLayout.s(tabLayout.k(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }
    }

    public static class i implements d {
        public final ViewPager a;

        public i(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(g gVar) {
            this.a.setCurrentItem(gVar.e);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        int resourceId;
        super(tcv.a(context, attributeSet, i2, com.sportybet.android.gp.tz.R.style.Widget_Design_TabLayout), attributeSet, i2);
        this.a = -1;
        this.b = new ArrayList<>();
        this.z = -1;
        this.E = 0;
        this.K = Reader.READ_DONE;
        this.V = -1;
        this.e0 = new ArrayList<>();
        this.o0 = new c220(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = gof0.d(context2, attributeSet, pk30.i0, i2, com.sportybet.android.gp.tz.R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListD = udf.d(getBackground());
        if (colorStateListD != null) {
            fcv fcvVar = new fcv();
            fcvVar.s(colorStateListD);
            fcvVar.o(context2);
            fcvVar.r(getElevation());
            setBackground(fcvVar);
        }
        setSelectedTabIndicator(ecv.d(5, context2, typedArrayD));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        fVar.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.v = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.f = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.i = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.v = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        if (bbv.b(com.sportybet.android.gp.tz.R.attr.isMaterial3Theme, context2, false)) {
            this.w = com.sportybet.android.gp.tz.R.attr.textAppearanceTitleSmall;
        } else {
            this.w = com.sportybet.android.gp.tz.R.attr.textAppearanceButton;
        }
        int resourceId2 = typedArrayD.getResourceId(24, com.sportybet.android.gp.tz.R.style.TextAppearance_Design_Tab);
        this.y = resourceId2;
        int[] iArr = dl30.z;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.G = dimensionPixelSize2;
            this.A = ecv.a(3, context2, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(22)) {
                resourceId = typedArrayD.getResourceId(22, resourceId2);
                this.z = resourceId;
            } else {
                resourceId = -1;
            }
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, iArr);
                try {
                    this.H = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListA = ecv.a(3, context2, typedArrayObtainStyledAttributes2);
                    if (colorStateListA != null) {
                        this.A = i(this.A.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayD.hasValue(25)) {
                this.A = ecv.a(25, context2, typedArrayD);
            }
            if (typedArrayD.hasValue(23)) {
                this.A = i(this.A.getDefaultColor(), typedArrayD.getColor(23, 0));
            }
            this.B = ecv.a(3, context2, typedArrayD);
            this.F = eai0.f(typedArrayD.getInt(4, -1), null);
            this.C = ecv.a(21, context2, typedArrayD);
            this.Q = typedArrayD.getInt(6, 300);
            this.c0 = f6w.c(context2, com.sportybet.android.gp.tz.R.attr.motionEasingEmphasizedInterpolator, dj0.b);
            this.L = typedArrayD.getDimensionPixelSize(14, -1);
            this.M = typedArrayD.getDimensionPixelSize(13, -1);
            this.J = typedArrayD.getResourceId(0, 0);
            this.O = typedArrayD.getDimensionPixelSize(1, 0);
            this.S = typedArrayD.getInt(15, 1);
            this.P = typedArrayD.getInt(2, 0);
            this.T = typedArrayD.getBoolean(12, false);
            this.a0 = typedArrayD.getBoolean(26, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.I = resources.getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.design_tab_text_size_2line);
            this.N = resources.getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.design_tab_scrollable_min_width);
            g();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList<g> arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = arrayList.get(i2);
            if (gVar != null && gVar.b != null && !TextUtils.isEmpty(gVar.c)) {
                return !this.T ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.L;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.S;
        if (i3 == 0 || i3 == 2) {
            return this.N;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList i(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private void setSelectedTabView(int i2) {
        f fVar = this.d;
        int childCount = fVar.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = fVar.getChildAt(i3);
                if ((i3 != i2 || childAt.isSelected()) && (i3 == i2 || !childAt.isSelected())) {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                } else {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).e();
                    }
                }
                i3++;
            }
        }
    }

    @Deprecated
    public final void a(c cVar) {
        ArrayList<c> arrayList = this.e0;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        e(view);
    }

    public final void b(g gVar) {
        d(gVar, this.b.isEmpty());
    }

    public final void c(g gVar, int i2, boolean z) {
        if (gVar.g != this) {
            hb5.a("Tab belongs to a different TabLayout.");
            return;
        }
        gVar.e = i2;
        ArrayList<g> arrayList = this.b;
        arrayList.add(i2, gVar);
        int size = arrayList.size();
        int i3 = -1;
        for (int i4 = i2 + 1; i4 < size; i4++) {
            if (arrayList.get(i4).e == this.a) {
                i3 = i4;
            }
            arrayList.get(i4).e = i4;
        }
        this.a = i3;
        TabView tabView = gVar.h;
        tabView.setSelected(false);
        tabView.setActivated(false);
        int i5 = gVar.e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.S == 1 && this.P == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.d.addView(tabView, i5, layoutParams);
        if (z) {
            gVar.b();
        }
    }

    public final void d(g gVar, boolean z) {
        c(gVar, this.b.size(), z);
    }

    public final void e(View view) {
        if (!(view instanceof TabItem)) {
            hb5.a("Only TabItem instances can be added to TabLayout");
            return;
        }
        TabItem tabItem = (TabItem) view;
        g gVarL = l();
        CharSequence charSequence = tabItem.a;
        if (charSequence != null) {
            gVarL.e(charSequence);
        }
        Drawable drawable = tabItem.b;
        if (drawable != null) {
            gVarL.d(drawable);
        }
        int i2 = tabItem.c;
        if (i2 != 0) {
            gVarL.f = LayoutInflater.from(gVarL.h.getContext()).inflate(i2, (ViewGroup) gVarL.h, false);
            gVarL.f();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            gVarL.d = tabItem.getContentDescription();
            gVarL.f();
        }
        b(gVarL);
    }

    public final void f(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            f fVar = this.d;
            int childCount = fVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (fVar.getChildAt(i3).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iH = h(i2, 0.0f);
            if (scrollX != iH) {
                j();
                this.g0.setIntValues(scrollX, iH);
                this.g0.start();
            }
            ValueAnimator valueAnimator = fVar.a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.a != i2) {
                fVar.a.cancel();
            }
            fVar.d(i2, this.Q, true);
            return;
        }
        setScrollPosition(i2, 0.0f, true);
    }

    public final void g() {
        int i2 = this.S;
        int iMax = (i2 == 0 || i2 == 2) ? Math.max(0, this.O - this.e) : 0;
        f fVar = this.d;
        fVar.setPaddingRelative(iMax, 0, 0, 0);
        int i3 = this.S;
        if (i3 == 0) {
            int i4 = this.P;
            if (i4 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i4 == 1) {
                fVar.setGravity(1);
            } else if (i4 == 2) {
            }
            fVar.setGravity(8388611);
        } else if (i3 == 1 || i3 == 2) {
            if (this.P == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            fVar.setGravity(1);
        }
        w(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.c;
        if (gVar != null) {
            return gVar.e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.P;
    }

    public ColorStateList getTabIconTint() {
        return this.B;
    }

    public int getTabIndicatorAnimationMode() {
        return this.W;
    }

    public int getTabIndicatorGravity() {
        return this.R;
    }

    public int getTabMaxWidth() {
        return this.K;
    }

    public int getTabMode() {
        return this.S;
    }

    public ColorStateList getTabRippleColor() {
        return this.C;
    }

    public Drawable getTabSelectedIndicator() {
        return this.D;
    }

    public ColorStateList getTabTextColors() {
        return this.A;
    }

    public final int h(int i2, float f2) {
        f fVar;
        View childAt;
        int i3 = this.S;
        if ((i3 != 0 && i3 != 2) || (childAt = (fVar = this.d).getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < fVar.getChildCount() ? fVar.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    public final void j() {
        if (this.g0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.g0 = valueAnimator;
            valueAnimator.setInterpolator(this.c0);
            this.g0.setDuration(this.Q);
            this.g0.addUpdateListener(new a());
        }
    }

    public final g k(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.b.get(i2);
    }

    public final g l() {
        g gVar = (g) p0.b();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.g = this;
        c220 c220Var = this.o0;
        TabView tabView = c220Var != null ? (TabView) c220Var.b() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(gVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.d)) {
            tabView.setContentDescription(gVar.c);
        } else {
            tabView.setContentDescription(gVar.d);
        }
        gVar.h = tabView;
        int i2 = gVar.i;
        if (i2 != -1) {
            tabView.setId(i2);
        }
        return gVar;
    }

    public final void m() {
        int currentItem;
        n();
        loz lozVar = this.i0;
        if (lozVar != null) {
            int iC = lozVar.c();
            for (int i2 = 0; i2 < iC; i2++) {
                g gVarL = l();
                gVarL.e(this.i0.e(i2));
                d(gVarL, false);
            }
            ViewPager viewPager = this.h0;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            s(k(currentItem), true);
        }
    }

    public final void n() {
        for (int childCount = this.d.getChildCount() - 1; childCount >= 0; childCount--) {
            r(childCount);
        }
        Iterator<g> it = this.b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.g = null;
            next.h = null;
            next.a = null;
            next.b = null;
            next.i = -1;
            next.c = null;
            next.d = null;
            next.e = -1;
            next.f = null;
            p0.a(next);
        }
        this.c = null;
    }

    @Deprecated
    public final void o(c cVar) {
        this.e0.remove(cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gcv.d(this);
        if (this.h0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                v((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.m0) {
            setupWithViewPager(null);
            this.m0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2 = 0;
        while (true) {
            f fVar = this.d;
            if (i2 >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                int i3 = TabView.A;
                Drawable drawable = tabView.w;
                if (drawable != null) {
                    drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                    tabView.w.draw(canvas);
                }
            }
            i2++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c7.e.a(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iRound = Math.round(eai0.c(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int iC = this.M;
            if (iC <= 0) {
                iC = (int) (size - eai0.c(getContext(), 56));
            }
            this.K = iC;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.S;
            if (i4 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(g gVar) {
        if (gVar.g == this) {
            q(gVar.e);
        } else {
            hb5.a("Tab does not belong to this TabLayout.");
        }
    }

    public final void q(int i2) {
        g gVar = this.c;
        int i3 = gVar != null ? gVar.e : 0;
        r(i2);
        ArrayList<g> arrayList = this.b;
        g gVarRemove = arrayList.remove(i2);
        int i4 = -1;
        if (gVarRemove != null) {
            gVarRemove.g = null;
            gVarRemove.h = null;
            gVarRemove.a = null;
            gVarRemove.b = null;
            gVarRemove.i = -1;
            gVarRemove.c = null;
            gVarRemove.d = null;
            gVarRemove.e = -1;
            gVarRemove.f = null;
            p0.a(gVarRemove);
        }
        int size = arrayList.size();
        for (int i5 = i2; i5 < size; i5++) {
            if (arrayList.get(i5).e == this.a) {
                i4 = i5;
            }
            arrayList.get(i5).e = i5;
        }
        this.a = i4;
        if (i3 == i2) {
            s(arrayList.isEmpty() ? null : arrayList.get(Math.max(0, i2 - 1)), true);
        }
    }

    public final void r(int i2) {
        f fVar = this.d;
        TabView tabView = (TabView) fVar.getChildAt(i2);
        fVar.removeViewAt(i2);
        if (tabView != null) {
            tabView.setTab(null);
            tabView.setSelected(false);
            this.o0.a(tabView);
        }
        requestLayout();
    }

    public final void s(g gVar, boolean z) {
        g gVar2 = this.c;
        ArrayList<c> arrayList = this.e0;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).A0(gVar);
                }
                f(gVar.e);
                return;
            }
            return;
        }
        int i2 = gVar != null ? gVar.e : -1;
        if (z) {
            if ((gVar2 == null || gVar2.e == -1) && i2 != -1) {
                setScrollPosition(i2, 0.0f, true);
            } else {
                f(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.c = gVar;
        if (gVar2 != null && gVar2.g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).g0(gVar2);
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).G(gVar);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        gcv.b(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        int i2 = 0;
        while (true) {
            f fVar = this.d;
            if (i2 >= fVar.getChildCount()) {
                g();
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                tabView.setOrientation(!TabLayout.this.T ? 1 : 0);
                TextView textView = tabView.i;
                if (textView == null && tabView.v == null) {
                    tabView.f(tabView.b, tabView.c, true);
                } else {
                    tabView.f(textView, tabView.v, false);
                }
            }
            i2++;
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.d0;
        if (cVar2 != null) {
            o(cVar2);
        }
        this.d0 = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        j();
        this.g0.addListener(animatorListener);
    }

    public void setScrollPosition(int i2, float f2, boolean z, boolean z2) {
        u(f2, i2, z, z2, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.D = drawableMutate;
        int i2 = this.E;
        if (i2 != 0) {
            drawableMutate.setTint(i2);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.V;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.D.getIntrinsicHeight();
        }
        this.d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.E = i2;
        Drawable drawable = this.D;
        if (i2 != 0) {
            drawable.setTint(i2);
        } else {
            drawable.setTintList(null);
        }
        w(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.R != i2) {
            this.R = i2;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.V = i2;
        this.d.b(i2);
    }

    public void setTabGravity(int i2) {
        if (this.P != i2) {
            this.P = i2;
            g();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            ArrayList<g> arrayList = this.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2).f();
            }
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(o0b.b(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.W = i2;
        if (i2 == 0) {
            this.b0 = new com.google.android.material.tabs.a();
            return;
        }
        if (i2 == 1) {
            this.b0 = new zvf();
        } else if (i2 == 2) {
            this.b0 = new t8h();
        } else {
            hb5.a(m58.a(i2, " is not a valid TabIndicatorAnimationMode"));
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.U = z;
        int i2 = f.c;
        f fVar = this.d;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.S) {
            this.S = i2;
            g();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.C == colorStateList) {
            return;
        }
        this.C = colorStateList;
        int i2 = 0;
        while (true) {
            f fVar = this.d;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i3 = TabView.A;
                ((TabView) childAt).d(context);
            }
            i2++;
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(o0b.b(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            ArrayList<g> arrayList = this.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2).f();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(loz lozVar) {
        t(lozVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.a0 == z) {
            return;
        }
        this.a0 = z;
        int i2 = 0;
        while (true) {
            f fVar = this.d;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i3 = TabView.A;
                ((TabView) childAt).d(context);
            }
            i2++;
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(loz lozVar, boolean z) {
        e eVar;
        loz lozVar2 = this.i0;
        if (lozVar2 != null && (eVar = this.j0) != null) {
            lozVar2.a.unregisterObserver(eVar);
        }
        this.i0 = lozVar;
        if (z && lozVar != null) {
            e eVar2 = this.j0;
            if (eVar2 == null) {
                eVar2 = new e();
                this.j0 = eVar2;
            }
            lozVar.a.registerObserver(eVar2);
        }
        m();
    }

    public final void u(float f2, int i2, boolean z, boolean z2, boolean z3) {
        float f3 = i2 + f2;
        int iRound = Math.round(f3);
        if (iRound >= 0) {
            f fVar = this.d;
            if (iRound >= fVar.getChildCount()) {
                return;
            }
            if (z2) {
                TabLayout.this.a = Math.round(f3);
                ValueAnimator valueAnimator = fVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.a.cancel();
                }
                fVar.c(fVar.getChildAt(i2), fVar.getChildAt(i2 + 1), f2);
            }
            ValueAnimator valueAnimator2 = this.g0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.g0.cancel();
            }
            int iH = h(i2, f2);
            int scrollX = getScrollX();
            boolean z4 = (i2 < getSelectedTabPosition() && iH >= scrollX) || (i2 > getSelectedTabPosition() && iH <= scrollX) || i2 == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z4 = (i2 < getSelectedTabPosition() && iH <= scrollX) || (i2 > getSelectedTabPosition() && iH >= scrollX) || i2 == getSelectedTabPosition();
            }
            if (z4 || this.n0 == 1 || z3) {
                if (i2 < 0) {
                    iH = 0;
                }
                scrollTo(iH, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void v(ViewPager viewPager, boolean z, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.h0;
        if (viewPager2 != null) {
            h hVar = this.k0;
            if (hVar != null && (arrayList2 = viewPager2.j0) != null) {
                arrayList2.remove(hVar);
            }
            b bVar = this.l0;
            if (bVar != null && (arrayList = this.h0.m0) != null) {
                arrayList.remove(bVar);
            }
        }
        c cVar = this.f0;
        if (cVar != null) {
            o(cVar);
            this.f0 = null;
        }
        if (viewPager != null) {
            this.h0 = viewPager;
            h hVar2 = this.k0;
            if (hVar2 == null) {
                hVar2 = new h(this);
                this.k0 = hVar2;
            }
            hVar2.c = 0;
            hVar2.b = 0;
            viewPager.b(hVar2);
            i iVar = new i(viewPager);
            this.f0 = iVar;
            a(iVar);
            loz adapter = viewPager.getAdapter();
            if (adapter != null) {
                t(adapter, z);
            }
            b bVar2 = this.l0;
            if (bVar2 == null) {
                bVar2 = new b();
                this.l0 = bVar2;
            }
            bVar2.a = z;
            ArrayList arrayList3 = viewPager.m0;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                viewPager.m0 = arrayList3;
            }
            arrayList3.add(bVar2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.h0 = null;
            t(null, false);
        }
        this.m0 = z2;
    }

    public final void w(boolean z) {
        int i2 = 0;
        while (true) {
            f fVar = this.d;
            if (i2 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.S == 1 && this.P == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i2++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        e(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        e(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        v(viewPager, z, false);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        e(view);
    }

    public void setScrollPosition(int i2, float f2, boolean z) {
        setScrollPosition(i2, f2, z, true);
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setTabTextColors(int i2, int i3) {
        setTabTextColors(i(i2, i3));
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(gr0.a(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
