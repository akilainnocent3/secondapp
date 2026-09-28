package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xv7 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final List<dw7> f;

    public xv7(String str, boolean z, boolean z2, int i, int i2, List<dw7> list) {
        list.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
        this.f = list;
    }

    public static xv7 a(xv7 xv7Var, String str, boolean z, int i, int i2, List list, int i3) {
        if ((i3 & 1) != 0) {
            str = xv7Var.a;
        }
        String str2 = str;
        boolean z2 = xv7Var.c;
        if ((i3 & 8) != 0) {
            i = xv7Var.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = xv7Var.e;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            list = xv7Var.f;
        }
        List list2 = list;
        xv7Var.getClass();
        str2.getClass();
        list2.getClass();
        return new xv7(str2, z, z2, i4, i5, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv7)) {
            return false;
        }
        xv7 xv7Var = (xv7) obj;
        return Intrinsics.g(this.a, xv7Var.a) && this.b == xv7Var.b && this.c == xv7Var.c && this.d == xv7Var.d && this.e == xv7Var.e && Intrinsics.g(this.f, xv7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gpp.a(this.e, gpp.a(this.d, mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("CodeChatRoomHeaderUiState(bookingCode=", this.a, ", isLoading=", ", isSelectionExpanded=", this.b);
        sbA.append(this.c);
        sbA.append(", selectionVisibleCount=");
        sbA.append(this.d);
        sbA.append(", selectionTotalCount=");
        return at6.b(sbA, this.e, ", selectionsPreview=", this.f, ")");
    }

    public xv7() {
        this(0);
    }

    public xv7(int i) {
        this("", true, true, 0, 0, m2g.a);
    }
}
