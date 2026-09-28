package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l770 {
    public final String a;
    public final String b;
    public final String c;
    public final List<e970> d;

    public l770(String str, String str2, String str3, List<e970> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public static l770 a(l770 l770Var, ArrayList arrayList) {
        return new l770(l770Var.a, l770Var.b, l770Var.c, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l770)) {
            return false;
        }
        l770 l770Var = (l770) obj;
        return this.a.equals(l770Var.a) && this.b.equals(l770Var.b) && this.c.equals(l770Var.c) && Intrinsics.g(this.d, l770Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nve.a(this.c, ", matchdays=", ")", ux5.a("ScheduledFootballLeague(id=", this.a, ", name=", this.b, ", logoUrl="), this.d);
    }
}
