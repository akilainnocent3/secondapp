package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bc4 {
    public final boolean a;
    public final String b;
    public final int c;
    public final boolean d;

    public bc4(boolean z, int i, String str, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = z2;
    }

    public static bc4 a(bc4 bc4Var, boolean z, String str, int i, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = bc4Var.a;
        }
        if ((i2 & 2) != 0) {
            str = bc4Var.b;
        }
        if ((i2 & 4) != 0) {
            i = bc4Var.c;
        }
        if ((i2 & 8) != 0) {
            z2 = bc4Var.d;
        }
        bc4Var.getClass();
        str.getClass();
        return new bc4(z, i, str, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc4)) {
            return false;
        }
        bc4 bc4Var = (bc4) obj;
        return this.a == bc4Var.a && Intrinsics.g(this.b, bc4Var.b) && this.c == bc4Var.c && this.d == bc4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gpp.a(this.c, gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("BioAuthVerifyIdentityState(isLoading=", ", message=", this.b, ", bizCode=", this.a);
        sbA.append(this.c);
        sbA.append(", showErrorDialog=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    public bc4() {
        this(0);
    }

    public /* synthetic */ bc4(int i) {
        this(false, 0, "", false);
    }
}
