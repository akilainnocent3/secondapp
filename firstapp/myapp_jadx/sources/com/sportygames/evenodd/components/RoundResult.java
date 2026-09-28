package com.sportygames.evenodd.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.ib5;
import defpackage.khg;
import defpackage.qz50;
import defpackage.r9n;
import defpackage.s4u;
import defpackage.uj50;
import defpackage.x1b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportygames/evenodd/components/RoundResult;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkhg;", "a", "Lkhg;", "getBinding", "()Lkhg;", "setBinding", "(Lkhg;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoundResult extends LinearLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public khg binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundResult(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.evenodd_round_result, (ViewGroup) this, false);
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
                                i = R.id.guideline;
                                if (((Guideline) h5e.a(R.id.guideline, viewInflate)) != null) {
                                    i = R.id.message;
                                    TextView textView2 = (TextView) h5e.a(R.id.message, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.message_win;
                                        TextView textView3 = (TextView) h5e.a(R.id.message_win, viewInflate);
                                        if (textView3 != null) {
                                            i = R.id.number_layout;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.number_layout, viewInflate);
                                            if (constraintLayout3 != null) {
                                                i = R.id.result_card_name;
                                                TextView textView4 = (TextView) h5e.a(R.id.result_card_name, viewInflate);
                                                if (textView4 != null) {
                                                    i = R.id.round_you_win_message;
                                                    if (((ConstraintLayout) h5e.a(R.id.round_you_win_message, viewInflate)) != null) {
                                                        i = R.id.space;
                                                        View viewA = h5e.a(R.id.space, viewInflate);
                                                        if (viewA != null) {
                                                            i = R.id.top_glow;
                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.top_glow, viewInflate);
                                                            if (appCompatImageView2 != null) {
                                                                i = R.id.total;
                                                                TextView textView5 = (TextView) h5e.a(R.id.total, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = R.id.total_bg;
                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.total_bg, viewInflate);
                                                                    if (constraintLayout4 != null) {
                                                                        i = R.id.total_text;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.total_text, viewInflate);
                                                                        if (textView6 != null) {
                                                                            i = R.id.total_win_amount;
                                                                            TextView textView7 = (TextView) h5e.a(R.id.total_win_amount, viewInflate);
                                                                            if (textView7 != null) {
                                                                                i = R.id.total_win_icon;
                                                                                if (((AppCompatImageView) h5e.a(R.id.total_win_icon, viewInflate)) != null) {
                                                                                    i = R.id.view4;
                                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.view4, viewInflate);
                                                                                    if (appCompatImageView3 != null) {
                                                                                        i = R.id.view5;
                                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.view5, viewInflate);
                                                                                        if (appCompatImageView4 != null) {
                                                                                            i = R.id.view6;
                                                                                            if (((TextView) h5e.a(R.id.view6, viewInflate)) != null) {
                                                                                                i = R.id.win_amount;
                                                                                                TextView textView8 = (TextView) h5e.a(R.id.win_amount, viewInflate);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.win_trophy;
                                                                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.win_trophy, viewInflate);
                                                                                                    if (appCompatImageView5 != null) {
                                                                                                        this.binding = new khg((ConstraintLayout) viewInflate, appCompatImageView, constraintLayout, textView, constraintLayout2, textView2, textView3, constraintLayout3, textView4, viewA, appCompatImageView2, textView5, constraintLayout4, textView6, textView7, appCompatImageView3, appCompatImageView4, textView8, appCompatImageView5);
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
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(ConstraintLayout constraintLayout, String str) {
        if (c.l(str, getContext().getString(R.string.odd), true)) {
            constraintLayout.setBackground(getContext().getDrawable(R.drawable.circle_odd));
        } else {
            constraintLayout.setBackground(getContext().getDrawable(R.drawable.circle_even));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ConstraintLayout constraintLayout, String str, x1b x1bVar) {
        qz50 qz50Var;
        if (x1bVar instanceof qz50) {
            qz50Var = (qz50) x1bVar;
            int i = qz50Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qz50Var.d = i - Integer.MIN_VALUE;
            } else {
                qz50Var = new qz50(this, x1bVar);
            }
        } else {
            qz50Var = new qz50(this, x1bVar);
        }
        Object objB = qz50Var.b;
        y5b y5bVar = y5b.a;
        int i2 = qz50Var.d;
        if (i2 == 0) {
            uj50.b(objB);
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = getContext();
            qz50Var.a = constraintLayout;
            qz50Var.d = 1;
            objB = r9n.b(context, str, qz50Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            constraintLayout = qz50Var.a;
            uj50.b(objB);
        }
        constraintLayout.setBackground((Drawable) objB);
        return Unit.a;
    }

    public final khg getBinding() {
        return this.binding;
    }

    public final void setBinding(khg khgVar) {
        khgVar.getClass();
        this.binding = khgVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundResult(Context context) {
        this(context, null);
        context.getClass();
    }
}
