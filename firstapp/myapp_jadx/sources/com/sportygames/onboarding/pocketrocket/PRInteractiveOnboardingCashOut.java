package com.sportygames.onboarding.pocketrocket;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingFocusBox;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import defpackage.ylz;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/sportygames/onboarding/pocketrocket/PRInteractiveOnboardingCashOut;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "", "R", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "S", "getDEFAULT_TEXT", "DEFAULT_TEXT", "", "T", "Z", "getNoBorder", "()Z", "noBorder", "Lylz;", "a0", "Lylz;", "getPrOnboardingInteractionListener", "()Lylz;", "setPrOnboardingInteractionListener", "(Lylz;)V", "prOnboardingInteractionListener", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PRInteractiveOnboardingCashOut extends DynamicOnboardingScreenBasicBase {
    public static final /* synthetic */ int b0 = 0;
    public final float Q;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final boolean noBorder;
    public boolean U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ylz prOnboardingInteractionListener;

    public static final class a {
        public static Float[] a() {
            return new Float[]{Float.valueOf(0.02f), Float.valueOf(0.675f)};
        }

        public static Float[] b() {
            return new Float[]{Float.valueOf(0.35f), Float.valueOf(0.35500002f)};
        }

        public static Float[] c() {
            return new Float[]{Float.valueOf(0.68f), Float.valueOf(0.02f)};
        }

        public static Float[] d() {
            return new Float[]{Float.valueOf(0.6273682f), Float.valueOf(0.28967676f)};
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PRInteractiveOnboardingCashOut(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
        this.Q = a(9.0f);
        String string = context.getString(R.string.onboarding_pick_to_place_bet_cms);
        string.getClass();
        this.TEXT_KEY = string;
        String string2 = context.getString(R.string.onboarding_pick_to_place_bet_text);
        string2.getClass();
        this.DEFAULT_TEXT = string2;
        this.noBorder = true;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getDEFAULT_TEXT() {
        return this.DEFAULT_TEXT;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public boolean getNoBorder() {
        return this.noBorder;
    }

    public final ylz getPrOnboardingInteractionListener() {
        return this.prOnboardingInteractionListener;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getTEXT_KEY() {
        return this.TEXT_KEY;
    }

    public final void i(boolean z, boolean z2, boolean z3) {
        this.U = z;
        this.V = z2;
        this.W = z3;
        if (z) {
            setFocusBoxPrimary(new OnboardingFocusBox(a.a()[0].floatValue(), a.d()[0].floatValue(), a.a()[1].floatValue(), a.d()[1].floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, this.Q, 240, null));
        }
        if (z2) {
            setFocusBoxSecondary(new OnboardingFocusBox(a.b()[0].floatValue(), a.d()[0].floatValue(), a.b()[1].floatValue(), a.d()[1].floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, this.Q, 240, null));
        }
        if (z3) {
            setFocusBoxTertiary(new OnboardingFocusBox(a.c()[0].floatValue(), a.d()[0].floatValue(), a.c()[1].floatValue(), a.d()[1].floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, this.Q, 240, null));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        RectF focusRoundRectPrimary = getFocusRoundRectPrimary();
        if (focusRoundRectPrimary != null && focusRoundRectPrimary.contains(motionEvent.getX(), motionEvent.getY()) && this.U) {
            setFocusBoxPrimary(null);
            setFocusRoundRectPrimary(null);
            ylz ylzVar = this.prOnboardingInteractionListener;
            if (ylzVar != null) {
                ylzVar.a();
            }
            invalidate();
        }
        RectF focusRoundRectSecondary = getFocusRoundRectSecondary();
        if (focusRoundRectSecondary != null && focusRoundRectSecondary.contains(motionEvent.getX(), motionEvent.getY()) && this.V) {
            setFocusBoxSecondary(null);
            setFocusRoundRectSecondary(null);
            ylz ylzVar2 = this.prOnboardingInteractionListener;
            if (ylzVar2 != null) {
                ylzVar2.c();
            }
            invalidate();
        }
        RectF focusRoundRectTertiary = getFocusRoundRectTertiary();
        if (focusRoundRectTertiary == null || !focusRoundRectTertiary.contains(motionEvent.getX(), motionEvent.getY()) || !this.W) {
            return true;
        }
        setFocusBoxTertiary(null);
        setFocusRoundRectTertiary(null);
        ylz ylzVar3 = this.prOnboardingInteractionListener;
        if (ylzVar3 != null) {
            ylzVar3.b();
        }
        invalidate();
        return true;
    }

    public final void setPrOnboardingInteractionListener(ylz ylzVar) {
        this.prOnboardingInteractionListener = ylzVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PRInteractiveOnboardingCashOut(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PRInteractiveOnboardingCashOut(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PRInteractiveOnboardingCashOut(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
