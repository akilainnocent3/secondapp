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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\f\u0010\nR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u00102\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\"\u00106\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)¨\u00067"}, d2 = {"Lcom/sportygames/onboarding/spinmatch/FHOnboardingMenuSetting;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "", "", "getBoxVerticalCoordinates", "()[Ljava/lang/Float;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "setupFocusBox", "", "T", "Ljava/lang/String;", "getBITMAP_KEY", "()Ljava/lang/String;", "BITMAP_KEY", "U", "getDEFAULT_URL", "DEFAULT_URL", "V", "getTEXT_KEY", "TEXT_KEY", "W", "getDEFAULT_TEXT", "DEFAULT_TEXT", "", "a0", "I", "getImageWidth", "()I", "setImageWidth", "(I)V", "imageWidth", "b0", "F", "getItemHeight0", "()F", "setItemHeight0", "(F)V", "itemHeight0", "c0", "getItemHeight1", "setItemHeight1", "itemHeight1", "d0", "getItemHeight2", "setItemHeight2", "itemHeight2", "e0", "getItemWidth", "setItemWidth", "itemWidth", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FHOnboardingMenuSetting extends DynamicOnboardingScreenBasicBase {
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

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public int imageWidth;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public float itemHeight0;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public float itemHeight1;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public float itemHeight2;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public float itemWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    public FHOnboardingMenuSetting(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = a(10.0f);
        this.R = 0.615f;
        this.S = 0.025f;
        String string = context.getString(R.string.onboarding_brand_up_full_cms);
        string.getClass();
        this.BITMAP_KEY = string;
        this.DEFAULT_URL = "https://s.sporty.net/sportygames/cms/assets/militao_up_full_1721652336716.png";
        String string2 = context.getString(R.string.onboarding_fixed_coefficient_cms);
        string2.getClass();
        this.TEXT_KEY = string2;
        String string3 = context.getString(R.string.onboarding_fixed_coefficient_text);
        string3.getClass();
        this.DEFAULT_TEXT = string3;
    }

    private final Float[] getBoxVerticalCoordinates() {
        float dimension = getContext().getResources().getDimension(R.dimen._100sdp) + this.itemHeight0 + this.itemHeight1;
        return new Float[]{Float.valueOf(dimension), Float.valueOf(this.itemHeight2 + dimension)};
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
        float f = size;
        int i3 = (int) (0.46f * f);
        this.imageWidth = i3;
        f(i3, (int) (i3 * 2.5227273f));
        DynamicOnboardingScreenBasicBase.h(this, (int) vs50.a(2.0f, this.S, this.R, f), (int) (size2 * 0.5f), null, null, 12);
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
        if (getWidth() == 0 || getHeight() == 0 || this.imageWidth == 0 || this.itemHeight0 == 0.0f || this.itemHeight1 == 0.0f || this.itemHeight2 == 0.0f || this.itemWidth == 0.0f) {
            return;
        }
        d(canvas, ((1.0f - this.R) * getWidth()) - this.imageWidth, getBoxVerticalCoordinates()[1].floatValue());
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0 || this.itemHeight0 == 0.0f || this.itemHeight1 == 0.0f || this.itemHeight2 == 0.0f || this.itemWidth == 0.0f) {
            return;
        }
        e(canvas, ((1.0f - this.R) + this.S) * getWidth(), (getHeight() * 0.02f) + getBoxVerticalCoordinates()[1].floatValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingMenuSetting(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingMenuSetting(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingMenuSetting(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
