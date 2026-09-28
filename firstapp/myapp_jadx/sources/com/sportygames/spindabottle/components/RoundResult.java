package com.sportygames.spindabottle.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bcb0;
import defpackage.bmy;
import defpackage.h5e;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportygames/spindabottle/components/RoundResult;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lbcb0;", "a", "Lbcb0;", "getBinding", "()Lbcb0;", "setBinding", "(Lbcb0;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoundResult extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public bcb0 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundResult(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spin_round_result, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.bottom_glow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.bottom_glow, viewInflate);
        if (appCompatImageView != null) {
            i = R.id.evenodd_result_big_box;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.evenodd_result_big_box, viewInflate);
            if (constraintLayout != null) {
                i = R.id.gift_amount;
                TextView textView = (TextView) h5e.a(R.id.gift_amount, viewInflate);
                if (textView != null) {
                    i = R.id.gift_icon;
                    if (((AppCompatImageView) h5e.a(R.id.gift_icon, viewInflate)) != null) {
                        i = R.id.gift_minus_saperator_tv;
                        if (((TextView) h5e.a(R.id.gift_minus_saperator_tv, viewInflate)) != null) {
                            i = R.id.gift_round_detail;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.gift_round_detail, viewInflate);
                            if (constraintLayout2 != null) {
                                i = R.id.message;
                                TextView textView2 = (TextView) h5e.a(R.id.message, viewInflate);
                                if (textView2 != null) {
                                    i = R.id.message_win;
                                    TextView textView3 = (TextView) h5e.a(R.id.message_win, viewInflate);
                                    if (textView3 != null) {
                                        i = R.id.result_card_name;
                                        TextView textView4 = (TextView) h5e.a(R.id.result_card_name, viewInflate);
                                        if (textView4 != null) {
                                            i = R.id.round_you_win_message;
                                            if (((ConstraintLayout) h5e.a(R.id.round_you_win_message, viewInflate)) != null) {
                                                i = R.id.top_glow;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.top_glow, viewInflate);
                                                if (appCompatImageView2 != null) {
                                                    i = R.id.total_win_amount;
                                                    TextView textView5 = (TextView) h5e.a(R.id.total_win_amount, viewInflate);
                                                    if (textView5 != null) {
                                                        i = R.id.total_win_icon;
                                                        if (((AppCompatImageView) h5e.a(R.id.total_win_icon, viewInflate)) != null) {
                                                            i = R.id.view1;
                                                            View viewA = h5e.a(R.id.view1, viewInflate);
                                                            if (viewA != null) {
                                                                i = R.id.view2;
                                                                View viewA2 = h5e.a(R.id.view2, viewInflate);
                                                                if (viewA2 != null) {
                                                                    i = R.id.view3;
                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.view3, viewInflate);
                                                                    if (appCompatImageView3 != null) {
                                                                        i = R.id.view4;
                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.view4, viewInflate);
                                                                        if (appCompatImageView4 != null) {
                                                                            i = R.id.view5;
                                                                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.view5, viewInflate);
                                                                            if (appCompatImageView5 != null) {
                                                                                i = R.id.view6;
                                                                                if (((TextView) h5e.a(R.id.view6, viewInflate)) != null) {
                                                                                    i = R.id.win_amount;
                                                                                    TextView textView6 = (TextView) h5e.a(R.id.win_amount, viewInflate);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.win_trophy;
                                                                                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) h5e.a(R.id.win_trophy, viewInflate);
                                                                                        if (appCompatImageView6 != null) {
                                                                                            this.binding = new bcb0((ConstraintLayout) viewInflate, appCompatImageView, constraintLayout, textView, constraintLayout2, textView2, textView3, textView4, appCompatImageView2, textView5, viewA, viewA2, appCompatImageView3, appCompatImageView4, appCompatImageView5, textView6, appCompatImageView6);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final bcb0 getBinding() {
        return this.binding;
    }

    public final void setBinding(bcb0 bcb0Var) {
        bcb0Var.getClass();
        this.binding = bcb0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundResult(Context context) {
        this(context, null);
        context.getClass();
    }
}
