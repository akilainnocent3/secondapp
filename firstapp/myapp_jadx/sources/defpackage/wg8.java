package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wg8 {
    public final boolean a;
    public final String b;
    public final k9h c;
    public final rsa d;
    public final vs00 e;

    public wg8(boolean z, String str, k9h k9hVar, rsa rsaVar, vs00 vs00Var) {
        this.a = z;
        this.b = str;
        this.c = k9hVar;
        this.d = rsaVar;
        this.e = vs00Var;
    }

    public static wg8 a(wg8 wg8Var, boolean z, String str, k9h k9hVar, rsa rsaVar, vs00 vs00Var, int i) {
        if ((i & 1) != 0) {
            z = wg8Var.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = wg8Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            k9hVar = wg8Var.c;
        }
        k9h k9hVar2 = k9hVar;
        if ((i & 8) != 0) {
            wg8Var.getClass();
        }
        if ((i & 16) != 0) {
            rsaVar = wg8Var.d;
        }
        rsa rsaVar2 = rsaVar;
        if ((i & 32) != 0) {
            vs00Var = wg8Var.e;
        }
        wg8Var.getClass();
        return new wg8(z2, str2, k9hVar2, rsaVar2, vs00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg8)) {
            return false;
        }
        wg8 wg8Var = (wg8) obj;
        return this.a == wg8Var.a && Intrinsics.g(this.b, wg8Var.b) && Intrinsics.g(this.c, wg8Var.c) && Intrinsics.g(this.d, wg8Var.d) && Intrinsics.g(this.e, wg8Var.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k9h k9hVar = this.c;
        int iHashCode3 = (iHashCode2 + (k9hVar == null ? 0 : k9hVar.hashCode())) * 961;
        rsa rsaVar = this.d;
        int iHashCode4 = (iHashCode3 + (rsaVar == null ? 0 : rsaVar.hashCode())) * 31;
        vs00 vs00Var = this.e;
        return iHashCode4 + (vs00Var != null ? vs00Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("CommonPayDialogsState(isProgressDialogVisible=", ", infoDialogMessage=", this.b, ", failedTransaction=", this.a);
        sbA.append(this.c);
        sbA.append(", pendingRequest=null, confirmAmount=");
        sbA.append(this.d);
        sbA.append(", phoneNumberInfo=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ wg8(int i) {
        this(false, null, null, null, null);
    }

    public wg8() {
        this(0);
    }
}
