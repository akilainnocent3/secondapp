package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.rush.model.entity.DetailResponseEntity;
import java.util.TreeMap;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sp80 extends Dialog {
    public DetailResponseEntity a;
    public rm0 b;
    public FloatingActionButton c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView i;
    public TextView v;
    public TextView w;
    public String y;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.rush_game_limits);
        View viewFindViewById = findViewById(R.id.game_limit_close);
        viewFindViewById.getClass();
        this.c = (FloatingActionButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.min_bet);
        viewFindViewById2.getClass();
        this.d = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.game_limit);
        viewFindViewById3.getClass();
        this.e = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.max_bet);
        viewFindViewById4.getClass();
        this.f = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.min_coeff);
        viewFindViewById5.getClass();
        this.v = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.max_coeff);
        viewFindViewById6.getClass();
        this.i = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.max_payout);
        viewFindViewById7.getClass();
        this.w = (TextView) viewFindViewById7;
        final fem femVar = new fem(this, 1);
        FloatingActionButton floatingActionButton = this.c;
        if (floatingActionButton == null) {
            Intrinsics.n("closeButton");
            throw null;
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener(this) { // from class: rp80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zj60 bridge;
                String str = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
                Bundle bundleA = whs.a("popup_name", "game limit", "button_name", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, "Rush");
                bundleA.putString("user_state", str);
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                    ((bk60) bridge).a("popup_action", bundleA);
                }
                femVar.invoke();
            }
        });
        DetailResponseEntity detailResponseEntity = this.a;
        if (detailResponseEntity != null) {
            TextView textView = this.d;
            if (textView == null) {
                Intrinsics.n("minBet");
                throw null;
            }
            op5 op5Var = op5.a;
            String string = getContext().getString(R.string.min_bet_text_cms_rush);
            string.getClass();
            String string2 = getContext().getString(R.string.sg_rush_min_bet);
            string2.getClass();
            String strC = op5.c(op5Var, string, string2);
            String str = this.y;
            TreeMap treeMap = pw.a;
            textView.setText(tx5.a(strC, " : ", str, " ", pw.a(pw.n(detailResponseEntity.getMinAmount()))));
            TextView textView2 = this.f;
            if (textView2 == null) {
                Intrinsics.n("maxBet");
                throw null;
            }
            String string3 = getContext().getString(R.string.max_bet_text_cms_rush);
            string3.getClass();
            String string4 = getContext().getString(R.string.sg_rush_max_bet);
            string4.getClass();
            textView2.setText(tx5.a(op5.c(op5Var, string3, string4), " : ", this.y, " ", pw.a(pw.n(detailResponseEntity.getMaxAmount()))));
            TextView textView3 = this.v;
            if (textView3 == null) {
                Intrinsics.n("minCoeff");
                throw null;
            }
            String string5 = getContext().getString(R.string.min_coefficient_text_cms);
            string5.getClass();
            String string6 = getContext().getString(R.string.min_coeff);
            string6.getClass();
            textView3.setText(op5.c(op5Var, string5, string6) + " : " + pw.a(pw.n(detailResponseEntity.getMinUserCoefficient())) + "x");
            TextView textView4 = this.i;
            if (textView4 == null) {
                Intrinsics.n("maxCoeff");
                throw null;
            }
            String string7 = getContext().getString(R.string.max_coefficient_text_cms);
            string7.getClass();
            String string8 = getContext().getString(R.string.max_coeff);
            string8.getClass();
            textView4.setText(op5.c(op5Var, string7, string8) + " : " + pw.n(detailResponseEntity.getMaxUserCoefficient()) + "x");
            TextView textView5 = this.w;
            if (textView5 == null) {
                Intrinsics.n("maxPayout");
                throw null;
            }
            String string9 = getContext().getString(R.string.max_payout_text_cms);
            string9.getClass();
            String string10 = getContext().getString(R.string.sg_rush_max_payout);
            string10.getClass();
            textView5.setText(tx5.a(op5.c(op5Var, string9, string10), " : ", this.y, " ", pw.a(pw.n(detailResponseEntity.getMaxPayout()))));
        }
        op5 op5Var2 = op5.a;
        TextView textView6 = this.e;
        if (textView6 != null) {
            op5.r(op5Var2, b.f(textView6), null, 6);
        } else {
            Intrinsics.n("gameLimit");
            throw null;
        }
    }
}
