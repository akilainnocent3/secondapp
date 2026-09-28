package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wne0 {
    public final List<aoe0> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public wne0(int i, ArrayList arrayList) {
        this((i & 1) != 0 ? m2g.a : arrayList, false, (i & 4) == 0, false);
    }

    public static wne0 a(wne0 wne0Var, List list, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = wne0Var.a;
        }
        if ((i & 2) != 0) {
            z = wne0Var.b;
        }
        boolean z3 = wne0Var.c;
        if ((i & 8) != 0) {
            z2 = wne0Var.d;
        }
        wne0Var.getClass();
        list.getClass();
        return new wne0(list, z, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wne0)) {
            return false;
        }
        wne0 wne0Var = (wne0) obj;
        return Intrinsics.g(this.a, wne0Var.a) && this.b == wne0Var.b && this.c == wne0Var.c && this.d == wne0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchPaymentItemListState(items=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isEditable=");
        return lng.a(", isEditing=", ")", sb, this.c, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wne0(List<? extends aoe0> list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public wne0() {
        this(15, null);
    }
}
