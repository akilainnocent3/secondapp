package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class avq {
    public final long a;
    public final long b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final ArrayList j;
    public final List<String> k;
    public final ArrayList l;
    public final boolean m;
    public final ArrayList n;

    public avq(long j, long j2, Long l, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, ArrayList arrayList, List list, ArrayList arrayList2, boolean z6, ArrayList arrayList3) {
        list.getClass();
        this.a = j;
        this.b = j2;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = i;
        this.i = z5;
        this.j = arrayList;
        this.k = list;
        this.l = arrayList2;
        this.m = z6;
        this.n = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avq)) {
            return false;
        }
        avq avqVar = (avq) obj;
        return this.a == avqVar.a && this.b == avqVar.b && Intrinsics.g(this.c, avqVar.c) && this.d == avqVar.d && this.e == avqVar.e && this.f == avqVar.f && this.g == avqVar.g && this.h == avqVar.h && this.i == avqVar.i && this.j.equals(avqVar.j) && Intrinsics.g(this.k, avqVar.k) && this.l.equals(avqVar.l) && this.m == avqVar.m && this.n.equals(avqVar.n);
    }

    public final int hashCode() {
        int iA = f87.a(Long.hashCode(this.a) * 31, this.b, 31);
        Long l = this.c;
        return this.n.hashCode() + mtg0.a(vt5.a(this.l, ai50.a(vt5.a(this.j, mtg0.a(gpp.a(this.h, mtg0.a(mtg0.a(mtg0.a(mtg0.a((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31), 31, this.k), 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbA = q6a0.a(this.a, "LNModuleConfig(maxStake=", ", minStake=");
        sbA.append(this.b);
        sbA.append(", maxPayout=");
        sbA.append(this.c);
        u8.a(", giftEnabled=", ", missionEnabled=", sbA, this.d, this.e);
        u8.a(", defaultApplyGift=", ", myNumberEnabled=", sbA, this.f, this.g);
        sbA.append(", maxMyNumberPerLottery=");
        sbA.append(this.h);
        sbA.append(", liveStreamEnable=");
        sbA.append(this.i);
        sbA.append(", bannerImageUrls=");
        sbA.append(this.j);
        sbA.append(", categoryIds=");
        sbA.append(this.k);
        sbA.append(", colors=");
        sbA.append(this.l);
        sbA.append(", showOffEnable=");
        sbA.append(this.m);
        sbA.append(", marketGroups=");
        sbA.append(this.n);
        sbA.append(")");
        return sbA.toString();
    }
}
