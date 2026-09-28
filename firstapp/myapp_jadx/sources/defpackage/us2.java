package defpackage;

import android.app.Activity;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.commons.models.CardDetail;
import com.sportygames.redblack.remote.models.BetHistoryItem;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class us2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final to40 a;
    public BetHistoryItem b;

    public static final class a {
    }

    public us2(to40 to40Var) {
        super(to40Var.a);
        this.a = to40Var;
    }

    public final void a(BetHistoryItem betHistoryItem, Activity activity) {
        betHistoryItem.getClass();
        activity.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        to40 to40Var = this.a;
        if (zIsExpanded) {
            ConstraintLayout constraintLayout = to40Var.D;
            UnderLineTextView underLineTextView = to40Var.G;
            constraintLayout.setVisibility(0);
            double giftAmount = betHistoryItem.getGiftAmount();
            ConstraintLayout constraintLayout2 = to40Var.v;
            if (giftAmount > 0.0d) {
                constraintLayout2.setVisibility(0);
                TextView textView = to40Var.I;
                TreeMap treeMap = pw.a;
                textView.setText(pw.d(betHistoryItem.getStakeAmount()));
                to40Var.d.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                to40Var.O.setText(pw.d(betHistoryItem.getActualDebitedAmount()));
                boolean winStatus = betHistoryItem.getWinStatus();
                Group group = to40Var.z;
                if (winStatus) {
                    group.setVisibility(0);
                    to40Var.K.setText(pw.d(betHistoryItem.getPayoutAmount()));
                    to40Var.e.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                    to40Var.Q.setText(pw.d(betHistoryItem.getActualCreditedAmount()));
                } else {
                    group.setVisibility(8);
                }
            } else {
                constraintLayout2.setVisibility(8);
            }
            to40Var.B.setVisibility(8);
            to40Var.C.setVisibility(0);
            underLineTextView.setText(betHistoryItem.getTicketId());
            TextView textView2 = to40Var.U;
            String upperCase = betHistoryItem.getDecision().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            textView2.setText(upperCase);
            to40Var.M.setCardDraw(new CardDetail(betHistoryItem.getUserCard()));
            underLineTextView.setOnClickListener(new wr2(betHistoryItem, 0));
            to40Var.b.setText(R.string.bet_history_hide_detail);
        } else {
            to40Var.D.setVisibility(8);
            to40Var.B.setVisibility(0);
            to40Var.C.setVisibility(8);
            to40Var.b.setText(R.string.bet_history_show_detail);
        }
        op5.r(op5.a, b.f(to40Var.b, to40Var.J, to40Var.f, to40Var.P, to40Var.T, to40Var.G, to40Var.L, to40Var.U, to40Var.i, to40Var.R, to40Var.S), null, 4);
    }
}
