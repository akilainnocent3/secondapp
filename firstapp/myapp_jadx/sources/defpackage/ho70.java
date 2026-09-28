package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ho70 {
    public final b4l a;
    public final int b;
    public final int c;

    public ho70(b4l b4lVar, int i, int i2) {
        this.a = b4lVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho70)) {
            return false;
        }
        ho70 ho70Var = (ho70) obj;
        return this.a == ho70Var.a && this.b == ho70Var.b && this.c == ho70Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScoreChange(goalSymbol=");
        sb.append(this.a);
        sb.append(", currentScore=");
        sb.append(this.b);
        sb.append(", nextScore=");
        return zk1.a(this.c, ")", sb);
    }
}
