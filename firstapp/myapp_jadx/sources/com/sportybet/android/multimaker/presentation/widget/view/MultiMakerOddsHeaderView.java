package com.sportybet.android.multimaker.presentation.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsHeaderView;
import defpackage.bmy;
import defpackage.fhw;
import defpackage.h5e;
import defpackage.hhw;
import defpackage.hwr;
import defpackage.ihw;
import defpackage.ku90;
import defpackage.lyh;
import defpackage.mhw;
import defpackage.mpe0;
import defpackage.nid0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001b\u0010,\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"¨\u0006-"}, d2 = {"Lcom/sportybet/android/multimaker/presentation/widget/view/MultiMakerOddsHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isTotalOddsModeVisible", "", "setIsTotalOddsModeVisible", "(Z)V", "Lmhw;", "mode", "setOddsRangeMode", "(Lmhw;)V", "Lcom/sporty/android/common_ui/uitext/UiText;", "oddsRangeUiText", "setOddsRangeText", "(Lcom/sporty/android/common_ui/uitext/UiText;)V", "isEnabled", "setIsEnabled", "Llyh;", "G", "Llyh;", "getOddsRangeModeChangedEventFlow", "()Llyh;", "oddsRangeModeChangedEventFlow", "H", "Lttr;", "getGreen", "()I", "green", "I", "getGrey", "grey", "J", "getMmWhite", "mmWhite", "K", "getMmGrey", "mmGrey", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MultiMakerOddsHeaderView extends ConstraintLayout {
    public static final /* synthetic */ int M = 0;
    public final ku90<mhw> F;
    public final ku90 G;
    public final mpe0 H;
    public final mpe0 I;
    public final mpe0 J;
    public final mpe0 K;
    public final nid0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsHeaderView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        ku90<mhw> ku90Var = new ku90<>();
        this.F = ku90Var;
        this.G = ku90Var;
        this.H = hwr.b(new fhw(context, 0));
        this.I = hwr.b(new Function0() { // from class: ghw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = MultiMakerOddsHeaderView.M;
                return Integer.valueOf(context.getColor(R.color.text_disable_type2_primary));
            }
        });
        this.J = hwr.b(new hhw(context, 0));
        this.K = hwr.b(new ihw(context, 0));
        LayoutInflater.from(context).inflate(R.layout.spr_multi_maker_header_view_layout, this);
        int i2 = R.id.multi_maker_selection_odds;
        TextView textView = (TextView) h5e.a(R.id.multi_maker_selection_odds, this);
        if (textView != null) {
            i2 = R.id.multi_maker_total_odds;
            TextView textView2 = (TextView) h5e.a(R.id.multi_maker_total_odds, this);
            if (textView2 != null) {
                i2 = R.id.odds_range_value;
                TextView textView3 = (TextView) h5e.a(R.id.odds_range_value, this);
                if (textView3 != null) {
                    this.L = new nid0(this, textView, textView2, textView3);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: jhw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.F.a(mhw.a);
                        }
                    });
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: khw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.F.a(mhw.b);
                        }
                    });
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final int getGreen() {
        return ((Number) this.H.getValue()).intValue();
    }

    private final int getGrey() {
        return ((Number) this.I.getValue()).intValue();
    }

    private final int getMmGrey() {
        return ((Number) this.K.getValue()).intValue();
    }

    private final int getMmWhite() {
        return ((Number) this.J.getValue()).intValue();
    }

    public final lyh<mhw> getOddsRangeModeChangedEventFlow() {
        return this.G;
    }

    public final void setIsEnabled(boolean isEnabled) {
        nid0 nid0Var = this.L;
        nid0Var.b.setEnabled(isEnabled);
        nid0Var.c.setEnabled(isEnabled);
        nid0Var.d.setTextColor(isEnabled ? getGreen() : getGrey());
    }

    public final void setIsTotalOddsModeVisible(boolean isTotalOddsModeVisible) {
        this.L.c.setVisibility(isTotalOddsModeVisible ? 0 : 8);
    }

    public final void setOddsRangeMode(mhw mode) {
        mode.getClass();
        nid0 nid0Var = this.L;
        nid0Var.c.setTextColor(mode == mhw.b ? getMmWhite() : getMmGrey());
        nid0Var.b.setTextColor(mode == mhw.a ? getMmWhite() : getMmGrey());
    }

    public final void setOddsRangeText(UiText oddsRangeUiText) {
        oddsRangeUiText.getClass();
        TextView textView = this.L.d;
        Context context = getContext();
        context.getClass();
        textView.setText(oddsRangeUiText.e(context));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiMakerOddsHeaderView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ MultiMakerOddsHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
