package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mli0 {
    public final fqo a;
    public final qgi0 b;
    public final uji0 c;
    public final boolean d;

    public mli0(fqo fqoVar, qgi0 qgi0Var, uji0 uji0Var, boolean z) {
        qgi0Var.getClass();
        this.a = fqoVar;
        this.b = qgi0Var;
        this.c = uji0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mli0)) {
            return false;
        }
        mli0 mli0Var = (mli0) obj;
        return this.a.equals(mli0Var.a) && Intrinsics.g(this.b, mli0Var.b) && Intrinsics.g(this.c, mli0Var.c) && this.d == mli0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        uji0 uji0Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (uji0Var == null ? 0 : uji0Var.a.hashCode())) * 31);
    }

    public final String toString() {
        return "VirtualLobbyUiState(topAppBarState=" + this.a + ", contentStatus=" + this.b + ", getStartedBottomSheetUiState=" + this.c + ", showBuildAndGoEntrySheet=" + this.d + ")";
    }
}
