package defpackage;

import com.sporty.android.core.model.loyalty.ParticipateMissionRequest;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class nvv {
    public final b9k a;
    public final etz b;
    public final qb6 c;
    public final lwv d;
    public final b390 e;
    public jvd0 f;
    public final wwd0 g;
    public final v340 h;
    public final wwd0 i;
    public final wwd0 j;
    public final wwd0 k;
    public final wwd0 l;
    public final ku90<qsv> m;
    public final t340 n;

    public nvv(b9k b9kVar, etz etzVar, qb6 qb6Var, lwv lwvVar) {
        b9kVar.getClass();
        etzVar.getClass();
        qb6Var.getClass();
        lwvVar.getClass();
        this.a = b9kVar;
        this.b = etzVar;
        this.c = qb6Var;
        this.d = lwvVar;
        this.e = d390.b(0, 1, null, 5);
        wwd0 wwd0VarA = xwd0.a(lrv.b.a);
        this.g = wwd0VarA;
        this.h = e1i.b(wwd0VarA);
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.i = xwd0.a(o2gVar);
        t3g t3gVar = t3g.a;
        this.j = xwd0.a(t3gVar);
        this.k = xwd0.a(t3gVar);
        this.l = xwd0.a(lk50.b.a);
        ku90<qsv> ku90Var = new ku90<>();
        this.m = ku90Var;
        this.n = e1i.a(ku90Var);
    }

    public final void a(yqv yqvVar, et7 et7Var) {
        wwd0 wwd0Var;
        Object value;
        yqvVar.getClass();
        if (yqvVar instanceof yqv.e) {
            int i = ((yqv.e) yqvVar).a;
            do {
                wwd0Var = this.k;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, yi80.f((Set) value, Integer.valueOf(i))));
            ParticipateMissionRequest participateMissionRequest = new ParticipateMissionRequest(String.valueOf(i));
            etz etzVar = this.b;
            etzVar.getClass();
            kzh.d(new g1i(etzVar.a.b(participateMissionRequest), new mvv(this, i, et7Var, null)), et7Var);
            return;
        }
        if (yqvVar instanceof yqv.g) {
            int i2 = ((yqv.g) yqvVar).a;
            wwd0 wwd0Var2 = this.j;
            Set set = (Set) wwd0Var2.getValue();
            wwd0Var2.k(null, set.contains(Integer.valueOf(i2)) ? yi80.c(set, Integer.valueOf(i2)) : yi80.f(set, Integer.valueOf(i2)));
            return;
        }
        if (yqvVar instanceof yqv.f) {
            c(0, uxs.ENABLE);
            return;
        }
        boolean z = yqvVar instanceof yqv.b;
        wwd0 wwd0Var3 = this.g;
        if (z) {
            wwd0Var3.k(null, new lrv.a(((yqv.b) yqvVar).a, uxs.ENABLE));
            return;
        }
        if (yqvVar instanceof yqv.d) {
            wwd0Var3.setValue(lrv.b.a);
            return;
        }
        if (yqvVar instanceof yqv.c) {
            ej5.c(et7Var, null, null, new ivv(this, ((yqv.c) yqvVar).a, et7Var, null), 3);
        } else if (yqvVar instanceof yqv.a) {
            this.e.a(Unit.a);
        } else {
            uhc.a();
        }
    }

    public final void b(et7 et7Var) {
        kzh.d(new g1i(this.a.a.d(), new kvv(this, null)), et7Var);
    }

    public final void c(int i, uxs uxsVar) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, kpu.i((Map) value, new Pair(Integer.valueOf(i), uxsVar))));
    }
}
