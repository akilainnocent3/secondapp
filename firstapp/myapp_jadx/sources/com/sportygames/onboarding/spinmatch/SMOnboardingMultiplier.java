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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\f\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010#\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010&\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c¨\u0006'"}, d2 = {"Lcom/sportygames/onboarding/spinmatch/SMOnboardingMultiplier;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "", "", "getBoxVerticalCoordinates", "()[Ljava/lang/Float;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "a0", "Ljava/lang/Float;", "getFocusBox2Height1", "()Ljava/lang/Float;", "setFocusBox2Height1", "(Ljava/lang/Float;)V", "focusBox2Height1", "b0", "getFocusBox2Height2", "setFocusBox2Height2", "focusBox2Height2", "", "c0", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "d0", "getDEFAULT_URL", "DEFAULT_URL", "e0", "getTEXT_KEY", "TEXT_KEY", "f0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SMOnboardingMultiplier extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;
    public final float U;
    public final float V;
    public final float W;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public Float focusBox2Height1;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public Float focusBox2Height2;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final String BITMAP_KEY;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final String DEFAULT_URL;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public SMOnboardingMultiplier(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 0.035f;
        this.R = 0.0205f;
        this.S = a(7.0f);
        this.T = 0.035f;
        this.U = 0.5f;
        this.V = 0.035f;
        this.W = 0.3f;
        String string = context.getString(R.string.onboarding_brand_up_full_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_up_full_1721652336716.png";
        String string2 = context.getString(R.string.onboarding_multiplier_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_multiplier_text);
        string3.getClass();
        this.DEFAULT_TEXT = string3;
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
    public String getBITMAP_KEY() {
        return this.BITMAP_KEY;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getDEFAULT_TEXT() {
        return this.DEFAULT_TEXT;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getDEFAULT_URL() {
        return this.DEFAULT_URL;
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
        float f = size;
        float f2 = this.T;
        float f3 = this.U;
        float f4 = (f3 - f2) * f;
        f((int) f4, (int) ((111.0f * f4) / 44.0f));
        DynamicOnboardingScreenBasicBase.h(this, (int) ((f - (f3 * f)) - ((size * 2) * this.V)), (int) (size2 * this.W), null, null, 12);
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
        d(canvas, getWidth() * this.T, (getHeight() * 0.018f) + getBoxVerticalCoordinates()[1].floatValue());
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e(canvas, (this.U + this.V) * getWidth(), (getHeight() * 0.018f) + getBoxVerticalCoordinates()[1].floatValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingMultiplier(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingMultiplier(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingMultiplier(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
