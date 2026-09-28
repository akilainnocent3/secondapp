package com.sportygames.onboarding.spinmatch;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import defpackage.k660;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\f\u0010\nR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\"\u0010 \u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u001fR\"\u0010+\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00103\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u00107\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*¨\u00068"}, d2 = {"Lcom/sportygames/onboarding/spinmatch/FHOnboardingMenuSettingArrow;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "", "", "getBoxVerticalCoordinates", "()[Ljava/lang/Float;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "W", "I", "getBITMAP_ID", "()I", "BITMAP_ID", "", "a0", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "b0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "c0", "getImageWidth", "setImageWidth", "(I)V", "imageWidth", "d0", "getTextWidth", "setTextWidth", "textWidth", "e0", "F", "getItemHeight0", "()F", "setItemHeight0", "(F)V", "itemHeight0", "f0", "getItemHeight1", "setItemHeight1", "itemHeight1", "g0", "getItemHeight2", "setItemHeight2", "itemHeight2", "h0", "getItemWidth", "setItemWidth", "itemWidth", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FHOnboardingMenuSettingArrow extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
    public final float T;
    public final float U;
    public final float V;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final int BITMAP_ID;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public int imageWidth;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public int textWidth;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public float itemHeight0;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public float itemHeight1;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public float itemHeight2;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public float itemWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    public FHOnboardingMenuSettingArrow(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = a(10.0f);
        this.R = 0.07f;
        this.S = 0.65f;
        this.T = 0.25f;
        this.U = 0.7f;
        this.V = 0.25f;
        this.BITMAP_ID = R.drawable.onb_arrow_up;
        String string = context.getString(R.string.onboarding_fixed_coefficient_cms);
        string.getClass();
        this.TEXT_KEY = string;
        String string2 = context.getString(R.string.onboarding_fixed_coefficient_text);
        string2.getClass();
        this.DEFAULT_TEXT = string2;
    }

    private final Float[] getBoxVerticalCoordinates() {
        float dimension = getContext().getResources().getDimension(R.dimen._100sdp) + this.itemHeight0 + this.itemHeight1;
        return new Float[]{Float.valueOf(dimension), Float.valueOf(this.itemHeight2 + dimension)};
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public int getBITMAP_ID() {
        return this.BITMAP_ID;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getDEFAULT_TEXT() {
        return this.DEFAULT_TEXT;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final float getItemHeight0() {
        return this.itemHeight0;
    }

    public final float getItemHeight1() {
        return this.itemHeight1;
    }

    public final float getItemHeight2() {
        return this.itemHeight2;
    }

    public final float getItemWidth() {
        return this.itemWidth;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getTEXT_KEY() {
        return this.TEXT_KEY;
    }

    public final int getTextWidth() {
        return this.textWidth;
    }

    public final Float[] i(int i) {
        float f = i;
        return new Float[]{Float.valueOf((((0.02f * f) + f) - this.itemWidth) - getContext().getResources().getDimension(R.dimen._25sdp)), k660.a(f, 0.01f, f)};
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
        DynamicOnboardingScreenBasicBase.h(this, (int) (size * this.U), (int) (f * this.V), null, null, 12);
    }

    public final void setImageWidth(int i) {
        this.imageWidth = i;
    }

    public final void setItemHeight0(float f) {
        this.itemHeight0 = f;
    }

    public final void setItemHeight1(float f) {
        this.itemHeight1 = f;
    }

    public final void setItemHeight2(float f) {
        this.itemHeight2 = f;
    }

    public final void setItemWidth(float f) {
        this.itemWidth = f;
    }

    public final void setTextWidth(int i) {
        this.textWidth = i;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupFocusBox(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0 || this.itemHeight0 == 0.0f || this.itemHeight1 == 0.0f || this.itemHeight2 == 0.0f || this.itemWidth == 0.0f) {
            return;
        }
        Float f = i(getWidth())[0];
        Float f2 = getBoxVerticalCoordinates()[0];
        Float f3 = i(getWidth())[1];
        Float f4 = getBoxVerticalCoordinates()[1];
        float f5 = this.Q;
        b(canvas, f, f2, f3, f4, Float.valueOf(f5), Float.valueOf(f5), (524160 & 128) != 0 ? null : null, (524160 & 256) != 0 ? null : null, (524160 & 512) != 0 ? null : null, (524160 & 1024) != 0 ? null : null, (524160 & 2048) != 0 ? null : null, (524160 & 4096) != 0 ? null : null, null, null, null, null, null, null);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0 || this.itemHeight0 == 0.0f || this.itemHeight1 == 0.0f || this.itemHeight2 == 0.0f || this.itemWidth == 0.0f) {
            return;
        }
        d(canvas, getWidth() * this.S, (getHeight() * 0.01f) + getBoxVerticalCoordinates()[1].floatValue());
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0 || this.itemHeight0 == 0.0f || this.itemHeight1 == 0.0f || this.itemHeight2 == 0.0f || this.itemWidth == 0.0f) {
            return;
        }
        e(canvas, getWidth() * this.T, (getHeight() * 0.01f) + (getHeight() * this.R) + (getHeight() * 0.01f) + getBoxVerticalCoordinates()[1].floatValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingMenuSettingArrow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingMenuSettingArrow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingMenuSettingArrow(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
