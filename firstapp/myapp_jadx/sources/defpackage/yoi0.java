package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class yoi0 {
    public final String a;
    public final String b;
    public final zoi0 c;

    public /* synthetic */ yoi0(int i) {
        this("0.0", "0.0", new zoi0.a(new ijf0((String) null, 0L, 7), true, true, true, true));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoi0)) {
            return false;
        }
        yoi0 yoi0Var = (yoi0) obj;
        return Intrinsics.g(this.a, yoi0Var.a) && Intrinsics.g(this.b, yoi0Var.b) && Intrinsics.g(this.c, yoi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WDAmountState(max=" + this.a + ", min=" + this.b + ", value=" + this.c + ')';
    }

    public yoi0(String str, String str2, zoi0 zoi0Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = zoi0Var;
    }

    public yoi0() {
        this(0);
    }
}
