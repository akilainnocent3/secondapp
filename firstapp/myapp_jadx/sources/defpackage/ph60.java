package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ph60 {
    public final String a;
    public final cl60 b;

    public ph60(String str, cl60 cl60Var) {
        str.getClass();
        this.a = str;
        this.b = cl60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph60)) {
            return false;
        }
        ph60 ph60Var = (ph60) obj;
        return Intrinsics.g(this.a, ph60Var.a) && this.b.equals(ph60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SGButtonTextData(text=" + this.a + ", color=" + this.b + ')';
    }
}
