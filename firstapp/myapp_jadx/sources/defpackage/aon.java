package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class aon {
    public final krp a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public aon(krp krpVar) {
        this.a = krpVar;
    }

    public final Object a(cb30 cb30Var, dq7 dq7Var, cb30 cb30Var2, uf50 uf50Var) {
        String value;
        cb30Var2.getClass();
        StringBuilder sb = new StringBuilder(zgp.a(dq7Var));
        sb.append(':');
        if (cb30Var == null || (value = cb30Var.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(cb30Var2);
        ynn ynnVar = (ynn) this.b.get(sb.toString());
        Object objB = ynnVar != null ? ynnVar.b(uf50Var) : null;
        if (objB == null) {
            return null;
        }
        return objB;
    }
}
