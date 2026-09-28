package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.spin2win.model.BetHistoryItem;
import com.sportygames.spin2win.model.IndividualBetDetails;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class ws2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final q5b0 a;
    public BetHistoryItem b;

    public static final class a {
    }

    public ws2(q5b0 q5b0Var) {
        super(q5b0Var.a);
        this.a = q5b0Var;
    }

    public final void a(BetHistoryItem betHistoryItem, Context context) {
        betHistoryItem.getClass();
        context.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        q5b0 q5b0Var = this.a;
        if (zIsExpanded) {
            ConstraintLayout constraintLayout = q5b0Var.D;
            UnderLineTextView underLineTextView = q5b0Var.J;
            constraintLayout.setVisibility(0);
            Double giftAmount = betHistoryItem.getGiftAmount();
            double dDoubleValue = giftAmount != null ? giftAmount.doubleValue() : 0.0d;
            ConstraintLayout constraintLayout2 = q5b0Var.v;
            if (dDoubleValue > 0.0d) {
                constraintLayout2.setVisibility(0);
                TextView textView = q5b0Var.L;
                TreeMap treeMap = pw.a;
                Double totalStake = betHistoryItem.getTotalStake();
                textView.setText(pw.d(totalStake != null ? totalStake.doubleValue() : 0.0d));
                TextView textView2 = q5b0Var.d;
                Double giftAmount2 = betHistoryItem.getGiftAmount();
                textView2.setText("- ".concat(pw.d(giftAmount2 != null ? giftAmount2.doubleValue() : 0.0d)));
                TextView textView3 = q5b0Var.Q;
                Double actualPaidAmount = betHistoryItem.getActualPaidAmount();
                textView3.setText(pw.d(actualPaidAmount != null ? actualPaidAmount.doubleValue() : 0.0d));
                Double totalPayout = betHistoryItem.getTotalPayout();
                double dDoubleValue2 = totalPayout != null ? totalPayout.doubleValue() : 0.0d;
                ConstraintLayout constraintLayout3 = q5b0Var.z;
                if (dDoubleValue2 > 0.0d) {
                    constraintLayout3.setVisibility(0);
                    TextView textView4 = q5b0Var.N;
                    Double totalPayout2 = betHistoryItem.getTotalPayout();
                    textView4.setText(pw.d(totalPayout2 != null ? totalPayout2.doubleValue() : 0.0d));
                    TextView textView5 = q5b0Var.e;
                    Double giftAmount3 = betHistoryItem.getGiftAmount();
                    textView5.setText("- ".concat(pw.d(giftAmount3 != null ? giftAmount3.doubleValue() : 0.0d)));
                    TextView textView6 = q5b0Var.S;
                    Double actualPayoutAmount = betHistoryItem.getActualPayoutAmount();
                    textView6.setText(pw.d(actualPayoutAmount != null ? actualPayoutAmount.doubleValue() : 0.0d));
                } else {
                    constraintLayout3.setVisibility(8);
                }
            } else {
                constraintLayout2.setVisibility(8);
            }
            q5b0Var.B.setVisibility(8);
            q5b0Var.C.setVisibility(0);
            String ticketId = betHistoryItem.getTicketId();
            if (ticketId == null) {
                ticketId = "";
            }
            underLineTextView.setText(ticketId);
            underLineTextView.setOnClickListener(new yr2(betHistoryItem, 0));
            q5b0Var.b.setText(R.string.bet_history_hide_detail);
            q5b0Var.F.setText("Picks");
            RecyclerView recyclerView = q5b0Var.E;
            recyclerView.setLayoutManager(new GridLayoutManager(2));
            List<IndividualBetDetails> individualBetDetailsList = betHistoryItem.getIndividualBetDetailsList();
            if (individualBetDetailsList == null) {
                individualBetDetailsList = m2g.a;
            }
            individualBetDetailsList.getClass();
            w3b0 w3b0Var = new w3b0();
            w3b0Var.a = individualBetDetailsList;
            recyclerView.setAdapter(w3b0Var);
        } else {
            q5b0Var.D.setVisibility(8);
            q5b0Var.B.setVisibility(0);
            q5b0Var.C.setVisibility(8);
            q5b0Var.b.setText(R.string.bet_history_show_detail);
        }
        op5.r(op5.a, b.f(q5b0Var.b, q5b0Var.M, q5b0Var.f, q5b0Var.R, q5b0Var.O, q5b0Var.i, q5b0Var.T, q5b0Var.F), null, 4);
        TextView textView7 = q5b0Var.G;
        String string = context.getString(R.string.key_result);
        string.getClass();
        String string2 = context.getString(R.string.sg_result);
        string2.getClass();
        textView7.setText(op5.b(string, string2, null) + " " + betHistoryItem.getHouseDraw());
    }
}
