package defpackage;

import com.appsflyer.internal.u;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dxu implements gaj {
    public final /* synthetic */ MatchEventActivity a;

    public /* synthetic */ dxu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        int i = MatchEventActivity.a0;
        str.getClass();
        str2.getClass();
        str3.getClass();
        z5v z5vVarI1 = this.a.I1();
        ku90<i5v> ku90Var = z5vVarI1.g0;
        if (str.equals(str2)) {
            ku90Var.a(new i5v.a(str2));
        } else {
            z5vVarI1.J.b.a(str2);
            ku90Var.a(new i5v.a(str2));
            z5vVarI1.D.a(new a5o.g0(u.a(AnalyticsParam.CONTENT_TYPE, "league_tab_".concat(str3)), 0), k00.b, k00.a, k00.c);
        }
        return Unit.a;
    }
}
