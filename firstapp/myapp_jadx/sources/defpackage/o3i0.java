package defpackage;

import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o3i0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public final List<e3i0> g;
    public final String h;
    public final String i;

    public o3i0(String str, String str2, String str3, int i, long j, String str4, List<e3i0> list, String str5, String str6) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = j;
        this.f = str4;
        this.g = list;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3i0)) {
            return false;
        }
        o3i0 o3i0Var = (o3i0) obj;
        return Intrinsics.g(this.a, o3i0Var.a) && this.b.equals(o3i0Var.b) && this.c.equals(o3i0Var.c) && this.d == o3i0Var.d && this.e == o3i0Var.e && this.f.equals(o3i0Var.f) && Intrinsics.g(this.g, o3i0Var.g) && Intrinsics.g(this.h, o3i0Var.h) && Intrinsics.g(this.i, o3i0Var.i);
    }

    public final int hashCode() {
        int iA = ai50.a(gmf0.a(f87.a(gpp.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), this.e, 31), 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("VideoDetail(id=", this.a, ", title=", this.b, ", description=");
        wxa.b(this.d, this.c, ", duration=", ", publishedTime=", sbA);
        em5.a(this.e, ", byLine=", this.f, sbA);
        sbA.append(", videoSources=");
        sbA.append(this.g);
        sbA.append(rarBonoqWB.BBJzqX);
        sbA.append(this.h);
        return pr0.a(sbA, ", sportName=", this.i, ")");
    }
}
