package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class aol0 {
    public n8l0 a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final /* synthetic */ iol0 e;

    public /* synthetic */ aol0(iol0 iol0Var) {
        this.e = iol0Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb A[RETURN] */
    public final boolean a(long j, d7l0 d7l0Var) {
        int size;
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.isEmpty() || ((((d7l0) this.c.get(0)).v() / 1000) / 60) / 60 == ((d7l0Var.v() / 1000) / 60) / 60) {
            long jA = this.d + ((long) d7l0Var.a());
            iol0 iol0Var = this.e;
            if (!iol0Var.e0().q(null, v2l0.d1)) {
                iol0Var.e0();
                if (jA < Math.max(0, ((Integer) v2l0.j.a(null)).intValue())) {
                    this.d = jA;
                    this.c.add(d7l0Var);
                    this.b.add(Long.valueOf(j));
                    size = this.c.size();
                    iol0Var.e0();
                    if (size < Math.max(1, ((Integer) v2l0.k.a(null)).intValue())) {
                        return true;
                    }
                }
            } else if (this.c.isEmpty()) {
                this.d = jA;
                this.c.add(d7l0Var);
                this.b.add(Long.valueOf(j));
                size = this.c.size();
                iol0Var.e0();
                if (size < Math.max(1, ((Integer) v2l0.k.a(null)).intValue())) {
                    return true;
                }
            } else {
                iol0Var.e0();
                if (jA < Math.max(0, ((Integer) v2l0.j.a(null)).intValue())) {
                    this.d = jA;
                    this.c.add(d7l0Var);
                    this.b.add(Long.valueOf(j));
                    size = this.c.size();
                    iol0Var.e0();
                    if (size < Math.max(1, ((Integer) v2l0.k.a(null)).intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
