package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r5f0 {
    public final String a;
    public final s5f0 b;
    public final String c;

    public r5f0(String str, s5f0 s5f0Var, String str2) {
        s5f0Var.getClass();
        this.a = str;
        this.b = s5f0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5f0)) {
            return false;
        }
        r5f0 r5f0Var = (r5f0) obj;
        return Intrinsics.g(this.a, r5f0Var.a) && Intrinsics.g(this.b, r5f0Var.b) && Intrinsics.g(this.c, r5f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskItem(description=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", url=");
        return uf80.a(sb, this.c, ")");
    }
}
