package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ere0 {
    public final String a;
    public final String b;
    public final fre0 c;

    public /* synthetic */ ere0(int i) {
        this("0.0", "0.0", new fre0.a(new ijf0((String) null, 0L, 7), true, true, true, true));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ere0)) {
            return false;
        }
        ere0 ere0Var = (ere0) obj;
        return Intrinsics.g(this.a, ere0Var.a) && Intrinsics.g(this.b, ere0Var.b) && Intrinsics.g(this.c, ere0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TGAmountState(max=" + this.a + ", min=" + this.b + ", value=" + this.c + ')';
    }

    public ere0(String str, String str2, fre0 fre0Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = fre0Var;
    }

    public ere0() {
        this(0);
    }
}
