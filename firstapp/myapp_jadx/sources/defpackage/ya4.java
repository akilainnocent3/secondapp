package defpackage;

import com.appsflyer.internal.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ya4 {
    public final qd4.c a;
    public final long b;
    public final boolean c;

    public ya4(qd4.c cVar, long j, boolean z) {
        this.a = cVar;
        this.b = j;
        this.c = z;
    }

    public static ya4 a(ya4 ya4Var, qd4.c cVar, long j, boolean z, int i) {
        if ((i & 1) != 0) {
            cVar = ya4Var.a;
        }
        if ((i & 2) != 0) {
            j = ya4Var.b;
        }
        if ((i & 4) != 0) {
            z = ya4Var.c;
        }
        ya4Var.getClass();
        return new ya4(cVar, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya4)) {
            return false;
        }
        ya4 ya4Var = (ya4) obj;
        return Intrinsics.g(this.a, ya4Var.a) && this.b == ya4Var.b && this.c == ya4Var.c;
    }

    public final int hashCode() {
        qd4.c cVar = this.a;
        return Boolean.hashCode(this.c) + f87.a((cVar == null ? 0 : cVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BioAuthVerificationUiState(cryptoObject=");
        sb.append(this.a);
        sb.append(", verifiedDateInMillis=");
        sb.append(this.b);
        return w.a(sb, ", verifiedSuccess=", this.c, ")");
    }

    public /* synthetic */ ya4(int i) {
        this(null, 0L, false);
    }

    public ya4() {
        this(0);
    }
}
