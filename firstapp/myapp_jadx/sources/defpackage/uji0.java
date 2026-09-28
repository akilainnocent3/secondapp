package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uji0 {
    public final qcn<tji0> a;

    public uji0(uf00 uf00Var) {
        uf00Var.getClass();
        this.a = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uji0) && Intrinsics.g(this.a, ((uji0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vf5.a(this.a, "VirtualLobbyGetStartedUiState(tabStates=", ")");
    }
}
