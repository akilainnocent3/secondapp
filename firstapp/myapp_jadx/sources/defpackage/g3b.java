package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class g3b {
    public final krp a;
    public final ArrayList<wf50> b = new ArrayList<>();

    public g3b(krp krpVar) {
        this.a = krpVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    public final <T> T a(qn70 qn70Var, uf50 uf50Var, boolean z) {
        T t;
        T t2;
        uf50 uf50Var2;
        cb30 cb30Var = qn70Var.a;
        aon aonVar = this.a.d;
        wrz wrzVar = uf50Var.e;
        cb30 cb30Var2 = uf50Var.d;
        String str = uf50Var.f;
        dq7 dq7Var = uf50Var.c;
        b21 b21Var = uf50Var.a;
        if (wrzVar == null || wrzVar.a.isEmpty()) {
            t = null;
        } else {
            b21Var.getClass();
            b21Var.f(v6s.a, "|- ? " + str + " look in injected parameters");
            t = (T) wrzVar.a(dq7Var);
        }
        if (t != null) {
            return t;
        }
        boolean z2 = qn70Var.c;
        T t3 = (T) aonVar.a(cb30Var2, dq7Var, cb30Var, uf50Var);
        if (t3 == null) {
            ThreadLocal<gx0<wrz>> threadLocal = qn70Var.g;
            gx0<wrz> gx0Var = threadLocal != null ? threadLocal.get() : null;
            if (gx0Var == null || gx0Var.isEmpty()) {
                t3 = null;
            } else {
                b21Var.getClass();
                b21Var.f(v6s.a, "|- ? " + str + " look in stack parameters");
                wrz wrzVarF = gx0Var.f();
                if (wrzVarF != null) {
                    t3 = (T) wrzVarF.a(dq7Var);
                } else {
                    t3 = null;
                }
            }
            if (t3 == null) {
                if (z2 || !(cb30Var instanceof z8h0)) {
                    t2 = null;
                } else {
                    b21Var.getClass();
                    b21Var.f(v6s.a, "|- ? " + str + " look at scope archetype");
                    aonVar.getClass();
                    z8h0 z8h0Var = uf50Var.b.d;
                    if (z8h0Var != null) {
                        uf50Var.g = z8h0Var;
                        t2 = (T) aonVar.a(cb30Var2, dq7Var, z8h0Var, uf50Var);
                    } else {
                        t2 = null;
                    }
                }
                if (t2 != null) {
                    return t2;
                }
                int i = 0;
                if (!z) {
                    ArrayList<wf50> arrayList = this.b;
                    int size = arrayList.size();
                    while (i < size) {
                        wf50 wf50Var = arrayList.get(i);
                        i++;
                        wf50 wf50Var2 = wf50Var;
                        String str2 = "|- ['" + wf50Var2.getName() + "'] ?";
                        b21Var.getClass();
                        b21Var.f(v6s.a, str2);
                        T t4 = (T) wf50Var2.a();
                        if (t4 != null) {
                            return t4;
                        }
                    }
                } else if (!z2) {
                    b21Var.getClass();
                    b21Var.f(v6s.a, "|- ? " + str + " look in other scopes");
                    ArrayList<qn70> arrayList2 = qn70Var.f;
                    LinkedHashSet<qn70> linkedHashSet = new LinkedHashSet();
                    gx0 gx0Var2 = new gx0(new ep50(arrayList2));
                    while (!gx0Var2.isEmpty()) {
                        qn70 qn70Var2 = (qn70) gx0Var2.removeLast();
                        if (linkedHashSet.add(qn70Var2)) {
                            Iterator<qn70> it = qn70Var2.f.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                qn70 next = it.next();
                                next.getClass();
                                qn70 qn70Var3 = next;
                                if (!linkedHashSet.contains(qn70Var3)) {
                                    gx0Var2.addLast(qn70Var3);
                                }
                            }
                        }
                    }
                    for (qn70 qn70Var4 : linkedHashSet) {
                        b21Var.f(v6s.a, j26.a(he.a("|- ? ", str, " look in scope '"), qn70Var4.b, '\''));
                        if (qn70Var4.c) {
                            uf50Var2 = uf50Var;
                        } else {
                            uf50Var2 = new uf50(uf50Var.a, qn70Var4, dq7Var, uf50Var.d, uf50Var.e);
                            uf50Var2.g = qn70Var4.d;
                        }
                        T t5 = (T) a(qn70Var4, uf50Var2, false);
                        if (t5 != null) {
                            return t5;
                        }
                    }
                }
                return null;
            }
        }
        return t3;
    }
}
