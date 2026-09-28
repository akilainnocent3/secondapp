package defpackage;

import android.app.Activity;
import android.content.Intent;
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
import com.sportygames.sportyherov2.remote.models.BetHistoryItem;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class qs2 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final vr80 a;
    public BetHistoryItem b;

    public static final class a {
    }

    public qs2(vr80 vr80Var) {
        super(vr80Var.a);
        this.a = vr80Var;
    }

    public final void a(final BetHistoryItem betHistoryItem, final Activity activity, final c28 c28Var, final ibs ibsVar, final String str, final String str2) {
        betHistoryItem.getClass();
        activity.getClass();
        c28Var.getClass();
        ibsVar.getClass();
        str.getClass();
        str2.getClass();
        boolean zIsExpanded = betHistoryItem.isExpanded();
        vr80 vr80Var = this.a;
        if (zIsExpanded) {
            TextView textView = vr80Var.d0;
            UnderLineTextView underLineTextView = vr80Var.R;
            TextView textView2 = vr80Var.d0;
            TextView textView3 = vr80Var.e;
            Map<Double, Integer> map = m18.a;
            textView.setTextColor(th50.a(m18.b(betHistoryItem.getHouseCoefficient()), activity.getTheme(), activity.getResources()));
            double houseCoefficient = betHistoryItem.getHouseCoefficient();
            String strValueOf = String.valueOf(houseCoefficient);
            if (StringsKt.M(strValueOf, "E", false) || StringsKt.M(strValueOf, "e", false)) {
                textView2.setText(activity.getString(R.string.coeff, String.format(SportyGamesManager.locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(houseCoefficient)}, 1)).toString()));
            } else {
                textView2.setText(activity.getString(R.string.coeff, String.valueOf(houseCoefficient)));
            }
            vr80Var.I.setVisibility(0);
            double giftAmount = betHistoryItem.getGiftAmount();
            ConstraintLayout constraintLayout = vr80Var.A;
            if (giftAmount > 0.0d) {
                ConstraintLayout constraintLayout2 = vr80Var.E;
                constraintLayout.setVisibility(0);
                TextView textView4 = vr80Var.T;
                TreeMap treeMap = pw.a;
                textView4.setText(pw.d(betHistoryItem.getStakeAmount()));
                vr80Var.v.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                vr80Var.Y.setText(pw.d(betHistoryItem.getActualDebitedAmount()));
                double payoutAmount = betHistoryItem.getPayoutAmount();
                ConstraintLayout constraintLayout3 = vr80Var.D;
                if (payoutAmount > 0.0d) {
                    constraintLayout3.setVisibility(0);
                    constraintLayout2.setVisibility(0);
                    vr80Var.V.setText(pw.d(betHistoryItem.getPayoutAmount()));
                    vr80Var.w.setText("- ".concat(pw.d(betHistoryItem.getGiftAmount())));
                    vr80Var.a0.setText(pw.d(betHistoryItem.getActualCreditedAmount()));
                } else {
                    constraintLayout3.setVisibility(8);
                    constraintLayout2.setVisibility(8);
                }
            } else {
                constraintLayout.setVisibility(8);
            }
            vr80Var.G.setVisibility(8);
            vr80Var.H.setVisibility(0);
            underLineTextView.setText(betHistoryItem.getTicketId());
            vr80Var.N.setText(betHistoryItem.getRoundId());
            underLineTextView.setOnClickListener(new rr2(betHistoryItem, 0));
            vr80Var.b.setText(R.string.bet_history_hide_detail);
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
            vr80Var.I.setVisibility(8);
            vr80Var.G.setVisibility(0);
            vr80Var.H.setVisibility(8);
            vr80Var.b.setText(R.string.bet_history_show_detail);
        }
        vr80Var.i.setOnClickListener(new View.OnClickListener() { // from class: es2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                new et80(activity, c28Var, ibsVar, betHistoryItem.getRoundId()).a();
                wz.a("FairnessClicked", "Sporty Hero", "bet history");
            }
        });
        vr80Var.c.setOnClickListener(new View.OnClickListener() { // from class: hs2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity2 = activity;
                Intent intent = new Intent(activity2, (Class<?>) ChatActivity.class);
                intent.putExtra("roomId", str2);
                intent.putExtra("botId", str);
                intent.putExtra("color", R.color.toolbar_strip_bottle);
                intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Sporty Hero");
                intent.putExtra("betObject", betHistoryItem);
                intent.putExtra("share_data_type", "bet_history");
                try {
                    activity2.getClass();
                    Fragment fragmentG = ((GameMainActivity) activity2).getSupportFragmentManager().G(R.id.main_game_container);
                    if (fragmentG instanceof q1c0) {
                        ((q1c0) fragmentG).x0 = true;
                    }
                } catch (Exception unused) {
                }
                activity2.startActivity(intent);
            }
        });
        op5 op5Var = op5.a;
        AppCompatTextView appCompatTextView = vr80Var.b;
        op5.r(op5Var, b.f(appCompatTextView, vr80Var.U, vr80Var.y, vr80Var.Z, appCompatTextView, vr80Var.W, vr80Var.z, vr80Var.c0, vr80Var.b0, vr80Var.M, vr80Var.Q, vr80Var.e), null, 4);
    }
}
