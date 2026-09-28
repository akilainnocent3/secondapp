package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class muk0 {
    public final j1l0 a;
    public g3l0 b;
    public final wmk0 c;
    public final gul0 d;

    public muk0() {
        j1l0 j1l0Var = new j1l0();
        this.a = j1l0Var;
        this.b = j1l0Var.b.c();
        this.c = new wmk0();
        this.d = new gul0();
        Callable callable = new Callable() { // from class: jrk0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new dtl0(this.a.d);
            }
        };
        HashMap map = j1l0Var.d.a;
        map.put("internal.registerCallback", callable);
        map.put("internal.eventLogger", new Callable() { // from class: ulk0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new ncl0(this.a.c);
            }
        });
    }

    public final boolean a(qmk0 qmk0Var) throws wwk0 {
        wmk0 wmk0Var = this.c;
        try {
            wmk0Var.a = qmk0Var;
            wmk0Var.b = qmk0Var.clone();
            wmk0Var.c.clear();
            this.a.c.e("runtime.counter", new eok0(Double.valueOf(0.0d)));
            this.d.a(this.b.c(), wmk0Var);
            return (wmk0Var.b.equals(wmk0Var.a) && wmk0Var.c.isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new wwk0(th);
        }
    }

    public final void b(pal0 pal0Var) {
        jok0 jok0Var;
        try {
            j1l0 j1l0Var = this.a;
            this.b = j1l0Var.b.c();
            if (j1l0Var.a(this.b, (wal0[]) pal0Var.q().toArray(new wal0[0])) instanceof ynk0) {
                throw new IllegalStateException("Program loading failed");
            }
            for (aal0 aal0Var : pal0Var.r().q()) {
                List listR = aal0Var.r();
                String strQ = aal0Var.q();
                Iterator it = listR.iterator();
                while (it.hasNext()) {
                    ipk0 ipk0VarA = j1l0Var.a(this.b, (wal0) it.next());
                    if (!(ipk0VarA instanceof vok0)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    g3l0 g3l0Var = this.b;
                    if (g3l0Var.d(strQ)) {
                        ipk0 ipk0VarG = g3l0Var.g(strQ);
                        if (!(ipk0VarG instanceof jok0)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strQ)));
                        }
                        jok0Var = (jok0) ipk0VarG;
                    } else {
                        jok0Var = null;
                    }
                    if (jok0Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strQ)));
                    }
                    jok0Var.g(this.b, Collections.singletonList(ipk0VarA));
                }
            }
        } catch (Throwable th) {
            throw new wwk0(th);
        }
    }
}
