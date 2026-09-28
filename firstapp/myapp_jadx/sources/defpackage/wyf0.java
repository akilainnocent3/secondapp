package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wyf0 {
    public final vyf0 a;

    public wyf0(vyf0 vyf0Var) {
        vyf0Var.getClass();
        this.a = vyf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyf0) && Intrinsics.g(this.a, ((wyf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToastUiInfoState(hint=" + this.a + ")";
    }
}
