package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.sportybet.android.gp.tz.R;
import defpackage.b78;
import defpackage.eai0;
import defpackage.fyf0;
import defpackage.gof0;
import defpackage.gr0;
import defpackage.pk30;
import defpackage.tcv;
import defpackage.udf;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int[] y0 = {R.attr.state_with_icon};
    public Drawable l0;
    public Drawable m0;
    public int n0;
    public Drawable o0;
    public Drawable p0;
    public ColorStateList q0;
    public ColorStateList r0;
    public PorterDuff.Mode s0;
    public ColorStateList t0;
    public ColorStateList u0;
    public PorterDuff.Mode v0;
    public int[] w0;
    public int[] x0;

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.n0 = -1;
        Context context2 = getContext();
        this.l0 = super.getThumbDrawable();
        this.q0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.o0 = super.getTrackDrawable();
        this.t0 = super.getTrackTintList();
        super.setTrackTintList(null);
        fyf0 fyf0VarE = gof0.e(context2, attributeSet, pk30.M, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.m0 = fyf0VarE.b(0);
        TypedArray typedArray = fyf0VarE.b;
        this.n0 = typedArray.getDimensionPixelSize(1, -1);
        this.r0 = fyf0VarE.a(2);
        int i2 = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.s0 = eai0.f(i2, mode);
        this.p0 = fyf0VarE.b(4);
        this.u0 = fyf0VarE.a(5);
        this.v0 = eai0.f(typedArray.getInt(6, -1), mode);
        fyf0VarE.g();
        setEnforceSwitchWidth(false);
        e();
        f();
    }

    public static void g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(b78.b(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
    }

    public final void e() {
        this.l0 = udf.b(this.l0, this.q0, getThumbTintMode());
        this.m0 = udf.b(this.m0, this.r0, this.s0);
        h();
        Drawable drawable = this.l0;
        Drawable drawable2 = this.m0;
        int i = this.n0;
        super.setThumbDrawable(udf.a(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    public final void f() {
        this.o0 = udf.b(this.o0, this.t0, getTrackTintMode());
        this.p0 = udf.b(this.p0, this.u0, this.v0);
        h();
        Drawable layerDrawable = this.o0;
        if (layerDrawable != null && this.p0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.o0, this.p0});
        } else if (layerDrawable == null) {
            layerDrawable = this.p0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.l0;
    }

    public Drawable getThumbIconDrawable() {
        return this.m0;
    }

    public int getThumbIconSize() {
        return this.n0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.r0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.s0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.q0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.p0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.u0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.v0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.o0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.t0;
    }

    public final void h() {
        if (this.q0 == null && this.r0 == null && this.t0 == null && this.u0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.q0;
        if (colorStateList != null) {
            g(this.l0, colorStateList, this.w0, this.x0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.r0;
        if (colorStateList2 != null) {
            g(this.m0, colorStateList2, this.w0, this.x0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.t0;
        if (colorStateList3 != null) {
            g(this.o0, colorStateList3, this.w0, this.x0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.u0;
        if (colorStateList4 != null) {
            g(this.p0, colorStateList4, this.w0, this.x0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.m0 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.w0 = iArr;
        this.x0 = udf.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.l0 = drawable;
        e();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.m0 = drawable;
        e();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(gr0.a(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.n0 != i) {
            this.n0 = i;
            e();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.r0 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.s0 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.q0 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.p0 = drawable;
        f();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(gr0.a(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.v0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.o0 = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context) {
        this(context, null);
    }
}
