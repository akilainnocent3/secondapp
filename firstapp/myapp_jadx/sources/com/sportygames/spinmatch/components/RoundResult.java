package com.sportygames.spinmatch.components;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.WinTextResponsiveLayout;
import com.sportygames.spinmatch.model.response.MatchPlaceBetResponse;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.op5;
import defpackage.pw;
import defpackage.uqe0;
import defpackage.vz50;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sportygames/spinmatch/components/RoundResult;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "currency", "Lcom/sportygames/spinmatch/model/response/MatchPlaceBetResponse;", "matchPlaceBetResponse", "", "setResult", "(Ljava/lang/String;Lcom/sportygames/spinmatch/model/response/MatchPlaceBetResponse;)V", "Lvz50;", "F", "Lvz50;", "getBinding", "()Lvz50;", "setBinding", "(Lvz50;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoundResult extends ConstraintLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public vz50 binding;

    public static final class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            ConstraintLayout constraintLayout;
            ConstraintLayout constraintLayout2;
            RoundResult roundResult = RoundResult.this;
            vz50 binding = roundResult.getBinding();
            if (binding != null && (constraintLayout2 = binding.i) != null) {
                constraintLayout2.setVisibility(8);
            }
            vz50 binding2 = roundResult.getBinding();
            if (binding2 == null || (constraintLayout = binding2.i) == null) {
                return;
            }
            constraintLayout.clearAnimation();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public static final class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            ConstraintLayout constraintLayout;
            ConstraintLayout constraintLayout2;
            RoundResult roundResult = RoundResult.this;
            vz50 binding = roundResult.getBinding();
            if (binding != null && (constraintLayout2 = binding.i) != null) {
                constraintLayout2.setVisibility(0);
            }
            vz50 binding2 = roundResult.getBinding();
            if (binding2 == null || (constraintLayout = binding2.i) == null) {
                return;
            }
            constraintLayout.clearAnimation();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundResult(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.round_result, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.gift_amount;
        TextView textView = (TextView) h5e.a(R.id.gift_amount, viewInflate);
        if (textView != null) {
            i = R.id.gift_close_bracket_tv;
            if (((TextView) h5e.a(R.id.gift_close_bracket_tv, viewInflate)) != null) {
                i = R.id.gift_icon;
                if (((AppCompatImageView) h5e.a(R.id.gift_icon, viewInflate)) != null) {
                    i = R.id.gift_minus_saperator_tv;
                    if (((TextView) h5e.a(R.id.gift_minus_saperator_tv, viewInflate)) != null) {
                        i = R.id.gift_open_bracket_tv;
                        if (((TextView) h5e.a(R.id.gift_open_bracket_tv, viewInflate)) != null) {
                            i = R.id.gift_round_detail;
                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.gift_round_detail, viewInflate);
                            if (constraintLayout != null) {
                                i = R.id.message;
                                TextView textView2 = (TextView) h5e.a(R.id.message, viewInflate);
                                if (textView2 != null) {
                                    i = R.id.message_win;
                                    TextView textView3 = (TextView) h5e.a(R.id.message_win, viewInflate);
                                    if (textView3 != null) {
                                        i = R.id.message_win_amount;
                                        TextView textView4 = (TextView) h5e.a(R.id.message_win_amount, viewInflate);
                                        if (textView4 != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                            i = R.id.round_result_layout;
                                            if (((WinTextResponsiveLayout) h5e.a(R.id.round_result_layout, viewInflate)) != null) {
                                                i = R.id.total_win_amount;
                                                TextView textView5 = (TextView) h5e.a(R.id.total_win_amount, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.total_win_icon;
                                                    if (((AppCompatImageView) h5e.a(R.id.total_win_icon, viewInflate)) != null) {
                                                        i = R.id.win_image;
                                                        ImageView imageView = (ImageView) h5e.a(R.id.win_image, viewInflate);
                                                        if (imageView != null) {
                                                            this.binding = new vz50(constraintLayout2, textView, constraintLayout, textView2, textView3, textView4, constraintLayout2, textView5, imageView);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void E(boolean z) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        if (z) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(300L);
            vz50 vz50Var = this.binding;
            if (vz50Var != null && (constraintLayout = vz50Var.i) != null) {
                constraintLayout.startAnimation(scaleAnimation);
            }
            scaleAnimation.setAnimationListener(new b());
            return;
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(300L);
        scaleAnimation2.setAnimationListener(new a());
        vz50 vz50Var2 = this.binding;
        if (vz50Var2 == null || (constraintLayout2 = vz50Var2.i) == null) {
            return;
        }
        constraintLayout2.startAnimation(scaleAnimation2);
    }

    public final vz50 getBinding() {
        return this.binding;
    }

    public final void setBinding(vz50 vz50Var) {
        this.binding = vz50Var;
    }

    public final void setResult(String currency, MatchPlaceBetResponse matchPlaceBetResponse) {
        MatchPlaceBetResponse.IndividualBetDetailsList individualBetDetailsList;
        String strI;
        String strI2;
        String strD;
        Object next;
        MatchPlaceBetResponse.IndividualBetDetailsList individualBetDetailsList2;
        currency.getClass();
        matchPlaceBetResponse.getClass();
        List<MatchPlaceBetResponse.IndividualBetDetailsList> individualBetDetailsList3 = matchPlaceBetResponse.getIndividualBetDetailsList();
        String strD2 = null;
        if (individualBetDetailsList3 != null) {
            Iterator<T> it = individualBetDetailsList3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                individualBetDetailsList2 = (MatchPlaceBetResponse.IndividualBetDetailsList) next;
                if (c.l(individualBetDetailsList2.getWinStatus(), "WIN", true)) {
                    break;
                }
            } while (!c.l(individualBetDetailsList2.getWinStatus(), "FREE_SPIN", true));
            individualBetDetailsList = (MatchPlaceBetResponse.IndividualBetDetailsList) next;
        } else {
            individualBetDetailsList = null;
        }
        if (individualBetDetailsList == null) {
            vz50 vz50Var = this.binding;
            if (vz50Var != null) {
                vz50Var.e.setVisibility(8);
            }
            vz50 vz50Var2 = this.binding;
            if (vz50Var2 != null) {
                vz50Var2.f.setVisibility(8);
            }
            vz50 vz50Var3 = this.binding;
            if (vz50Var3 != null) {
                vz50Var3.w.setVisibility(8);
            }
            vz50 vz50Var4 = this.binding;
            if (vz50Var4 != null) {
                vz50Var4.d.setVisibility(0);
            }
            vz50 vz50Var5 = this.binding;
            if (vz50Var5 != null) {
                vz50Var5.c.setVisibility(8);
                return;
            }
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!c.l(individualBetDetailsList.getWinStatus(), "WIN", true)) {
            vz50 vz50Var6 = this.binding;
            if (vz50Var6 != null) {
                vz50Var6.c.setVisibility(8);
            }
            op5 op5Var = op5.a;
            vz50 vz50Var7 = this.binding;
            spannableStringBuilder.append((CharSequence) op5.c(op5Var, String.valueOf(vz50Var7 != null ? vz50Var7.e.getTag() : null), getContext().getString(R.string.spin_match_Free_spin_msg) + " ").concat(" "));
            int color = getContext().getColor(R.color.free_spin_color);
            String string = getContext().getString(R.string.one_free_spin_text_cms);
            string.getClass();
            spannableStringBuilder.append((CharSequence) Html.fromHtml("<font color=" + color + ">" + op5.c(op5Var, string, getContext().getString(R.string.one_free_spin) + " ") + "</font>"));
            vz50 vz50Var8 = this.binding;
            if (vz50Var8 != null) {
                vz50Var8.e.setText(spannableStringBuilder);
            }
            vz50 vz50Var9 = this.binding;
            if (vz50Var9 != null) {
                vz50Var9.e.setVisibility(0);
            }
            vz50 vz50Var10 = this.binding;
            if (vz50Var10 != null) {
                vz50Var10.f.setVisibility(8);
            }
            vz50 vz50Var11 = this.binding;
            if (vz50Var11 != null) {
                vz50Var11.w.setVisibility(8);
            }
            vz50 vz50Var12 = this.binding;
            if (vz50Var12 != null) {
                vz50Var12.d.setVisibility(8);
                return;
            }
            return;
        }
        Double giftAmount = matchPlaceBetResponse.getGiftAmount();
        vz50 vz50Var13 = this.binding;
        if (giftAmount != null) {
            if (vz50Var13 != null) {
                vz50Var13.c.setVisibility(0);
            }
            vz50 vz50Var14 = this.binding;
            if (vz50Var14 != null) {
                TextView textView = vz50Var14.v;
                String currency2 = matchPlaceBetResponse.getCurrency();
                if (currency2 != null) {
                    op5.a.getClass();
                    strI2 = op5.i(currency2);
                } else {
                    strI2 = null;
                }
                Double payoutAmount = individualBetDetailsList.getPayoutAmount();
                if (payoutAmount != null) {
                    double dDoubleValue = payoutAmount.doubleValue();
                    TreeMap treeMap = pw.a;
                    strD = pw.d(dDoubleValue);
                } else {
                    strD = null;
                }
                textView.setText(strI2 + " " + strD);
            }
            vz50 vz50Var15 = this.binding;
            if (vz50Var15 != null) {
                TextView textView2 = vz50Var15.b;
                String currency3 = matchPlaceBetResponse.getCurrency();
                if (currency3 != null) {
                    op5.a.getClass();
                    strI = op5.i(currency3);
                } else {
                    strI = null;
                }
                double dDoubleValue2 = matchPlaceBetResponse.getGiftAmount().doubleValue();
                TreeMap treeMap2 = pw.a;
                textView2.setText(strI + " " + ((Object) pw.d(dDoubleValue2)));
            }
        } else if (vz50Var13 != null) {
            vz50Var13.c.setVisibility(8);
        }
        op5 op5Var2 = op5.a;
        vz50 vz50Var16 = this.binding;
        spannableStringBuilder.append((CharSequence) op5.c(op5Var2, String.valueOf(vz50Var16 != null ? vz50Var16.e.getTag() : null), getContext().getString(R.string.redblack_win_msg) + " "));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        int color2 = getContext().getColor(R.color.win_color);
        String strI3 = op5.i(currency);
        Double actualCreditedAmt = matchPlaceBetResponse.getActualCreditedAmt();
        if (actualCreditedAmt != null) {
            double dDoubleValue3 = actualCreditedAmt.doubleValue();
            TreeMap treeMap3 = pw.a;
            strD2 = pw.d(dDoubleValue3);
        }
        StringBuilder sbA = uqe0.a(color2, "<font color=", ">", strI3, " ");
        sbA.append(strD2);
        sbA.append("</font>");
        spannableStringBuilder2.append((CharSequence) Html.fromHtml(sbA.toString()));
        vz50 vz50Var17 = this.binding;
        if (vz50Var17 != null) {
            vz50Var17.e.setText(spannableStringBuilder);
        }
        vz50 vz50Var18 = this.binding;
        if (vz50Var18 != null) {
            vz50Var18.e.setVisibility(0);
        }
        vz50 vz50Var19 = this.binding;
        if (vz50Var19 != null) {
            vz50Var19.f.setVisibility(0);
        }
        vz50 vz50Var20 = this.binding;
        if (vz50Var20 != null) {
            vz50Var20.w.setVisibility(0);
        }
        vz50 vz50Var21 = this.binding;
        if (vz50Var21 != null) {
            vz50Var21.f.setText(spannableStringBuilder2);
        }
        vz50 vz50Var22 = this.binding;
        if (vz50Var22 != null) {
            vz50Var22.d.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundResult(Context context) {
        this(context, null);
        context.getClass();
    }
}
