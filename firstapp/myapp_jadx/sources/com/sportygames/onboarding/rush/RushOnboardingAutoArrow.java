package com.sportygames.onboarding.rush;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/sportygames/onboarding/rush/RushOnboardingAutoArrow;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "U", "I", "getBITMAP_ID", "()I", "BITMAP_ID", "", "V", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "W", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RushOnboardingAutoArrow extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final int BITMAP_ID;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public RushOnboardingAutoArrow(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 10000.0f;
        this.R = 0.07f;
        this.S = 0.75f;
        this.T = 0.25f;
        this.BITMAP_ID = R.drawable.onb_arrow_down;
        String string = context.getString(R.string.onboarding_place_auto_bet_cms);
        string.getClass();
        this.TEXT_KEY = string;
        String string2 = context.getString(R.string.onboarding_place_auto_bet_text);
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
        int i3 = (int) (this.R * f);
        f(i3, i3);
        DynamicOnboardingScreenBasicBase.h(this, (int) (size * this.S), (int) (f * this.T), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float fFloatValue = i(getWidth())[0].floatValue();
        float fFloatValue2 = i(getWidth())[1].floatValue();
        float width = getWidth() * 0.01f;
        Float fValueOf = Float.valueOf(fFloatValue - width);
        Float fValueOf2 = Float.valueOf(j(getHeight())[0].floatValue() - width);
        Float fValueOf3 = Float.valueOf(fFloatValue2 + width);
        Float fValueOf4 = Float.valueOf(j(getHeight())[1].floatValue() + width);
        float f = this.Q;
        b(canvas, fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(f), Float.valueOf(f), (524160 & 128) != 0 ? null : null, (524160 & 256) != 0 ? null : null, (524160 & 512) != 0 ? null : null, (524160 & 1024) != 0 ? null : null, (524160 & 2048) != 0 ? null : null, (524160 & 4096) != 0 ? null : null, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float fFloatValue = i(getWidth())[0].floatValue() - (getWidth() * 0.03f);
        int height = getHeight();
        float fFloatValue2 = j(height)[0].floatValue();
        float f = height;
        d(canvas, fFloatValue, (fFloatValue2 - (0.02f * f)) - (f * this.R));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float width = (1.0f - this.S) * getWidth();
        int height = getHeight();
        float fFloatValue = j(height)[0].floatValue();
        float f = height;
        e(canvas, width, (((fFloatValue - (0.02f * f)) - (f * this.R)) - (getHeight() * 0.01f)) - (getHeight() * this.T));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingAutoArrow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingAutoArrow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingAutoArrow(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
