package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i4k0 {
    public final String a;
    public final String b;
    public final List<j4k0> c;
    public final List<uyj0> d;
    public final List<j6k0> e;
    public final List<j6k0> f;
    public final List<l6k0> g;
    public final List<n6k0> h;
    public final List<r5k0> i;

    public i4k0(String str, String str2, List<j4k0> list, List<uyj0> list2, List<j6k0> list3, List<j6k0> list4, List<l6k0> list5, List<n6k0> list6, List<r5k0> list7) {
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
        if (!(obj instanceof i4k0)) {
            return false;
        }
        i4k0 i4k0Var = (i4k0) obj;
        return this.a.equals(i4k0Var.a) && this.b.equals(i4k0Var.b) && Intrinsics.g(this.c, i4k0Var.c) && Intrinsics.g(this.d, i4k0Var.d) && Intrinsics.g(this.e, i4k0Var.e) && Intrinsics.g(this.f, i4k0Var.f) && Intrinsics.g(this.g, i4k0Var.g) && Intrinsics.g(this.h, i4k0Var.h) && Intrinsics.g(this.i, i4k0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("WorldCupSettleRound(sportId=", this.a, ", roundId=", this.b, ", tickets=");
        qpu.a(", leagues=", ", events=", sbA, this.c, this.d);
        qpu.a(", fillingEvents=", ", markets=", sbA, this.e, this.f);
        qpu.a(", outcomes=", ", betBuilders=", sbA, this.g, this.h);
        return ng1.a(sbA, this.i, ")");
    }
}
