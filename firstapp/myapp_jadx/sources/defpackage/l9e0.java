package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l9e0 {
    public final int a;
    public final List<Object> b;

    public l9e0(int i, List<? extends Object> list) {
        list.getClass();
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9e0)) {
            return false;
        }
        l9e0 l9e0Var = (l9e0) obj;
        return this.a == l9e0Var.a && Intrinsics.g(this.b, l9e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StringData(id=" + this.a + ", args=" + this.b + ")";
    }
}
