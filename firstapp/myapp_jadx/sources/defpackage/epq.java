package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class epq {
    public final hpq a;
    public final y5q b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ epq(hpq hpqVar, int i) {
        this((i & 1) != 0 ? gsq.b.a : hpqVar, y5q.a.a, (i & 4) == 0, (i & 8) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epq)) {
            return false;
        }
        epq epqVar = (epq) obj;
        return Intrinsics.g(this.a, epqVar.a) && Intrinsics.g(this.b, epqVar.b) && this.c == epqVar.c && this.d == epqVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNLobbyState(tabState=");
        sb.append(this.a);
        sb.append(", drawInfoState=");
        sb.append(this.b);
        sb.append(", showSearchIcon=");
        return lng.a(", showRewardCenter=", ")", sb, this.c, this.d);
    }

    public epq(hpq hpqVar, y5q y5qVar, boolean z, boolean z2) {
        hpqVar.getClass();
        y5qVar.getClass();
        this.a = hpqVar;
        this.b = y5qVar;
        this.c = z;
        this.d = z2;
    }

    public epq() {
        this(null, 15);
    }
}
