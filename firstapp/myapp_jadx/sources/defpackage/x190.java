package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x190 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final Uri g;
    public final Uri h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final q190 l;
    public final String m;
    public final String n;
    public final String o;

    public x190(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, Uri uri3, String str6, boolean z, boolean z2, q190 q190Var, String str7, String str8, String str9) {
        q190Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = uri;
        this.g = uri2;
        this.h = uri3;
        this.i = str6;
        this.j = z;
        this.k = z2;
        this.l = q190Var;
        this.m = str7;
        this.n = str8;
        this.o = str9;
    }

    public static x190 a(x190 x190Var, String str, String str2, Uri uri, String str3, boolean z, int i) {
        String str4 = (i & 1) != 0 ? x190Var.a : str;
        String str5 = x190Var.b;
        String str6 = (i & 4) != 0 ? x190Var.c : str2;
        String str7 = x190Var.d;
        String str8 = x190Var.e;
        Uri uri2 = (i & 32) != 0 ? x190Var.f : uri;
        Uri uri3 = x190Var.g;
        Uri uri4 = x190Var.h;
        String str9 = (i & 256) != 0 ? x190Var.i : str3;
        boolean z2 = (i & 512) != 0 ? x190Var.j : z;
        boolean z3 = x190Var.k;
        q190 q190Var = x190Var.l;
        String str10 = x190Var.m;
        String str11 = x190Var.n;
        String str12 = x190Var.o;
        x190Var.getClass();
        q190Var.getClass();
        return new x190(str4, str5, str6, str7, str8, uri2, uri3, uri4, str9, z2, z3, q190Var, str10, str11, str12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x190)) {
            return false;
        }
        x190 x190Var = (x190) obj;
        return Intrinsics.g(this.a, x190Var.a) && Intrinsics.g(this.b, x190Var.b) && Intrinsics.g(this.c, x190Var.c) && Intrinsics.g(this.d, x190Var.d) && Intrinsics.g(this.e, x190Var.e) && Intrinsics.g(this.f, x190Var.f) && Intrinsics.g(this.g, x190Var.g) && Intrinsics.g(this.h, x190Var.h) && Intrinsics.g(this.i, x190Var.i) && this.j == x190Var.j && this.k == x190Var.k && this.l == x190Var.l && Intrinsics.g(this.m, x190Var.m) && Intrinsics.g(this.n, x190Var.n) && Intrinsics.g(this.o, x190Var.o);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Uri uri = this.f;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.g;
        int iHashCode7 = (iHashCode6 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.h;
        int iHashCode8 = (iHashCode7 + (uri3 == null ? 0 : uri3.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode9 = (this.l.hashCode() + mtg0.a(mtg0.a((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.j), 31, this.k)) * 31;
        String str7 = this.m;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ShareVmState(linkUrl=", this.a, ", orderId=", this.b, ", shareCode=");
        hxa.c(sbA, this.c, ", source=", this.d, ", startDestination=");
        sbA.append(this.e);
        sbA.append(", imageUri=");
        sbA.append(this.f);
        sbA.append(", parserTicketUri=");
        sbA.append(this.g);
        sbA.append(", parserWonUri=");
        sbA.append(this.h);
        sbA.append(", userNote=");
        uts.b(this.i, ", isUserNoteEnabled=", ", isSingleBetBuilder=", sbA, this.j);
        sbA.append(this.k);
        sbA.append(", shareSourceType=");
        sbA.append(this.l);
        sbA.append(", description=");
        hxa.c(sbA, this.m, ", hashtag=", this.n, ", quote=");
        return uf80.a(sbA, this.o, ")");
    }
}
