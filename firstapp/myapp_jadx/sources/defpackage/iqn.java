package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iqn {
    public final String a;
    public final String b;
    public final List<jqn> c;
    public final List<hqn> d;
    public final List<asn> e;
    public final List<asn> f;
    public final List<csn> g;
    public final List<dsn> h;
    public final List<grn> i;

    public iqn(String str, String str2, List<jqn> list, List<hqn> list2, List<asn> list3, List<asn> list4, List<csn> list5, List<dsn> list6, List<grn> list7) {
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
        if (!(obj instanceof iqn)) {
            return false;
        }
        iqn iqnVar = (iqn) obj;
        return this.a.equals(iqnVar.a) && this.b.equals(iqnVar.b) && Intrinsics.g(this.c, iqnVar.c) && Intrinsics.g(this.d, iqnVar.d) && Intrinsics.g(this.e, iqnVar.e) && Intrinsics.g(this.f, iqnVar.f) && Intrinsics.g(this.g, iqnVar.g) && Intrinsics.g(this.h, iqnVar.h) && Intrinsics.g(this.i, iqnVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantFootballSettleRound(sportId=", this.a, ", roundId=", this.b, ", tickets=");
        qpu.a(", leagues=", ", events=", sbA, this.c, this.d);
        qpu.a(", fillingEvents=", ", markets=", sbA, this.e, this.f);
        qpu.a(", outcomes=", ", betBuilders=", sbA, this.g, this.h);
        return ng1.a(sbA, this.i, ")");
    }
}
