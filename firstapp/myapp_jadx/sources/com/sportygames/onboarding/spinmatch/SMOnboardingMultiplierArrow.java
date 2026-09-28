package com.sportygames.onboarding.spinmatch;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import defpackage.k660;
import defpackage.pga;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\f\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006'"}, d2 = {"Lcom/sportygames/onboarding/spinmatch/SMOnboardingMultiplierArrow;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "", "", "getBoxVerticalCoordinates", "()[Ljava/lang/Float;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "W", "Ljava/lang/Float;", "getFocusBox2Height1", "()Ljava/lang/Float;", "setFocusBox2Height1", "(Ljava/lang/Float;)V", "focusBox2Height1", "a0", "getFocusBox2Height2", "setFocusBox2Height2", "focusBox2Height2", "", "b0", "I", "getBITMAP_ID", "()I", "BITMAP_ID", "", "c0", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "d0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SMOnboardingMultiplierArrow extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;
    public final float U;
    public final float V;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public Float focusBox2Height1;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public Float focusBox2Height2;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final int BITMAP_ID;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public SMOnboardingMultiplierArrow(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 0.035f;
        this.R = 0.0205f;
        this.S = a(7.0f);
        this.T = 0.07f;
        this.U = 0.78f;
        this.V = 0.25f;
        this.BITMAP_ID = R.drawable.onb_arrow_down;
        String string = context.getString(R.string.onboarding_multiplier_cms);
        string.getClass();
        this.TEXT_KEY = string;
        String string2 = context.getString(R.string.onboarding_multiplier_text);
        string2.getClass();
        this.DEFAULT_TEXT = string2;
    }

    private final Float[] getBoxVerticalCoordinates() {
        Float f = this.focusBox2Height1;
        float fFloatValue = (f != null ? f.floatValue() : 0.0f) + 0.09f;
        Float f2 = this.focusBox2Height2;
        float fFloatValue2 = (1.0f - ((fFloatValue + (f2 != null ? f2.floatValue() : 0.0f)) + 0.09f)) * getHeight();
        float width = (getWidth() - (getContext().getResources().getDimension(R.dimen._3sdp) * 2.0f)) / 4.5f;
        float f3 = (0.055f * width) + (fFloatValue2 - (width / 5.3999996f));
        return new Float[]{k660.a(width, 0.06f, f3 - (width - (width / 2.8f))), Float.valueOf(f3)};
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public int getBITMAP_ID() {
        return this.BITMAP_ID;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getDEFAULT_TEXT() {
        return this.DEFAULT_TEXT;
    }

    public final Float getFocusBox2Height1() {
        return this.focusBox2Height1;
    }

    public final Float getFocusBox2Height2() {
        return this.focusBox2Height2;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getTEXT_KEY() {
        return this.TEXT_KEY;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 || size2 == 0) {
            return;
        }
        setMeasuredDimension(size, size2);
        float f = size2;
        int i3 = (int) (this.T * f);
        f(i3, i3);
        DynamicOnboardingScreenBasicBase.h(this, (int) (size * this.U), (int) (f * this.V), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    public final void setFocusBox2Height1(Float f) {
        this.focusBox2Height1 = f;
    }

    public final void setFocusBox2Height2(Float f) {
        this.focusBox2Height2 = f;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float fFloatValue = getBoxVerticalCoordinates()[0].floatValue();
        float fFloatValue2 = getBoxVerticalCoordinates()[1].floatValue();
        Float fValueOf = Float.valueOf(getWidth() * this.Q);
        Float fA = k660.a(getHeight(), 0.0038f, fFloatValue);
        Float fValueOf2 = Float.valueOf((1.0f - this.R) * getWidth());
        Float fA2 = pga.a(getHeight(), 0.003f, fFloatValue2);
        float f = this.S;
        b(canvas, fValueOf, fA, fValueOf2, fA2, Float.valueOf(f), Float.valueOf(f), (524160 & 128) != 0 ? null : null, (524160 & 256) != 0 ? null : null, (524160 & 512) != 0 ? null : null, (524160 & 1024) != 0 ? null : null, (524160 & 2048) != 0 ? null : null, (524160 & 4096) != 0 ? null : null, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float width = getWidth() * 0.4f;
        float height = getHeight();
        d(canvas, width, (getBoxVerticalCoordinates()[0].floatValue() - (0.03f * height)) - (height * this.T));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float height = getHeight();
        e(canvas, 0.0f, (((getBoxVerticalCoordinates()[0].floatValue() - (0.03f * height)) - (height * this.T)) - (getHeight() * 0.01f)) - (getHeight() * this.V));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingMultiplierArrow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingMultiplierArrow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingMultiplierArrow(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
