package defpackage;

import android.content.Context;
import com.appsflyer.internal.u;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class w9c0 {
    public final Context a;
    public final rdd0 b;
    public final y8j c;

    public w9c0(Context context, rdd0 rdd0Var, y8j y8jVar) {
        rdd0Var.getClass();
        y8jVar.getClass();
        this.a = context;
        this.b = rdd0Var;
        this.c = y8jVar;
    }

    public final void a(String str) {
        this.b.a(new a5o.g0(u.a(AnalyticsParam.CONTENT_TYPE, str), 0), k00.b, k00.a, k00.c);
    }

    public final void b(pdd0 pdd0Var) {
        this.b.a(pdd0Var, k00.d);
    }

    public final void c(v9c0 v9c0Var) {
        v9c0Var.getClass();
        boolean z = v9c0Var instanceof v9c0.g;
        y8j y8jVar = this.c;
        if (z) {
            b(new ipc0(0));
            y8j.a(y8jVar, "legends__match_confirm_btn");
            return;
        }
        if (v9c0Var instanceof v9c0.j) {
            b(new kpc0(0));
            y8j.a(y8jVar, "legends__lucky_pick_btn");
            return;
        }
        if (v9c0Var instanceof v9c0.p) {
            b(new opc0(0));
            y8j.a(y8jVar, "legends__recommended_match_list");
            return;
        }
        if (v9c0Var instanceof v9c0.h) {
            a("league_tab_" + v9c0Var + ".leagueName");
            return;
        }
        if (v9c0Var instanceof v9c0.f) {
            a("bet_history_event_page");
            return;
        }
        if (v9c0Var instanceof v9c0.r) {
            b(new qpc0(((v9c0.r) v9c0Var).a.a));
            y8j.a(y8jVar, "legends__stats_btn");
            return;
        }
        if (v9c0Var instanceof v9c0.n) {
            b(new mpc0(0));
            b(new a5o.f0("sr:sport:3"));
            y8j.a(y8jVar, "legends__place_bet_btn");
            a(AnalyticsParam.AN_EVENT_PLACE_BET);
            return;
        }
        if (v9c0Var instanceof v9c0.q) {
            b(new ppc0(0));
            y8j.a(y8jVar, "legends__skip_to_result_btn");
            return;
        }
        if (v9c0Var instanceof v9c0.m) {
            this.b.a(((v9c0.m) v9c0Var).a, k00.d, k00.c);
            return;
        }
        if (v9c0Var instanceof v9c0.l) {
            b(new lpc0(0));
            y8j.a(y8jVar, "legends__next_round_btn");
            return;
        }
        if (v9c0Var instanceof v9c0.c) {
            v9c0.c cVar = (v9c0.c) v9c0Var;
            long j = cVar.a;
            String lowerCase = cVar.b.toLowerCase(hj10.a.a().b().a);
            lowerCase.getClass();
            hpc0 hpc0Var = new hpc0(j, lowerCase);
            b(hpc0Var);
            y8jVar.f("legends__animation__page", hpc0Var.createCustomMetrics());
            return;
        }
        if (v9c0Var.equals(v9c0.b.a)) {
            b(new gpc0(0));
            y8j.a(y8jVar, "legends__animation_error");
            return;
        }
        if (v9c0Var.equals(v9c0.i.a)) {
            b(new jpc0(0));
            y8j.a(y8jVar, "legends_lite_animation_place_bet_btn");
            return;
        }
        if (v9c0Var.equals(v9c0.o.a)) {
            b(new npc0(0));
            y8j.a(y8jVar, "legends_player_animation_place_bet_btn");
            return;
        }
        if (v9c0Var instanceof v9c0.e) {
            boolean z2 = ((v9c0.e) v9c0Var).a;
            if (z2) {
                a("detail_market_category_tab_".concat(sn5.b(this.a, R.string.page_instant_virtual__bet_builder, new Object[0])));
            }
            b(new a5o.m("sr:sport:3", Boolean.valueOf(z2)));
            y8jVar.f(AnalyticsEvent.IV__EVENT_LIST__DETAILS__BET_BUILDER_BTN, jpu.b(new Pair(AnalyticsParam.EVENT_STATUS, Boolean.valueOf(z2))));
            return;
        }
        if (v9c0Var.equals(v9c0.d.a)) {
            b(new a5o.e("sr:sport:3"));
            y8j.a(y8jVar, AnalyticsEvent.IV__BET_BUILDER__ADD_TO_BETSLIP_BTN);
        } else {
            if (v9c0Var.equals(v9c0.a.a)) {
                b(new a5o.l("sr:sport:3"));
                return;
            }
            if (!(v9c0Var instanceof v9c0.k)) {
                uhc.a();
                return;
            }
            a("detail_market_category_tab_" + ((v9c0.k) v9c0Var).a);
        }
    }
}
