package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sjd {
    public final String a;
    public final tre0 b;

    public sjd(String str, tre0 tre0Var) {
        str.getClass();
        this.a = str;
        this.b = tre0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjd)) {
            return false;
        }
        sjd sjdVar = (sjd) obj;
        return Intrinsics.g(this.a, sjdVar.a) && this.b == sjdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeferredKey(animationName=" + this.a + ", type=" + this.b + ')';
    }
}
