package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.sportybet.android.gp.tz.R;
import defpackage.b6w;
import defpackage.gof0;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.j32;
import defpackage.mk0;
import defpackage.pae;
import defpackage.pk30;
import defpackage.q2h;
import defpackage.rx80;
import defpackage.tcv;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final b q0 = new b(Float.class, "width");
    public static final c r0 = new c(Float.class, "height");
    public static final d s0 = new d(Float.class, "paddingStart");
    public static final e t0 = new e(Float.class, "paddingEnd");
    public int a0;
    public boolean b0;
    public final f c0;
    public final f d0;
    public final h e0;
    public final g f0;
    public final int g0;
    public int h0;
    public int i0;
    public final ExtendedFloatingActionButtonBehavior j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public ColorStateList n0;
    public int o0;
    public int p0;

    public class a implements i {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final ViewGroup.LayoutParams a() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final int b() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final int c() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }
    }

    public class b extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    public class d extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.setPaddingRelative(f.intValue(), view2.getPaddingTop(), view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    public class e extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    public class f extends j32 {
        public final i g;
        public final boolean h;

        public f(mk0 mk0Var, i iVar, boolean z) {
            super(ExtendedFloatingActionButton.this, mk0Var);
            this.g = iVar;
            this.h = z;
        }

        @Override // defpackage.c6w
        public final void a() {
            this.d.a = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.l0 = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            i iVar = this.g;
            layoutParams.width = iVar.a().width;
            layoutParams.height = iVar.a().height;
        }

        @Override // defpackage.c6w
        public final void c() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z = this.h;
            extendedFloatingActionButton.k0 = z;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!z) {
                extendedFloatingActionButton.o0 = layoutParams.width;
                extendedFloatingActionButton.p0 = layoutParams.height;
            }
            i iVar = this.g;
            layoutParams.width = iVar.a().width;
            layoutParams.height = iVar.a().height;
            if (z) {
                extendedFloatingActionButton.l(extendedFloatingActionButton.n0);
            } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
                extendedFloatingActionButton.l(ColorStateList.valueOf(0));
            }
            extendedFloatingActionButton.setPaddingRelative(iVar.getPaddingStart(), extendedFloatingActionButton.getPaddingTop(), iVar.getPaddingEnd(), extendedFloatingActionButton.getPaddingBottom());
            extendedFloatingActionButton.requestLayout();
        }

        @Override // defpackage.c6w
        public final boolean d() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return this.h == extendedFloatingActionButton.k0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
        }

        @Override // defpackage.c6w
        public final int e() {
            return this.h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // defpackage.j32, defpackage.c6w
        public final AnimatorSet f() {
            b6w b6wVarB = this.f;
            if (b6wVarB == null) {
                b6wVarB = this.e;
                if (b6wVarB == null) {
                    b6wVarB = b6w.b(this.a, e());
                    this.e = b6wVarB;
                }
                b6wVarB.getClass();
            }
            boolean zG = b6wVarB.g("width");
            i iVar = this.g;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (zG) {
                PropertyValuesHolder[] propertyValuesHolderArrE = b6wVarB.e("width");
                propertyValuesHolderArrE[0].setFloatValues(extendedFloatingActionButton.getWidth(), iVar.c());
                b6wVarB.h("width", propertyValuesHolderArrE);
            }
            if (b6wVarB.g("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrE2 = b6wVarB.e("height");
                propertyValuesHolderArrE2[0].setFloatValues(extendedFloatingActionButton.getHeight(), iVar.b());
                b6wVarB.h("height", propertyValuesHolderArrE2);
            }
            if (b6wVarB.g("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrE3 = b6wVarB.e("paddingStart");
                propertyValuesHolderArrE3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), iVar.getPaddingStart());
                b6wVarB.h("paddingStart", propertyValuesHolderArrE3);
            }
            if (b6wVarB.g("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrE4 = b6wVarB.e("paddingEnd");
                propertyValuesHolderArrE4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), iVar.getPaddingEnd());
                b6wVarB.h("paddingEnd", propertyValuesHolderArrE4);
            }
            if (b6wVarB.g("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrE5 = b6wVarB.e("labelOpacity");
                boolean z = this.h;
                propertyValuesHolderArrE5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                b6wVarB.h("labelOpacity", propertyValuesHolderArrE5);
            }
            return g(b6wVarB);
        }

        @Override // defpackage.c6w
        public final void onAnimationStart(Animator animator) {
            mk0 mk0Var = this.d;
            Animator animator2 = mk0Var.a;
            if (animator2 != null) {
                animator2.cancel();
            }
            mk0Var.a = animator;
            boolean z = this.h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.k0 = z;
            extendedFloatingActionButton.l0 = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    public class g extends j32 {
        public boolean g;

        public g(mk0 mk0Var) {
            super(ExtendedFloatingActionButton.this, mk0Var);
        }

        @Override // defpackage.c6w
        public final void a() {
            this.d.a = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.a0 = 0;
            if (this.g) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // defpackage.j32, defpackage.c6w
        public final void b() {
            super.b();
            this.g = true;
        }

        @Override // defpackage.c6w
        public final void c() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // defpackage.c6w
        public final boolean d() {
            b bVar = ExtendedFloatingActionButton.q0;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int visibility = extendedFloatingActionButton.getVisibility();
            int i = extendedFloatingActionButton.a0;
            if (visibility == 0) {
                if (i != 1) {
                    return false;
                }
            } else if (i == 2) {
                return false;
            }
            return true;
        }

        @Override // defpackage.c6w
        public final int e() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // defpackage.c6w
        public final void onAnimationStart(Animator animator) {
            mk0 mk0Var = this.d;
            Animator animator2 = mk0Var.a;
            if (animator2 != null) {
                animator2.cancel();
            }
            mk0Var.a = animator;
            this.g = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.a0 = 1;
        }
    }

    public class h extends j32 {
        public h(mk0 mk0Var) {
            super(ExtendedFloatingActionButton.this, mk0Var);
        }

        @Override // defpackage.c6w
        public final void a() {
            this.d.a = null;
            ExtendedFloatingActionButton.this.a0 = 0;
        }

        @Override // defpackage.c6w
        public final void c() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // defpackage.c6w
        public final boolean d() {
            b bVar = ExtendedFloatingActionButton.q0;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int visibility = extendedFloatingActionButton.getVisibility();
            int i = extendedFloatingActionButton.a0;
            if (visibility != 0) {
                if (i != 2) {
                    return false;
                }
            } else if (i == 1) {
                return false;
            }
            return true;
        }

        @Override // defpackage.c6w
        public final int e() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // defpackage.c6w
        public final void onAnimationStart(Animator animator) {
            mk0 mk0Var = this.d;
            Animator animator2 = mk0Var.a;
            if (animator2 != null) {
                animator2.cancel();
            }
            mk0Var.a = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.a0 = 2;
        }
    }

    public interface i {
        ViewGroup.LayoutParams a();

        int b();

        int c();

        int getPaddingEnd();

        int getPaddingStart();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(tcv.a(context, attributeSet, i2, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i2);
        this.a0 = 0;
        this.b0 = true;
        mk0 mk0Var = new mk0();
        h hVar = new h(mk0Var);
        this.e0 = hVar;
        g gVar = new g(mk0Var);
        this.f0 = gVar;
        this.k0 = true;
        this.l0 = false;
        this.m0 = false;
        Context context2 = getContext();
        this.j0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayD = gof0.d(context2, attributeSet, pk30.q, i2, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        b6w b6wVarA = b6w.a(5, context2, typedArrayD);
        b6w b6wVarA2 = b6w.a(4, context2, typedArrayD);
        b6w b6wVarA3 = b6w.a(2, context2, typedArrayD);
        b6w b6wVarA4 = b6w.a(6, context2, typedArrayD);
        this.g0 = typedArrayD.getDimensionPixelSize(0, -1);
        int i3 = typedArrayD.getInt(3, 1);
        this.h0 = getPaddingStart();
        this.i0 = getPaddingEnd();
        mk0 mk0Var2 = new mk0();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a(this);
        com.google.android.material.floatingactionbutton.b bVar = new com.google.android.material.floatingactionbutton.b(this, aVar);
        com.google.android.material.floatingactionbutton.c cVar = new com.google.android.material.floatingactionbutton.c(this, bVar, aVar);
        boolean z = true;
        i iVar = aVar;
        if (i3 != 1) {
            i iVar2 = i3 != 2 ? cVar : bVar;
            z = true;
            iVar = iVar2;
        }
        f fVar = new f(mk0Var2, iVar, z);
        this.d0 = fVar;
        f fVar2 = new f(mk0Var2, new a(), false);
        this.c0 = fVar2;
        hVar.f = b6wVarA;
        gVar.f = b6wVarA2;
        fVar.f = b6wVarA3;
        fVar2.f = b6wVarA4;
        typedArrayD.recycle();
        setShapeAppearanceModel(rx80.c(context2, attributeSet, i2, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, rx80.m).a());
        this.n0 = getTextColors();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.j0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i2 = this.g0;
        if (i2 >= 0) {
            return i2;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public b6w getExtendMotionSpec() {
        return this.d0.f;
    }

    public b6w getHideMotionSpec() {
        return this.f0.f;
    }

    public b6w getShowMotionSpec() {
        return this.e0.f;
    }

    public b6w getShrinkMotionSpec() {
        return this.c0.f;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e A[LOOP:0: B:37:0x007c->B:38:0x007e, LOOP_END] */
    public final void k(int i2) {
        j32 j32Var;
        int i3;
        AnimatorSet animatorSetF;
        ArrayList<Animator.AnimatorListener> arrayList;
        int size;
        ViewGroup.LayoutParams layoutParams;
        if (i2 == 0) {
            j32Var = this.e0;
        } else if (i2 == 1) {
            j32Var = this.f0;
        } else if (i2 == 2) {
            j32Var = this.c0;
        } else {
            if (i2 != 3) {
                ib5.a(hce0.a(i2, "Unknown strategy type: "));
                return;
            }
            j32Var = this.d0;
        }
        if (j32Var.d()) {
            return;
        }
        if (this.b0) {
            if (!isLaidOut()) {
                int visibility = getVisibility();
                int i4 = this.a0;
                if (visibility == 0 ? i4 == 1 : i4 != 2) {
                    if (this.m0) {
                        if (!isInEditMode()) {
                            if (i2 == 2) {
                                layoutParams = getLayoutParams();
                                if (layoutParams != null) {
                                    this.o0 = layoutParams.width;
                                    this.p0 = layoutParams.height;
                                } else {
                                    this.o0 = getWidth();
                                    this.p0 = getHeight();
                                }
                            }
                            i3 = 0;
                            measure(0, 0);
                            animatorSetF = j32Var.f();
                            animatorSetF.addListener(new q2h(j32Var));
                            arrayList = j32Var.c;
                            size = arrayList.size();
                            while (i3 < size) {
                                Animator.AnimatorListener animatorListener = arrayList.get(i3);
                                i3++;
                                animatorSetF.addListener(animatorListener);
                            }
                            animatorSetF.start();
                            return;
                        }
                    }
                }
            } else if (!isInEditMode()) {
                if (i2 == 2) {
                    layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.o0 = layoutParams.width;
                        this.p0 = layoutParams.height;
                    } else {
                        this.o0 = getWidth();
                        this.p0 = getHeight();
                    }
                }
                i3 = 0;
                measure(0, 0);
                animatorSetF = j32Var.f();
                animatorSetF.addListener(new q2h(j32Var));
                arrayList = j32Var.c;
                size = arrayList.size();
                while (i3 < size) {
                    Animator.AnimatorListener animatorListener2 = arrayList.get(i3);
                    i3++;
                    animatorSetF.addListener(animatorListener2);
                }
                animatorSetF.start();
                return;
            }
        }
        j32Var.c();
    }

    public final void l(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.k0 = false;
            this.c0.c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.m0 = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.b0 = z;
    }

    public void setExtendMotionSpec(b6w b6wVar) {
        this.d0.f = b6wVar;
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(b6w.b(getContext(), i2));
    }

    public void setExtended(boolean z) {
        if (this.k0 == z) {
            return;
        }
        f fVar = z ? this.d0 : this.c0;
        if (fVar.d()) {
            return;
        }
        fVar.c();
    }

    public void setHideMotionSpec(b6w b6wVar) {
        this.f0.f = b6wVar;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(b6w.b(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (!this.k0 || this.l0) {
            return;
        }
        this.h0 = getPaddingStart();
        this.i0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        if (!this.k0 || this.l0) {
            return;
        }
        this.h0 = i2;
        this.i0 = i4;
    }

    public void setShowMotionSpec(b6w b6wVar) {
        this.e0.f = b6wVar;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(b6w.b(getContext(), i2));
    }

    public void setShrinkMotionSpec(b6w b6wVar) {
        this.c0.f = b6wVar;
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(b6w.b(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        this.n0 = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.n0 = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        public Rect a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pk30.r);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean e(Rect rect, View view) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void g(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.e ? ((CoordinatorLayout.e) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListL = coordinatorLayout.l(extendedFloatingActionButton);
            int size = arrayListL.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListL.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.e ? ((CoordinatorLayout.e) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.u(i, extendedFloatingActionButton);
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || eVar.f != appBarLayout.getId()) {
                return false;
            }
            Rect rect = this.a;
            if (rect == null) {
                rect = new Rect();
                this.a = rect;
            }
            pae.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i = z2 ? 2 : 1;
                b bVar = ExtendedFloatingActionButton.q0;
                extendedFloatingActionButton.k(i);
            } else {
                int i2 = z2 ? 3 : 0;
                b bVar2 = ExtendedFloatingActionButton.q0;
                extendedFloatingActionButton.k(i2);
            }
            return true;
        }

        public final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || eVar.f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                int i = z2 ? 2 : 1;
                b bVar = ExtendedFloatingActionButton.q0;
                extendedFloatingActionButton.k(i);
            } else {
                int i2 = z2 ? 3 : 0;
                b bVar2 = ExtendedFloatingActionButton.q0;
                extendedFloatingActionButton.k(i2);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }
}
