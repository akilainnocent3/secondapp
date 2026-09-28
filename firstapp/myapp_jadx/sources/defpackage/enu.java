package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class enu {
    public final tzs a;

    public enu(tzs tzsVar) {
        tzsVar.getClass();
        this.a = tzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enu) && Intrinsics.g(this.a, ((enu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ManageAccountUiStatus(processUiBlockState=" + this.a + ")";
    }

    public enu() {
        this(0);
    }

    public /* synthetic */ enu(int i) {
        this(tzs.a.a);
    }
}
