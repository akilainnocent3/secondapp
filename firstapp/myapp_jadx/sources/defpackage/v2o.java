package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v2o {
    public final int a;
    public final int b;
    public final String c;
    public final qcn<Integer> d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;

    public v2o(int i, int i2, String str, qcn<Integer> qcnVar, int i3, String str2, String str3, String str4) {
        qcnVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = qcnVar;
        this.e = i3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2o)) {
            return false;
        }
        v2o v2oVar = (v2o) obj;
        return this.a == v2oVar.a && this.b == v2oVar.b && this.c.equals(v2oVar.c) && Intrinsics.g(this.d, v2oVar.d) && this.e == v2oVar.e && this.f.equals(v2oVar.f) && this.g.equals(v2oVar.g) && this.h.equals(v2oVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + gmf0.a(gmf0.a(gpp.a(this.e, shu.a(this.d, gmf0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("InstantRacingRacerState(racerId=", this.a, this.b, ", racerNumber=", ", racerNameText=");
        sbA.append(this.c);
        sbA.append(", racerPreviousResults=");
        sbA.append(this.d);
        sbA.append(", racerStarCount=");
        f78.b(this.e, ", racerNumberUrl=", this.f, ", racerUrl=", sbA);
        return kwi.a(sbA, this.g, ", racerNumberCapeUrl=", this.h, ")");
    }
}
