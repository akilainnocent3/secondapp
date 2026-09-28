package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ym5 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ym5(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        String str = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str2 = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM CMSResponseEntity WHERE page = ? AND countryCode = ? AND locale = ?");
                try {
                    hq60VarH1.L(1, "currency_symbols");
                    hq60VarH1.L(2, str);
                    hq60VarH1.L(3, str2);
                    int iB = l0b.b(hq60VarH1, "key");
                    int iB2 = l0b.b(hq60VarH1, AnalyticsParam.MINI_GAMES_PAGE);
                    int iB3 = l0b.b(hq60VarH1, "countryCode");
                    int iB4 = l0b.b(hq60VarH1, "locale");
                    int iB5 = l0b.b(hq60VarH1, "value");
                    int iB6 = l0b.b(hq60VarH1, "type");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList.add(new hp5(hq60VarH1.k1(iB), hq60VarH1.k1(iB2), hq60VarH1.k1(iB3), hq60VarH1.k1(iB4), hq60VarH1.isNull(iB5) ? null : hq60VarH1.k1(iB5), hq60VarH1.isNull(iB6) ? null : hq60VarH1.k1(iB6)));
                        break;
                    }
                    return arrayList;
                } finally {
                    hq60VarH1.close();
                }
            default:
                String str3 = (String) obj;
                str3.getClass();
                String str4 = (String) ((Map) obj2).get(str3);
                return str4 == null ? tug.a(str, "_", str3) : str4;
        }
    }

    public /* synthetic */ ym5(String str, Map map) {
        this.c = map;
        this.b = str;
    }
}
