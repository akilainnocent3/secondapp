package com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.bettingstreak.domain.model.BettingStreakMissionUpdate;
import defpackage.e1i;
import defpackage.i24;
import defpackage.itf0;
import defpackage.j24;
import defpackage.j8i0;
import defpackage.k00;
import defpackage.ku90;
import defpackage.q7e0;
import defpackage.rdd0;
import defpackage.t340;
import defpackage.uhc;
import defpackage.v340;
import defpackage.vu60;
import defpackage.wwd0;
import defpackage.xwd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/streakMission/c;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final rdd0 a;
    public final i24 b;
    public final v340 c;
    public final ku90<b> d;
    public final t340 e;

    public c(rdd0 rdd0Var, i24 i24Var, vu60 vu60Var) {
        Object value;
        j24 j24Var;
        rdd0Var.getClass();
        vu60Var.getClass();
        this.a = rdd0Var;
        this.b = i24Var;
        wwd0 wwd0VarA = xwd0.a(new j24(0));
        this.c = e1i.b(wwd0VarA);
        ku90<b> ku90Var = new ku90<>();
        this.d = ku90Var;
        this.e = e1i.a(ku90Var);
        BettingStreakMissionUpdate bettingStreakMissionUpdate = (BettingStreakMissionUpdate) vu60Var.b("streak_mission");
        if (bettingStreakMissionUpdate == null) {
            itf0.a aVar = itf0.a;
            aVar.q("BettingStreakMissionVM");
            aVar.d("Missing streak_mission in SavedStateHandle", new Object[0]);
            bettingStreakMissionUpdate = new BettingStreakMissionUpdate(0);
        }
        do {
            value = wwd0VarA.getValue();
            this.b.getClass();
            int iOrdinal = bettingStreakMissionUpdate.a.ordinal();
            if (iOrdinal == 0) {
                j24Var = new j24(new ResourceUiText(R.string.page_loyalty__repair_tool_mission), new ResourceUiText(R.string.page_loyalty__streak_repair_tool_mission_acceptable_message), new ResourceUiText(R.string.page_loyalty__activate_mission));
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    throw null;
                }
                j24Var = new j24(new ResourceUiText(R.string.page_loyalty__popup_mission_complete_title), new ResourceUiText(R.string.page_loyalty__streak_repair_tool_completed_message), new ResourceUiText(R.string.common_functions__check_reward));
            }
        } while (!wwd0VarA.g(value, j24Var));
        this.a.a(q7e0.j.a, k00.d);
    }

    public final void x1(a aVar) {
        aVar.getClass();
        boolean zEquals = aVar.equals(a.b.a);
        ku90<b> ku90Var = this.d;
        if (zEquals) {
            ku90Var.a(b.a.a);
            return;
        }
        if (!aVar.equals(a.C0394a.a)) {
            uhc.a();
            return;
        }
        this.a.a(q7e0.i.a, k00.d);
        ku90Var.a(b.C0395b.a);
        ku90Var.a(b.a.a);
    }
}
