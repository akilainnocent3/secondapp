package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class af10 {
    public final int a;
    public final String b;
    public final boolean c;

    public af10(int i, String str, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af10)) {
            return false;
        }
        af10 af10Var = (af10) obj;
        return this.a == af10Var.a && Intrinsics.g(this.b, af10Var.b) && this.c == af10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(uqe0.a(this.a, "PixQuickInputEntry(amount=", ", label=", this.b, ", isHot="), this.c, ")");
    }
}
