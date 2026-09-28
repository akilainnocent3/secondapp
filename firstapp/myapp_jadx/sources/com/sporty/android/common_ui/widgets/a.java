package com.sporty.android.common_ui.widgets;

import android.text.TextUtils;
import android.view.View;
import com.sporty.android.core.model.realsports.Order;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;
import defpackage.f00;
import defpackage.g08;
import defpackage.hb5;
import defpackage.krv;
import defpackage.rws;
import defpackage.vgb0;
import defpackage.w1k;
import defpackage.wga;
import defpackage.zyf0;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ GenericPairButton a;

    public a(GenericPairButton genericPairButton) {
        this.a = genericPairButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GenericPairButton.a aVar = this.a.H;
        if (aVar != null) {
            BetSuccessfulPageFragment betSuccessfulPageFragment = ((com.sportybet.plugin.realsports.betsucc.presentation.fragment.a) aVar).a;
            Order order = betSuccessfulPageFragment.Q;
            if (order == null || TextUtils.isEmpty(order.shareCode)) {
                zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again, 0);
                betSuccessfulPageFragment.o0(BetSuccessfulPageFragment.b.f);
                return;
            }
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("from", betSuccessfulPageFragment.M.B.getValue() instanceof krv.c ? AnalyticsParam.EVENT_PARAM_MISSION_REMINDER : "betslip")};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) != null) {
                hb5.a(wga.a(key, "duplicate key: "));
                return;
            }
            Map<String, ? extends Object> mapUnmodifiableMap = Collections.unmodifiableMap(map);
            f00 f00Var = vgb0.a;
            mapUnmodifiableMap.getClass();
            vgb0.c(AnalyticsEvent.BETSLIP_REBET_ADD_TO_BETSLIP, mapUnmodifiableMap, false);
            betSuccessfulPageFragment.w.c(AnalyticsEvent.BETSLIP_REBET_ADD_TO_BETSLIP, mapUnmodifiableMap, null);
            rws rwsVar = betSuccessfulPageFragment.L;
            String str = betSuccessfulPageFragment.Q.shareCode;
            g08 g08VarM0 = betSuccessfulPageFragment.m0();
            rwsVar.getClass();
            rws.y1(rwsVar, str, g08VarM0, null, 28);
        }
    }
}
