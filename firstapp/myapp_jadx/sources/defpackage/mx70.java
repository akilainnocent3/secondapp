package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mx70 {
    public final List<vt70> a;
    public final String b;

    public mx70(List<vt70> list, String str) {
        str.getClass();
        this.a = list;
        this.b = str;
    }

    public static mx70 a(mx70 mx70Var, ArrayList arrayList) {
        String str = mx70Var.b;
        str.getClass();
        return new mx70(arrayList, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx70)) {
            return false;
        }
        mx70 mx70Var = (mx70) obj;
        return this.a.equals(mx70Var.a) && Intrinsics.g(this.b, mx70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchResult(categories=" + this.a + ", query=" + this.b + ")";
    }
}
