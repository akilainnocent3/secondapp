package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.r;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.sportybet.android.gp.tz.R;
import defpackage.bbv;
import defpackage.c7;
import defpackage.dj0;
import defpackage.e6;
import defpackage.eai0;
import defpackage.ecv;
import defpackage.f6w;
import defpackage.fcv;
import defpackage.g9i0;
import defpackage.gof0;
import defpackage.hb5;
import defpackage.l8j0;
import defpackage.n9j0;
import defpackage.nfs;
import defpackage.p72;
import defpackage.pk30;
import defpackage.r6i0;
import defpackage.r72;
import defpackage.rx80;
import defpackage.tcv;
import defpackage.vbv;
import defpackage.w9h;
import defpackage.zmy;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final SnackbarBaseLayout i;
    public final SnackbarContentLayout j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public ArrayList s;
    public final AccessibilityManager t;
    public static final w9h v = dj0.b;
    public static final LinearInterpolator w = dj0.a;
    public static final nfs x = dj0.d;
    public static final int[] z = {R.attr.snackbarStyle};
    public static final String A = BaseTransientBottomBar.class.getSimpleName();
    public static final Handler y = new Handler(Looper.getMainLooper(), new a());
    public final b l = new b();
    public final e u = new e();

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final g y;

        public Behavior() {
            g gVar = new g();
            this.i = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.v = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.e = 0;
            this.y = gVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            g gVar = this.y;
            gVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    h.b().e(gVar.a);
                }
            } else if (coordinatorLayout.s(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                h.b().d(gVar.a);
            }
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean w(View view) {
            this.y.getClass();
            return view instanceof SnackbarBaseLayout;
        }
    }

    public static class SnackbarBaseLayout extends FrameLayout {
        public static final a A = new a();
        public BaseTransientBottomBar<?> a;
        public final rx80 b;
        public int c;
        public final float d;
        public final float e;
        public final int f;
        public final int i;
        public ColorStateList v;
        public PorterDuff.Mode w;
        public Rect y;
        public boolean z;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            Drawable drawable;
            super(tcv.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, pk30.e0);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.b = rx80.d(context2, attributeSet, 0, 0).a();
            }
            this.d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(ecv.a(4, context2, typedArrayObtainStyledAttributes));
            setBackgroundTintMode(eai0.f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(A);
            setFocusable(true);
            if (getBackground() == null) {
                int iG = vbv.g(getBackgroundOverlayColorAlpha(), vbv.b(R.attr.colorSurface, this), vbv.b(R.attr.colorOnSurface, this));
                rx80 rx80Var = this.b;
                if (rx80Var != null) {
                    w9h w9hVar = BaseTransientBottomBar.v;
                    fcv fcvVar = new fcv(rx80Var);
                    fcvVar.s(ColorStateList.valueOf(iG));
                    drawable = fcvVar;
                } else {
                    Resources resources = getResources();
                    w9h w9hVar2 = BaseTransientBottomBar.v;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iG);
                    drawable = gradientDrawable;
                }
                ColorStateList colorStateList = this.v;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                setBackground(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.e;
        }

        public int getAnimationMode() {
            return this.c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.d;
        }

        public int getMaxInlineActionWidth() {
            return this.i;
        }

        public int getMaxWidth() {
            return this.f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.c();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                h hVarB = h.b();
                e eVar = baseTransientBottomBar.u;
                synchronized (hVarB.a) {
                    z = true;
                    if (!hVarB.c(eVar)) {
                        h.c cVar = hVarB.d;
                        if (!(cVar != null && cVar.a.get() == eVar)) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    BaseTransientBottomBar.y.post(new com.google.android.material.snackbar.e(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.r) {
                return;
            }
            baseTransientBottomBar.f();
            baseTransientBottomBar.r = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.f;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }

        public void setAnimationMode(int i) {
            this.c = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.v != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.v);
                drawable.setTintMode(this.w);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.v = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintList(colorStateList);
                drawableMutate.setTintMode(this.w);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.w = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintMode(mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.z || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.y = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.a;
            if (baseTransientBottomBar != null) {
                w9h w9hVar = BaseTransientBottomBar.v;
                baseTransientBottomBar.g();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : A);
            super.setOnClickListener(onClickListener);
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            if (i == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.i;
                if (snackbarBaseLayout.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.e) {
                        CoordinatorLayout.e eVar = (CoordinatorLayout.e) layoutParams;
                        Behavior behavior = new Behavior();
                        g gVar = behavior.y;
                        gVar.getClass();
                        gVar.a = baseTransientBottomBar.u;
                        behavior.b = new com.google.android.material.snackbar.f(baseTransientBottomBar);
                        eVar.b(behavior);
                        eVar.g = 80;
                    }
                    ViewGroup viewGroup = baseTransientBottomBar.g;
                    snackbarBaseLayout.z = true;
                    viewGroup.addView(snackbarBaseLayout);
                    snackbarBaseLayout.z = false;
                    baseTransientBottomBar.g();
                    snackbarBaseLayout.setVisibility(4);
                }
                if (snackbarBaseLayout.isLaidOut()) {
                    baseTransientBottomBar.f();
                    return true;
                }
                baseTransientBottomBar.r = true;
                return true;
            }
            if (i != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i2 = message.arg1;
            SnackbarBaseLayout snackbarBaseLayout2 = baseTransientBottomBar2.i;
            AccessibilityManager accessibilityManager = baseTransientBottomBar2.t;
            if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || snackbarBaseLayout2.getVisibility() != 0) {
                baseTransientBottomBar2.d(i2);
                return true;
            }
            if (snackbarBaseLayout2.getAnimationMode() == 1) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar2.d);
                valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar2));
                valueAnimatorOfFloat.setDuration(baseTransientBottomBar2.b);
                valueAnimatorOfFloat.addListener(new p72(baseTransientBottomBar2, i2));
                valueAnimatorOfFloat.start();
                return true;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            SnackbarBaseLayout snackbarBaseLayout3 = baseTransientBottomBar2.i;
            int height = snackbarBaseLayout3.getHeight();
            ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout3.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            }
            valueAnimator.setIntValues(0, height);
            valueAnimator.setInterpolator(baseTransientBottomBar2.e);
            valueAnimator.setDuration(baseTransientBottomBar2.c);
            valueAnimator.addListener(new r72(baseTransientBottomBar2, i2));
            valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar2));
            valueAnimator.start();
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            SnackbarBaseLayout snackbarBaseLayout = baseTransientBottomBar.i;
            if (snackbarBaseLayout != null) {
                int iHeight = n9j0.a(baseTransientBottomBar.h).height();
                int[] iArr = new int[2];
                snackbarBaseLayout.getLocationInWindow(iArr);
                int height = (iHeight - (snackbarBaseLayout.getHeight() + iArr[1])) + ((int) snackbarBaseLayout.getTranslationY());
                int i = baseTransientBottomBar.p;
                if (height >= i) {
                    baseTransientBottomBar.q = i;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.A, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                int i2 = baseTransientBottomBar.p;
                baseTransientBottomBar.q = i2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i2 - height) + marginLayoutParams.bottomMargin;
                snackbarBaseLayout.requestLayout();
            }
        }
    }

    public class c implements zmy {
        public c() {
        }

        @Override // defpackage.zmy
        public final l8j0 b(View view, l8j0 l8j0Var) {
            int iA = l8j0Var.a();
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            baseTransientBottomBar.m = iA;
            baseTransientBottomBar.n = l8j0Var.b();
            baseTransientBottomBar.o = l8j0Var.c();
            baseTransientBottomBar.g();
            return l8j0Var;
        }
    }

    public class d extends e6 {
        public d() {
        }

        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            c7Var.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }

        @Override // defpackage.e6
        public final boolean g(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.g(view, i, bundle);
            }
            BaseTransientBottomBar.this.a();
            return true;
        }
    }

    public class e implements h.b {
        public e() {
        }

        @Override // com.google.android.material.snackbar.h.b
        public final void a() {
            Handler handler = BaseTransientBottomBar.y;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.h.b
        public final void b(int i) {
            Handler handler = BaseTransientBottomBar.y;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    public static class g {
        public e a;
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            hb5.a("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            hb5.a("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        gof0.c(context, gof0.a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(z);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = snackbarBaseLayout.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.b.setTextColor(vbv.g(actionTextColorAlpha, vbv.b(R.attr.colorSurface, snackbarContentLayout2), snackbarContentLayout2.b.getCurrentTextColor()));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        snackbarBaseLayout.setAccessibilityLiveRegion(1);
        snackbarBaseLayout.setImportantForAccessibility(1);
        snackbarBaseLayout.setFitsSystemWindows(true);
        c cVar = new c();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(snackbarBaseLayout, cVar);
        r6i0.p(snackbarBaseLayout, new d());
        this.t = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = bbv.c(context, R.attr.motionDurationLong2, r.d.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.a = bbv.c(context, R.attr.motionDurationLong2, 150);
        this.b = bbv.c(context, R.attr.motionDurationMedium1, 75);
        this.d = f6w.c(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.f = f6w.c(context, R.attr.motionEasingEmphasizedInterpolator, x);
        this.e = f6w.c(context, R.attr.motionEasingEmphasizedInterpolator, v);
    }

    public void a() {
        b(3);
    }

    public final void b(int i) {
        h hVarB = h.b();
        e eVar = this.u;
        synchronized (hVarB.a) {
            try {
                if (hVarB.c(eVar)) {
                    hVarB.a(hVarB.c, i);
                } else {
                    h.c cVar = hVarB.d;
                    if (cVar != null && cVar.a.get() == eVar) {
                        hVarB.a(hVarB.d, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        this.p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        g();
    }

    public final void d(int i) {
        h hVarB = h.b();
        e eVar = this.u;
        synchronized (hVarB.a) {
            try {
                if (hVarB.c(eVar)) {
                    hVarB.c = null;
                    h.c cVar = hVarB.d;
                    if (cVar != null && cVar != null) {
                        hVarB.c = cVar;
                        hVarB.d = null;
                        h.b bVar = cVar.a.get();
                        if (bVar != null) {
                            bVar.a();
                        } else {
                            hVarB.c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f) this.s.get(size)).a(this, i);
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void e() {
        h hVarB = h.b();
        e eVar = this.u;
        synchronized (hVarB.a) {
            try {
                if (hVarB.c(eVar)) {
                    hVarB.f(hVarB.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f) this.s.get(size)).b(this);
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.t;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        SnackbarBaseLayout snackbarBaseLayout = this.i;
        if (z2) {
            snackbarBaseLayout.post(new com.google.android.material.snackbar.g(this));
            return;
        }
        if (snackbarBaseLayout.getParent() != null) {
            snackbarBaseLayout.setVisibility(0);
        }
        e();
    }

    public final void g() {
        SnackbarBaseLayout snackbarBaseLayout = this.i;
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = A;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (snackbarBaseLayout.y == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (snackbarBaseLayout.getParent() == null) {
            return;
        }
        int i = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = snackbarBaseLayout.y;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            snackbarBaseLayout.requestLayout();
        }
        if ((z3 || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = snackbarBaseLayout.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) layoutParams2).a instanceof SwipeDismissBehavior)) {
                b bVar = this.l;
                snackbarBaseLayout.removeCallbacks(bVar);
                snackbarBaseLayout.post(bVar);
            }
        }
    }

    public static abstract class f<B> {
        public void b(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public void a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        }
    }
}
