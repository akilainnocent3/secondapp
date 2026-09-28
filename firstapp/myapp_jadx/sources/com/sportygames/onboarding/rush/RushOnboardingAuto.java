package com.sportygames.onboarding.rush;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sportygames/onboarding/rush/RushOnboardingAuto;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "U", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "V", "getDEFAULT_URL", "DEFAULT_URL", "W", "getTEXT_KEY", "TEXT_KEY", "a0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RushOnboardingAuto extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final String BITMAP_KEY;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final String DEFAULT_URL;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public RushOnboardingAuto(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 10000.0f;
        this.R = 0.08f;
        this.S = 0.05f;
        this.T = 0.82f;
        String string = context.getString(R.string.onboarding_brand_right_half_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_right_half_1721652291642.png";
        String string2 = context.getString(R.string.onboarding_place_auto_bet_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_place_auto_bet_text);
        string3.getClass();
        this.DEFAULT_TEXT = string3;
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

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getTEXT_KEY() {
        return this.TEXT_KEY;
    }

    public final Float[] i(int i) {
        float dimension = getContext().getResources().getDimension(R.dimen._7sdp);
        float f = i;
        float f2 = f - (dimension * 2.0f);
        float dimension2 = (f - dimension) - ((f2 - (getContext().getResources().getDimension(R.dimen._50dp) + (getContext().getResources().getDimension(R.dimen._12sdp) + (0.43f * f2)))) / 2.0f);
        return new Float[]{Float.valueOf(dimension2 - getContext().getResources().getDimension(R.dimen._50dp)), Float.valueOf(dimension2)};
    }

    public final Float[] j(int i) {
        float f = i;
        float fA = (((0.465f * f) + a(12.0f)) - getContext().getResources().getDimension(R.dimen._7sdp)) * 0.3f;
        float dimension = f - getContext().getResources().getDimension(R.dimen._7sdp);
        float f2 = dimension - fA;
        float dimension2 = (fA - getContext().getResources().getDimension(R.dimen._50dp)) / 2.0f;
        return new Float[]{Float.valueOf(f2 + dimension2), Float.valueOf(dimension - dimension2)};
    }

    public final int k(int i) {
        return (int) (((((double) i) * 0.015d) + ((double) i(i)[0].floatValue())) - ((double) (i * this.R)));
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
        f(k(size), (int) (k(size) * 0.96f));
        float f = size;
        DynamicOnboardingScreenBasicBase.h(this, (int) (((1.0f - this.S) * f) - ((k(size) * 0.77f) + (f * this.R))), (int) (((int) (k(size) * 0.96f)) * this.T), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float width = getWidth() * 0.01f;
        Float fValueOf = Float.valueOf(i(getWidth())[0].floatValue() - width);
        Float fValueOf2 = Float.valueOf(j(getHeight())[0].floatValue() - width);
        Float fValueOf3 = Float.valueOf(i(getWidth())[1].floatValue() + width);
        Float fValueOf4 = Float.valueOf(j(getHeight())[1].floatValue() + width);
        float f = this.Q;
        b(canvas, fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(f), Float.valueOf(f), (524160 & 128) != 0 ? null : null, (524160 & 256) != 0 ? null : null, (524160 & 512) != 0 ? null : null, (524160 & 1024) != 0 ? null : null, (524160 & 2048) != 0 ? null : null, (524160 & 4096) != 0 ? null : null, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, getWidth() * this.R, j(getHeight())[0].floatValue() - ((int) (k(getWidth()) * 0.96f)));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int width = getWidth();
        e(canvas, (k(width) * 0.77f) + (width * this.R), j(getHeight())[0].floatValue() - ((int) (k(getWidth()) * 0.96f)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingAuto(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingAuto(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingAuto(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
