package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class lvh0 implements gvh0 {
    public final lv50 a;
    public final a b = new a();
    public final b c = new b();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            nfz nfzVar = (nfz) obj;
            hq60Var.getClass();
            nfzVar.getClass();
            hq60Var.q(1, 0L);
            hq60Var.q(2, nfzVar.a ? 1L : 0L);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `an_test_override_setting` (`id`,`enabled`) VALUES (?,?)";
        }
    }

    public static final class b extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            mvh0 mvh0Var = (mvh0) obj;
            hq60Var.getClass();
            mvh0Var.getClass();
            hq60Var.L(1, mvh0Var.a);
            hq60Var.L(2, mvh0Var.b);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `an_test_variant_override` (`campaign_code`,`variant_value`) VALUES (?,?)";
        }
    }

    public lvh0(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.gvh0
    public final q2i a() {
        kvh0 kvh0Var = new kvh0();
        return s7n.a(this.a, new String[]{"an_test_variant_override"}, kvh0Var);
    }

    @Override // defpackage.gvh0
    public final Object b(nfz nfzVar, e4d e4dVar) {
        Object objC = qlc.c(e4dVar, this.a, new p0x(1, this, nfzVar), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.gvh0
    public final Object c(final mvh0 mvh0Var, z3d z3dVar) {
        Object objC = qlc.c(z3dVar, this.a, new Function1() { // from class: hvh0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.c.m(vp60Var, mvh0Var);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.gvh0
    public final q2i d(final String str) {
        str.getClass();
        Function1 function1 = new Function1() { // from class: jvh0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM an_test_variant_override WHERE campaign_code = ? LIMIT 1");
                try {
                    hq60VarH1.L(1, str2);
                    return hq60VarH1.D1() ? new mvh0(hq60VarH1.k1(l0b.b(hq60VarH1, "campaign_code")), hq60VarH1.k1(l0b.b(hq60VarH1, "variant_value"))) : null;
                } finally {
                    hq60VarH1.close();
                }
            }
        };
        return s7n.a(this.a, new String[]{"an_test_variant_override"}, function1);
    }

    @Override // defpackage.gvh0
    public final q2i e() {
        ivh0 ivh0Var = new ivh0();
        return s7n.a(this.a, new String[]{"an_test_override_setting"}, ivh0Var);
    }

    @Override // defpackage.gvh0
    public final Object f(String str, a4d a4dVar) {
        Object objC = qlc.c(a4dVar, this.a, new o0x(str, 2), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
