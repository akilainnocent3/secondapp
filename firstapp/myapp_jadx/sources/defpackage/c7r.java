package defpackage;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c7r {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final glq e;
    public final String f;
    public final l6r g;
    public final qcn<jer> h;

    public c7r(String str, String str2, String str3, boolean z, glq glqVar, String str4, l6r l6rVar, qcn<jer> qcnVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        glqVar.getClass();
        l6rVar.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = glqVar;
        this.f = str4;
        this.g = l6rVar;
        this.h = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7r)) {
            return false;
        }
        c7r c7rVar = (c7r) obj;
        return Intrinsics.g(this.a, c7rVar.a) && Intrinsics.g(this.b, c7rVar.b) && Intrinsics.g(this.c, c7rVar.c) && this.d == c7rVar.d && Intrinsics.g(this.e, c7rVar.e) && this.f.equals(c7rVar.f) && Intrinsics.g(this.g, c7rVar.g) && Intrinsics.g(this.h, c7rVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + gmf0.a((this.e.hashCode() + mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a(vZBMKENANSz.fSXViKpcZ, this.a, ", lotteryId=", this.b, ", name=");
        uts.b(this.c, ", isFavorite=", ", countryFlag=", sbA, this.d);
        sbA.append(this.e);
        sbA.append(", drawTime=");
        sbA.append(this.f);
        sbA.append(", results=");
        sbA.append(this.g);
        sbA.append(", stream=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
