package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ei1<T> {
    public final T a;
    public final kw20 b;
    public final ck1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public ei1(Object obj, kw20 kw20Var, ck1 ck1Var) {
        if (obj == 0) {
            bmy.a("Null payload");
            throw null;
        }
        this.a = obj;
        this.b = kw20Var;
        this.c = ck1Var;
    }

    public final ck1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ei1)) {
            return false;
        }
        ei1 ei1Var = (ei1) obj;
        if (!this.a.equals(ei1Var.a) || !this.b.equals(ei1Var.b)) {
            return false;
        }
        ck1 ck1Var = this.c;
        if (ck1Var == null) {
            return ei1Var.a() == null;
        }
        return ck1Var.equals(ei1Var.a());
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        ck1 ck1Var = this.c;
        return ((ck1Var == null ? 0 : ck1Var.hashCode()) ^ iHashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
