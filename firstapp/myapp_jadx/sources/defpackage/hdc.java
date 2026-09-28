package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hdc {
    public final List<gdc> a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public hdc(List<gdc> list, boolean z, int i, boolean z2, boolean z3) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = z3;
    }

    public static hdc a(hdc hdcVar, ArrayList arrayList, boolean z, int i) {
        List<gdc> list = arrayList;
        if ((i & 1) != 0) {
            list = hdcVar.a;
        }
        List<gdc> list2 = list;
        boolean z2 = hdcVar.b;
        int i2 = hdcVar.c;
        boolean z3 = (i & 8) != 0 ? hdcVar.d : true;
        if ((i & 16) != 0) {
            z = hdcVar.e;
        }
        list2.getClass();
        return new hdc(list2, z2, i2, z3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdc)) {
            return false;
        }
        hdc hdcVar = (hdc) obj;
        return Intrinsics.g(this.a, hdcVar.a) && this.b == hdcVar.b && this.c == hdcVar.c && this.d == hdcVar.d && this.e == hdcVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(gpp.a(this.c, mtg0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomCodeList(codes=");
        sb.append(this.a);
        sb.append(", reachLimit=");
        sb.append(this.b);
        sb.append(", codeCountLimit=");
        sb.append(this.c);
        sb.append(", editHintWatched=");
        sb.append(this.d);
        sb.append(", acting=");
        return mq0.a(sb, this.e, ")");
    }
}
