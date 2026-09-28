package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dza {
    public final Object a;
    public final int b;
    public final int c;

    public dza(int i, int i2, Object obj) {
        obj.getClass();
        this.a = obj;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dza)) {
            return false;
        }
        dza dzaVar = (dza) obj;
        return Intrinsics.g(this.a, dzaVar.a) && this.b == dzaVar.b && this.c == dzaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentAnchor(key=");
        sb.append(this.a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", offset=");
        return zk1.a(this.c, ")", sb);
    }
}
