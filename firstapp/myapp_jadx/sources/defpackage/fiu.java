package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fiu extends d58 {
    public final j48 a;

    public fiu(j48 j48Var) {
        this.a = j48Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fiu) && Intrinsics.g(this.a, ((fiu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Main(collectionsUiModel=" + this.a + ')';
    }
}
