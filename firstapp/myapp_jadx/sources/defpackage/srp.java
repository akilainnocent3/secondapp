package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class srp implements r8i0.c {
    public final dq7 a;
    public final qn70 b;
    public final cb30 c;
    public final Function0<wrz> d;

    public srp(dq7 dq7Var, qn70 qn70Var, cb30 cb30Var, Function0 function0) {
        qn70Var.getClass();
        this.a = dq7Var;
        this.b = qn70Var;
        this.c = cb30Var;
        this.d = function0;
    }

    @Override // r8i0.c
    public final j8i0 b(dq7 dq7Var, dsw dswVar) throws sn70 {
        i90 i90Var = new i90(this.d, dswVar);
        qn70 qn70Var = this.b;
        krp krpVar = qn70Var.e;
        j2z j2zVar = krpVar.e;
        j2zVar.getClass();
        Object obj = j2zVar.a.get(qrp.a);
        if (obj == null) {
            obj = null;
        }
        boolean zG = Intrinsics.g(obj, Boolean.TRUE);
        cb30 cb30Var = this.c;
        dq7 dq7Var2 = this.a;
        if (!zG) {
            return (j8i0) qn70Var.a(dq7Var2, i90Var, cb30Var);
        }
        String str = dq7Var.k() + '-' + z7b.d();
        z8h0 z8h0Var = new z8h0(dq7Var);
        z8h0 z8h0Var2 = t8i0.a;
        zn70 zn70Var = krpVar.c;
        ConcurrentHashMap concurrentHashMap = zn70Var.c;
        krp krpVar2 = zn70Var.a;
        b21 b21Var = krpVar2.a;
        b21Var.getClass();
        v6s v6sVar = v6s.a;
        b21Var.f(v6sVar, "| (+) Scope - id:'" + str + "' q:'" + z8h0Var + '\'');
        Set<cb30> set = zn70Var.b;
        if (!set.contains(z8h0Var)) {
            b21 b21Var2 = krpVar2.a;
            b21Var2.getClass();
            b21Var2.f(v6sVar, "| Scope '" + z8h0Var + "' not defined. Creating it ...");
            set.add(z8h0Var);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new sn70(tug.a("Scope with id '", str, "' is already created"));
        }
        qn70 qn70Var2 = new qn70(z8h0Var, str, z8h0Var2, krpVar2, 4);
        qn70[] qn70VarArr = {zn70Var.d};
        if (qn70Var2.c) {
            ib5.a("Can't add scope link to a root scope");
            return null;
        }
        qn70Var2.f.addAll(0, ay0.S(qn70VarArr));
        concurrentHashMap.put(str, qn70Var2);
        j8i0 j8i0Var = (j8i0) qn70Var2.a(dq7Var2, i90Var, cb30Var);
        j8i0Var.addCloseable(new u8i0(str, krpVar));
        return j8i0Var;
    }
}
