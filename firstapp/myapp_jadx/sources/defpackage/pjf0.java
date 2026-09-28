package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pjf0 {
    public static final pjf0 c = new pjf0(d2l.f(0), d2l.f(0));
    public final long a;
    public final long b;

    public pjf0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjf0)) {
            return false;
        }
        pjf0 pjf0Var = (pjf0) obj;
        return omf0.a(this.a, pjf0Var.a) && omf0.a(this.b, pjf0Var.b);
    }

    public final int hashCode() {
        pmf0[] pmf0VarArr = omf0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) omf0.f(this.a)) + ", restLine=" + ((Object) omf0.f(this.b)) + ')';
    }
}
