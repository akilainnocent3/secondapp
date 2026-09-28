package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ej {
    public final c330 a;

    public /* synthetic */ ej(int i) {
        this(new c330.a(null, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej) && Intrinsics.g(this.a, ((ej) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddNewAccountUiStatus(nextProgressButtonUiState=" + this.a + ")";
    }

    public ej(c330 c330Var) {
        this.a = c330Var;
    }

    public ej() {
        this(0);
    }
}
