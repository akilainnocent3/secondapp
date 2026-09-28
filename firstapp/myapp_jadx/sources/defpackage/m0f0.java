package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0f0 {
    public final gxe0 a;
    public final ove0 b;

    public m0f0(gxe0 gxe0Var, ove0 ove0Var) {
        gxe0Var.getClass();
        ove0Var.getClass();
        this.a = gxe0Var;
        this.b = ove0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0f0)) {
            return false;
        }
        m0f0 m0f0Var = (m0f0) obj;
        return Intrinsics.g(this.a, m0f0Var.a) && Intrinsics.g(this.b, m0f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TGUIState(loadingState=" + this.a + ", dialogState=" + this.b + ')';
    }

    public m0f0() {
        this(0);
    }

    public /* synthetic */ m0f0(int i) {
        this(new gxe0.b(0.0f), ove0.c.a);
    }
}
