package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q880 {
    public final lcl a;
    public final long b;
    public final p880 c;
    public final boolean d;

    public q880(lcl lclVar, long j, p880 p880Var, boolean z) {
        this.a = lclVar;
        this.b = j;
        this.c = p880Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q880)) {
            return false;
        }
        q880 q880Var = (q880) obj;
        return this.a == q880Var.a && gly.c(this.b, q880Var.b) && this.c == q880Var.c && this.d == q880Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + f87.a(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) gly.h(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return ruw.a(sb, this.d, ')');
    }
}
