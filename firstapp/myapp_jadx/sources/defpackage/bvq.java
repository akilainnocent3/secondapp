package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bvq {
    public final String a;
    public final String b;
    public final List<String> c;

    public bvq(String str, String str2, List<String> list) {
        bt6.a(str, str2, list);
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvq)) {
            return false;
        }
        bvq bvqVar = (bvq) obj;
        return Intrinsics.g(this.a, bvqVar.a) && Intrinsics.g(this.b, bvqVar.b) && Intrinsics.g(this.c, bvqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ng1.a(ux5.a("LNModuleMarketGroup(id=", this.a, ", name=", this.b, ", marketIds="), this.c, ")");
    }
}
