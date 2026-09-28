package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.ecv;
import defpackage.fcv;
import defpackage.gcv;
import defpackage.gof0;
import defpackage.gr0;
import defpackage.o0b;
import defpackage.pk30;
import defpackage.qy80;
import defpackage.rx80;
import defpackage.tbv;
import defpackage.tcv;
import defpackage.vbv;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, qy80 {
    public final tbv i;
    public final boolean v;
    public boolean w;
    public boolean y;
    public static final int[] z = {R.attr.state_checkable};
    public static final int[] A = {R.attr.state_checked};
    public static final int[] B = {com.sportybet.android.gp.tz.R.attr.state_dragged};

    public interface a {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.w = false;
        this.y = false;
        this.v = true;
        TypedArray typedArrayD = gof0.d(getContext(), attributeSet, pk30.G, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_CardView, new int[0]);
        tbv tbvVar = new tbv(this, attributeSet, i);
        this.i = tbvVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        fcv fcvVar = tbvVar.c;
        fcvVar.s(cardBackgroundColor);
        tbvVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        tbvVar.l();
        MaterialCardView materialCardView = tbvVar.a;
        ColorStateList colorStateListA = ecv.a(11, materialCardView.getContext(), typedArrayD);
        tbvVar.n = colorStateListA;
        if (colorStateListA == null) {
            tbvVar.n = ColorStateList.valueOf(-1);
        }
        tbvVar.h = typedArrayD.getDimensionPixelSize(12, 0);
        boolean z2 = typedArrayD.getBoolean(0, false);
        tbvVar.s = z2;
        materialCardView.setLongClickable(z2);
        tbvVar.l = ecv.a(6, materialCardView.getContext(), typedArrayD);
        tbvVar.g(ecv.d(2, materialCardView.getContext(), typedArrayD));
        tbvVar.f = typedArrayD.getDimensionPixelSize(5, 0);
        tbvVar.e = typedArrayD.getDimensionPixelSize(4, 0);
        tbvVar.g = typedArrayD.getInteger(3, 8388661);
        ColorStateList colorStateListA2 = ecv.a(7, materialCardView.getContext(), typedArrayD);
        tbvVar.k = colorStateListA2;
        if (colorStateListA2 == null) {
            tbvVar.k = ColorStateList.valueOf(vbv.b(com.sportybet.android.gp.tz.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListA3 = ecv.a(1, materialCardView.getContext(), typedArrayD);
        colorStateListA3 = colorStateListA3 == null ? ColorStateList.valueOf(0) : colorStateListA3;
        fcv fcvVar2 = tbvVar.d;
        fcvVar2.s(colorStateListA3);
        RippleDrawable rippleDrawable = tbvVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(tbvVar.k);
        }
        fcvVar.r(materialCardView.getCardElevation());
        float f = tbvVar.h;
        ColorStateList colorStateList = tbvVar.n;
        fcvVar2.z(f);
        fcvVar2.y(colorStateList);
        materialCardView.setBackgroundInternal(tbvVar.d(fcvVar));
        Drawable drawableC = tbvVar.j() ? tbvVar.c() : fcvVar2;
        tbvVar.i = drawableC;
        materialCardView.setForeground(tbvVar.d(drawableC));
        typedArrayD.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.i.c.getBounds());
        return rectF;
    }

    public final void f() {
        tbv tbvVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (tbvVar = this.i).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        tbvVar.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        tbvVar.o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    public final void g(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.i.c.b.d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.i.d.b.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.i.j;
    }

    public int getCheckedIconGravity() {
        return this.i.g;
    }

    public int getCheckedIconMargin() {
        return this.i.e;
    }

    public int getCheckedIconSize() {
        return this.i.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.i.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.i.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.i.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.i.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.i.b.top;
    }

    public float getProgress() {
        return this.i.c.b.j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.i.c.l();
    }

    public ColorStateList getRippleColor() {
        return this.i.k;
    }

    public rx80 getShapeAppearanceModel() {
        return this.i.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.i.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.i.n;
    }

    public int getStrokeWidth() {
        return this.i.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tbv tbvVar = this.i;
        tbvVar.k();
        gcv.c(this, tbvVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        tbv tbvVar = this.i;
        if (tbvVar != null && tbvVar.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        if (this.w) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        if (this.y) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.w);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        tbv tbvVar = this.i;
        accessibilityNodeInfo.setCheckable(tbvVar != null && tbvVar.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.w);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.i.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.v) {
            tbv tbvVar = this.i;
            if (!tbvVar.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                tbvVar.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.i.c.s(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        tbv tbvVar = this.i;
        tbvVar.c.r(tbvVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        fcv fcvVar = this.i.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        fcvVar.s(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.i.s = z2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.w != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.i.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        tbv tbvVar = this.i;
        if (tbvVar.g != i) {
            tbvVar.g = i;
            MaterialCardView materialCardView = tbvVar.a;
            tbvVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.i.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.i.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.i.g(gr0.a(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.i.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.i.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        tbv tbvVar = this.i;
        tbvVar.l = colorStateList;
        Drawable drawable = tbvVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        tbv tbvVar = this.i;
        if (tbvVar != null) {
            tbvVar.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        tbv tbvVar = this.i;
        tbvVar.b.set(i, i2, i3, i4);
        tbvVar.l();
    }

    public void setDragged(boolean z2) {
        if (this.y != z2) {
            this.y = z2;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.i.m();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        tbv tbvVar = this.i;
        tbvVar.m();
        tbvVar.l();
    }

    public void setProgress(float f) {
        tbv tbvVar = this.i;
        tbvVar.c.t(f);
        fcv fcvVar = tbvVar.d;
        if (fcvVar != null) {
            fcvVar.t(f);
        }
        fcv fcvVar2 = tbvVar.q;
        if (fcvVar2 != null) {
            fcvVar2.t(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        tbv tbvVar = this.i;
        rx80.a aVarH = tbvVar.m.h();
        aVarH.b(f);
        tbvVar.h(aVarH.a());
        tbvVar.i.invalidateSelf();
        if (tbvVar.i() || (tbvVar.a.getPreventCornerOverlap() && !tbvVar.c.p())) {
            tbvVar.l();
        }
        if (tbvVar.i()) {
            tbvVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        tbv tbvVar = this.i;
        tbvVar.k = colorStateList;
        RippleDrawable rippleDrawable = tbvVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListB = o0b.b(getContext(), i);
        tbv tbvVar = this.i;
        tbvVar.k = colorStateListB;
        RippleDrawable rippleDrawable = tbvVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListB);
        }
    }

    @Override // defpackage.qy80
    public void setShapeAppearanceModel(rx80 rx80Var) {
        setClipToOutline(rx80Var.g(getBoundsAsRectF()));
        this.i.h(rx80Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        tbv tbvVar = this.i;
        if (tbvVar.n != colorStateList) {
            tbvVar.n = colorStateList;
            fcv fcvVar = tbvVar.d;
            fcvVar.z(tbvVar.h);
            fcvVar.y(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        tbv tbvVar = this.i;
        if (i != tbvVar.h) {
            tbvVar.h = i;
            fcv fcvVar = tbvVar.d;
            ColorStateList colorStateList = tbvVar.n;
            fcvVar.z(i);
            fcvVar.y(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        tbv tbvVar = this.i;
        tbvVar.m();
        tbvVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        tbv tbvVar = this.i;
        if (tbvVar != null && tbvVar.s && isEnabled()) {
            this.w = !this.w;
            refreshDrawableState();
            f();
            tbvVar.f(this.w, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.i.c.s(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
