package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class b3x implements v2x {
    public final lv50 a;
    public final a b = new a();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            h3x h3xVar = (h3x) obj;
            hq60Var.getClass();
            h3xVar.getClass();
            hq60Var.q(1, h3xVar.a);
            hq60Var.L(2, h3xVar.b);
            hq60Var.q(3, h3xVar.c);
            hq60Var.L(4, h3xVar.d);
            hq60Var.L(5, h3xVar.e);
            hq60Var.L(6, h3xVar.f);
            hq60Var.L(7, h3xVar.g);
            hq60Var.L(8, h3xVar.h);
            hq60Var.L(9, h3xVar.i);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `notification_center` (`id`,`cursor`,`category`,`sendTime`,`title`,`content`,`bannerImageUrl`,`buttonText`,`buttonLink`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public b3x(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.v2x
    public final Object a(k4x k4xVar) {
        Object objC = qlc.c(k4xVar, this.a, new w2x(0), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.v2x
    public final Object b(final int i, r3x r3xVar) {
        Object objC = qlc.c(r3xVar, this.a, new Function1() { // from class: a3x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM notification_center WHERE category=?");
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

    @Override // defpackage.v2x
    public final d3x c(final int i) {
        return new d3x(new bw50("SELECT * FROM notification_center WHERE category=? order by id desc", new Function1() { // from class: z2x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                hq60Var.q(1, i);
                return Unit.a;
            }
        }), this, this.a, new String[]{"notification_center"});
    }

    @Override // defpackage.v2x
    public final Object d(final ArrayList arrayList, r3x r3xVar) {
        Object objC = qlc.c(r3xVar, this.a, new Function1() { // from class: y2x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.n(vp60Var, arrayList);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.v2x
    public final Object e(final int i, l4x l4xVar) {
        Object objC = qlc.c(l4xVar, this.a, new Function1() { // from class: x2x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM notification_center WHERE id=?");
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
}
