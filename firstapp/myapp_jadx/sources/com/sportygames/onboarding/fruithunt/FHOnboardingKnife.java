package com.sportygames.onboarding.fruithunt;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/sportygames/onboarding/fruithunt/FHOnboardingKnife;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "V", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "W", "getDEFAULT_URL", "DEFAULT_URL", "a0", "getTEXT_KEY", "TEXT_KEY", "b0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FHOnboardingKnife extends DynamicOnboardingScreenBasicBase {
    public static final /* synthetic */ int c0 = 0;
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

    public static final class a {
        public static float a(int i, int i2) {
            float f = i2;
            return ((0.716f * f) - (((int) (((int) (i * 0.575f)) * 2.1361501f)) * 0.4f)) - (f * 0.02f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FHOnboardingKnife(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = 0.032f;
        this.R = 10000.0f;
        this.S = 0.05f;
        this.T = 0.51f;
        this.U = 0.325f;
        String string = context.getString(R.string.onboarding_brand_left_full_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_left_full_1721651992176.png";
        String string2 = context.getString(R.string.onboarding_select_direction_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_select_direction_text);
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
        int i3 = (int) (0.575f * f);
        float f2 = i3;
        int i4 = (int) (2.1361501f * f2);
        f(i3, i4);
        DynamicOnboardingScreenBasicBase.h(this, (int) ((f2 * 0.33f) + ((this.T * f) - (f * this.S))), (int) (i4 * this.U), null, DynamicOnboardingScreenBasicBase.a.c, 4);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float f = 1.0f - this.Q;
        float height = (f - 0.716f) * getHeight();
        float width = (getWidth() - height) / 2.0f;
        float f2 = height + width;
        Float fValueOf = Float.valueOf(width);
        Float fValueOf2 = Float.valueOf(getHeight() * 0.716f);
        Float fValueOf3 = Float.valueOf(f2);
        Float fValueOf4 = Float.valueOf(f * getHeight());
        float f3 = this.R;
        b(canvas, fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(f3), Float.valueOf(f3), (524160 & 128) != 0 ? null : null, (524160 & 256) != 0 ? null : null, (524160 & 512) != 0 ? null : null, (524160 & 1024) != 0 ? null : null, (524160 & 2048) != 0 ? null : null, (524160 & 4096) != 0 ? null : null, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, getWidth() * 0.51f, a.a(getWidth(), getHeight()));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e(canvas, getWidth() * this.S, a.a(getWidth(), getHeight()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingKnife(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingKnife(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingKnife(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
