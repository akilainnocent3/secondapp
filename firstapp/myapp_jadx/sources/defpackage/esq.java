package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class esq {
    public final String a;
    public final String b;
    public final lhr c;
    public final lhr d;

    public esq(String str, String str2, lhr lhrVar, lhr lhrVar2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = lhrVar;
        this.d = lhrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esq)) {
            return false;
        }
        esq esqVar = (esq) obj;
        return Intrinsics.g(this.a, esqVar.a) && Intrinsics.g(this.b, esqVar.b) && this.c.equals(esqVar.c) && this.d.equals(esqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNLotteryStream(id=", this.a, ", title=", this.b, ", startTime=");
        sbA.append(this.c);
        sbA.append(", endTime=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
