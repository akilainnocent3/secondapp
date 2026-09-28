package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class gdc {
    public final int a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final CountryCodeName e;
    public final Double f;
    public final Integer g;
    public final String h;
    public final Long i;
    public final Long j;
    public final List<idc> k;
    public final boolean l;
    public final boolean m;
    public final g8c n;
    public final z320 o;
    public final boolean p;

    public gdc(int i, String str, String str2, Boolean bool, CountryCodeName countryCodeName, Double d, Integer num, String str3, Long l, Long l2, List list, boolean z, g8c.a aVar, z320 z320Var, boolean z2, int i2) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : countryCodeName, (i2 & 32) != 0 ? null : d, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : l, (i2 & 512) != 0 ? null : l2, (List<idc>) ((i2 & 1024) != 0 ? m2g.a : list), (i2 & 2048) != 0 ? false : z, false, (g8c) ((i2 & 8192) != 0 ? null : aVar), (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? z320.SAFE : z320Var, (i2 & 32768) != 0 ? false : z2);
    }

    public static gdc a(gdc gdcVar, boolean z, boolean z2, g8c g8cVar, int i) {
        int i2 = gdcVar.a;
        String str = gdcVar.b;
        String str2 = gdcVar.c;
        Boolean bool = gdcVar.d;
        CountryCodeName countryCodeName = gdcVar.e;
        Double d = gdcVar.f;
        Integer num = gdcVar.g;
        String str3 = gdcVar.h;
        Long l = gdcVar.i;
        Long l2 = gdcVar.j;
        List<idc> list = gdcVar.k;
        boolean z3 = (i & 2048) != 0 ? gdcVar.l : z;
        boolean z4 = (i & 4096) != 0 ? gdcVar.m : z2;
        g8c g8cVar2 = (i & 8192) != 0 ? gdcVar.n : g8cVar;
        z320 z320Var = gdcVar.o;
        g8c g8cVar3 = g8cVar2;
        boolean z5 = gdcVar.p;
        gdcVar.getClass();
        str.getClass();
        z320Var.getClass();
        return new gdc(i2, str, str2, bool, countryCodeName, d, num, str3, l, l2, list, z3, z4, g8cVar3, z320Var, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdc)) {
            return false;
        }
        gdc gdcVar = (gdc) obj;
        return this.a == gdcVar.a && Intrinsics.g(this.b, gdcVar.b) && Intrinsics.g(this.c, gdcVar.c) && Intrinsics.g(this.d, gdcVar.d) && this.e == gdcVar.e && Intrinsics.g(this.f, gdcVar.f) && Intrinsics.g(this.g, gdcVar.g) && Intrinsics.g(this.h, gdcVar.h) && Intrinsics.g(this.i, gdcVar.i) && Intrinsics.g(this.j, gdcVar.j) && Intrinsics.g(this.k, gdcVar.k) && this.l == gdcVar.l && this.m == gdcVar.m && Intrinsics.g(this.n, gdcVar.n) && this.o == gdcVar.o && this.p == gdcVar.p;
    }

    public final int hashCode() {
        int iA = gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CountryCodeName countryCodeName = this.e;
        int iHashCode3 = (iHashCode2 + (countryCodeName == null ? 0 : countryCodeName.hashCode())) * 31;
        Double d = this.f;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.i;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.j;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<idc> list = this.k;
        int iA2 = mtg0.a(mtg0.a((iHashCode8 + (list == null ? 0 : list.hashCode())) * 31, 31, this.l), 31, this.m);
        g8c g8cVar = this.n;
        return Boolean.hashCode(this.p) + ((this.o.hashCode() + ((iA2 + (g8cVar != null ? g8cVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "CustomCode(id=", ", aliasCode=", this.b, ", shareCode=");
        x03.a(sbA, this.c, ", shareCodeValid=", this.d, ", countryCode=");
        sbA.append(this.e);
        sbA.append(", totalOdds=");
        sbA.append(this.f);
        sbA.append(", foldsAmount=");
        w03.a(this.g, ", userId=", this.h, ", deadline=", sbA);
        sbA.append(this.i);
        sbA.append(", createTime=");
        sbA.append(this.j);
        sbA.append(", shareCodeDetail=");
        sbA.append(this.k);
        sbA.append(", watchEdit=");
        sbA.append(this.l);
        sbA.append(", isCodeLoading=");
        sbA.append(this.m);
        sbA.append(", error=");
        sbA.append(this.n);
        sbA.append(", popularityLevel=");
        sbA.append(this.o);
        sbA.append(", isCreatorCode=");
        sbA.append(this.p);
        sbA.append(")");
        return sbA.toString();
    }

    public gdc(int i, String str, String str2, Boolean bool, CountryCodeName countryCodeName, Double d, Integer num, String str3, Long l, Long l2, List<idc> list, boolean z, boolean z2, g8c g8cVar, z320 z320Var, boolean z3) {
        str.getClass();
        z320Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = countryCodeName;
        this.f = d;
        this.g = num;
        this.h = str3;
        this.i = l;
        this.j = l2;
        this.k = list;
        this.l = z;
        this.m = z2;
        this.n = g8cVar;
        this.o = z320Var;
        this.p = z3;
    }
}
