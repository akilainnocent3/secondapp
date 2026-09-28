package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jxs {
    public static final jxs f;
    public final hxs a;
    public final hxs b;
    public final hxs c;
    public final boolean d;
    public final boolean e;

    static {
        hxs.c cVar = hxs.c.c;
        f = new jxs(cVar, cVar, cVar);
    }

    public jxs(hxs hxsVar, hxs hxsVar2, hxs hxsVar3) {
        hxsVar.getClass();
        hxsVar2.getClass();
        hxsVar3.getClass();
        this.a = hxsVar;
        this.b = hxsVar2;
        this.c = hxsVar3;
        this.d = (hxsVar instanceof hxs.a) || (hxsVar3 instanceof hxs.a) || (hxsVar2 instanceof hxs.a);
        this.e = (hxsVar instanceof hxs.c) && (hxsVar3 instanceof hxs.c) && (hxsVar2 instanceof hxs.c);
    }

    public static jxs a(jxs jxsVar, int i) {
        int i2 = i & 1;
        hxs hxsVar = hxs.c.c;
        hxs hxsVar2 = i2 != 0 ? jxsVar.a : hxsVar;
        hxs hxsVar3 = (i & 2) != 0 ? jxsVar.b : hxsVar;
        if ((i & 4) != 0) {
            hxsVar = jxsVar.c;
        }
        hxsVar2.getClass();
        hxsVar3.getClass();
        hxsVar.getClass();
        return new jxs(hxsVar2, hxsVar3, hxsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxs)) {
            return false;
        }
        jxs jxsVar = (jxs) obj;
        return Intrinsics.g(this.a, jxsVar.a) && Intrinsics.g(this.b, jxsVar.b) && Intrinsics.g(this.c, jxsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
