package com.sportygames.onboarding.sportyhero;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingFocusBox;
import com.sportygames.commons.views.DynamicOnboardingScreenBasicBase;
import defpackage.tn60;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001$R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0014R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0014¨\u0006%"}, d2 = {"Lcom/sportygames/onboarding/sportyhero/SHInteractiveOnboardingCashOut;", "Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "", "R", "Ljava/lang/String;", "getTEXT_KEY", "()Ljava/lang/String;", "TEXT_KEY", "S", "getDEFAULT_TEXT", "DEFAULT_TEXT", "", "T", "Z", "getNoBorder", "()Z", "noBorder", "U", "getBetPlaced", "setBetPlaced", "(Z)V", "betPlaced", "V", "getBet1Placed", "setBet1Placed", "bet1Placed", "Ltn60;", "W", "Ltn60;", "getShOnboardingInteractionListener", "()Ltn60;", "setShOnboardingInteractionListener", "(Ltn60;)V", "shOnboardingInteractionListener", "isSideBetsEnabled", "setSideBetsEnabled", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SHInteractiveOnboardingCashOut extends DynamicOnboardingScreenBasicBase {
    public static final /* synthetic */ int a0 = 0;
    public float Q;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final boolean noBorder;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean betPlaced;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public boolean bet1Placed;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public tn60 shOnboardingInteractionListener;

    public static final class a {
        public static Float[] a(float f, float f2) {
            return new Float[]{Float.valueOf(f), Float.valueOf((1.0f - f) - f2)};
        }

        public static Float[] b(float f, float f2) {
            return new Float[]{Float.valueOf(f), Float.valueOf((1.0f - f) - f2)};
        }

        public static Float[] c() {
            return new Float[]{Float.valueOf(0.49f), Float.valueOf(0.03f)};
        }

        public static Float[] d() {
            return new Float[]{Float.valueOf(0.51f), Float.valueOf(0.03f)};
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SHInteractiveOnboardingCashOut(Context context, AttributeSet attributeSet, int i, int i2) {
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

    public final boolean getBet1Placed() {
        return this.bet1Placed;
    }

    public final boolean getBetPlaced() {
        return this.betPlaced;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getDEFAULT_TEXT() {
        return this.DEFAULT_TEXT;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public boolean getNoBorder() {
        return this.noBorder;
    }

    public final tn60 getShOnboardingInteractionListener() {
        return this.shOnboardingInteractionListener;
    }

    @Override // com.sportygames.commons.views.DynamicOnboardingScreenBasicBase
    public String getTEXT_KEY() {
        return this.TEXT_KEY;
    }

    public final void i(boolean z, boolean z2, boolean z3, float f, float f2, float f3, int i) {
        this.betPlaced = z;
        this.bet1Placed = z2;
        if (z) {
            if (i == 1) {
                setFocusBoxPrimary(new OnboardingFocusBox(a.c()[0].floatValue(), (z3 ? 0.0f : -0.053f) + a.a(f, f2)[0].floatValue(), a.c()[1].floatValue(), a.a(f, f2)[1].floatValue() + (z3 ? 0.0f : 0.05f), 0.0f, 0.0f, 0.0f, 0.0f, this.Q, 240, null));
            } else {
                this.Q = a(12.0f);
                setFocusBoxPrimary(new OnboardingFocusBox(a.d()[0].floatValue(), (z3 ? 0.0f : -0.035f) + a.a(f, f2)[0].floatValue(), a.d()[1].floatValue(), a.a(f, f2)[1].floatValue() + (z3 ? 0.0f : 0.02f), 0.0f, 0.0f, 0.0f, 0.0f, this.Q, 240, null));
            }
        }
        if (z2) {
            if (i == 1) {
                setFocusBoxSecondary(new OnboardingFocusBox(a.c()[0].floatValue(), a.b(f3, f2)[0].floatValue() + (z3 ? 0.0f : -0.053f), a.c()[1].floatValue(), a.b(f3, f2)[1].floatValue() + (z3 ? 0.0f : 0.05f), 0.0f, 0.0f, 0.0f, 0.0f, this.Q, 240, null));
            } else {
                this.Q = a(12.0f);
                setFocusBoxSecondary(new OnboardingFocusBox(a.d()[0].floatValue(), a.b(f3, f2)[0].floatValue() + (z3 ? 0.0f : -0.016f), a.d()[1].floatValue(), a.b(f3, f2)[1].floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, this.Q, 240, null));
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        RectF focusRoundRectPrimary = getFocusRoundRectPrimary();
        if (focusRoundRectPrimary != null && focusRoundRectPrimary.contains(motionEvent.getX(), motionEvent.getY()) && this.betPlaced) {
            setFocusBoxPrimary(null);
            setFocusRoundRectPrimary(null);
            tn60 tn60Var = this.shOnboardingInteractionListener;
            if (tn60Var != null) {
                tn60Var.b();
            }
            invalidate();
        }
        RectF focusRoundRectSecondary = getFocusRoundRectSecondary();
        if (focusRoundRectSecondary == null || !focusRoundRectSecondary.contains(motionEvent.getX(), motionEvent.getY()) || !this.bet1Placed) {
            return true;
        }
        setFocusBoxSecondary(null);
        setFocusRoundRectSecondary(null);
        tn60 tn60Var2 = this.shOnboardingInteractionListener;
        if (tn60Var2 != null) {
            tn60Var2.a();
        }
        invalidate();
        return true;
    }

    public final void setBet1Placed(boolean z) {
        this.bet1Placed = z;
    }

    public final void setBetPlaced(boolean z) {
        this.betPlaced = z;
    }

    public final void setShOnboardingInteractionListener(tn60 tn60Var) {
        this.shOnboardingInteractionListener = tn60Var;
    }

    public final void setSideBetsEnabled(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHInteractiveOnboardingCashOut(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHInteractiveOnboardingCashOut(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHInteractiveOnboardingCashOut(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
