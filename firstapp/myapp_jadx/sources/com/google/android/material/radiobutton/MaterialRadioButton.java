package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import defpackage.ecv;
import defpackage.gof0;
import defpackage.pk30;
import defpackage.tcv;
import defpackage.vbv;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int[][] i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i2) {
        super(tcv.a(context, attributeSet, i2, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayD = gof0.d(context2, attributeSet, pk30.J, i2, com.sportybet.android.gp.tz.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            setButtonTintList(ecv.a(0, context2, typedArrayD));
        }
        this.f = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iB = vbv.b(com.sportybet.android.gp.tz.R.attr.colorControlActivated, this);
        int iB2 = vbv.b(com.sportybet.android.gp.tz.R.attr.colorOnSurface, this);
        int iB3 = vbv.b(com.sportybet.android.gp.tz.R.attr.colorSurface, this);
        ColorStateList colorStateList2 = new ColorStateList(i, new int[]{vbv.g(1.0f, iB3, iB), vbv.g(0.54f, iB3, iB2), vbv.g(0.38f, iB3, iB2), vbv.g(0.38f, iB3, iB2)});
        this.e = colorStateList2;
        return colorStateList2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context) {
        this(context, null);
    }
}
