package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class z8h0 implements cb30 {
    public final String a;

    public z8h0(dq7 dq7Var) {
        this.a = zgp.a(dq7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z8h0.class == obj.getClass() && this.a.equals(((z8h0) obj).a);
    }

    @Override // defpackage.cb30
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
