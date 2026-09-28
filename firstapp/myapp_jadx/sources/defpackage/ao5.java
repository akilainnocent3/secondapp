package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ao5 {
    public final int a;
    public final String b;
    public final String c;

    public ao5(int i, String str, String str2) {
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
        if (!(obj instanceof ao5)) {
            return false;
        }
        ao5 ao5Var = (ao5) obj;
        return this.a == ao5Var.a && Intrinsics.g(this.b, ao5Var.b) && Intrinsics.g(this.c, ao5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(uqe0.a(this.a, "CMSLanguageInfo(id=", ", code=", this.b, ", name="), this.c, ")");
    }
}
