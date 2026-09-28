package com.sportygames.onboarding.fruithunt;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingFocusBox;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import defpackage.zen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/sportygames/onboarding/fruithunt/FHOnboardingChatArrow;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/graphics/Canvas;", "canvas", "", "setupImage", "(Landroid/graphics/Canvas;)V", "setupText", "", "a0", "I", "getBITMAP_ID", "()I", "BITMAP_ID", "", "b0", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "c0", "getDEFAULT_TEXT", "DEFAULT_TEXT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FHOnboardingChatArrow extends DynamicOnboardingScreenBasicBase {
    public final float Q;
    public final float R;
    public final float S;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public FHOnboardingChatArrow(Context context, AttributeSet attributeSet, int i, int i2) {
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet2, i3, 0);
        this.Q = 0.14f;
        this.R = 0.742f;
        this.S = 0.935f;
        float fA = a(5.0f);
        this.T = 0.07f;
        this.U = 0.05f;
        this.V = 0.9f;
        this.W = 0.07f;
        this.BITMAP_ID = R.drawable.onb_arrow_up;
        String string = context.getString(R.string.onboarding_chat_cms);
        string.getClass();
        this.TEXT_KEY = string;
        String string2 = context.getString(R.string.onboarding_chat_text);
        string2.getClass();
        this.DEFAULT_TEXT = string2;
        setFocusBoxPrimary(new OnboardingFocusBox(0.742f, 0.01f, 0.14f, 0.935f, 0.0f, 0.0f, 0.0f, 0.0f, fA, 240, null));
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
        int i3 = (int) (this.T * f);
        f(i3, i3);
        DynamicOnboardingScreenBasicBase.h(this, (int) (size * this.V), (int) (f * this.W), null, null, 12);
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupImage(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float width = getWidth() * this.R;
        float width2 = (1.0f - this.Q) * getWidth();
        float fA = zen.a(width2, width, 1.5f, (width + width2) / 2.0f);
        float height = getHeight();
        d(canvas, fA, (height * 0.01f) + ((1.0f - this.S) * height));
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public void setupText(Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float height = getHeight();
        e(canvas, this.U, (getHeight() * 0.01f) + (getHeight() * this.T) + (height * 0.01f) + ((1.0f - this.S) * height));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingChatArrow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingChatArrow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FHOnboardingChatArrow(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
