package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.spindabottle.remote.models.BetHistoryItem;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xs2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final s35 a;
    public BetHistoryItem b;

    public static final class a {
    }

    public xs2(s35 s35Var) {
        super(s35Var.a);
        this.a = s35Var;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01ee  */
    public final void a(BetHistoryItem betHistoryItem, Activity activity) {
        final BetHistoryItem betHistoryItem2;
        int i;
        betHistoryItem.getClass();
        activity.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        s35 s35Var = this.a;
        if (zIsExpanded) {
            ConstraintLayout constraintLayout = s35Var.D;
            UnderLineTextView underLineTextView = s35Var.H;
            constraintLayout.setVisibility(0);
            double giftAmount = betHistoryItem.getGiftAmount();
            ConstraintLayout constraintLayout2 = s35Var.v;
            if (giftAmount > 0.0d) {
                constraintLayout2.setVisibility(0);
                TextView textView = s35Var.J;
                TreeMap treeMap = pw.a;
                textView.setText(pw.d(betHistoryItem.getStakeAmount()));
                s35Var.d.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                s35Var.P.setText(pw.d(betHistoryItem.getActualDebitedAmount()));
                boolean zG = Intrinsics.g(betHistoryItem.getUserPick(), betHistoryItem.getHouseDraw());
                Group group = s35Var.z;
                if (zG) {
                    group.setVisibility(0);
                    s35Var.L.setText(pw.d(betHistoryItem.getPayoutAmount()));
                    s35Var.e.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                    s35Var.R.setText(pw.d(betHistoryItem.getActualCreditedAmount()));
                } else {
                    group.setVisibility(8);
                }
            } else {
                constraintLayout2.setVisibility(8);
            }
            s35Var.B.setVisibility(8);
            s35Var.C.setVisibility(0);
            underLineTextView.setText(betHistoryItem.getTicketId());
            s35Var.U.setText(betHistoryItem.getUserPick());
            betHistoryItem2 = betHistoryItem;
            underLineTextView.setOnClickListener(new View.OnClickListener() { // from class: or2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String ticketId = betHistoryItem2.getTicketId();
                    ticketId.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("KEY_TICKET_ID", ticketId);
                    SportyGamesManager.getInstance().gotoSportyBet(xae.d, bundle);
                }
            });
            s35Var.b.setText(R.string.bet_history_hide_detail);
        } else {
            betHistoryItem2 = betHistoryItem;
            s35Var.D.setVisibility(8);
            s35Var.B.setVisibility(0);
            s35Var.C.setVisibility(8);
            s35Var.b.setText(R.string.bet_history_show_detail);
        }
        String houseDraw = betHistoryItem2.getHouseDraw();
        int iHashCode = houseDraw.hashCode();
        if (iHashCode != -2021012075) {
            if (iHashCode != 2715) {
                if (iHashCode == 2104482 && houseDraw.equals("DOWN")) {
                    s35Var.N.setTag("bet_history_down_img:sg_game_name");
                }
            } else if (houseDraw.equals("UP")) {
                s35Var.N.setTag("bet_history_up_img:sg_game_name");
            }
        } else if (houseDraw.equals("MIDDLE")) {
            s35Var.N.setTag("bet_history_middle_img:sg_game_name");
        }
        String userPick = betHistoryItem2.getUserPick();
        int iHashCode2 = userPick.hashCode();
        if (iHashCode2 != -2021012075) {
            if (iHashCode2 != 2715) {
                if (iHashCode2 == 2104482 && userPick.equals("DOWN")) {
                    s35Var.U.setTag("down:sg_game_name");
                }
            } else if (userPick.equals("UP")) {
                s35Var.U.setTag("up:sg_game_name");
            }
        } else if (userPick.equals("MIDDLE")) {
            s35Var.U.setTag("middle:sg_game_name");
        }
        op5.r(op5.a, b.f(s35Var.b, s35Var.K, s35Var.f, s35Var.Q, s35Var.T, s35Var.E, s35Var.M, s35Var.i, s35Var.S, s35Var.U), null, 4);
        ArrayList arrayListF = b.f(s35Var.N);
        String houseDraw2 = betHistoryItem2.getHouseDraw();
        int iHashCode3 = houseDraw2.hashCode();
        if (iHashCode3 != -2021012075) {
            if (iHashCode3 != 2715) {
                if (iHashCode3 == 2104482 && houseDraw2.equals("DOWN")) {
                    i = R.drawable.down;
                } else {
                    i = 0;
                }
            } else if (houseDraw2.equals("UP")) {
                i = R.drawable.up;
            } else {
                i = 0;
            }
        } else if (houseDraw2.equals("MIDDLE")) {
            i = R.drawable.middle_bet;
        } else {
            i = 0;
        }
        op5.o(arrayListF, b.f(activity.getDrawable(i)), activity);
    }
}
