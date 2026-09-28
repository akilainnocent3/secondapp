package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p020 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public p020(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p020)) {
            return false;
        }
        p020 p020Var = (p020) obj;
        return k020.a(this.a, p020Var.a) && this.b == p020Var.b && gly.c(this.c, p020Var.c) && gly.c(this.d, p020Var.d) && this.e == p020Var.e && Float.compare(this.f, p020Var.f) == 0 && this.g == p020Var.g && this.h == p020Var.h && this.i.equals(p020Var.i) && gly.c(this.j, p020Var.j) && gly.c(this.k, p020Var.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + f87.a(vt5.a(this.i, mtg0.a(gpp.a(this.g, tvh.a(this.f, mtg0.a(f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31), 31), 31, this.h), 31), this.j, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.a + ')'));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) gly.h(this.c));
        sb.append(", position=");
        sb.append((Object) gly.h(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
        if (i == 1) {
            str = "Touch";
        } else if (i == 2) {
            str = "Mouse";
        } else if (i != 3) {
            str = i != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb.append((Object) str);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) gly.h(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) gly.h(this.k));
        sb.append(')');
        return sb.toString();
    }
}
