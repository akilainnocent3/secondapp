package com.sportygames.onboarding.spin2win;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/sportygames/onboarding/spin2win/SWOnboardingChipsArrow;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "V", "I", "getBITMAP_ID", "()I", "BITMAP_ID", "", "W", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "a0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SWOnboardingChipsArrow extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;
    public final float U;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final int BITMAP_ID;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public SWOnboardingChipsArrow(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 0.64512f;
        this.R = 10000.0f;
        this.S = 0.07f;
        this.T = 1.0f;
        this.U = 0.25f;
        this.BITMAP_ID = R.drawable.onb_arrow_down;
        String string = context.getString(R.string.onboarding_select_chips_wager_cms);
        string.getClass();
        this.TEXT_KEY = string;
        String string2 = context.getString(R.string.onboarding_select_chips_wager_text);
        string2.getClass();
        this.DEFAULT_TEXT = string2;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public int getBITMAP_ID() {
        return this.BITMAP_ID;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getDEFAULT_TEXT() {
        return this.DEFAULT_TEXT;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getTEXT_KEY() {
        return this.TEXT_KEY;
    }

    public final Float[] i(int i) {
        float f = i;
        float f2 = 0.1f * f * 0.9f;
        float f3 = (1.0f - SWOnboardingBoard.c0) * f;
        float dimension = ((((f * 0.9f) - f3) - (getContext().getResources().getDimension(R.dimen._10sdp) + f2)) / 2.0f) + f3;
        return new Float[]{Float.valueOf(dimension), Float.valueOf(f2 + dimension)};
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
        int i3 = (int) (this.S * f);
        f(i3, i3);
        DynamicOnboardingScreenBasicBase.h(this, (int) (size * this.T), (int) (f * this.U), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        Float fValueOf = Float.valueOf(0.0f);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float width = getWidth() * this.Q;
        float width2 = ((getWidth() - width) - getContext().getResources().getDimension(R.dimen._5sdp)) / 2.0f;
        float f = width + width2;
        Float f2 = i(getHeight())[0];
        f2.getClass();
        Float f3 = i(getHeight())[1];
        f3.getClass();
        float width3 = getWidth() * 0.51f;
        float width4 = (0.806f * getWidth() * 0.1467f) + width3;
        float height = (0.14531401f * getHeight()) + a(2.0f) + (getHeight() * 0.12329999f) + (getHeight() * 0.01f) + a(2.0f);
        float height2 = (getHeight() * 0.048438f) + height;
        Float fValueOf2 = Float.valueOf(width2);
        Float fValueOf3 = Float.valueOf(f);
        float f4 = this.R;
        b(canvas, fValueOf2, f2, fValueOf3, f3, Float.valueOf(f4), Float.valueOf(f4), (524160 & 128) != 0 ? null : k660.a(getWidth(), 0.015f, width3), (524160 & 256) != 0 ? null : k660.a(getWidth(), 0.008f, height), (524160 & 512) != 0 ? null : pga.a(getWidth(), 0.012f, width4), (524160 & 1024) != 0 ? null : pga.a(getWidth(), 0.0055f, height2), (524160 & 2048) != 0 ? null : fValueOf, (524160 & 4096) != 0 ? null : fValueOf, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, getWidth() * 0.45f, (i(getHeight())[0].floatValue() - (getHeight() * 0.01f)) - (getHeight() * this.S));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int height = getHeight();
        float fFloatValue = i(height)[0].floatValue();
        float f = height;
        e(canvas, 0.0f, (((fFloatValue - (0.003f * f)) - (f * this.S)) - (getHeight() * 0.014f)) - (getHeight() * this.U));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SWOnboardingChipsArrow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SWOnboardingChipsArrow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SWOnboardingChipsArrow(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
