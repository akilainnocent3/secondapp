package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class f0e0 {
    public final boolean a;
    public final String b;

    public f0e0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0e0)) {
            return false;
        }
        f0e0 f0e0Var = (f0e0) obj;
        return this.a == f0e0Var.a && this.b.equals(f0e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StepResult(success=" + this.a + ", message=" + this.b + ")";
    }
}
