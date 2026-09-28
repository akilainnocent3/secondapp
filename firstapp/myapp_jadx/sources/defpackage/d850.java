package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d850 {
    public static final d850 c = new d850(0, false);
    public final int a;
    public final boolean b;

    public d850(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d850.class != obj.getClass()) {
            return false;
        }
        d850 d850Var = (d850) obj;
        return this.a == d850Var.a && this.b == d850Var.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
