package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class b6r implements w5r {
    public final lv50 a;
    public final a b = new a();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            e6r e6rVar = (e6r) obj;
            hq60Var.getClass();
            e6rVar.getClass();
            hq60Var.L(1, e6rVar.a);
            hq60Var.q(2, e6rVar.b);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `recent_search` (`name`,`modifyTime`) VALUES (?,?)";
        }
    }

    public b6r(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.w5r
    public final Object b(e6r e6rVar, ibr.a aVar) {
        Object objC = qlc.c(aVar, this.a, new y5r(0, this, e6rVar), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.w5r
    public final Object c(v5r v5rVar) {
        Object objC = qlc.c(v5rVar, this.a, new x5r(), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.w5r
    public final q2i d() {
        a6r a6rVar = new a6r();
        return s7n.a(this.a, new String[]{"recent_search"}, a6rVar);
    }

    @Override // defpackage.w5r
    public final Object e(final long j, v5r v5rVar) {
        Object objC = qlc.c(v5rVar, this.a, new Function1() { // from class: z5r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM recent_search WHERE modifyTime > ?");
                try {
                    hq60VarH1.q(1, j2);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.w5r
    public final Object f(long j, ebr ebrVar) {
        Object objB = qlc.b(this.a, new c6r(this, j, null), ebrVar);
        return objB == y5b.a ? objB : Unit.a;
    }
}
