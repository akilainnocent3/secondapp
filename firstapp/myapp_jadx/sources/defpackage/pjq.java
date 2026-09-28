package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pjq {
    public final tjq a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public pjq(int i) {
        this(new tjq.b(vch0.a, ojq.SETTLED), false, true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjq)) {
            return false;
        }
        pjq pjqVar = (pjq) obj;
        return Intrinsics.g(this.a, pjqVar.a) && this.b == pjqVar.b && this.c == pjqVar.c && this.d == pjqVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNHistoryFilterButtonState(res=");
        sb.append(this.a);
        sb.append(", isOpen=");
        sb.append(this.b);
        sb.append(", enabled=");
        return lng.a(", highlight=", ")", sb, this.c, this.d);
    }

    public pjq(tjq tjqVar, boolean z, boolean z2, boolean z3) {
        this.a = tjqVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public pjq() {
        this(0);
    }
}
