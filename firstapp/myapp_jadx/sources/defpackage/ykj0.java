package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ykj0 {
    public final boolean a;
    public final boolean b;

    public ykj0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static ykj0 a(ykj0 ykj0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ykj0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = ykj0Var.b;
        }
        ykj0Var.getClass();
        return new ykj0(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykj0)) {
            return false;
        }
        ykj0 ykj0Var = (ykj0) obj;
        return this.a == ykj0Var.a && this.b == ykj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WithdrawButtonState(isEnabled=" + this.a + ", isLoading=" + this.b + ")";
    }

    public ykj0() {
        this(false, false);
    }
}
