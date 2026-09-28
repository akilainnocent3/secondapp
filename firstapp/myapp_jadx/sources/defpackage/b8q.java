package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b8q {
    public final a8q a;
    public final boolean b;
    public final boolean c;
    public final q7q.b d;
    public final boolean e;

    public b8q(a8q a8qVar, boolean z, q7q.b bVar, int i) {
        a8qVar = (i & 1) != 0 ? a8q.d.a : a8qVar;
        boolean z2 = (i & 2) == 0;
        z = (i & 4) != 0 ? false : z;
        bVar = (i & 8) != 0 ? null : bVar;
        boolean z3 = (i & 16) == 0;
        a8qVar.getClass();
        this.a = a8qVar;
        this.b = z2;
        this.c = z;
        this.d = bVar;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8q)) {
            return false;
        }
        b8q b8qVar = (b8q) obj;
        return Intrinsics.g(this.a, b8qVar.a) && this.b == b8qVar.b && this.c == b8qVar.c && Intrinsics.g(this.d, b8qVar.d) && this.e == b8qVar.e;
    }

    public final int hashCode() {
        int iA = mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        q7q.b bVar = this.d;
        return Boolean.hashCode(this.e) + ((iA + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNFeatureMatchCardsState(content=");
        sb.append(this.a);
        sb.append(", isTabSelected=");
        sb.append(this.b);
        sb.append(", isFeatureEnabled=");
        sb.append(this.c);
        sb.append(", featureMatch=");
        sb.append(this.d);
        sb.append(", isConfigDisabled=");
        return mq0.a(sb, this.e, ")");
    }

    public b8q() {
        this(null, false, null, 31);
    }
}
