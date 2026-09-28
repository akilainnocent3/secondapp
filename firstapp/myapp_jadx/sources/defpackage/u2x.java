package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u2x {
    public final int a;
    public final String b;
    public final String c;

    public u2x(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2x)) {
            return false;
        }
        u2x u2xVar = (u2x) obj;
        return this.a == u2xVar.a && Intrinsics.g(this.b, u2xVar.b) && Intrinsics.g(this.c, u2xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(uqe0.a(this.a, "NCCursorEntity(category=", ", forwardCursor=", this.b, ", backwardCursor="), this.c, ")");
    }
}
