package defpackage;

import com.sporty.android.book.domain.entity.Category;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class t2x implements o2x {
    public final lv50 a;
    public final a b = new a();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            u2x u2xVar = (u2x) obj;
            hq60Var.getClass();
            u2xVar.getClass();
            hq60Var.q(1, u2xVar.a);
            hq60Var.L(2, u2xVar.b);
            hq60Var.L(3, u2xVar.c);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `notification_cursor` (`category`,`forwardCursor`,`backwardCursor`) VALUES (?,?,?)";
        }
    }

    public t2x(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.o2x
    public final Object a(k4x k4xVar) {
        Object objC = qlc.c(k4xVar, this.a, new p2x(), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.o2x
    public final Object b(final int i, r3x r3xVar) {
        Object objC = qlc.c(r3xVar, this.a, new Function1() { // from class: s2x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM notification_cursor  WHERE category=?");
                try {
                    hq60VarH1.q(1, i2);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.o2x
    public final Object c(final u2x u2xVar, r3x r3xVar) {
        Object objC = qlc.c(r3xVar, this.a, new Function1() { // from class: q2x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.m(vp60Var, u2xVar);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.o2x
    public final Object d(final int i, q3x q3xVar) {
        return qlc.c(q3xVar, this.a, new Function1() { // from class: r2x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM notification_cursor WHERE category=?");
                try {
                    hq60VarH1.q(1, i2);
                    return hq60VarH1.D1() ? new u2x((int) hq60VarH1.getLong(l0b.b(hq60VarH1, Category.CATEGORY_ID)), hq60VarH1.k1(l0b.b(hq60VarH1, "forwardCursor")), hq60VarH1.k1(l0b.b(hq60VarH1, "backwardCursor"))) : null;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }
}
