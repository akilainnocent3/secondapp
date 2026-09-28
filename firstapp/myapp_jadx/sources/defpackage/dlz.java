package defpackage;

import com.sportygames.crash.models.header.snc.OdQr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dlz {
    public final int a;
    public final String b;
    public final String c;
    public final double d;
    public final vkz e;
    public final double f;
    public final String g;
    public final String h;
    public final boolean i;
    public final double j;
    public final double k;
    public final double l;

    public dlz(int i, String str, String str2, double d, vkz vkzVar, double d2, String str3, String str4, boolean z, double d3, double d4, double d5) {
        wd7.a(str, str2, str3, str4);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = vkzVar;
        this.f = d2;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = d3;
        this.k = d4;
        this.l = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlz)) {
            return false;
        }
        dlz dlzVar = (dlz) obj;
        return this.a == dlzVar.a && Intrinsics.g(this.b, dlzVar.b) && Intrinsics.g(this.c, dlzVar.c) && Double.compare(this.d, dlzVar.d) == 0 && this.e == dlzVar.e && Double.compare(this.f, dlzVar.f) == 0 && Intrinsics.g(this.g, dlzVar.g) && Intrinsics.g(this.h, dlzVar.h) && this.i == dlzVar.i && Double.compare(this.j, dlzVar.j) == 0 && Double.compare(this.k, dlzVar.k) == 0 && Double.compare(this.l, dlzVar.l) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.l) + nrg0.a(nrg0.a(mtg0.a(gmf0.a(gmf0.a(nrg0.a((this.e.hashCode() + nrg0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBHistoryRecord(id=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", date=");
        sb.append(this.c);
        sb.append(", stake=");
        sb.append(this.d);
        sb.append(", status=");
        sb.append(this.e);
        sb.append(", amount=");
        sb.append(this.f);
        sb.append(", ticketId=");
        sb.append(this.g);
        sb.append(", roundId=");
        sb.append(this.h);
        sb.append(OdQr.mVyX);
        sb.append(this.i);
        sb.append(", majorPrize=");
        sb.append(this.j);
        sb.append(", minorPrize=");
        sb.append(this.k);
        sb.append(", flyAwayBonus=");
        return org0.a(sb, this.l, ')');
    }
}
