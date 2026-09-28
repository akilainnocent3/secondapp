package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class kmn {
    public final xln a;
    public final xln b;
    public final xln c;

    public /* synthetic */ kmn(int i) {
        this(new xln(7, (String) null, false), new xln(7, (String) null, false), new xln(7, (String) null, false));
    }

    public static kmn a(kmn kmnVar, xln xlnVar, xln xlnVar2, xln xlnVar3, int i) {
        if ((i & 1) != 0) {
            xlnVar = kmnVar.a;
        }
        if ((i & 2) != 0) {
            xlnVar2 = kmnVar.b;
        }
        if ((i & 4) != 0) {
            xlnVar3 = kmnVar.c;
        }
        kmnVar.getClass();
        xlnVar.getClass();
        xlnVar2.getClass();
        xlnVar3.getClass();
        return new kmn(xlnVar, xlnVar2, xlnVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmn)) {
            return false;
        }
        kmn kmnVar = (kmn) obj;
        return Intrinsics.g(this.a, kmnVar.a) && Intrinsics.g(this.b, kmnVar.b) && Intrinsics.g(this.c, kmnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InputState(minOdds=" + this.a + ", maxOdds=" + this.b + ", stake=" + this.c + ")";
    }

    public kmn(xln xlnVar, xln xlnVar2, xln xlnVar3) {
        xlnVar.getClass();
        xlnVar2.getClass();
        xlnVar3.getClass();
        this.a = xlnVar;
        this.b = xlnVar2;
        this.c = xlnVar3;
    }
}
