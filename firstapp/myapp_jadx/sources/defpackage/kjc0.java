package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kjc0 {
    public final icc0 a;
    public final sdc0 b;
    public final gfc0 c;

    public kjc0(icc0 icc0Var, sdc0 sdc0Var, gfc0 gfc0Var) {
        icc0Var.getClass();
        this.a = icc0Var;
        this.b = sdc0Var;
        this.c = gfc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjc0)) {
            return false;
        }
        kjc0 kjc0Var = (kjc0) obj;
        return Intrinsics.g(this.a, kjc0Var.a) && this.b.equals(kjc0Var.b) && this.c.equals(kjc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SportyLegendsSelection(event=" + this.a + ", market=" + this.b + lobGSRIlnSGJY.xxAJdFe + this.c + ")";
    }
}
