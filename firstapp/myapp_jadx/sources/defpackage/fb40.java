package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class fb40 implements db40 {
    public final lv50 a;
    public final a b = new a();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            hb40 hb40Var = (hb40) obj;
            hq60Var.getClass();
            hb40Var.getClass();
            hq60Var.L(1, hb40Var.a);
            hq60Var.L(2, hb40Var.b);
            hq60Var.L(3, hb40Var.c);
            hq60Var.L(4, hb40Var.d);
            hq60Var.q(5, hb40Var.e);
            hq60Var.q(6, hb40Var.f ? 1L : 0L);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `realtime_cms` (`apiPageName`,`stringKey`,`language`,`value`,`version`,`isPageUpdating`) VALUES (?,?,?,?,?,?)";
        }
    }

    public fb40(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.db40
    public final Object a(String str, qp5 qp5Var) {
        return qlc.c(qp5Var, this.a, new zi00(str, 1), true, false);
    }

    @Override // defpackage.db40
    public final Object b(String str, lb40 lb40Var) {
        return qlc.c(lb40Var, this.a, new yi00(str, 1), true, false);
    }

    @Override // defpackage.db40
    public final Object c(String str, qp5 qp5Var) {
        Object objC = qlc.c(qp5Var, this.a, new ms3(str, 2), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.db40
    public final Object d(final hb40 hb40Var, sp5 sp5Var) {
        Object objC = qlc.c(sp5Var, this.a, new Function1() { // from class: eb40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.m(vp60Var, hb40Var);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
