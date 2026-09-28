package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eu {
    public final String a;
    public final boolean b;
    public final grx c;

    public eu(int i) {
        this(null, false, new grx(m2g.a, null, false));
    }

    public static eu a(eu euVar, String str, boolean z, grx grxVar, int i) {
        if ((i & 1) != 0) {
            str = euVar.a;
        }
        if ((i & 2) != 0) {
            z = euVar.b;
        }
        if ((i & 4) != 0) {
            grxVar = euVar.c;
        }
        euVar.getClass();
        grxVar.getClass();
        return new eu(str, z, grxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        return Intrinsics.g(this.a, euVar.a) && this.b == euVar.b && Intrinsics.g(this.c, euVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("AllNewsState(errorMessage=", this.a, ", isLoadingMore=", ", pagination=", this.b);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    public eu(String str, boolean z, grx grxVar) {
        this.a = str;
        this.b = z;
        this.c = grxVar;
    }

    public eu() {
        this(0);
    }
}
