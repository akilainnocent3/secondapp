package com.sportygames.onboarding.sportyhero;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingFocusBox;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import defpackage.jpu;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/sportygames/onboarding/sportyhero/SHOnboardingValentineIntroArrow;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "", "V", "I", "getBITMAP_ID", "()I", "BITMAP_ID", "", "W", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "a0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "", "b0", "Ljava/util/Map;", "getWORDS_COLOR_MAP", "()Ljava/util/Map;", "WORDS_COLOR_MAP", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SHOnboardingValentineIntroArrow extends DynamicOnboardingScreenBasicBase {
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

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final Map<String, Integer> WORDS_COLOR_MAP;

    /* JADX WARN: Illegal instructions before constructor call */
    public SHOnboardingValentineIntroArrow(Context context, AttributeSet attributeSet, int i, int i2) {
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet2, i3, 0);
        this.Q = 0.553f;
        float fA = a(6.0f);
        this.R = 0.02f;
        this.S = 0.34f;
        this.T = 0.2f;
        this.U = 0.07f;
        this.BITMAP_ID = R.drawable.onb_arrow_up;
        String string = context.getString(R.string.onboarding_valentines_intro_cms);
        string.getClass();
        this.TEXT_KEY = string;
        String string2 = context.getString(R.string.onboarding_valentines_intro_text);
        string2.getClass();
        this.DEFAULT_TEXT = string2;
        this.WORDS_COLOR_MAP = jpu.b(new Pair("love.", Integer.valueOf(getResources().getColor(R.color.valentine))));
        setFocusBoxPrimary(new OnboardingFocusBox(0.01f, 0.115f, 0.01f, 0.553f, 0.0f, 0.0f, 0.0f, 0.0f, fA, 240, null));
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

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public Map<String, Integer> getWORDS_COLOR_MAP() {
        return this.WORDS_COLOR_MAP;
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
        float f2 = size;
        DynamicOnboardingScreenBasicBase.h(this, (int) (((1.0f - this.S) * f2) - (this.R * f2)), (int) (f * this.T), null, null, 12);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, (getWidth() * 0.02f) + ((1.0f - this.S) * getWidth()), ((1.0f - this.Q) + 0.01f) * getHeight());
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e(canvas, getWidth() * this.R, (getHeight() * 0.03f) + (((1.0f - this.Q) + 0.01f) * getHeight()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingValentineIntroArrow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingValentineIntroArrow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingValentineIntroArrow(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
