package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b2v {
    public final List<ieo> a;
    public final List<xfo> b;

    public b2v(List<ieo> list, List<xfo> list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2v)) {
            return false;
        }
        b2v b2vVar = (b2v) obj;
        return Intrinsics.g(this.a, b2vVar.a) && Intrinsics.g(this.b, b2vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return w9d.a("MatchEventDetailSessionData(events=", ", leagues=", ")", this.a, this.b);
    }
}
