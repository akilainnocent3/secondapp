package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c95 {
    public final String a;
    public final p85 b;
    public final d85 c;

    public c95(String str, p85 p85Var, d85 d85Var) {
        p85Var.getClass();
        d85Var.getClass();
        this.a = str;
        this.b = p85Var;
        this.c = d85Var;
    }

    public static c95 a(c95 c95Var, String str, p85 p85Var, d85 d85Var, int i) {
        if ((i & 1) != 0) {
            str = c95Var.a;
        }
        if ((i & 2) != 0) {
            p85Var = c95Var.b;
        }
        if ((i & 4) != 0) {
            d85Var = c95Var.c;
        }
        c95Var.getClass();
        str.getClass();
        p85Var.getClass();
        d85Var.getClass();
        return new c95(str, p85Var, d85Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c95)) {
            return false;
        }
        c95 c95Var = (c95) obj;
        return Intrinsics.g(this.a, c95Var.a) && Intrinsics.g(this.b, c95Var.b) && Intrinsics.g(this.c, c95Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BrRegistrationSuccessfulUiState(userName=" + this.a + ", sheetState=" + this.b + ", loyaltyState=" + this.c + ")";
    }

    public c95() {
        this(0);
    }

    public /* synthetic */ c95(int i) {
        this("", p85.c.a, d85.b.a);
    }
}
