package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class nj1 {
    public static final nj1 c = new nj1(true);
    public final boolean a;
    public final int b = 1;

    static {
        new nj1(false);
    }

    public nj1(boolean z) {
        this.a = z;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nj1)) {
            return false;
        }
        nj1 nj1Var = (nj1) obj;
        return this.a == nj1Var.b() && pjh.a(this.b, nj1Var.a()) && !nj1Var.c();
    }

    public final int hashCode() {
        return ((pjh.b(this.b) ^ (((this.a ? 1231 : 1237) ^ 1000003) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "LoggerConfig{enabled=" + this.a + ", minimumSeverity=" + ym80.a(this.b) + ", traceBased=false}";
    }
}
