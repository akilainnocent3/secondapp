package com.sportybet.feature.loyalty.impl.notifications.presentation.challenge;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import defpackage.ay0;
import defpackage.e1i;
import defpackage.fx6;
import defpackage.i37;
import defpackage.j8i0;
import defpackage.k00;
import defpackage.ku90;
import defpackage.kz6;
import defpackage.o8i0;
import defpackage.rdd0;
import defpackage.t340;
import defpackage.v340;
import defpackage.vu60;
import defpackage.wib0;
import defpackage.wwd0;
import defpackage.xwd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/challenge/d;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d extends j8i0 {
    public final rdd0 a;
    public final Integer b;
    public final v340 c;
    public final ku90<b> d;
    public final t340 e;

    public d(vu60 vu60Var, wib0 wib0Var, rdd0 rdd0Var) {
        vu60Var.getClass();
        wib0Var.getClass();
        rdd0Var.getClass();
        this.a = rdd0Var;
        Integer num = (Integer) vu60Var.b("topRanking");
        this.b = num;
        wwd0 wwd0VarA = xwd0.a(new fx6(0));
        this.c = e1i.b(wwd0VarA);
        ku90<b> ku90Var = new ku90<>();
        this.d = ku90Var;
        this.e = e1i.a(ku90Var);
        kz6 kz6Var = num != null ? kz6.New : kz6.Win;
        wib0Var.b(o8i0.d(this), kotlin.collections.a.c(kz6Var), "challenge_announcement_" + hashCode());
        wwd0VarA.k(null, num != null ? new fx6(new ResourceUiText(R.string.page_loyalty__challenge_notify_available_title), new ResourceUiText(R.string.page_loyalty__challenge_notify_available_body, ay0.S(new Object[]{num})), new ResourceUiText(R.string.page_loyalty__challenge_notify_available_action), "https://s.sporty.net/cms/challenge_new_img_3x_56e2af334d.png") : new fx6(new ResourceUiText(R.string.page_loyalty__challenge_notify_won_title), new ResourceUiText(R.string.page_loyalty__challenge_notify_won_body), new ResourceUiText(R.string.page_loyalty__challenge_notify_won_action), "https://s.sporty.net/cms/challenge_won_img_3x_5ec8e037ee.png"));
        if (num != null) {
            rdd0Var.a(i37.n.a, k00.d);
        }
    }
}
