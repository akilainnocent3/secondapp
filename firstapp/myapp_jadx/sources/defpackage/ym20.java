package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym20 {
    public final String a;
    public final Long b;

    public ym20(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym20)) {
            return false;
        }
        ym20 ym20Var = (ym20) obj;
        return this.a.equals(ym20Var.a) && this.b.equals(ym20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
