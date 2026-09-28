package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yi90 {
    public static final yi90 c;
    public final ovk a;
    public final byk b;

    static {
        byk bykVar = byk.j;
        c = new yi90(ovk.f, byk.j);
    }

    public yi90(ovk ovkVar, byk bykVar) {
        ovkVar.getClass();
        bykVar.getClass();
        this.a = ovkVar;
        this.b = bykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi90)) {
            return false;
        }
        yi90 yi90Var = (yi90) obj;
        return Intrinsics.g(this.a, yi90Var.a) && Intrinsics.g(this.b, yi90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimGiftUiState(giftSelectorUiState=" + this.a + ", giftValueEditorUiState=" + this.b + ")";
    }
}
