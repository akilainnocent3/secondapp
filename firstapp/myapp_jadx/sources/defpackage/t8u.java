package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t8u {
    public final int a;
    public final int b;
    public final int c;
    public final q9u d;
    public final boolean e;

    public t8u(int i) {
        this(0, 0, 0, new q9u(m2g.a, 0.0f), false);
    }

    public static t8u a(t8u t8uVar, int i, int i2, boolean z, int i3) {
        int i4 = t8uVar.a;
        if ((i3 & 2) != 0) {
            i = t8uVar.b;
        }
        int i5 = i;
        if ((i3 & 4) != 0) {
            i2 = t8uVar.c;
        }
        int i6 = i2;
        q9u q9uVar = t8uVar.d;
        if ((i3 & 16) != 0) {
            z = t8uVar.e;
        }
        t8uVar.getClass();
        q9uVar.getClass();
        return new t8u(i4, i5, i6, q9uVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8u)) {
            return false;
        }
        t8u t8uVar = (t8u) obj;
        return this.a == t8uVar.a && this.b == t8uVar.b && this.c == t8uVar.c && Intrinsics.g(this.d, t8uVar.d) && this.e == t8uVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("LuckyWheelDataState(activityId=", this.a, this.b, ", ticketType=", ", ticketNum=");
        sbA.append(this.c);
        sbA.append(", prizeState=");
        sbA.append(this.d);
        sbA.append(", spinAble=");
        return mq0.a(sbA, this.e, ")");
    }

    public t8u(int i, int i2, int i3, q9u q9uVar, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = q9uVar;
        this.e = z;
    }

    public t8u() {
        this(0);
    }
}
