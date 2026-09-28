package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes7.dex */
public final class hle0 {
    public final lch a;
    public final fbh0 b;
    public final u840 c;
    public final mgb0 d;
    public final JsonSerializeService e;

    public hle0(uqm uqmVar, lch lchVar, fbh0 fbh0Var, u840 u840Var, mgb0 mgb0Var, JsonSerializeService jsonSerializeService) {
        final ema emaVar = new ema();
        this.a = lchVar;
        this.b = fbh0Var;
        this.c = u840Var;
        this.d = mgb0Var;
        this.e = jsonSerializeService;
        ady adyVar = new ady(new ycy(new j760(mgb0Var.getAccountFlow(), e.a)).h(wm70.c));
        dle0 dle0Var = new dle0(this);
        yby.c(2, "prefetch");
        xcy xcyVar = new xcy(adyVar, dle0Var);
        rlr rlrVar = new rlr(new gtj(this, 1), new ele0(), new ib() { // from class: fle0
            @Override // defpackage.ib
            public final void run() {
                emaVar.d();
            }
        });
        xcyVar.a(rlrVar);
        emaVar.b(rlrVar);
        uqmVar.addLogoutEventListener(new fjt() { // from class: gle0
            @Override // defpackage.fjt
            public final void p() {
                hle0 hle0Var = this.a;
                vn20.i("swipe_bet", hle0Var.d.isLogin() ? "pref_key_user_preference" : "pref_key_default_user_preference", "", true);
                vn20.a("swipe_bet").edit().remove("pref_key_show_user_preference").commit();
                hle0Var.b();
                hle0Var.a();
            }
        });
    }

    public static String c(Event event) {
        Market market = event.markets.get(0);
        String string = event.eventId + "/uof:" + market.product + "/" + event.sport.id + "/" + market.id;
        if (!TextUtils.isEmpty(market.specifier)) {
            StringBuilder sbB = mq0.b(string, "?");
            sbB.append(market.specifier);
            string = sbB.toString();
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("index = %s", string);
        return string;
    }

    public final void a() {
        vn20.i("swipe_bet", this.d.isLogin() ? "pref_key_current_appeared_index" : "pref_key_default_current_appeared_index", "", true);
    }

    public final void b() {
        vn20.i("swipe_bet", this.d.isLogin() ? "pref_key_paginate_index" : "pref_key_default_paginate_index", "", true);
    }

    public final void d(String str) {
        vn20.i("swipe_bet", this.d.isLogin() ? "pref_key_user_preference" : "pref_key_default_user_preference", str, true);
    }
}
