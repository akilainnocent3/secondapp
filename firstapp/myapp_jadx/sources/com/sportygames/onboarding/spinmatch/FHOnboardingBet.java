package com.sportygames.onboarding.spinmatch;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import defpackage.k660;
import defpackage.vs50;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sportygames/onboarding/spinmatch/FHOnboardingBet;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "a0", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "b0", "getDEFAULT_URL", "DEFAULT_URL", "c0", "getTEXT_KEY", "TEXT_KEY", "d0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FHOnboardingBet extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;
    public final float U;
    public final float V;
    public final float W;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final String BITMAP_KEY;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final String DEFAULT_URL;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public FHOnboardingBet(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 0.7444f;
        this.R = 0.067f;
        this.S = a(39.0f);
        this.T = 0.14f;
        this.U = 0.31559998f;
        this.V = 0.05f;
        this.W = 0.4f;
        String string = context.getString(R.string.onboarding_brand_right_full_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_right_full_1721652245969.png";
        String string2 = context.getString(R.string.onboarding_select_bet_amount_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_select_bet_amount_text);
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
        float fA = ((i - a(40.0f)) - a(6.0f)) - getContext().getResources().getDimension(R.dimen._21sdp);
        return new Float[]{k660.a(i, 0.053f, (fA - getContext().getResources().getDimension(R.dimen._50dp)) - getContext().getResources().getDimension(R.dimen._5sdp)), Float.valueOf(fA)};
    }

    public final float j(int i) {
        float fFloatValue = i(i)[0].floatValue();
        float width = getWidth();
        return (fFloatValue - (((((1.0f - this.U) * width) - (width * this.T)) * 2.221198f) * 0.44f)) - (i * 0.02f);
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
        float f2 = this.U;
        float f3 = this.T;
        float f4 = ((1.0f - f2) * f) - (f * f3);
        f((int) f4, (int) vs50.a(f, f3, (1.0f - f2) * f, 2.221198f));
        float f5 = f3 * f;
        DynamicOnboardingScreenBasicBase.h(this, (int) (((1.0f - this.V) * f) - (((((1.0f - f2) * f) - f5) * 0.82f) + f5)), (int) (((int) (f4 * 2.221198f)) * this.W), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        Float fValueOf = Float.valueOf(getWidth() * this.Q);
        Float f = i(getHeight())[0];
        Float fValueOf2 = Float.valueOf((1.0f - this.R) * getWidth());
        Float f2 = i(getHeight())[1];
        float f3 = this.S;
        b(canvas, fValueOf, f, fValueOf2, f2, Float.valueOf(f3), Float.valueOf(f3), (524160 & 128) != 0 ? null : null, (524160 & 256) != 0 ? null : null, (524160 & 512) != 0 ? null : null, (524160 & 1024) != 0 ? null : null, (524160 & 2048) != 0 ? null : null, (524160 & 4096) != 0 ? null : null, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, getWidth() * this.T, j(getHeight()));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float fJ = j(getHeight());
        float width = getWidth();
        float f = this.T * width;
        e(canvas, ((((1.0f - this.U) * width) - f) * 0.82f) + f, fJ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingBet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingBet(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingBet(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
