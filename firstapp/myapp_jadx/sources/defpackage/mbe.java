package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mbe {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final wk10 g;
    public final aie h;
    public final long i;

    public mbe(String str, String str2, String str3, Integer num, String str4, String str5, wk10 wk10Var, aie aieVar, long j) {
        wd7.a(str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = str5;
        this.g = wk10Var;
        this.h = aieVar;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbe)) {
            return false;
        }
        mbe mbeVar = (mbe) obj;
        return Intrinsics.g(this.a, mbeVar.a) && Intrinsics.g(this.b, mbeVar.b) && Intrinsics.g(this.c, mbeVar.c) && Intrinsics.g(this.d, mbeVar.d) && Intrinsics.g(this.e, mbeVar.e) && Intrinsics.g(this.f, mbeVar.f) && this.g == mbeVar.g && this.h == mbeVar.h && this.i == mbeVar.i;
    }

    public final int hashCode() {
        String str = this.a;
        int iA = gmf0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return Long.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + gmf0.a(gmf0.a((iA + (num != null ? num.hashCode() : 0)) * 31, 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("Device(locationName=", this.a, ", deviceName=", this.b, ", deviceId=");
        oie.a(this.d, this.c, ", inactiveDays=", ", ip=", sbA);
        hxa.c(sbA, this.e, ", phoneModel=", this.f, ", platformType=");
        sbA.append(this.g);
        sbA.append(", status=");
        sbA.append(this.h);
        sbA.append(", updateTime=");
        return nrz.a(this.i, ")", sbA);
    }
}
