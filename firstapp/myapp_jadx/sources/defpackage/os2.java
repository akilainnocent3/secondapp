package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.spinmatch.model.response.BetHistoryItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class os2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final r8b0 a;
    public BetHistoryItem b;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((BetHistoryItem.IndividualBetDetails) t).getBetConfig().getOrderedPosition()).compareTo(Integer.valueOf(((BetHistoryItem.IndividualBetDetails) t2).getBetConfig().getOrderedPosition()));
        }
    }

    public static final class b {
    }

    public os2(r8b0 r8b0Var) {
        super(r8b0Var.a);
        this.a = r8b0Var;
    }

    public static String b(Context context, String str) {
        if (str != null) {
            return hce0.a((int) Double.parseDouble(str), "x");
        }
        op5 op5Var = op5.a;
        String string = context.getString(R.string.wild_label_cms);
        return at6.a(string, context, R.string.wild, op5Var, string);
    }

    public final void a(final BetHistoryItem betHistoryItem, Context context) {
        int i;
        BetHistoryItem.IndividualBetDetails individualBetDetails;
        betHistoryItem.getClass();
        context.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        r8b0 r8b0Var = this.a;
        if (zIsExpanded) {
            ConstraintLayout constraintLayout = r8b0Var.E;
            RecyclerView recyclerView = r8b0Var.F;
            TextView textView = r8b0Var.L;
            constraintLayout.setVisibility(0);
            Double giftAmount = betHistoryItem.getGiftAmount();
            double dDoubleValue = giftAmount != null ? giftAmount.doubleValue() : 0.0d;
            ConstraintLayout constraintLayout2 = r8b0Var.v;
            if (dDoubleValue > 0.0d) {
                ConstraintLayout constraintLayout3 = r8b0Var.A;
                constraintLayout2.setVisibility(0);
                TextView textView2 = r8b0Var.N;
                TreeMap treeMap = pw.a;
                Double stakeAmount = betHistoryItem.getStakeAmount();
                textView2.setText(pw.d(stakeAmount != null ? stakeAmount.doubleValue() : 0.0d));
                TextView textView3 = r8b0Var.d;
                Double giftAmount2 = betHistoryItem.getGiftAmount();
                textView3.setText("- ".concat(pw.d(giftAmount2 != null ? giftAmount2.doubleValue() : 0.0d)));
                TextView textView4 = r8b0Var.W;
                Double actualDebitedAmount = betHistoryItem.getActualDebitedAmount();
                textView4.setText(pw.d(actualDebitedAmount != null ? actualDebitedAmount.doubleValue() : 0.0d));
                ArrayList<BetHistoryItem.IndividualBetDetails> individualBetDetails2 = betHistoryItem.getIndividualBetDetails();
                boolean zG = Intrinsics.g((individualBetDetails2 == null || (individualBetDetails = individualBetDetails2.get(0)) == null) ? null : individualBetDetails.getWinStatus(), "WIN");
                ConstraintLayout constraintLayout4 = r8b0Var.z;
                if (zG) {
                    constraintLayout4.setVisibility(0);
                    constraintLayout3.setVisibility(0);
                    TextView textView5 = r8b0Var.P;
                    Double payoutAmount = betHistoryItem.getPayoutAmount();
                    textView5.setText(pw.d(payoutAmount != null ? payoutAmount.doubleValue() : 0.0d));
                    TextView textView6 = r8b0Var.e;
                    Double giftAmount3 = betHistoryItem.getGiftAmount();
                    textView6.setText("- ".concat(pw.d(giftAmount3 != null ? giftAmount3.doubleValue() : 0.0d)));
                    TextView textView7 = r8b0Var.Y;
                    Double actualCreditedAmount = betHistoryItem.getActualCreditedAmount();
                    textView7.setText(pw.d(actualCreditedAmount != null ? actualCreditedAmount.doubleValue() : 0.0d));
                } else {
                    constraintLayout4.setVisibility(8);
                    constraintLayout3.setVisibility(8);
                }
            } else {
                constraintLayout2.setVisibility(8);
            }
            r8b0Var.C.setVisibility(8);
            r8b0Var.D.setVisibility(0);
            Integer ticketId = betHistoryItem.getTicketId();
            textView.setText(ticketId != null ? String.valueOf(ticketId.intValue()) : null);
            textView.setOnClickListener(new View.OnClickListener() { // from class: pr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wz.a("TransactionTicketClicked", "Spin Match", new String[0]);
                    Integer ticketId2 = betHistoryItem.getTicketId();
                    String strValueOf = ticketId2 != null ? String.valueOf(ticketId2.intValue()) : null;
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    SportyGamesManager.getInstance().gotoSportyBet(xae.d, mll0.a("KEY_TICKET_ID", strValueOf));
                }
            });
            r8b0Var.b.setText(R.string.bet_history_hide_detail);
            ArrayList<BetHistoryItem.IndividualBetDetails> individualBetDetails3 = betHistoryItem.getIndividualBetDetails();
            if (individualBetDetails3 != null && individualBetDetails3.size() > 1) {
                o48.v(new a(), individualBetDetails3);
            }
            hq2 hq2Var = new hq2(context, betHistoryItem.getIndividualBetDetails());
            ArrayList<BetHistoryItem.IndividualBetDetails> individualBetDetails4 = betHistoryItem.getIndividualBetDetails();
            if (individualBetDetails4 == null || individualBetDetails4.size() != 1) {
                ArrayList<BetHistoryItem.IndividualBetDetails> individualBetDetails5 = betHistoryItem.getIndividualBetDetails();
                i = (individualBetDetails5 == null || individualBetDetails5.size() != 2) ? 3 : 2;
            } else {
                i = 1;
            }
            recyclerView.setLayoutManager(new GridLayoutManager(i));
            recyclerView.setAdapter(hq2Var);
            r8b0Var.R.setTextColor(context.getColor(betHistoryItem.getWheel1Draw().getColourCode()));
            r8b0Var.T.setTextColor(context.getColor(betHistoryItem.getWheel2Draw().getColourCode()));
            r8b0Var.I.setTextColor(context.getColor(betHistoryItem.getResult().getColourCode()));
        } else {
            r8b0Var.E.setVisibility(8);
            r8b0Var.C.setVisibility(0);
            r8b0Var.D.setVisibility(8);
            r8b0Var.b.setText(R.string.bet_history_show_detail);
        }
        op5 op5Var = op5.a;
        ArrayList arrayListF = kotlin.collections.b.f(r8b0Var.S, r8b0Var.U);
        ArrayList arrayListF2 = kotlin.collections.b.f(null, null);
        op5Var.getClass();
        op5.o(arrayListF, arrayListF2, context);
        op5.r(op5Var, kotlin.collections.b.f(r8b0Var.b, r8b0Var.O, r8b0Var.f, r8b0Var.X, r8b0Var.Q, r8b0Var.i, r8b0Var.Z), null, 4);
    }
}
