package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ae90 {
    public final boolean a;
    public final s690 b;

    public ae90(boolean z, s690 s690Var) {
        s690Var.getClass();
        this.a = z;
        this.b = s690Var;
    }

    public static ae90 a(ae90 ae90Var, boolean z, s690 s690Var, int i) {
        if ((i & 1) != 0) {
            z = ae90Var.a;
        }
        if ((i & 2) != 0) {
            s690Var = ae90Var.b;
        }
        ae90Var.getClass();
        s690Var.getClass();
        return new ae90(z, s690Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae90)) {
            return false;
        }
        ae90 ae90Var = (ae90) obj;
        return this.a == ae90Var.a && Intrinsics.g(this.b, ae90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SidePanelEditState(isInEditMode=" + this.a + ", shortcutEditGuidance=" + this.b + ")";
    }
}
