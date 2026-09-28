package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fo5 {
    public final String a;
    public final String b;
    public final String c;
    public final HashMap<String, String> d;

    public fo5(String str, String str2, String str3, HashMap<String, String> map) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo5)) {
            return false;
        }
        fo5 fo5Var = (fo5) obj;
        return Intrinsics.g(this.a, fo5Var.a) && Intrinsics.g(this.b, fo5Var.b) && Intrinsics.g(this.c, fo5Var.c) && Intrinsics.g(this.d, fo5Var.d);
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

    public /* synthetic */ fo5(String str, String str2, String str3) {
        this(str, str2, str3, new HashMap());
    }
}
