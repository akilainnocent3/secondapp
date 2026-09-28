package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.crashInitiated.model.response.BetHistoryItem;
import java.text.DecimalFormat;
import java.util.TreeMap;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class rs2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final h260 a;
    public BetHistoryItem b;

    public rs2(h260 h260Var) {
        super(h260Var.a);
        this.a = h260Var;
    }

    public final void a(BetHistoryItem betHistoryItem, Context context) {
        final BetHistoryItem betHistoryItem2;
        String str;
        betHistoryItem.getClass();
        context.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        h260 h260Var = this.a;
        if (zIsExpanded) {
            ConstraintLayout constraintLayout = h260Var.F;
            TextView textView = h260Var.Q;
            TextView textView2 = h260Var.C;
            UnderLineTextView underLineTextView = h260Var.I;
            constraintLayout.setVisibility(0);
            Double giftAmount = betHistoryItem.getGiftAmount();
            double dDoubleValue = giftAmount != null ? giftAmount.doubleValue() : 0.0d;
            ConstraintLayout constraintLayout2 = h260Var.w;
            if (dDoubleValue > 0.0d) {
                constraintLayout2.setVisibility(0);
                TextView textView3 = h260Var.K;
                TreeMap treeMap = pw.a;
                Double stakeAmount = betHistoryItem.getStakeAmount();
                textView3.setText(pw.d(stakeAmount != null ? stakeAmount.doubleValue() : 0.0d));
                TextView textView4 = h260Var.e;
                Double giftAmount2 = betHistoryItem.getGiftAmount();
                textView4.setText("- ".concat(pw.d(giftAmount2 != null ? giftAmount2.doubleValue() : 0.0d)));
                TextView textView5 = h260Var.S;
                Double actualDebitedAmount = betHistoryItem.getActualDebitedAmount();
                textView5.setText(pw.d(actualDebitedAmount != null ? actualDebitedAmount.doubleValue() : 0.0d));
                Double houseCoefficient = betHistoryItem.getHouseCoefficient();
                double dDoubleValue2 = houseCoefficient != null ? houseCoefficient.doubleValue() : 0.0d;
                Double userCoefficient = betHistoryItem.getUserCoefficient();
                double dDoubleValue3 = userCoefficient != null ? userCoefficient.doubleValue() : 0.0d;
                ConstraintLayout constraintLayout3 = h260Var.A;
                if (dDoubleValue2 >= dDoubleValue3) {
                    constraintLayout3.setVisibility(0);
                    TextView textView6 = h260Var.M;
                    Double payoutAmount = betHistoryItem.getPayoutAmount();
                    textView6.setText(pw.d(payoutAmount != null ? payoutAmount.doubleValue() : 0.0d));
                    TextView textView7 = h260Var.f;
                    Double giftAmount3 = betHistoryItem.getGiftAmount();
                    textView7.setText("- ".concat(pw.d(giftAmount3 != null ? giftAmount3.doubleValue() : 0.0d)));
                    TextView textView8 = h260Var.U;
                    Double actualCreditedAmount = betHistoryItem.getActualCreditedAmount();
                    textView8.setText(pw.d(actualCreditedAmount != null ? actualCreditedAmount.doubleValue() : 0.0d));
                } else {
                    constraintLayout3.setVisibility(8);
                }
            } else {
                constraintLayout2.setVisibility(8);
            }
            h260Var.D.setVisibility(8);
            h260Var.E.setVisibility(0);
            Integer ticketId = betHistoryItem.getTicketId();
            underLineTextView.setText(ticketId != null ? String.valueOf(ticketId.intValue()) : null);
            textView2.setTextAppearance(context, R.style.TextPrimaryBold);
            textView.setTextAppearance(context, R.style.TextPrimaryBold);
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
            textView.setText(str + "x");
            Double houseCoefficient2 = betHistoryItem.getHouseCoefficient();
            if (houseCoefficient2 != null) {
                try {
                    String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(houseCoefficient2.doubleValue());
                    str3.getClass();
                    str2 = str3;
                } catch (Exception unused2) {
                }
            } else {
                str2 = null;
            }
            textView2.setText(str2 + "x");
            betHistoryItem2 = betHistoryItem;
            underLineTextView.setOnClickListener(new View.OnClickListener() { // from class: sr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wz.a("TransactionTicketClicked", "Rush", new String[0]);
                    Integer ticketId2 = betHistoryItem2.getTicketId();
                    String strValueOf = ticketId2 != null ? String.valueOf(ticketId2.intValue()) : null;
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    SportyGamesManager.getInstance().gotoSportyBet(xae.d, mll0.a("KEY_TICKET_ID", strValueOf));
                }
            });
            h260Var.c.setText(R.string.bet_history_hide_detail);
        } else {
            betHistoryItem2 = betHistoryItem;
            h260Var.F.setVisibility(8);
            h260Var.D.setVisibility(0);
            h260Var.E.setVisibility(8);
            h260Var.c.setText(R.string.bet_history_show_detail);
        }
        Double houseCoefficient3 = betHistoryItem2.getHouseCoefficient();
        double dDoubleValue4 = houseCoefficient3 != null ? houseCoefficient3.doubleValue() : 0.0d;
        Double userCoefficient3 = betHistoryItem2.getUserCoefficient();
        if (dDoubleValue4 < (userCoefficient3 != null ? userCoefficient3.doubleValue() : 0.0d)) {
            h260Var.Q.setTextColor(context.getColor(R.color.sg_rush_target_color_red));
        } else {
            h260Var.Q.setTextColor(context.getColor(R.color.sg_rush_target_color_green));
        }
        op5.r(op5.a, b.f(h260Var.c, h260Var.O, h260Var.P, h260Var.L, h260Var.i, h260Var.T, h260Var.N, h260Var.v, h260Var.V), null, 4);
    }
}
