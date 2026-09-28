package defpackage;

import java.util.Arrays;
import sl0.d;

/* JADX INFO: loaded from: classes4.dex */
public final class qn0<O extends sl0.d> {
    public final int a;
    public final sl0 b;
    public final sl0.d c;
    public final String d;

    public qn0(sl0 sl0Var, sl0.d dVar, String str) {
        this.b = sl0Var;
        this.c = dVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{sl0Var, dVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn0)) {
            return false;
        }
        qn0 qn0Var = (qn0) obj;
        return scy.a(this.b, qn0Var.b) && scy.a(this.c, qn0Var.c) && scy.a(this.d, qn0Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
