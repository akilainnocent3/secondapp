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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/sportygames/onboarding/sportyhero/SHOnboardingValentineIntro;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "", "W", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "a0", "getDEFAULT_URL", "DEFAULT_URL", "b0", "getTEXT_KEY", "TEXT_KEY", "c0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "", "", "d0", "Ljava/util/Map;", "getWORDS_COLOR_MAP", "()Ljava/util/Map;", "WORDS_COLOR_MAP", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SHOnboardingValentineIntro extends DynamicOnboardingScreenBasicBase {
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

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final Map<String, Integer> WORDS_COLOR_MAP;

    /* JADX WARN: Illegal instructions before constructor call */
    public SHOnboardingValentineIntro(Context context, AttributeSet attributeSet, int i, int i2) {
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet2, i3, 0);
        this.Q = 0.553f;
        float fA = a(6.0f);
        this.R = -0.05f;
        this.S = 0.54f;
        this.T = 0.02f;
        this.U = 0.48f;
        this.V = 0.2f;
        String string = context.getString(R.string.onboarding_brand_up_full_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_up_full_1721652336716.png";
        String string2 = context.getString(R.string.onboarding_valentines_intro_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_valentines_intro_text);
        string3.getClass();
        this.DEFAULT_TEXT = string3;
        this.WORDS_COLOR_MAP = jpu.b(new Pair("love.", Integer.valueOf(getResources().getColor(R.color.valentine))));
        setFocusBoxPrimary(new OnboardingFocusBox(0.01f, 0.115f, 0.01f, 0.553f, 0.0f, 0.0f, 0.0f, 0.0f, fA, 240, null));
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
        float f = this.S;
        float f2 = this.R;
        float f3 = size;
        f((int) (((1.0f - f) - f2) * f3), (int) (((1.0f - f) - f2) * f3 * 2.5227273f));
        DynamicOnboardingScreenBasicBase.h(this, (int) (((1.0f - this.U) * f3) - (this.T * f3)), (int) (size2 * this.V), null, null, 12);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        d(canvas, this.R * getWidth(), ((1.0f - this.Q) + 0.01f) * getHeight());
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        e(canvas, getWidth() * this.U, (getHeight() * 0.03f) + (((1.0f - this.Q) + 0.01f) * getHeight()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingValentineIntro(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingValentineIntro(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHOnboardingValentineIntro(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
