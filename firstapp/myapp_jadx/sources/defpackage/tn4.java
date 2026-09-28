package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class tn4 {
    public final int a;
    public final ek4 b;
    public final bk4 c;

    public tn4(int i, ek4 ek4Var, bk4 bk4Var) {
        this.a = i;
        this.b = ek4Var;
        this.c = bk4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn4)) {
            return false;
        }
        tn4 tn4Var = (tn4) obj;
        return this.a == tn4Var.a && this.b == tn4Var.b && this.c == tn4Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BonusCupPendingGameplayEvent(objectId=" + this.a + ", objectType=" + this.b + ", eventType=" + this.c + ')';
    }
}
