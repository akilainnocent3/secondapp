package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wyy {
    public final int a;
    public final int b;
    public final Long c;

    public wyy(int i, int i2, Long l) {
        this.a = i;
        this.b = i2;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyy)) {
            return false;
        }
        wyy wyyVar = (wyy) obj;
        return this.a == wyyVar.a && this.b == wyyVar.b && Intrinsics.g(this.c, wyyVar.c);
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Long l = this.c;
        return iA + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("OpenBetCounts(openBetCount=", this.a, this.b, ", openBetCountById=", ", lastFetchingTimestamp=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ wyy(int i) {
        this(0, 0, null);
    }

    public wyy() {
        this(0);
    }
}
