package com.sportygames.onboarding.sportyhero;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingFocusBox;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/sportygames/onboarding/sportyhero/SHOnboardingBetArrow;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "", "a0", "I", "getBITMAP_ID", "()I", "BITMAP_ID", "", "b0", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "c0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "", "d0", "Z", "isSideBetsEnabled", "()Z", "setSideBetsEnabled", "(Z)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SHOnboardingBetArrow extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public float S;
    public final float T;
    public final float U;
    public final float V;
    public final float W;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final int BITMAP_ID;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public boolean isSideBetsEnabled;

    /* JADX WARN: Illegal instructions before constructor call */
    public SHOnboardingBetArrow(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 0.015f;
        this.R = 0.015f;
        this.T = a(8.0f);
        this.U = 0.07f;
        this.V = 1.0f;
        this.W = 0.25f;
        this.BITMAP_ID = R.drawable.onb_arrow_down;
        String string = context.getString(R.string.onboarding_place_bet_cms);
        string.getClass();
        this.TEXT_KEY = string;
        String string2 = context.getString(R.string.onboarding_place_bet_text);
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

    public final float i(int i) {
        float f = i;
        return (((this.S + (this.isSideBetsEnabled ? 0.0f : -0.033f)) * f) - (0.01f * f)) - (f * this.U);
    }

    public final void j(float f, float f2, boolean z) {
        this.isSideBetsEnabled = z;
        this.S = f;
        float f3 = ((1.0f - f) - f2) - 0.006f;
        setFocusBoxPrimary(new OnboardingFocusBox(this.R, (z ? 0.0f : -0.033f) + f, this.Q, f3 + (z ? 0.0f : 0.018f), 0.0f, 0.0f, 0.0f, 0.0f, this.T, 240, null));
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
        int i3 = (int) (this.U * f);
        f(i3, i3);
        DynamicOnboardingScreenBasicBase.h(this, (int) (size * this.V), (int) (f * this.W), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    public final void setSideBetsEnabled(boolean z) {
        this.isSideBetsEnabled = z;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, getWidth() * 0.52f, i(getHeight()));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e(canvas, 0.0f, (i(getHeight()) - (getHeight() * 0.01f)) - (getHeight() * this.W));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingBetArrow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingBetArrow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingBetArrow(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
