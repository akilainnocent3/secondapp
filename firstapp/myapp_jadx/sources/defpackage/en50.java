package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class en50 extends x4c {
    public final oh4 a;

    public en50(oh4 oh4Var) {
        this.a = oh4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof en50) && Intrinsics.g(this.a, ((en50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResumeGame(session=" + this.a + ')';
    }
}
