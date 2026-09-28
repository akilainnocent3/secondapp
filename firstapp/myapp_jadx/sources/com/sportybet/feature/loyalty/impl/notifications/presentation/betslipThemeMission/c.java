package com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import defpackage.ay3;
import defpackage.by3;
import defpackage.j8i0;
import defpackage.ku90;
import defpackage.uhc;
import defpackage.vu60;
import defpackage.wwd0;
import defpackage.xwd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/betslipThemeMission/c;", "Lj8i0;", "Lvu60;", "savedStateHandle", "<init>", "(Lvu60;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final wwd0 a;
    public final ku90<b> b;
    public final ku90 c;

    public c(vu60 vu60Var) {
        ay3 ay3Var;
        vu60Var.getClass();
        by3 by3Var = (by3) vu60Var.b("mission_variant");
        by3Var = by3Var == null ? by3.a : by3Var;
        wwd0 wwd0VarA = xwd0.a(new ay3(0));
        this.a = wwd0VarA;
        ku90<b> ku90Var = new ku90<>();
        this.b = ku90Var;
        this.c = ku90Var;
        int iOrdinal = by3Var.ordinal();
        if (iOrdinal == 0) {
            ay3Var = new ay3(new ResourceUiText(R.string.page_loyalty__popup_mission_invite_title), new ResourceUiText(R.string.page_loyalty__popup_betslip_mission_invite_img), R.string.page_loyalty__popup_betslip_mission_invite_content, new ResourceUiText(R.string.page_loyalty__activate_mission), by3.a);
        } else if (iOrdinal == 1) {
            ay3Var = new ay3(new ResourceUiText(R.string.page_loyalty__popup_mission_complete_title), new ResourceUiText(R.string.page_loyalty__popup_betslip_mission_complete_img), R.string.page_loyalty__popup_betslip_mission_complete_content, new ResourceUiText(R.string.page_loyalty__popup_betslip_mission_complete_cta), by3.b);
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                throw null;
            }
            ay3Var = new ay3(new ResourceUiText(R.string.page_loyalty__popup_mission_complete_title), new ResourceUiText(R.string.page_loyalty__popup_betslip_mission_complete_img), R.string.page_loyalty__popup_betslip_mission_complete_with_free_bet_content, new ResourceUiText(R.string.page_loyalty__popup_betslip_mission_complete_cta), by3.c);
        }
        wwd0VarA.k(null, ay3Var);
    }

    public final void x1(a aVar) {
        aVar.getClass();
        boolean zEquals = aVar.equals(a.C0384a.a);
        ku90<b> ku90Var = this.b;
        if (zEquals) {
            ku90Var.a(b.d.a);
            return;
        }
        if (aVar.equals(a.c.a)) {
            ku90Var.a(b.C0385b.a);
            return;
        }
        if (aVar.equals(a.b.a)) {
            ku90Var.a(b.c.a);
        } else if (aVar.equals(a.d.a)) {
            ku90Var.a(b.a.a);
        } else {
            uhc.a();
        }
    }
}
