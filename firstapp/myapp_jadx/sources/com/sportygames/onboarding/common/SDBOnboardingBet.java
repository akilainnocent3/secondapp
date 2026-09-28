package com.sportygames.onboarding.common;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingFocusBox;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sportygames/onboarding/common/SDBOnboardingBet;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "", "T", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "U", "getDEFAULT_URL", "DEFAULT_URL", "V", "getTEXT_KEY", "TEXT_KEY", "W", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SDBOnboardingBet extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final String BITMAP_KEY;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final String DEFAULT_URL;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX WARN: Illegal instructions before constructor call */
    public SDBOnboardingBet(Context context, AttributeSet attributeSet, int i, int i2) {
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet2, i3, 0);
        this.Q = 0.92f;
        this.R = 0.02f;
        this.S = 0.83f;
        String string = context.getString(R.string.onboarding_brand_left_half_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_left_half_1721652139005.png";
        String string2 = context.getString(R.string.onboarding_pick_to_place_bet_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_pick_to_place_bet_text);
        string3.getClass();
        this.DEFAULT_TEXT = string3;
        setFocusBoxPrimary(new OnboardingFocusBox(0.0f, 0.92f, 0.0f, 0.0f, getSTROKE_WIDTH(), 0.0f, -getSTROKE_WIDTH(), -getSTROKE_WIDTH(), 0.0f, 32, null));
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
        DynamicOnboardingScreenBasicBase.h(this, (int) (size * 0.49f), (int) (i4 * this.S), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, (getWidth() / 2) - (getWidth() * 0.12f), (getHeight() * this.Q) - (getSTROKE_WIDTH() + ((int) (((double) ((int) (((double) getWidth()) * 0.6d))) * 0.95d))));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e(canvas, getWidth() * this.R, (getHeight() * this.Q) - (getSTROKE_WIDTH() + ((int) (((double) ((int) (((double) getWidth()) * 0.6d))) * 0.95d))));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SDBOnboardingBet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SDBOnboardingBet(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SDBOnboardingBet(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
