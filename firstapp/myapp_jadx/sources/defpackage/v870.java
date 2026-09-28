package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v870 {
    public final w870 a;
    public final List<String> b;

    public v870(w870 w870Var, List<String> list) {
        list.getClass();
        this.a = w870Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v870)) {
            return false;
        }
        v870 v870Var = (v870) obj;
        return this.a == v870Var.a && Intrinsics.g(this.b, v870Var.b);
    }

    public final int hashCode() {
        w870 w870Var = this.a;
        return this.b.hashCode() + ((w870Var == null ? 0 : w870Var.hashCode()) * 31);
    }

    public final String toString() {
        return "ScheduledFootballMarketLayout(mode=" + this.a + ", parameters=" + this.b + ")";
    }
}
