package defpackage;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;

/* JADX INFO: loaded from: classes.dex */
public final class ok1 {
    public final ml1 a;
    public final String b;
    public final ei1 c;
    public final xsg0<?, byte[]> d;
    public final j4g e;

    public ok1(ml1 ml1Var, String str, ei1 ei1Var, xsg0 xsg0Var, j4g j4gVar) {
        this.a = ml1Var;
        this.b = str;
        this.c = ei1Var;
        this.d = xsg0Var;
        this.e = j4gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ok1)) {
            return false;
        }
        ok1 ok1Var = (ok1) obj;
        return this.a.equals(ok1Var.a) && this.b.equals(ok1Var.b) && this.c.equals(ok1Var.c) && this.d.equals(ok1Var.d) && this.e.equals(ok1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + vZBMKENANSz.pyhHcJOLKy + this.e + "}";
    }
}
