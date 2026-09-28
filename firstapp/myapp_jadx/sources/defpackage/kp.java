package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kp {
    public final String a;
    public final String b;
    public final List<mp> c;
    public final List<jp> d;
    public final List<ir> e;
    public final List<ir> f;
    public final List<lr> g;
    public final List<nr> h;
    public final List<pq> i;

    public kp(String str, String str2, List<mp> list, List<jp> list2, List<ir> list3, List<ir> list4, List<lr> list5, List<nr> list6, List<pq> list7) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
        this.h = list6;
        this.i = list7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp)) {
            return false;
        }
        kp kpVar = (kp) obj;
        return this.a.equals(kpVar.a) && this.b.equals(kpVar.b) && Intrinsics.g(this.c, kpVar.c) && Intrinsics.g(this.d, kpVar.d) && Intrinsics.g(this.e, kpVar.e) && Intrinsics.g(this.f, kpVar.f) && Intrinsics.g(this.g, kpVar.g) && Intrinsics.g(this.h, kpVar.h) && Intrinsics.g(this.i, kpVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("AfricanCupSettleRound(sportId=", this.a, ", roundId=", this.b, ", tickets=");
        qpu.a(", leagues=", ", events=", sbA, this.c, this.d);
        qpu.a(", fillingEvents=", ", markets=", sbA, this.e, this.f);
        qpu.a(", outcomes=", ", betBuilders=", sbA, this.g, this.h);
        return ng1.a(sbA, this.i, ")");
    }
}
