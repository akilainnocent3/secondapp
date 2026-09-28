package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.ku1;
import defpackage.q5n;
import defpackage.t5n;
import defpackage.y8z;
import defpackage.zch0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001QB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010G\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010J\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010 R*\u0010O\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010 ¨\u0006R"}, d2 = {"Lcom/sportybet/plugin/realsports/widget/OutcomeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "textSize", "", "setTextSize", "(F)V", "button1textSize", "button2textSize", "(FF)V", "Landroid/content/res/ColorStateList;", "colors", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "", "left", "top", "right", "bottom", "setLeftPadding", "(IIII)V", "setRightPadding", "", "enabled", "setEnabled", "(Z)V", "button1FullWidth", "button2FullWidth", "setButtonFullWidth", "(ZZ)V", AnalyticsParam.DATA_NORMAL, AnalyticsParam.EVENT_STATUS_CHECKED, "disabled", "setBg", "(III)V", "setupWithVerticalOrientation", "()V", "Lcom/sportybet/plugin/realsports/widget/OutcomeButton;", "F", "Lcom/sportybet/plugin/realsports/widget/OutcomeButton;", "getOb1", "()Lcom/sportybet/plugin/realsports/widget/OutcomeButton;", "setOb1", "(Lcom/sportybet/plugin/realsports/widget/OutcomeButton;)V", "ob1", "G", "getOb2", "setOb2", "ob2", "Lcom/sportybet/plugin/realsports/widget/OutcomeViewShimmer;", "H", "Lcom/sportybet/plugin/realsports/widget/OutcomeViewShimmer;", "getShimmer", "()Lcom/sportybet/plugin/realsports/widget/OutcomeViewShimmer;", "setShimmer", "(Lcom/sportybet/plugin/realsports/widget/OutcomeViewShimmer;)V", "shimmer", "Lcom/sportybet/plugin/realsports/widget/OutcomeView$a;", "I", "Lcom/sportybet/plugin/realsports/widget/OutcomeView$a;", "getListener", "()Lcom/sportybet/plugin/realsports/widget/OutcomeView$a;", "setListener", "(Lcom/sportybet/plugin/realsports/widget/OutcomeView$a;)V", "listener", "K", "Z", AnalyticsParam.EVENT_PARAM_IS_CHECKED, "()Z", "setChecked", "highlighted", "L", "isHighlighted", "setHighlighted", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OutcomeView extends ConstraintLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public OutcomeButton ob1;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public OutcomeButton ob2;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public OutcomeViewShimmer shimmer;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public a listener;
    public boolean J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean isChecked;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public boolean isHighlighted;
    public int M;
    public int N;
    public final int O;
    public int P;
    public q5n Q;
    public FlashBoostBadgeView R;
    public boolean S;
    public boolean T;

    public interface a {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeView(Context context) {
        super(context);
        context.getClass();
        this.M = R.drawable.spr_outcomeview_disable_bg;
        this.N = R.drawable.spr_outcomeview_checked_bg;
        this.O = R.drawable.spr_outcomeview_highlighted_bg;
        this.P = R.drawable.bg_filled_custom_brand_secondary_variable_type1_type4;
        F(false);
    }

    public final void E() {
        q5n q5nVar = this.Q;
        if (q5nVar != null) {
            q5nVar.a();
        }
        this.Q = null;
        if (this.T) {
            this.T = false;
            this.S = false;
            G();
        }
        getOb1().a();
        getOb2().a();
    }

    public final void F(boolean z) {
        LayoutInflater.from(getContext()).inflate(R.layout.spr_outcome_view, this);
        View viewFindViewById = findViewById(R.id.btn1);
        viewFindViewById.getClass();
        setOb1((OutcomeButton) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.btn2);
        viewFindViewById2.getClass();
        setOb2((OutcomeButton) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.shimmerAnimation);
        viewFindViewById3.getClass();
        setShimmer((OutcomeViewShimmer) viewFindViewById3);
        G();
        setClickable(true);
        setFocusable(true);
        if (z) {
            setupWithVerticalOrientation();
            return;
        }
        int iA = zch0.a(getContext(), 9);
        int iA2 = zch0.a(getContext(), 10);
        int iA3 = zch0.a(getContext(), 4);
        getOb1().setGravity(19);
        getOb2().setGravity(21);
        setLeftPadding(iA2, iA, iA3, iA);
        setRightPadding(iA3, iA, iA2, iA);
        getOb1().getViewTreeObserver().addOnPreDrawListener(new y8z(this));
    }

    public final void G() {
        int i;
        if (!isEnabled()) {
            q5n q5nVar = this.Q;
            if (q5nVar != null) {
                q5nVar.a();
            }
            setBackgroundResource(this.M);
            return;
        }
        boolean z = this.T;
        boolean z2 = this.isChecked;
        if (!z) {
            if (z2) {
                setBackgroundResource(this.N);
                return;
            } else if (this.isHighlighted) {
                setBackgroundResource(this.O);
                return;
            } else {
                setBackgroundResource(this.P);
                return;
            }
        }
        boolean z3 = this.S;
        if (z3 && z2) {
            i = R.drawable.bg_outcome_boosted_selected_dark;
        } else if (z3) {
            i = R.drawable.bg_outcome_boosted_dark;
        } else {
            i = z2 ? R.drawable.bg_outcome_boosted_selected : R.drawable.bg_outcome_boosted;
        }
        setBackgroundResource(i);
    }

    public final void H(ViewGroup viewGroup, ku1 ku1Var, boolean z) {
        FlashBoostBadgeView flashBoostBadgeView;
        boolean z2 = this.S != z;
        this.S = z;
        this.T = true;
        G();
        q5n q5nVar = this.Q;
        if (q5nVar != null && !z2) {
            FlashBoostBadgeView flashBoostBadgeView2 = q5nVar.b;
            if (flashBoostBadgeView2 != null) {
                flashBoostBadgeView2.setVisibility(0);
                return;
            }
            return;
        }
        if (q5nVar != null) {
            q5nVar.a();
        }
        FlashBoostBadgeView flashBoostBadgeView3 = this.R;
        if (flashBoostBadgeView3 == null) {
            int i = FlashBoostBadgeView.b;
            Context context = getContext();
            context.getClass();
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_flash_boost_badge, viewGroup, false);
            viewInflate.getClass();
            flashBoostBadgeView3 = (FlashBoostBadgeView) viewInflate;
            this.R = flashBoostBadgeView3;
        }
        flashBoostBadgeView3.a(ku1Var, z);
        q5n q5nVarA = t5n.a(this, flashBoostBadgeView3, viewGroup, ku1Var);
        this.Q = q5nVarA;
        if (q5nVarA == null || (flashBoostBadgeView = q5nVarA.b) == null) {
            return;
        }
        flashBoostBadgeView.setVisibility(0);
    }

    public final a getListener() {
        return this.listener;
    }

    public final OutcomeButton getOb1() {
        OutcomeButton outcomeButton = this.ob1;
        if (outcomeButton != null) {
            return outcomeButton;
        }
        Intrinsics.n("ob1");
        throw null;
    }

    public final OutcomeButton getOb2() {
        OutcomeButton outcomeButton = this.ob2;
        if (outcomeButton != null) {
            return outcomeButton;
        }
        Intrinsics.n("ob2");
        throw null;
    }

    public final OutcomeViewShimmer getShimmer() {
        OutcomeViewShimmer outcomeViewShimmer = this.shimmer;
        if (outcomeViewShimmer != null) {
            return outcomeViewShimmer;
        }
        Intrinsics.n("shimmer");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.listener = null;
        E();
    }

    public final void setBg(int normal, int checked, int disabled) {
        this.P = normal;
        this.N = checked;
        this.M = disabled;
    }

    public final void setButtonFullWidth(boolean button1FullWidth, boolean button2FullWidth) {
        if (this.J) {
            return;
        }
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(this);
        bVar.e(R.id.btn1, 7);
        bVar.e(R.id.btn2, 6);
        if (button1FullWidth) {
            bVar.g(R.id.btn1, 7, 0, 7);
        } else {
            bVar.g(R.id.btn1, 7, R.id.guideline_vertical, 6);
        }
        if (button2FullWidth) {
            bVar.g(R.id.btn2, 6, 0, 6);
        } else {
            bVar.g(R.id.btn2, 6, R.id.guideline_vertical, 7);
        }
        bVar.b(this);
    }

    public final void setChecked(boolean z) {
        getOb1().setChecked(z);
        getOb2().setChecked(z);
        this.isChecked = z;
        G();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        getOb1().setEnabled(enabled);
        getOb2().setEnabled(enabled);
        G();
    }

    public final void setHighlighted(boolean z) {
        this.isHighlighted = z;
        G();
    }

    public final void setLeftPadding(int left, int top, int right, int bottom) {
        getOb1().setPadding(left, top, right, bottom);
    }

    public final void setListener(a aVar) {
        this.listener = aVar;
    }

    public final void setOb1(OutcomeButton outcomeButton) {
        outcomeButton.getClass();
        this.ob1 = outcomeButton;
    }

    public final void setOb2(OutcomeButton outcomeButton) {
        outcomeButton.getClass();
        this.ob2 = outcomeButton;
    }

    public final void setRightPadding(int left, int top, int right, int bottom) {
        getOb2().setPadding(left, top, right, bottom);
    }

    public final void setShimmer(OutcomeViewShimmer outcomeViewShimmer) {
        outcomeViewShimmer.getClass();
        this.shimmer = outcomeViewShimmer;
    }

    public final void setTextColor(ColorStateList colors) {
        getOb1().setTextColor(colors);
        getOb2().setTextColor(colors);
    }

    public final void setTextSize(float textSize) {
        getOb1().setTextSize(textSize);
        getOb2().setTextSize(textSize);
    }

    public final void setupWithVerticalOrientation() {
        if (this.J) {
            return;
        }
        int iA = zch0.a(getContext(), 4);
        int iA2 = zch0.a(getContext(), 9);
        int iA3 = zch0.a(getContext(), 10);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(this);
        bVar.e(R.id.btn1, 7);
        bVar.e(R.id.btn2, 6);
        bVar.g(R.id.btn1, 7, 0, 7);
        bVar.g(R.id.btn1, 4, R.id.guideline_horizontal, 3);
        bVar.g(R.id.btn2, 6, 0, 6);
        bVar.g(R.id.btn2, 3, R.id.guideline_horizontal, 4);
        bVar.b(this);
        getOb1().setGravity(19);
        getOb2().setGravity(83);
        setLeftPadding(iA3, iA2, iA3, iA);
        setRightPadding(iA3, iA, iA3, iA2);
        this.J = true;
        a aVar = this.listener;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void setTextSize(float button1textSize, float button2textSize) {
        getOb1().setTextSize(button1textSize);
        getOb2().setTextSize(button2textSize);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.M = R.drawable.spr_outcomeview_disable_bg;
        this.N = R.drawable.spr_outcomeview_checked_bg;
        this.O = R.drawable.spr_outcomeview_highlighted_bg;
        this.P = R.drawable.bg_filled_custom_brand_secondary_variable_type1_type4;
        F(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeView(Context context, boolean z) {
        super(context);
        context.getClass();
        this.M = R.drawable.spr_outcomeview_disable_bg;
        this.N = R.drawable.spr_outcomeview_checked_bg;
        this.O = R.drawable.spr_outcomeview_highlighted_bg;
        this.P = R.drawable.bg_filled_custom_brand_secondary_variable_type1_type4;
        F(z);
    }
}
