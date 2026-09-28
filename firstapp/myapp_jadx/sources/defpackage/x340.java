package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x340 extends x4c {
    public final oh4 a;

    public x340(oh4 oh4Var) {
        this.a = oh4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x340) && Intrinsics.g(this.a, ((x340) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReadyToClaim(session=" + this.a + ')';
    }
}
