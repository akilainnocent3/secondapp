package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sportybet.android.gp.tz.R;
import defpackage.a2;
import defpackage.a45;
import defpackage.bbv;
import defpackage.dai0;
import defpackage.dj0;
import defpackage.eai0;
import defpackage.ecv;
import defpackage.f6w;
import defpackage.fcv;
import defpackage.gcv;
import defpackage.gof0;
import defpackage.k060;
import defpackage.l8j0;
import defpackage.pk30;
import defpackage.psg0;
import defpackage.rx80;
import defpackage.tcv;
import defpackage.vlf;
import defpackage.w35;
import defpackage.x35;
import defpackage.y35;
import defpackage.z35;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int K0 = 0;
    public final boolean A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public Behavior E0;
    public int F0;
    public int G0;
    public int H0;
    public final a I0;
    public final b J0;
    public Integer m0;
    public final fcv n0;
    public AnimatorSet o0;
    public AnimatorSet p0;
    public int q0;
    public int r0;
    public int s0;
    public final int t0;
    public int u0;
    public int v0;
    public final boolean w0;
    public boolean x0;
    public final boolean y0;
    public final boolean z0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.C0) {
                return;
            }
            bottomAppBar.F(bottomAppBar.q0, bottomAppBar.D0);
        }
    }

    public class b implements psg0<FloatingActionButton> {
        public b() {
        }
    }

    public class c implements eai0.b {
        public c() {
        }

        @Override // eai0.b
        public final l8j0 a(View view, l8j0 l8j0Var, eai0.c cVar) {
            boolean z;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.y0) {
                bottomAppBar.F0 = l8j0Var.a();
            }
            boolean z2 = false;
            if (bottomAppBar.z0) {
                z = bottomAppBar.H0 != l8j0Var.b();
                bottomAppBar.H0 = l8j0Var.b();
            } else {
                z = false;
            }
            if (bottomAppBar.A0) {
                boolean z3 = bottomAppBar.G0 != l8j0Var.c();
                bottomAppBar.G0 = l8j0Var.c();
                z2 = z3;
            }
            if (!z && !z2) {
                return l8j0Var;
            }
            AnimatorSet animatorSet = bottomAppBar.p0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = bottomAppBar.o0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            bottomAppBar.H();
            bottomAppBar.G();
            return l8j0Var;
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = BottomAppBar.K0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.C0 = false;
            bottomAppBar.p0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i = BottomAppBar.K0;
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ ActionMenuView a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        public e(ActionMenuView actionMenuView, int i, boolean z) {
            this.a = actionMenuView;
            this.b = i;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.b;
            boolean z = this.c;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.a;
            actionMenuView.setTranslationX(bottomAppBar.C(actionMenuView, i, z));
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i);
        fcv fcvVar = new fcv();
        this.n0 = fcvVar;
        this.B0 = 0;
        this.C0 = false;
        this.D0 = true;
        this.I0 = new a();
        this.J0 = new b();
        Context context2 = getContext();
        TypedArray typedArrayD = gof0.d(context2, attributeSet, pk30.e, i, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateListA = ecv.a(1, context2, typedArrayD);
        if (typedArrayD.hasValue(12)) {
            setNavigationIconTint(typedArrayD.getColor(12, -1));
        }
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayD.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayD.getDimensionPixelOffset(9, 0);
        this.q0 = typedArrayD.getInt(3, 0);
        this.r0 = typedArrayD.getInt(6, 0);
        this.s0 = typedArrayD.getInt(5, 1);
        this.w0 = typedArrayD.getBoolean(16, true);
        this.v0 = typedArrayD.getInt(11, 0);
        this.x0 = typedArrayD.getBoolean(10, false);
        this.y0 = typedArrayD.getBoolean(13, false);
        this.z0 = typedArrayD.getBoolean(14, false);
        this.A0 = typedArrayD.getBoolean(15, false);
        this.u0 = typedArrayD.getDimensionPixelOffset(4, -1);
        boolean z = typedArrayD.getBoolean(0, true);
        typedArrayD.recycle();
        this.t0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        a45 a45Var = new a45();
        a45Var.f = -1.0f;
        a45Var.b = dimensionPixelOffset;
        a45Var.a = dimensionPixelOffset2;
        a45Var.c(dimensionPixelOffset3);
        a45Var.e = 0.0f;
        k060 k060Var = new k060();
        k060 k060Var2 = new k060();
        k060 k060Var3 = new k060();
        k060 k060Var4 = new k060();
        a2 a2Var = new a2(0.0f);
        a2 a2Var2 = new a2(0.0f);
        a2 a2Var3 = new a2(0.0f);
        a2 a2Var4 = new a2(0.0f);
        new vlf();
        vlf vlfVar = new vlf();
        vlf vlfVar2 = new vlf();
        vlf vlfVar3 = new vlf();
        rx80 rx80Var = new rx80();
        rx80Var.a = k060Var;
        rx80Var.b = k060Var2;
        rx80Var.c = k060Var3;
        rx80Var.d = k060Var4;
        rx80Var.e = a2Var;
        rx80Var.f = a2Var2;
        rx80Var.g = a2Var3;
        rx80Var.h = a2Var4;
        rx80Var.i = a45Var;
        rx80Var.j = vlfVar;
        rx80Var.k = vlfVar2;
        rx80Var.l = vlfVar3;
        fcvVar.setShapeAppearanceModel(rx80Var);
        if (z) {
            fcvVar.w(2);
        } else {
            fcvVar.w(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        Paint.Style style = Paint.Style.FILL;
        fcvVar.u();
        fcvVar.o(context2);
        fcvVar.setTintList(colorStateListA);
        setElevation(dimensionPixelSize);
        setBackground(fcvVar);
        c cVar = new c();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pk30.x, i, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
        eai0.b(this, new dai0(z2, z3, z4, cVar));
    }

    public static void K(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        int i = 17;
        eVar.d = 17;
        int i2 = bottomAppBar.s0;
        if (i2 == 1) {
            i = 49;
            eVar.d = 49;
        }
        if (i2 == 0) {
            eVar.d = i | 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.F0;
    }

    private int getFabAlignmentAnimationDuration() {
        return bbv.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return D(this.q0);
    }

    private float getFabTranslationY() {
        if (this.s0 == 1) {
            return -getTopEdgeTreatment().d;
        }
        View viewB = B();
        return viewB != null ? (-((getMeasuredHeight() + getBottomInset()) - viewB.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.G0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a45 getTopEdgeTreatment() {
        return (a45) this.n0.b.a.i;
    }

    public final View B() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        ArrayList<View> arrayList = coordinatorLayout.b.b.get(this);
        ArrayList arrayList2 = coordinatorLayout.d;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            View view = (View) obj;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int C(ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.v0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean z2 = getLayoutDirection() == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z2 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i4 = z2 ? this.G0 : -this.H0;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z2) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i2 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i4) + i2);
    }

    public final float D(int i) {
        boolean z = getLayoutDirection() == 1;
        if (i != 1) {
            return 0.0f;
        }
        View viewB = B();
        int i2 = z ? this.H0 : this.G0;
        return ((getMeasuredWidth() / 2) - ((this.u0 == -1 || viewB == null) ? this.t0 + i2 : ((viewB.getMeasuredWidth() / 2) + this.u0) + i2)) * (z ? -1 : 1);
    }

    public final boolean E() {
        View viewB = B();
        FloatingActionButton floatingActionButton = viewB instanceof FloatingActionButton ? (FloatingActionButton) viewB : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void F(int i, boolean z) {
        if (!isLaidOut()) {
            this.C0 = false;
            int i2 = this.B0;
            if (i2 != 0) {
                this.B0 = 0;
                getMenu().clear();
                m(i2);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.p0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!E()) {
            i = 0;
            z = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - C(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new y35(this, actionMenuView, i, z));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.p0 = animatorSet3;
        animatorSet3.addListener(new d());
        this.p0.start();
    }

    public final void G() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.p0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (E()) {
            J(actionMenuView, this.q0, this.D0, false);
        } else {
            J(actionMenuView, 0, false, false);
        }
    }

    public final void H() {
        getTopEdgeTreatment().e = getFabTranslationX();
        this.n0.t((this.D0 && E() && this.s0 == 1) ? 1.0f : 0.0f);
        View viewB = B();
        if (viewB != null) {
            viewB.setTranslationY(getFabTranslationY());
            viewB.setTranslationX(getFabTranslationX());
        }
    }

    public final void I(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().c) {
            getTopEdgeTreatment().c = f;
            this.n0.invalidateSelf();
        }
    }

    public final void J(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        e eVar = new e(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.n0.b.f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        Behavior behavior = this.E0;
        if (behavior != null) {
            return behavior;
        }
        Behavior behavior2 = new Behavior();
        this.E0 = behavior2;
        return behavior2;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d;
    }

    public int getFabAlignmentMode() {
        return this.q0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.u0;
    }

    public int getFabAnchorMode() {
        return this.s0;
    }

    public int getFabAnimationMode() {
        return this.r0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().a;
    }

    public boolean getHideOnScroll() {
        return this.x0;
    }

    public int getMenuAlignmentMode() {
        return this.v0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gcv.c(this, this.n0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.p0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.o0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            H();
            final View viewB = B();
            if (viewB != null && viewB.isLaidOut()) {
                viewB.post(new Runnable() { // from class: v35
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = BottomAppBar.K0;
                        viewB.requestLayout();
                    }
                });
            }
        }
        G();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        this.q0 = savedState.c;
        this.D0 = savedState.d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.q0;
        savedState.d = this.D0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.n0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().c(f);
            this.n0.invalidateSelf();
            H();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        fcv fcvVar = this.n0;
        fcvVar.r(f);
        int iJ = fcvVar.b.p - fcvVar.j();
        Behavior behavior = getBehavior();
        behavior.z = iJ;
        if (behavior.y == 1) {
            setTranslationY(behavior.f + iJ);
        }
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.B0 = i2;
        this.C0 = true;
        F(i, this.D0);
        if (this.q0 != i && isLaidOut()) {
            AnimatorSet animatorSet = this.o0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.r0 == 1) {
                View viewB = B();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewB instanceof FloatingActionButton ? (FloatingActionButton) viewB : null, "translationX", D(i));
                objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                View viewB2 = B();
                FloatingActionButton floatingActionButton = viewB2 instanceof FloatingActionButton ? (FloatingActionButton) viewB2 : null;
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new x35(this, i), true);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(f6w.c(getContext(), R.attr.motionEasingEmphasizedInterpolator, dj0.a));
            this.o0 = animatorSet2;
            animatorSet2.addListener(new w35(this));
            this.o0.start();
        }
        this.q0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            H();
        }
    }

    public void setFabAnchorMode(int i) {
        this.s0 = i;
        H();
        View viewB = B();
        if (viewB != null) {
            K(this, viewB);
            viewB.requestLayout();
            this.n0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.r0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().f) {
            getTopEdgeTreatment().f = f;
            this.n0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().b = f;
            this.n0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().a = f;
            this.n0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.x0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                J(actionMenuView, this.q0, E(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.m0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.m0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.m0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect B;
        public WeakReference<BottomAppBar> C;
        public int D;
        public final a E;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                Rect rect = behavior.B;
                BottomAppBar bottomAppBar = behavior.C.get();
                if (bottomAppBar != null) {
                    int i9 = bottomAppBar.t0;
                    if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                        int height = view.getHeight();
                        if (view instanceof FloatingActionButton) {
                            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                            floatingActionButton.f(rect);
                            int iHeight = rect.height();
                            bottomAppBar.I(iHeight);
                            bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(rect)));
                            height = iHeight;
                        }
                        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
                        if (behavior.D == 0) {
                            if (bottomAppBar.s0 == 1) {
                                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                            }
                            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                            if (view.getLayoutDirection() == 1) {
                                ((ViewGroup.MarginLayoutParams) eVar).leftMargin += i9;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar).rightMargin += i9;
                            }
                        }
                        int i10 = BottomAppBar.K0;
                        bottomAppBar.H();
                        return;
                    }
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.E = new a();
            this.B = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.C = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.K0;
            View viewB = bottomAppBar.B();
            if (viewB != null && !viewB.isLaidOut()) {
                BottomAppBar.K(bottomAppBar, viewB);
                this.D = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) viewB.getLayoutParams())).bottomMargin;
                if (viewB instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewB;
                    if (bottomAppBar.s0 == 0 && bottomAppBar.w0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.c(bottomAppBar.I0);
                    floatingActionButton.d(new z35(bottomAppBar));
                    floatingActionButton.e(bottomAppBar.J0);
                }
                viewB.addOnLayoutChangeListener(this.E);
                bottomAppBar.H();
            }
            coordinatorLayout.u(i, bottomAppBar);
            super.l(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.t(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.E = new a();
            this.B = new Rect();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }
}
