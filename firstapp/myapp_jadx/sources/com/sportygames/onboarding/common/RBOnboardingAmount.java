package com.sportygames.onboarding.common;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import defpackage.w6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sportygames/onboarding/common/RBOnboardingAmount;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "W", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "a0", "getDEFAULT_URL", "DEFAULT_URL", "b0", "getTEXT_KEY", "TEXT_KEY", "c0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RBOnboardingAmount extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;
    public final float U;
    public final float V;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final String BITMAP_KEY;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final String DEFAULT_URL;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public RBOnboardingAmount(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 0.06f;
        this.R = 0.06f;
        this.S = 0.127f;
        this.T = a(27.0f);
        this.U = 0.02f;
        this.V = 0.83f;
        String string = context.getString(R.string.onboarding_brand_left_half_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_left_half_1721652139005.png";
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

    public final float i(int i) {
        float f = i;
        return (f * 0.025f) + (w6.a(f, 0.9f, 0.26444998f, (1.0f - this.S) * f) - getContext().getResources().getDimension(R.dimen._6sdp));
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
        int i3 = (int) (((double) size) * 0.6d);
        int i4 = (int) (((double) i3) * 0.95d);
        f(i3, i4);
        DynamicOnboardingScreenBasicBase.h(this, (int) (size * 0.49f), (int) (i4 * this.V), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        Float fValueOf = Float.valueOf(getWidth() * this.Q);
        Float fValueOf2 = Float.valueOf(i(getHeight()));
        Float fValueOf3 = Float.valueOf((1.0f - this.R) * getWidth());
        Float fValueOf4 = Float.valueOf((1.0f - this.S) * getHeight());
        float f = this.T;
        b(canvas, fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(f), Float.valueOf(f), (524160 & 128) != 0 ? null : null, (524160 & 256) != 0 ? null : null, (524160 & 512) != 0 ? null : null, (524160 & 1024) != 0 ? null : null, (524160 & 2048) != 0 ? null : null, (524160 & 4096) != 0 ? null : null, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, (getWidth() / 2) - (getWidth() * 0.15f), i(getHeight()) - (getSTROKE_WIDTH() + ((int) (((double) ((int) (((double) getWidth()) * 0.6d))) * 0.95d))));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e(canvas, getWidth() * this.U, i(getHeight()) - (getSTROKE_WIDTH() + ((int) (((double) ((int) (((double) getWidth()) * 0.6d))) * 0.95d))));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RBOnboardingAmount(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RBOnboardingAmount(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RBOnboardingAmount(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
