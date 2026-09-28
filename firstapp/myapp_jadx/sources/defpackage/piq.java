package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class piq {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final hlr e;
    public final String f;
    public final jrq g;
    public final jrq h;

    public piq(String str, String str2, String str3, String str4, hlr hlrVar, String str5, jrq jrqVar, jrq jrqVar2) {
        str2.getClass();
        str3.getClass();
        hlrVar.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hlrVar;
        this.f = str5;
        this.g = jrqVar;
        this.h = jrqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piq)) {
            return false;
        }
        piq piqVar = (piq) obj;
        return Intrinsics.g(this.a, piqVar.a) && Intrinsics.g(this.b, piqVar.b) && Intrinsics.g(this.c, piqVar.c) && Intrinsics.g(this.d, piqVar.d) && this.e == piqVar.e && Intrinsics.g(this.f, piqVar.f) && Intrinsics.g(this.g, piqVar.g) && Intrinsics.g(this.h, piqVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + gmf0.a((this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNHistoryDetailSelectionState(lotteryName=", this.a, ", drawId=", this.b, ", marketName=");
        hxa.c(sbA, this.c, ", resultDate=", this.d, ", status=");
        sbA.append(this.e);
        sbA.append(", selection=");
        sbA.append(this.f);
        sbA.append(", userResult=");
        sbA.append(this.g);
        sbA.append(", result=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }

    public piq() {
        this(0);
    }

    public /* synthetic */ piq(int i) {
        this("", "", "", "", hlr.VOID, "", new jrq.a(null, null, 3), new jrq.a(null, null, 3));
    }
}
