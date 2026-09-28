package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mp70 {
    public final boolean a;
    public final List<zyr> b;
    public final int c;
    public final int d;

    public mp70(List list, boolean z, int i, int i2) {
        list.getClass();
        this.a = z;
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp70)) {
            return false;
        }
        mp70 mp70Var = (mp70) obj;
        return this.a == mp70Var.a && Intrinsics.g(this.b, mp70Var.b) && this.c == mp70Var.c && this.d == mp70Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, ai50.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollInfo(isScrollInProgress=");
        sb.append(this.a);
        sb.append(", visibleItemsInfo=");
        sb.append(this.b);
        sb.append(", firstVisibleItemIndex=");
        return b7f.a(sb, this.c, ", firstVisibleItemScrollOffset=", this.d, ")");
    }
}
