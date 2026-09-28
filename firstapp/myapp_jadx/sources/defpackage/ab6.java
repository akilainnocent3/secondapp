package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ab6 implements wa6 {
    public final lv50 a;
    public final a b = new a();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            bb6 bb6Var = (bb6) obj;
            hq60Var.getClass();
            bb6Var.getClass();
            hq60Var.L(1, bb6Var.a);
            hq60Var.q(2, bb6Var.b);
            hq60Var.q(3, bb6Var.c);
            hq60Var.L(4, bb6Var.d);
            hq60Var.L(5, bb6Var.e);
            hq60Var.q(6, bb6Var.f ? 1L : 0L);
            hq60Var.q(7, bb6Var.g);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `an_test_campaign_variant` (`campaign_code`,`campaign_id`,`variant_id`,`variant_value`,`variant_name`,`can_convert`,`expire_time`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public ab6(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.wa6
    public final Object a(bb6 bb6Var, x1b x1bVar) {
        Object objC = qlc.c(x1bVar, this.a, new za6(0, this, bb6Var), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.wa6
    public final Object b(final String str, x1b x1bVar) {
        return qlc.c(x1bVar, this.a, new Function1() { // from class: ya6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                bb6 bb6Var;
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM an_test_campaign_variant WHERE campaign_code = ? LIMIT 1");
                try {
                    hq60VarH1.L(1, str2);
                    int iB = l0b.b(hq60VarH1, "campaign_code");
                    int iB2 = l0b.b(hq60VarH1, "campaign_id");
                    int iB3 = l0b.b(hq60VarH1, "variant_id");
                    int iB4 = l0b.b(hq60VarH1, "variant_value");
                    int iB5 = l0b.b(hq60VarH1, "variant_name");
                    int iB6 = l0b.b(hq60VarH1, "can_convert");
                    int iB7 = l0b.b(hq60VarH1, "expire_time");
                    if (hq60VarH1.D1()) {
                        bb6Var = new bb6(hq60VarH1.k1(iB), (int) hq60VarH1.getLong(iB2), (int) hq60VarH1.getLong(iB3), hq60VarH1.k1(iB4), hq60VarH1.k1(iB5), ((int) hq60VarH1.getLong(iB6)) != 0, hq60VarH1.getLong(iB7));
                    } else {
                        bb6Var = null;
                    }
                    return bb6Var;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.wa6
    public final Object c(tz.a aVar) {
        Object objC = qlc.c(aVar, this.a, new xa6(), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
