package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.rush.model.response.BetHistoryItem;
import java.text.DecimalFormat;
import java.util.TreeMap;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes2.dex */
public final class vs2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final h260 a;
    public BetHistoryItem b;

    public vs2(h260 h260Var) {
        super(h260Var.a);
        this.a = h260Var;
    }

    public final void a(final BetHistoryItem betHistoryItem, Context context) {
        double dDoubleValue;
        double dDoubleValue2;
        String strValueOf;
        String str;
        double dDoubleValue3;
        double dDoubleValue4;
        double dDoubleValue5;
        double dDoubleValue6;
        double dDoubleValue7;
        double dDoubleValue8;
        double dDoubleValue9;
        double dDoubleValue10;
        betHistoryItem.getClass();
        context.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        double dDoubleValue11 = 0.0d;
        h260 h260Var = this.a;
        if (zIsExpanded) {
            ConstraintLayout constraintLayout = h260Var.F;
            UnderLineTextView underLineTextView = h260Var.I;
            constraintLayout.setVisibility(0);
            Double giftAmount = betHistoryItem.getGiftAmount();
            if (giftAmount != null) {
                dDoubleValue2 = giftAmount.doubleValue();
            } else {
                dDoubleValue2 = 0.0d;
            }
            ConstraintLayout constraintLayout2 = h260Var.w;
            if (dDoubleValue2 > 0.0d) {
                constraintLayout2.setVisibility(0);
                TextView textView = h260Var.K;
                TreeMap treeMap = pw.a;
                Double stakeAmount = betHistoryItem.getStakeAmount();
                if (stakeAmount != null) {
                    dDoubleValue3 = stakeAmount.doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                textView.setText(pw.d(dDoubleValue3));
                TextView textView2 = h260Var.e;
                Double giftAmount2 = betHistoryItem.getGiftAmount();
                if (giftAmount2 != null) {
                    dDoubleValue4 = giftAmount2.doubleValue();
                } else {
                    dDoubleValue4 = 0.0d;
                }
                textView2.setText("- ".concat(pw.d(dDoubleValue4)));
                TextView textView3 = h260Var.S;
                Double actualDebitedAmount = betHistoryItem.getActualDebitedAmount();
                if (actualDebitedAmount != null) {
                    dDoubleValue5 = actualDebitedAmount.doubleValue();
                } else {
                    dDoubleValue5 = 0.0d;
                }
                textView3.setText(pw.d(dDoubleValue5));
                Double houseCoefficient = betHistoryItem.getHouseCoefficient();
                if (houseCoefficient != null) {
                    dDoubleValue6 = houseCoefficient.doubleValue();
                } else {
                    dDoubleValue6 = 0.0d;
                }
                Double userCoefficient = betHistoryItem.getUserCoefficient();
                if (userCoefficient != null) {
                    dDoubleValue7 = userCoefficient.doubleValue();
                } else {
                    dDoubleValue7 = 0.0d;
                }
                ConstraintLayout constraintLayout3 = h260Var.A;
                if (dDoubleValue6 >= dDoubleValue7) {
                    constraintLayout3.setVisibility(0);
                    TextView textView4 = h260Var.M;
                    Double payoutAmount = betHistoryItem.getPayoutAmount();
                    if (payoutAmount != null) {
                        dDoubleValue8 = payoutAmount.doubleValue();
                    } else {
                        dDoubleValue8 = 0.0d;
                    }
                    textView4.setText(pw.d(dDoubleValue8));
                    TextView textView5 = h260Var.f;
                    Double giftAmount3 = betHistoryItem.getGiftAmount();
                    if (giftAmount3 != null) {
                        dDoubleValue9 = giftAmount3.doubleValue();
                    } else {
                        dDoubleValue9 = 0.0d;
                    }
                    textView5.setText("- ".concat(pw.d(dDoubleValue9)));
                    TextView textView6 = h260Var.U;
                    Double actualCreditedAmount = betHistoryItem.getActualCreditedAmount();
                    if (actualCreditedAmount != null) {
                        dDoubleValue10 = actualCreditedAmount.doubleValue();
                    } else {
                        dDoubleValue10 = 0.0d;
                    }
                    textView6.setText(pw.d(dDoubleValue10));
                } else {
                    constraintLayout3.setVisibility(8);
                }
            } else {
                constraintLayout2.setVisibility(8);
            }
            h260Var.D.setVisibility(8);
            h260Var.E.setVisibility(0);
            Integer ticketId = betHistoryItem.getTicketId();
            if (ticketId != null) {
                strValueOf = String.valueOf(ticketId.intValue());
            } else {
                strValueOf = null;
            }
            underLineTextView.setText(strValueOf);
            TextView textView7 = h260Var.Q;
            Double userCoefficient2 = betHistoryItem.getUserCoefficient();
            String str2 = "0.00";
            if (userCoefficient2 != null) {
                try {
                    str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(userCoefficient2.doubleValue());
                    str.getClass();
                } catch (Exception unused) {
                    str = "0.00";
                }
            } else {
                str = null;
            }
            String str3 = LGxrN.bqjwda;
            r97.a(textView7, str, str3);
            TextView textView8 = h260Var.C;
            Double houseCoefficient2 = betHistoryItem.getHouseCoefficient();
            if (houseCoefficient2 != null) {
                try {
                    String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(houseCoefficient2.doubleValue());
                    str4.getClass();
                    str2 = str4;
                } catch (Exception unused2) {
                }
            } else {
                str2 = null;
            }
            textView8.setText(str2 + str3);
            underLineTextView.setOnClickListener(new View.OnClickListener() { // from class: mr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wz.a("TransactionTicketClicked", "Rush", new String[0]);
                    Integer ticketId2 = betHistoryItem.getTicketId();
                    String strValueOf2 = ticketId2 != null ? String.valueOf(ticketId2.intValue()) : null;
                    if (strValueOf2 == null) {
                        strValueOf2 = "";
                    }
                    SportyGamesManager.getInstance().gotoSportyBet(xae.d, mll0.a("KEY_TICKET_ID", strValueOf2));
                }
            });
            h260Var.c.setText(R.string.bet_history_hide_detail);
        } else {
            h260Var.F.setVisibility(8);
            h260Var.D.setVisibility(0);
            h260Var.E.setVisibility(8);
            h260Var.c.setText(R.string.bet_history_show_detail);
        }
        Double houseCoefficient3 = betHistoryItem.getHouseCoefficient();
        if (houseCoefficient3 != null) {
            dDoubleValue = houseCoefficient3.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        Double userCoefficient3 = betHistoryItem.getUserCoefficient();
        if (userCoefficient3 != null) {
            dDoubleValue11 = userCoefficient3.doubleValue();
        }
        if (dDoubleValue < dDoubleValue11) {
            h260Var.Q.setTextColor(context.getColor(R.color.sg_rush_target_color_red));
        } else {
            h260Var.Q.setTextColor(context.getColor(R.color.sg_rush_target_color_green));
        }
        op5.r(op5.a, b.f(h260Var.c, h260Var.O, h260Var.P, h260Var.L, h260Var.i, h260Var.T, h260Var.N, h260Var.v, h260Var.V), null, 4);
    }
}
