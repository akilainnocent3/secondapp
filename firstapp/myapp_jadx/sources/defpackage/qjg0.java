package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qjg0 {
    public final jjg0 a;
    public final pcn<Integer> b;

    static {
        jrh0.J(0);
        jrh0.J(1);
    }

    public qjg0(jjg0 jjg0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= jjg0Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = jjg0Var;
        this.b = pcn.j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qjg0.class == obj.getClass()) {
            qjg0 qjg0Var = (qjg0) obj;
            if (this.a.equals(qjg0Var.a) && this.b.equals(qjg0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
