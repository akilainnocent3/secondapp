package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tch0 {
    public final boolean a;
    public final k8 b;
    public final tzs c;
    public final tzs d;
    public final tzs e;

    public tch0(boolean z, k8 k8Var, tzs tzsVar, tzs tzsVar2, tzs tzsVar3) {
        k8Var.getClass();
        tzsVar.getClass();
        tzsVar2.getClass();
        tzsVar3.getClass();
        this.a = z;
        this.b = k8Var;
        this.c = tzsVar;
        this.d = tzsVar2;
        this.e = tzsVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tch0)) {
            return false;
        }
        tch0 tch0Var = (tch0) obj;
        return this.a == tch0Var.a && Intrinsics.g(this.b, tch0Var.b) && Intrinsics.g(this.c, tch0Var.c) && Intrinsics.g(this.d, tch0Var.d) && Intrinsics.g(this.e, tch0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UiStatus(shouldShowTutorial=" + this.a + ", accountCreateStatus=" + this.b + ", accountLoadingStatus=" + this.c + ", bankLoadingStatus=" + this.d + ", refreshUiState=" + this.e + ")";
    }

    public tch0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tch0(int i) {
        k8.b bVar = k8.b.a;
        tzs.a aVar = tzs.a.a;
        this(false, bVar, aVar, aVar, aVar);
    }
}
