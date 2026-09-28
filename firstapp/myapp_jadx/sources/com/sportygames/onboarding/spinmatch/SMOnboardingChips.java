package com.sportygames.onboarding.spinmatch;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingFocusBox;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010#\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019¨\u0006$"}, d2 = {"Lcom/sportygames/onboarding/spinmatch/SMOnboardingChips;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "d0", "Ljava/lang/Float;", "getFocusBox2Height1", "()Ljava/lang/Float;", "setFocusBox2Height1", "(Ljava/lang/Float;)V", "focusBox2Height1", "e0", "getFocusBox2Height2", "setFocusBox2Height2", "focusBox2Height2", "", "f0", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "g0", "getDEFAULT_URL", "DEFAULT_URL", "h0", "getTEXT_KEY", "TEXT_KEY", "i0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SMOnboardingChips extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;
    public final float U;
    public final float V;
    public final float W;
    public final float a0;
    public final float b0;
    public final float c0;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public Float focusBox2Height1;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public Float focusBox2Height2;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final String BITMAP_KEY;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public final String DEFAULT_URL;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public SMOnboardingChips(Context context, AttributeSet attributeSet, int i, int i2) {
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet2, i3, 0);
        this.Q = 0.13f;
        this.R = 0.13f;
        this.S = 0.79f;
        this.T = 0.122f;
        this.U = 10000.0f;
        this.V = 15.0f;
        this.W = 0.5555f;
        this.a0 = 0.56f;
        this.b0 = 0.02f;
        this.c0 = 0.34f;
        String string = context.getString(R.string.onboarding_brand_left_full_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_left_full_1721651992176.png";
        String string2 = context.getString(R.string.onboarding_select_chips_wager_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_select_chips_wager_text);
        string3.getClass();
        this.DEFAULT_TEXT = string3;
        setFocusBoxPrimary(new OnboardingFocusBox(0.13f, 0.79f, 0.13f, 0.122f, 0.0f, 0.0f, 0.0f, 0.0f, 10000.0f, 240, null));
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

    public final Float[] i(int i) {
        float f = i;
        float dimension = (f - (getContext().getResources().getDimension(R.dimen._3sdp) * 2.0f)) / 4.5f;
        float f2 = dimension / 2.8f;
        float f3 = dimension - f2;
        float f4 = f2 / 2.0f;
        float f5 = f * 0.007f;
        return new Float[]{Float.valueOf((getContext().getResources().getDimension(R.dimen._3sdp) + f4) - f5), Float.valueOf(getContext().getResources().getDimension(R.dimen._3sdp) + f4 + f3 + f5)};
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
        float f2 = this.W;
        float f3 = f * f2;
        f((int) f3, (int) (f * f2 * 2.1361501f));
        DynamicOnboardingScreenBasicBase.h(this, (int) (((f3 * 0.33f) + ((this.a0 * f) - i(size)[1].floatValue())) - (0.05f * f)), (int) (((int) (f * f2 * 2.1361501f)) * this.c0), null, DynamicOnboardingScreenBasicBase.a.c, 4);
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
        Float f = this.focusBox2Height1;
        float fFloatValue = (f != null ? f.floatValue() : 0.0f) + 0.09f;
        Float f2 = this.focusBox2Height2;
        float fFloatValue2 = (1.0f - ((fFloatValue + (f2 != null ? f2.floatValue() : 0.0f)) + 0.09f)) * getHeight();
        float width = (getWidth() - (getContext().getResources().getDimension(R.dimen._3sdp) * 2.0f)) / 4.5f;
        float f3 = width - (width / 2.8f);
        float fA = fFloatValue2 - ((width / 5.3999996f) - a(1.0f));
        float width2 = (getWidth() * 0.01f) + fA;
        float width3 = (fA - f3) - (getWidth() * 0.007f);
        Float fValueOf = Float.valueOf(this.Q * getWidth());
        Float fValueOf2 = Float.valueOf(this.S * getHeight());
        Float fValueOf3 = Float.valueOf((1.0f - this.R) * getWidth());
        Float fValueOf4 = Float.valueOf((1.0f - this.T) * getHeight());
        float f4 = this.U;
        Float fValueOf5 = Float.valueOf(f4);
        Float fValueOf6 = Float.valueOf(f4);
        Float f5 = i(getWidth())[0];
        Float fValueOf7 = Float.valueOf(width3);
        Float f6 = i(getWidth())[1];
        Float fValueOf8 = Float.valueOf(width2);
        float f7 = this.V;
        b(canvas, fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6, (524160 & 128) != 0 ? null : f5, (524160 & 256) != 0 ? null : fValueOf7, (524160 & 512) != 0 ? null : f6, (524160 & 1024) != 0 ? null : fValueOf8, (524160 & 2048) != 0 ? null : Float.valueOf(f7), (524160 & 4096) != 0 ? null : Float.valueOf(f7), null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float width = getWidth() * this.a0;
        float height = getHeight();
        d(canvas, width, ((this.S * height) - (((int) ((getWidth() * this.W) * 2.1361501f)) * 0.4f)) - (height * 0.02f));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float height = getHeight();
        e(canvas, (getWidth() * this.b0) + i(getWidth())[1].floatValue(), ((this.S * height) - (((int) ((getWidth() * this.W) * 2.1361501f)) * 0.4f)) - (height * 0.02f));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingChips(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingChips(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SMOnboardingChips(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
