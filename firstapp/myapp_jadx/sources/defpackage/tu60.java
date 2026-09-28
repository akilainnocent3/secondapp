package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tu60 {
    public final c330 a;
    public final tzs b;

    public /* synthetic */ tu60(c330.a aVar, int i) {
        this((i & 1) != 0 ? new c330.a(null, false) : aVar, tzs.a.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu60)) {
            return false;
        }
        tu60 tu60Var = (tu60) obj;
        return Intrinsics.g(this.a, tu60Var.a) && Intrinsics.g(this.b, tu60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SavedAssetsUiStatus(nextProgressButtonUiState=" + this.a + ", processUiBlockState=" + this.b + ")";
    }

    public tu60(c330 c330Var, tzs tzsVar) {
        c330Var.getClass();
        tzsVar.getClass();
        this.a = c330Var;
        this.b = tzsVar;
    }

    public tu60() {
        this((c330.a) null, 3);
    }
}
