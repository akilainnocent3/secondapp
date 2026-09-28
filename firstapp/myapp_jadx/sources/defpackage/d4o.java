package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d4o {
    public final boolean a;
    public final String b;
    public final String c;
    public final vsn d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final ltn h;
    public final List<nwn> i;
    public final List<own> j;
    public final mwn k;

    public d4o(boolean z, String str, String str2, vsn vsnVar, long j, boolean z2, boolean z3, ltn ltnVar, List<nwn> list, List<own> list2, mwn mwnVar) {
        ltnVar.getClass();
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = vsnVar;
        this.e = j;
        this.f = z2;
        this.g = z3;
        this.h = ltnVar;
        this.i = list;
        this.j = list2;
        this.k = mwnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4o)) {
            return false;
        }
        d4o d4oVar = (d4o) obj;
        return this.a == d4oVar.a && this.b.equals(d4oVar.b) && this.c.equals(d4oVar.c) && this.d.equals(d4oVar.d) && this.e == d4oVar.e && this.f == d4oVar.f && this.g == d4oVar.g && Intrinsics.g(this.h, d4oVar.h) && Intrinsics.g(this.i, d4oVar.i) && Intrinsics.g(this.j, d4oVar.j) && Intrinsics.g(this.k, d4oVar.k);
    }

    public final int hashCode() {
        int iA = ai50.a(ai50.a((this.h.hashCode() + mtg0.a(mtg0.a(f87.a((this.d.hashCode() + gmf0.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, this.e, 31), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j);
        mwn mwnVar = this.k;
        return iA + (mwnVar == null ? 0 : mwnVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = t160.a("InstantRacingSportConfig(active=", ", sportId=", this.b, ", backgroundUrl=", this.a);
        sbA.append(this.c);
        sbA.append(", betLimitInfo=");
        sbA.append(this.d);
        sbA.append(", keepBetLimit=");
        sbA.append(this.e);
        sbA.append(", statsEnabled=");
        sbA.append(this.f);
        sbA.append(", giftEnabled=");
        sbA.append(this.g);
        sbA.append(", bonusType=");
        sbA.append(this.h);
        qjk.a(", gameTypes=", ", leagues=", sbA, this.i, this.j);
        sbA.append(", feature=");
        sbA.append(this.k);
        sbA.append(")");
        return sbA.toString();
    }
}
