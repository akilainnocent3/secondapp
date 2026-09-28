package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hv7 {
    public final String a;
    public final int b;
    public final String c;
    public final List<String> d;
    public final int e;
    public final int f;
    public final ArrayList g;
    public final ev7 h;

    public hv7(String str, int i, String str2, List list, int i2, int i3, ArrayList arrayList, ev7 ev7Var) {
        list.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = list;
        this.e = i2;
        this.f = i3;
        this.g = arrayList;
        this.h = ev7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv7)) {
            return false;
        }
        hv7 hv7Var = (hv7) obj;
        return this.a.equals(hv7Var.a) && this.b == hv7Var.b && this.c.equals(hv7Var.c) && Intrinsics.g(this.d, hv7Var.d) && this.e == hv7Var.e && this.f == hv7Var.f && this.g.equals(hv7Var.g) && this.h.equals(hv7Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + mtg0.a(vt5.a(this.g, gpp.a(this.f, gpp.a(this.e, mtg0.a(ai50.a(gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, false), 31), 31), 31), 31, false);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "CodeChatListItemUiModel(bookingCode=", this.a, ", betsPlaced=", ", potentialWinMultiplier=");
        kya0.b(this.c, ", sportTypes=", ", isPinned=false, selectionVisibleCount=", sbA, this.d);
        d5d.a(sbA, this.e, ", selectionTotalCount=", this.f, ", selectionsPreview=");
        sbA.append(this.g);
        sbA.append(", isSelectionExpanded=false, commentsPreview=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
