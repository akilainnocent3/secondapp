package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.evenodd.remote.models.BetHistoryItem;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class ss2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final ihg a;
    public BetHistoryItem b;

    public static final class a {
    }

    public ss2(ihg ihgVar) {
        super(ihgVar.a);
        this.a = ihgVar;
    }

    public static int b(String str) {
        switch (str) {
            case "1":
                return R.drawable.one;
            case "2":
                return R.drawable.two;
            case "3":
                return R.drawable.three;
            case "4":
                return R.drawable.four;
            case "5":
                return R.drawable.five;
            case "6":
                return R.drawable.six;
            default:
                return 0;
        }
    }

    public final void a(final BetHistoryItem betHistoryItem, Activity activity) {
        String strB;
        betHistoryItem.getClass();
        activity.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        ihg ihgVar = this.a;
        if (zIsExpanded) {
            ConstraintLayout constraintLayout = ihgVar.E;
            AppCompatTextView appCompatTextView = ihgVar.F;
            UnderLineTextView underLineTextView = ihgVar.I;
            constraintLayout.setVisibility(0);
            double giftAmount = betHistoryItem.getGiftAmount();
            ConstraintLayout constraintLayout2 = ihgVar.v;
            if (giftAmount > 0.0d) {
                constraintLayout2.setVisibility(0);
                TextView textView = ihgVar.K;
                TreeMap treeMap = pw.a;
                textView.setText(pw.d(betHistoryItem.getStakeAmount()));
                ihgVar.d.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                ihgVar.S.setText(pw.d(betHistoryItem.getActualDebitedAmount()));
                boolean zG = Intrinsics.g(betHistoryItem.getUserPick(), betHistoryItem.getHouseDrawDecision());
                Group group = ihgVar.z;
                if (zG) {
                    group.setVisibility(0);
                    ihgVar.M.setText(pw.d(betHistoryItem.getPayoutAmount()));
                    ihgVar.e.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                    ihgVar.U.setText(pw.d(betHistoryItem.getActualCreditedAmount()));
                } else {
                    group.setVisibility(8);
                }
            } else {
                constraintLayout2.setVisibility(8);
            }
            ihgVar.C.setVisibility(8);
            ihgVar.D.setVisibility(0);
            underLineTextView.setText(betHistoryItem.getTicketId());
            ihgVar.X.setText(betHistoryItem.getUserPick());
            List listSplit$default = StringsKt__StringsKt.split$default(betHistoryItem.getHouseDraw(), new String[]{":"}, false, 0, 6, null);
            ihgVar.O.setImageDrawable(activity.getDrawable(b((String) listSplit$default.get(0))));
            ihgVar.P.setImageDrawable(activity.getDrawable(b((String) listSplit$default.get(1))));
            ihgVar.Q.setImageDrawable(activity.getDrawable(b((String) listSplit$default.get(2))));
            if (c.l(betHistoryItem.getHouseDrawDecision(), "triple", true)) {
                op5 op5Var = op5.a;
                String string = activity.getString(R.string.triple_cms);
                string.getClass();
                String houseDrawDecision = betHistoryItem.getHouseDrawDecision();
                op5Var.getClass();
                appCompatTextView.setText(op5.b(string, houseDrawDecision, null));
            } else {
                String upperCase = betHistoryItem.getHouseDrawDecision().toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (upperCase.equals("ODD")) {
                    op5 op5Var2 = op5.a;
                    String string2 = activity.getString(R.string.odd_cms);
                    string2.getClass();
                    String houseDrawDecision2 = betHistoryItem.getHouseDrawDecision();
                    op5Var2.getClass();
                    strB = op5.b(string2, houseDrawDecision2, null);
                } else {
                    op5 op5Var3 = op5.a;
                    String string3 = activity.getString(R.string.even_cms);
                    string3.getClass();
                    String houseDrawDecision3 = betHistoryItem.getHouseDrawDecision();
                    op5Var3.getClass();
                    strB = op5.b(string3, houseDrawDecision3, null);
                }
                appCompatTextView.setText(betHistoryItem.getHouseDrawSum() + ", " + strB);
            }
            underLineTextView.setOnClickListener(new View.OnClickListener() { // from class: ir2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String ticketId = betHistoryItem.getTicketId();
                    ticketId.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("KEY_TICKET_ID", ticketId);
                    SportyGamesManager.getInstance().gotoSportyBet(xae.d, bundle);
                }
            });
            ihgVar.b.setText(R.string.bet_history_hide_detail);
        } else {
            ihgVar.E.setVisibility(8);
            ihgVar.C.setVisibility(0);
            ihgVar.D.setVisibility(8);
            ihgVar.b.setText(R.string.bet_history_show_detail);
        }
        op5.r(op5.a, b.f(ihgVar.b, ihgVar.L, ihgVar.f, ihgVar.T, ihgVar.W, ihgVar.B, ihgVar.N, ihgVar.i, ihgVar.V, ihgVar.X), null, 4);
    }
}
