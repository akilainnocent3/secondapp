package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.gof0;
import defpackage.jwf;
import defpackage.pk30;
import defpackage.tcv;
import defpackage.vbv;

/* JADX INFO: loaded from: classes4.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] p0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final jwf l0;
    public ColorStateList m0;
    public ColorStateList n0;
    public boolean o0;

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i);
        Context context2 = getContext();
        this.l0 = new jwf(context2);
        gof0.a(context2, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = pk30.g0;
        gof0.b(context2, attributeSet, iArr, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.o0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        ColorStateList colorStateList = this.m0;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iB = vbv.b(com.sportybet.android.gp.tz.R.attr.colorSurface, this);
        int iB2 = vbv.b(com.sportybet.android.gp.tz.R.attr.colorControlActivated, this);
        float dimension = getResources().getDimension(com.sportybet.android.gp.tz.R.dimen.mtrl_switch_thumb_elevation);
        jwf jwfVar = this.l0;
        if (jwfVar.a) {
            float elevation = 0.0f;
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                elevation += ((View) parent).getElevation();
            }
            dimension += elevation;
        }
        int iA = jwfVar.a(iB, dimension);
        ColorStateList colorStateList2 = new ColorStateList(p0, new int[]{vbv.g(1.0f, iB, iB2), iA, vbv.g(0.38f, iB, iB2), iA});
        this.m0 = colorStateList2;
        return colorStateList2;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        ColorStateList colorStateList = this.n0;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iB = vbv.b(com.sportybet.android.gp.tz.R.attr.colorSurface, this);
        int iB2 = vbv.b(com.sportybet.android.gp.tz.R.attr.colorControlActivated, this);
        int iB3 = vbv.b(com.sportybet.android.gp.tz.R.attr.colorOnSurface, this);
        ColorStateList colorStateList2 = new ColorStateList(p0, new int[]{vbv.g(0.54f, iB, iB2), vbv.g(0.32f, iB, iB3), vbv.g(0.12f, iB, iB2), vbv.g(0.12f, iB, iB3)});
        this.n0 = colorStateList2;
        return colorStateList2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.o0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.o0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.o0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.switchStyle);
    }

    public SwitchMaterial(Context context) {
        this(context, null);
    }
}
