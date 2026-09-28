package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class jso {
    public final String a;
    public final qs70 b;
    public final mso c;
    public lso d;
    public fg1.a e;
    public String f;
    public String g;

    @FunctionalInterface
    public interface a<I extends h3> {
        h3 a(bj1 bj1Var, qs70 qs70Var, x7k0 x7k0Var);
    }

    public jso(String str, lso lsoVar, mso msoVar, qs70 qs70Var) {
        fg1 fg1Var = tm.a;
        this.e = new fg1.a();
        this.f = "";
        this.g = "";
        this.a = str;
        this.d = lsoVar;
        this.c = msoVar;
        this.b = qs70Var;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [iso] */
    public final ws70 a(lso lsoVar, final Consumer<rdy> consumer) {
        this.d = lsoVar;
        bj1 bj1VarC = c();
        qs70 qs70Var = this.b;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<mw40, rpv> entry : qs70Var.e.entrySet()) {
            mw40 key = entry.getKey();
            rpv value = entry.getValue();
            for (nw40 nw40Var : key.c.a(bj1VarC, qs70Var.d)) {
                if (oef.a != nw40Var.c().b()) {
                    int i = l11.e;
                    nl1 nl1VarC = nw40Var.c();
                    qj1 qj1VarA = npv.a(nl1VarC, nw40Var.e(), bj1VarC);
                    yr yrVar = (yr) nl1VarC.b();
                    gw gwVar = gw.b;
                    key.b.getClass();
                    arrayList.add((l11) value.a(new l11(key, qj1VarA, yrVar.b(bj1VarC, gwVar, amv.b), nw40Var.d(), nw40Var.a())));
                }
            }
        }
        final xs70 xs70Var = new xs70(bj1VarC, arrayList);
        mv5 mv5Var = new mv5(Collections.singletonList(xs70Var), new Runnable() { // from class: iso
            @Override // java.lang.Runnable
            public final void run() {
                consumer.accept(xs70Var);
            }
        });
        qs70 qs70Var2 = this.b;
        synchronized (qs70Var2.a) {
            qs70Var2.b.add(mv5Var);
        }
        return new ws70(this.b, mv5Var);
    }

    public final <I extends h3> I b(a<I> aVar) {
        bj1 bj1VarC = c();
        qs70 qs70Var = this.b;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<mw40, rpv> entry : qs70Var.e.entrySet()) {
            mw40 key = entry.getKey();
            rpv value = entry.getValue();
            for (nw40 nw40Var : key.c.a(bj1VarC, qs70Var.d)) {
                if (oef.a != nw40Var.c().b()) {
                    oug ougVarA = qs70Var.c.a();
                    boolean z = qs70Var.f;
                    nl1 nl1VarC = nw40Var.c();
                    qj1 qj1VarA = npv.a(nl1VarC, nw40Var.e(), bj1VarC);
                    yr yrVar = (yr) nl1VarC.b();
                    key.b.getClass();
                    xr xrVarB = yrVar.b(bj1VarC, ougVarA, amv.b);
                    arrayList.add((tpe0) value.a(pef.a == xrVarB ? s2g.c : new khd(key, qj1VarA, xrVarB, nw40Var.d(), nw40Var.a(), z)));
                }
            }
        }
        return (I) aVar.a(bj1VarC, this.b, arrayList.size() == 1 ? (x7k0) arrayList.get(0) : new qs70.a(arrayList));
    }

    public final bj1 c() {
        String str = this.f;
        String str2 = this.g;
        lso lsoVar = this.d;
        fg1.a aVar = this.e;
        return new bj1(this.a, str, str2, lsoVar, this.c, new fg1(aVar.a, aVar.b));
    }

    public final String d(String str) {
        StringBuilder sbB = mq0.b(str, "{descriptor=");
        sbB.append(c());
        sbB.append("}");
        return sbB.toString();
    }

    public final String toString() {
        return d(jso.class.getSimpleName());
    }
}
