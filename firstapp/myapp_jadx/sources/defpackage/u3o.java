package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u3o implements Serializable {
    public final String a;
    public final String b;
    public final List<w3o> c;
    public final List<v3o> d;
    public final List<u4o> e;
    public final List<w4o> f;
    public final List<x4o> i;

    public u3o(String str, String str2, List<w3o> list, List<v3o> list2, List<u4o> list3, List<w4o> list4, List<x4o> list5) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.i = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3o)) {
            return false;
        }
        u3o u3oVar = (u3o) obj;
        return this.a.equals(u3oVar.a) && this.b.equals(u3oVar.b) && Intrinsics.g(this.c, u3oVar.c) && Intrinsics.g(this.d, u3oVar.d) && Intrinsics.g(this.e, u3oVar.e) && Intrinsics.g(this.f, u3oVar.f) && Intrinsics.g(this.i, u3oVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ai50.a(ai50.a(ai50.a(ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingSettleRound(sportId=", this.a, ", roundId=", this.b, ", tickets=");
        qpu.a(", leagues=", ", events=", sbA, this.c, this.d);
        qpu.a(", markets=", ", outcomes=", sbA, this.e, this.f);
        return ng1.a(sbA, this.i, ")");
    }
}
