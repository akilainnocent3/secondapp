package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class zh30 implements wh30 {
    public final jrm a;
    public final vh30 b;
    public final wwd0 c;
    public final v340 d;

    public zh30(jrm jrmVar, vh30 vh30Var) {
        jrmVar.getClass();
        this.a = jrmVar;
        this.b = vh30Var;
        wwd0 wwd0VarA = xwd0.a(new uh30.a(0));
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        jrmVar.m1(new iu2.a() { // from class: xh30
            @Override // iu2.a
            public final void C() {
                this.a.a(false);
            }
        });
    }

    @Override // defpackage.wh30
    public final void a(boolean z) {
        wwd0 wwd0Var = this.c;
        uh30 uh30Var = (uh30) wwd0Var.getValue();
        jrm jrmVar = this.a;
        int i = 0;
        if (jrmVar.U().isEmpty() || uh30Var.a().isEmpty()) {
            uh30.a aVar = new uh30.a(0);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
            return;
        }
        ArrayList arrayListU = jrmVar.U();
        ArrayList arrayList = new ArrayList();
        int size = arrayListU.size();
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            if (qz3.b((Selection) obj)) {
                arrayList.add(obj);
            }
        }
        boolean zV = g880.v(uh30Var.a(), arrayList);
        if (uh30Var instanceof uh30.b) {
            if (zV) {
                return;
            }
            uh30.c cVar = new uh30.c(((uh30.b) uh30Var).a);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
            return;
        }
        if (!(uh30Var instanceof uh30.c)) {
            if (!(uh30Var instanceof uh30.a)) {
                uhc.a();
                return;
            } else {
                if (zV) {
                    uh30.b bVar = new uh30.b(((uh30.a) uh30Var).a);
                    wwd0Var.getClass();
                    wwd0Var.k(null, bVar);
                    return;
                }
                return;
            }
        }
        if (!zV && z) {
            uh30.a aVar2 = new uh30.a(((uh30.c) uh30Var).a);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar2);
        } else {
            if (!zV || z) {
                return;
            }
            uh30.b bVar2 = new uh30.b(((uh30.c) uh30Var).a);
            wwd0Var.getClass();
            wwd0Var.k(null, bVar2);
        }
    }

    @Override // defpackage.wh30
    public final yh30 b() {
        return new yh30(this.d, this);
    }

    @Override // defpackage.wh30
    public final void c(uh30 uh30Var) {
        uh30Var.getClass();
        wwd0 wwd0Var = this.c;
        wwd0Var.getClass();
        wwd0Var.k(null, uh30Var);
    }

    @Override // defpackage.wh30
    public final uh30 getResult() {
        uh30 uh30Var = (uh30) this.c.getValue();
        uh30Var.getClass();
        return this.b.a.W() ? uh30Var : new uh30.a(0);
    }
}
