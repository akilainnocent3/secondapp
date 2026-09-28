package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ro10 {
    public final String a;
    public final String b;
    public final String c;
    public final List<String> d;

    public ro10(String str, String str2, String str3, List<String> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro10)) {
            return false;
        }
        ro10 ro10Var = (ro10) obj;
        return this.a.equals(ro10Var.a) && this.b.equals(ro10Var.b) && this.c.equals(ro10Var.c) && Intrinsics.g(this.d, ro10Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nve.a(this.c, ", values=", ")", ux5.a("PlayedSport(desc=", this.a, ", title=", this.b, ", valueType="), this.d);
    }
}
