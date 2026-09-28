package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class dn50 extends c5c {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f;

    public dn50(long j, int i, int i2, int i3, ArrayList arrayList, ArrayList arrayList2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = arrayList;
        this.f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn50)) {
            return false;
        }
        dn50 dn50Var = (dn50) obj;
        return this.a == dn50Var.a && this.b == dn50Var.b && this.c == dn50Var.c && this.d == dn50Var.d && Intrinsics.g(this.e, dn50Var.e) && Intrinsics.g(this.f, dn50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + vt5.a(this.e, gpp.a(this.d, gpp.a(this.c, gpp.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "ResumeGame(sessionId=" + this.a + ", rowsCount=" + this.b + ", columnsCount=" + this.c + ", currentRound=" + this.d + ", stackedRows=" + this.e + ", rowConfiguration=" + this.f + ')';
    }
}
