package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ep70 {
    public final int a;
    public final int b;
    public final boolean c;

    public ep70(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep70)) {
            return false;
        }
        ep70 ep70Var = (ep70) obj;
        return this.a == ep70Var.a && this.b == ep70Var.b && this.c == ep70Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return mq0.a(dy5.a("ScrollData(index=", this.a, this.b, ", offset=", ", isAnimate="), this.c, ")");
    }
}
