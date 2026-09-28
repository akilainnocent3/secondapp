package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yf40 {
    public final boolean a;
    public final List<zf40> b;

    public yf40(boolean z, List<zf40> list) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public static yf40 a(yf40 yf40Var, boolean z, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = yf40Var.a;
        }
        List<zf40> list = arrayList;
        if ((i & 2) != 0) {
            list = yf40Var.b;
        }
        yf40Var.getClass();
        list.getClass();
        return new yf40(z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf40)) {
            return false;
        }
        yf40 yf40Var = (yf40) obj;
        return this.a == yf40Var.a && Intrinsics.g(this.b, yf40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RecentAccountBottomSheetState(isVisible=" + this.a + ", accounts=" + this.b + ")";
    }

    public yf40() {
        this(0);
    }

    public yf40(int i) {
        this(false, m2g.a);
    }
}
