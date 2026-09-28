package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le6d;", "Lj8i0;", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e6d extends j8i0 {
    public final azm a;
    public final jfk b;
    public final rdd0 c;
    public final String d;
    public final wwd0 e;
    public final v340 f;

    public e6d(vu60 vu60Var, azm azmVar, jfk jfkVar, rdd0 rdd0Var) {
        pdd0 pdd0Var;
        vu60Var.getClass();
        azmVar.getClass();
        rdd0Var.getClass();
        this.a = azmVar;
        this.b = jfkVar;
        this.c = rdd0Var;
        String str = (String) vu60Var.b("team_id");
        String str2 = str == null ? "" : str;
        this.d = str2;
        String str3 = (String) vu60Var.b("team_name");
        String str4 = (str3 == null || str3.length() <= 0) ? null : str3;
        String str5 = (String) vu60Var.b("entrance");
        str5 = (str5 == null || str5.length() <= 0) ? null : str5;
        wwd0 wwd0VarA = xwd0.a(new n7d(str2, true, str4, false, false, null));
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        if (str5 != null) {
            int iHashCode = str5.hashCode();
            if (iHashCode != -867650653) {
                if (iHashCode != 1942475165) {
                    if (iHashCode == 1947911796 && str5.equals("featured_match")) {
                        pdd0Var = x7f0.a;
                        rdd0Var.a(pdd0Var, k00.d);
                    }
                } else if (str5.equals(AnalyticsParam.EVENT_SOURCE_EVENT_DETAILS)) {
                    pdd0Var = w7f0.a;
                    rdd0Var.a(pdd0Var, k00.d);
                }
            } else if (str5.equals("code_hub")) {
                pdd0Var = v7f0.a;
                rdd0Var.a(pdd0Var, k00.d);
            }
        }
        rdd0Var.a(a8f0.a, k00.d);
        ej5.c(o8i0.d(this), null, null, new d6d(this, null), 3);
    }
}
