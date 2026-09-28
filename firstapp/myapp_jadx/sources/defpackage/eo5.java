package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class eo5 {
    public final String a;
    public final String b;
    public final String c;
    public final HashMap<String, String> d;

    public eo5(String str, String str2, HashMap map) {
        this.a = "sg_campaign";
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo5)) {
            return false;
        }
        eo5 eo5Var = (eo5) obj;
        return Intrinsics.g(this.a, eo5Var.a) && Intrinsics.g(this.b, eo5Var.b) && Intrinsics.g(this.c, eo5Var.c) && Intrinsics.g(this.d, eo5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("CMSModel(page=", this.a, ", key=", this.b, ", default=");
        sbA.append(this.c);
        sbA.append(", hashmap=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ eo5(String str, String str2) {
        this(str, str2, new HashMap());
    }
}
