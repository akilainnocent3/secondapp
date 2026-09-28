package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.pingpong.remote.models.BetHistoryItem;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ts2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final ur80 a;
    public BetHistoryItem b;

    public static final class a {
    }

    public ts2(ur80 ur80Var) {
        super(ur80Var.a);
        this.a = ur80Var;
    }

    public final void a(final BetHistoryItem betHistoryItem, final Activity activity, final y720 y720Var, final ibs ibsVar, final String str, final String str2) {
        betHistoryItem.getClass();
        activity.getClass();
        y720Var.getClass();
        ibsVar.getClass();
        str.getClass();
        str2.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        ur80 ur80Var = this.a;
        if (zIsExpanded) {
            TextView textView = ur80Var.d0;
            UnderLineTextView underLineTextView = ur80Var.R;
            TextView textView2 = ur80Var.d0;
            TextView textView3 = ur80Var.e;
            Map<Double, Integer> map = k18.a;
            textView.setBackgroundTintList(th50.a(k18.a(betHistoryItem.getHouseCoefficient()), activity.getTheme(), activity.getResources()));
            double houseCoefficient = betHistoryItem.getHouseCoefficient();
            String strValueOf = String.valueOf(houseCoefficient);
            if (StringsKt.M(strValueOf, "E", false) || StringsKt.M(strValueOf, "e", false)) {
                textView2.setText(activity.getString(R.string.coeff, String.format(SportyGamesManager.locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(houseCoefficient)}, 1)).toString()));
            } else {
                textView2.setText(activity.getString(R.string.coeff, String.valueOf(houseCoefficient)));
            }
            ur80Var.I.setVisibility(0);
            double giftAmount = betHistoryItem.getGiftAmount();
            ConstraintLayout constraintLayout = ur80Var.A;
            if (giftAmount > 0.0d) {
                ConstraintLayout constraintLayout2 = ur80Var.E;
                constraintLayout.setVisibility(0);
                TextView textView4 = ur80Var.T;
                TreeMap treeMap = pw.a;
                textView4.setText(pw.d(betHistoryItem.getStakeAmount()));
                ur80Var.v.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                ur80Var.Y.setText(pw.d(betHistoryItem.getActualDebitedAmount()));
                double payoutAmount = betHistoryItem.getPayoutAmount();
                ConstraintLayout constraintLayout3 = ur80Var.D;
                if (payoutAmount > 0.0d) {
                    constraintLayout3.setVisibility(0);
                    constraintLayout2.setVisibility(0);
                    ur80Var.V.setText(pw.d(betHistoryItem.getPayoutAmount()));
                    ur80Var.w.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                    ur80Var.a0.setText(pw.d(betHistoryItem.getActualCreditedAmount()));
                } else {
                    constraintLayout3.setVisibility(8);
                    constraintLayout2.setVisibility(8);
                }
            } else {
                constraintLayout.setVisibility(8);
            }
            ur80Var.G.setVisibility(8);
            ur80Var.H.setVisibility(0);
            underLineTextView.setText(betHistoryItem.getTicketId());
            ur80Var.N.setText(betHistoryItem.getRoundId());
            underLineTextView.setOnClickListener(new View.OnClickListener() { // from class: jr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String ticketId = betHistoryItem.getTicketId();
                    ticketId.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("KEY_TICKET_ID", ticketId);
                    SportyGamesManager.getInstance().gotoSportyBet(xae.d, bundle);
                }
            });
            ur80Var.b.setText(R.string.bet_history_hide_detail);
            if (betHistoryItem.getTargetCoefficient() != null) {
                textView3.setText("O/U");
                textView3.setTag(activity.getString(R.string.over_under_cms));
            } else if (betHistoryItem.getStartCoefficient() == null || betHistoryItem.getEndCoefficient() == null) {
                textView3.setText("Coeff");
                textView3.setTag(activity.getString(R.string.coeff_text_cms));
            } else {
                textView3.setText("Range");
                textView3.setTag(activity.getString(R.string.range_cms));
            }
        } else {
            ur80Var.I.setVisibility(8);
            ur80Var.G.setVisibility(0);
            ur80Var.H.setVisibility(8);
            ur80Var.b.setText(R.string.bet_history_show_detail);
        }
        ur80Var.i.setOnClickListener(new View.OnClickListener() { // from class: ur2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                new dt80(activity, y720Var, ibsVar, betHistoryItem.getRoundId()).a();
                wz.a("FairnessClicked", "Sporty Hero", "bet history");
            }
        });
        ur80Var.c.setOnClickListener(new View.OnClickListener() { // from class: cs2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity2 = activity;
                Intent intent = new Intent(activity2, (Class<?>) ChatActivity.class);
                intent.putExtra("roomId", str2);
                intent.putExtra("botId", str);
                intent.putExtra("color", R.color.toolbar_strip_bottle);
                intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "ping pong");
                intent.putExtra("betObject", betHistoryItem);
                intent.putExtra("share_data_type", "bet_history");
                try {
                    activity2.getClass();
                    Fragment fragmentG = ((GameMainActivity) activity2).getSupportFragmentManager().G(R.id.main_game_container);
                    if (fragmentG instanceof m410) {
                        ((m410) fragmentG).h0 = true;
                    }
                } catch (Exception unused) {
                }
                activity2.startActivity(intent);
            }
        });
        op5 op5Var = op5.a;
        AppCompatTextView appCompatTextView = ur80Var.b;
        op5.r(op5Var, b.f(appCompatTextView, ur80Var.U, ur80Var.y, ur80Var.Z, appCompatTextView, ur80Var.W, ur80Var.z, ur80Var.c0, ur80Var.b0, ur80Var.M, ur80Var.Q, ur80Var.e), null, 4);
    }
}
