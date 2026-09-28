package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jme {
    public final boolean a;
    public final zlj0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final fmj0 f;
    public final gmj0 g;

    public jme(boolean z, zlj0 zlj0Var, boolean z2, boolean z3, boolean z4, fmj0 fmj0Var, gmj0 gmj0Var) {
        this.a = z;
        this.b = zlj0Var;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = fmj0Var;
        this.g = gmj0Var;
    }

    public static jme a(jme jmeVar, boolean z, zlj0 zlj0Var, boolean z2, boolean z3, boolean z4, fmj0 fmj0Var, gmj0 gmj0Var, int i) {
        if ((i & 1) != 0) {
            z = jmeVar.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            zlj0Var = jmeVar.b;
        }
        zlj0 zlj0Var2 = zlj0Var;
        if ((i & 4) != 0) {
            z2 = jmeVar.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = jmeVar.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = jmeVar.e;
        }
        boolean z8 = z4;
        if ((i & 32) != 0) {
            fmj0Var = jmeVar.f;
        }
        fmj0 fmj0Var2 = fmj0Var;
        if ((i & 64) != 0) {
            gmj0Var = jmeVar.g;
        }
        jmeVar.getClass();
        zlj0Var2.getClass();
        return new jme(z5, zlj0Var2, z6, z7, z8, fmj0Var2, gmj0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jme)) {
            return false;
        }
        jme jmeVar = (jme) obj;
        return this.a == jmeVar.a && Intrinsics.g(this.b, jmeVar.b) && this.c == jmeVar.c && this.d == jmeVar.d && this.e == jmeVar.e && Intrinsics.g(this.f, jmeVar.f) && Intrinsics.g(this.g, jmeVar.g);
    }

    public final int hashCode() {
        int iA = mtg0.a(mtg0.a(mtg0.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        fmj0 fmj0Var = this.f;
        int iHashCode = (iA + (fmj0Var == null ? 0 : fmj0Var.hashCode())) * 31;
        gmj0 gmj0Var = this.g;
        return iHashCode + (gmj0Var != null ? gmj0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsState(isGenericErrorVisible=");
        sb.append(this.a);
        sb.append(", withdrawConfirmationBottomSheet=");
        sb.append(this.b);
        sb.append(", isFacialRecognitionErrorDialogVisible=");
        nng.a(", isWithdrawProgressDialogVisible=", ", isPendingRequestDialogVisible=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", withdrawFailedDialogState=");
        sb.append(this.f);
        sb.append(", withdrawGreylistedDialogState=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public jme() {
        this(0);
    }

    public /* synthetic */ jme(int i) {
        this(false, new zlj0(0), false, false, false, null, null);
    }
}
