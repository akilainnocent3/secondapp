package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lccu;", "Lj8i0;", "", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ccu extends j8i0 {
    public final ku90<String> A;
    public final t340 B;
    public final wbu a;
    public final hbu b;
    public final psm c;
    public final mgb0 d;
    public final gbn e;
    public final rdd0 f;
    public final int i;
    public final wwd0 v;
    public final v340 w;
    public final ku90<n8u> y;
    public final t340 z;

    public ccu(wbu wbuVar, hbu hbuVar, psm psmVar, mgb0 mgb0Var, gbn gbnVar, vu60 vu60Var, rdd0 rdd0Var) {
        psmVar.getClass();
        mgb0Var.getClass();
        gbnVar.getClass();
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = wbuVar;
        this.b = hbuVar;
        this.c = psmVar;
        this.d = mgb0Var;
        this.e = gbnVar;
        this.f = rdd0Var;
        Integer num = (Integer) vu60Var.b("KEY_LW_TYPE");
        this.i = num != null ? num.intValue() : 0;
        wwd0 wwd0VarA = xwd0.a(new jbu(0));
        this.v = wwd0VarA;
        this.w = e1i.b(wwd0VarA);
        ku90<n8u> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = e1i.a(ku90Var);
        ku90<String> ku90Var2 = new ku90<>();
        this.A = ku90Var2;
        this.B = e1i.a(ku90Var2);
        x1();
        rdd0Var.a(obu.a, k00.d);
    }

    public final void x1() {
        int i = this.i;
        wbu wbuVar = this.a;
        kzh.d(new g1i(bm50.a(new pbu(wbuVar.a.t(i), wbuVar)), new acu(this, null)), o8i0.d(this));
    }

    public final void y1(x8u x8uVar) {
        Object value;
        jbu jbuVar;
        k9u k9uVar;
        t8u t8uVar;
        Object value2;
        Object value3;
        String strA;
        fau fauVar;
        Object value4;
        Object value5;
        k9u k9uVar2;
        t8u t8uVar2;
        Object value6;
        x8uVar.getClass();
        jbu jbuVar2 = (jbu) this.w.a.getValue();
        if (x8uVar.equals(x8u.f.a)) {
            x1();
            return;
        }
        boolean zEquals = x8uVar.equals(x8u.h.a);
        wwd0 wwd0Var = this.v;
        if (zEquals) {
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, jbu.a((jbu) value6, false, false, null, null, null, !jbuVar2.f, null, false, null, null, 991)));
            return;
        }
        boolean zEquals2 = x8uVar.equals(x8u.i.a);
        ku90<String> ku90Var = this.A;
        if (zEquals2) {
            this.f.a(nbu.a, k00.d);
            jbu jbuVar3 = (jbu) wwd0Var.getValue();
            if (jbuVar3.d != ccb0.a) {
                return;
            }
            do {
                value5 = wwd0Var.getValue();
                k9uVar2 = k9u.b;
                t8uVar2 = jbuVar3.c;
            } while (!wwd0Var.g(value5, jbu.a((jbu) value5, false, false, t8u.a(t8uVar2, 0, t8uVar2.c, false, 11), null, null, false, k9uVar2, false, null, null, 955)));
            ku90Var.a("lucky_wheel/spin_clicked.mp3");
            return;
        }
        if (x8uVar.equals(x8u.j.a)) {
            p9u p9uVar = jbuVar2.e;
            int i = p9uVar != null ? p9uVar.b : 0;
            int i2 = jbuVar2.c.c;
            if (i > 0) {
                ku90Var.a("lucky_wheel/winning.mp3");
                strA = vga.a(i, " ", this.c.b());
            } else {
                strA = "";
            }
            String str = strA;
            if (i == 0 && i2 == 0) {
                fauVar = fau.a;
            } else if (i != 0 || i2 <= 0) {
                fauVar = (i <= 0 || i2 != 0) ? fau.d : fau.c;
            } else {
                fauVar = fau.b;
            }
            fau fauVar2 = fauVar;
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, jbu.a((jbu) value4, false, false, null, ccb0.a, null, false, k9u.e, true, new ibu(str, fauVar2), null, 567)));
            return;
        }
        if (x8uVar.equals(x8u.c.a)) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, jbu.a((jbu) value3, false, false, null, null, null, false, k9u.c, false, null, null, 959)));
            return;
        }
        x8u.k kVar = x8u.k.a;
        if (x8uVar.equals(kVar)) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, jbu.a((jbu) value2, false, false, null, ccb0.b, null, false, k9u.d, false, null, null, 951)));
            jbu jbuVar4 = (jbu) wwd0Var.getValue();
            t8u t8uVar3 = jbuVar4.c;
            int i3 = t8uVar3.b;
            int i4 = t8uVar3.a;
            wbu wbuVar = this.a;
            wbuVar.getClass();
            dq40 dq40Var = new dq40();
            kzh.d(new g1i(new sbu(bm50.a(new rbu(r0i.a(new yzh(new qbu(wbuVar.a.v(i3), dq40Var), new tbu(3, null)), new ubu(wbuVar, i4, null)))), dq40Var), new bcu(jbuVar4, this, null)), o8i0.d(this));
            return;
        }
        x8u.g gVar = x8u.g.a;
        if (x8uVar.equals(gVar)) {
            do {
                value = wwd0Var.getValue();
                jbuVar = (jbu) value;
                k9uVar = k9u.a;
                t8uVar = jbuVar2.c;
            } while (!wwd0Var.g(value, jbu.a(jbuVar, false, false, t8u.a(t8uVar, 0, 0, t8uVar.c > 0, 15), null, null, false, k9uVar, false, null, null, 555)));
            return;
        }
        boolean zEquals3 = x8uVar.equals(x8u.a.a);
        ku90<n8u> ku90Var2 = this.y;
        if (zEquals3) {
            p9u p9uVar2 = ((jbu) wwd0Var.getValue()).e;
            if ((p9uVar2 != null ? p9uVar2.b : 0) > 0) {
                ku90Var.a("lucky_wheel/winning_dialog_clicked.mp3");
            }
            ku90Var2.a(n8u.b.a);
            return;
        }
        if (x8uVar.equals(x8u.e.a)) {
            p9u p9uVar3 = ((jbu) wwd0Var.getValue()).e;
            if ((p9uVar3 != null ? p9uVar3.b : 0) > 0) {
                ku90Var.a("lucky_wheel/winning_dialog_clicked.mp3");
            }
            y1(gVar);
            y1(kVar);
            return;
        }
        if (x8uVar.equals(x8u.d.a)) {
            ku90Var2.a(n8u.a.a);
        } else if (x8uVar.equals(x8u.b.a)) {
            ku90Var2.a(n8u.b.a);
        } else {
            uhc.a();
        }
    }

    public final void z1(int i, int i2) {
        Object value;
        wwd0 wwd0Var = this.v;
        t8u t8uVarA = t8u.a(((jbu) wwd0Var.getValue()).c, i, i2, false, 25);
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, jbu.a((jbu) value, false, false, t8uVarA, null, null, false, null, false, null, null, 1019)));
    }
}
