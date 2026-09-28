package com.sportygames.onboarding.rush;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lcom/sportygames/onboarding/rush/RushOnboardingBet;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "V", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "W", "getDEFAULT_URL", "DEFAULT_URL", "a0", "getTEXT_KEY", "TEXT_KEY", "b0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "", "c0", "F", "getBetHeight", "()F", "setBetHeight", "(F)V", "betHeight", "d0", "getBetWidth", "setBetWidth", "betWidth", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RushOnboardingBet extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;
    public final float U;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final String BITMAP_KEY;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final String DEFAULT_URL;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public float betHeight;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public float betWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    public RushOnboardingBet(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 10000.0f;
        this.R = 0.05f;
        this.S = 0.42f;
        this.T = 0.05f;
        this.U = 0.39f;
        String string = context.getString(R.string.onboarding_brand_left_full_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_left_full_1721651992176.png";
        String string2 = context.getString(R.string.onboarding_place_bet_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_place_bet_text);
        string3.getClass();
        this.DEFAULT_TEXT = string3;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getBITMAP_KEY() {
        return this.BITMAP_KEY;
    }

    public final float getBetHeight() {
        return this.betHeight;
    }

    public final float getBetWidth() {
        return this.betWidth;
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
        float f = i;
        float fA = (((0.465f * f) + a(12.0f)) - getContext().getResources().getDimension(R.dimen._7sdp)) * 0.3f;
        float dimension = f - getContext().getResources().getDimension(R.dimen._7sdp);
        float f2 = dimension - fA;
        float dimension2 = (fA - getContext().getResources().getDimension(R.dimen._50dp)) / 2.0f;
        return new Float[]{Float.valueOf(f2 + dimension2), Float.valueOf(dimension - dimension2)};
    }

    public final float j(int i) {
        return (i(i)[0].floatValue() - (((int) (((int) (((1.0f - this.T) - this.S) * getWidth())) * 2.1361501f)) * 0.43f)) - (i * 0.01f);
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
        float f3 = this.S;
        f((int) (((1.0f - f2) - f3) * f), (int) (((int) (((1.0f - f2) - f3) * f)) * 2.1361501f));
        DynamicOnboardingScreenBasicBase.h(this, (int) ((((1.0f - (1.0f - f3)) - this.R) - 0.02f) * f), (int) (((int) (((int) (((1.0f - f2) - f3) * f)) * 2.1361501f)) * this.U), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    public final void setBetHeight(float f) {
        this.betHeight = f;
    }

    public final void setBetWidth(float f) {
        this.betWidth = f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0068  */
    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        float f;
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float dimension = getContext().getResources().getDimension(R.dimen._7sdp);
        float width = getWidth() - (dimension * 2.0f);
        float f2 = 0.43f * width;
        float dimension2 = ((width - (getContext().getResources().getDimension(R.dimen._50dp) + (getContext().getResources().getDimension(R.dimen._12sdp) + f2))) / 2.0f) + dimension;
        float f3 = f2 + dimension2;
        float width2 = getWidth() * 0.01f;
        float f4 = this.betHeight;
        float f5 = this.Q;
        if (f4 == 0.0f) {
            f = f5;
        } else {
            float f6 = this.betWidth;
            if (f6 == 0.0f) {
                f = f5;
            } else {
                f = (f6 / (3.0f * f4)) * (f4 / 2.0f);
            }
        }
        if (f4 != 0.0f) {
            float f7 = this.betWidth;
            if (f7 != 0.0f) {
                f5 = (f4 / (f7 * 0.33333334f)) * (f4 / 2.0f);
            }
        }
        b(canvas, Float.valueOf(dimension2 - width2), Float.valueOf(i(getHeight())[0].floatValue() - width2), Float.valueOf(f3 + width2), Float.valueOf(i(getHeight())[1].floatValue() + width2), Float.valueOf(f), Float.valueOf(f5), (524160 & 128) != 0 ? null : null, (524160 & 256) != 0 ? null : null, (524160 & 512) != 0 ? null : null, (524160 & 1024) != 0 ? null : null, (524160 & 2048) != 0 ? null : null, (524160 & 4096) != 0 ? null : null, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, getWidth() * this.S, j(getHeight()));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e(canvas, getWidth() * this.R, j(getHeight()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingBet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingBet(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RushOnboardingBet(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
