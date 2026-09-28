package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kme {
    public final sb00 a;
    public final vvd b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final xzd i;

    public /* synthetic */ kme(int i, boolean z) {
        this(new sb00(0), new vvd(31, null, null, false, false), false, false, false, false, false, (i & 128) != 0 ? false : z, null);
    }

    public static kme a(kme kmeVar, sb00 sb00Var, vvd vvdVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, xzd xzdVar, int i) {
        if ((i & 1) != 0) {
            sb00Var = kmeVar.a;
        }
        sb00 sb00Var2 = sb00Var;
        if ((i & 2) != 0) {
            vvdVar = kmeVar.b;
        }
        vvd vvdVar2 = vvdVar;
        if ((i & 4) != 0) {
            z = kmeVar.c;
        }
        boolean z7 = z;
        if ((i & 8) != 0) {
            z2 = kmeVar.d;
        }
        boolean z8 = z2;
        if ((i & 16) != 0) {
            z3 = kmeVar.e;
        }
        boolean z9 = z3;
        boolean z10 = (i & 32) != 0 ? kmeVar.f : z4;
        boolean z11 = (i & 64) != 0 ? kmeVar.g : z5;
        boolean z12 = (i & 128) != 0 ? kmeVar.h : z6;
        xzd xzdVar2 = (i & 256) != 0 ? kmeVar.i : xzdVar;
        kmeVar.getClass();
        sb00Var2.getClass();
        vvdVar2.getClass();
        return new kme(sb00Var2, vvdVar2, z7, z8, z9, z10, z11, z12, xzdVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kme)) {
            return false;
        }
        kme kmeVar = (kme) obj;
        return Intrinsics.g(this.a, kmeVar.a) && Intrinsics.g(this.b, kmeVar.b) && this.c == kmeVar.c && this.d == kmeVar.d && this.e == kmeVar.e && this.f == kmeVar.f && this.g == kmeVar.g && this.h == kmeVar.h && Intrinsics.g(this.i, kmeVar.i);
    }

    public final int hashCode() {
        int iA = mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        xzd xzdVar = this.i;
        return iA + (xzdVar == null ? 0 : xzdVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsState(pendingDepositsDialog=");
        sb.append(this.a);
        sb.append(", depositConfirmationBottomSheet=");
        sb.append(this.b);
        sb.append(", isDepositProgressDialogVisible=");
        nng.a(", isGenericErrorDialogVisible=", ", isFacialRecognitionErrorDialogVisible=", sb, this.c, this.d);
        nng.a(", isFacialRecognitionRegistrationDialogVisible=", ", isFacialRecognitionRegistrationErrorDialogVisible=", sb, this.e, this.f);
        nng.a(", shouldCompleteRegistrationWithFacialRecognition=", ", depositFailedDialog=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public kme(sb00 sb00Var, vvd vvdVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, xzd xzdVar) {
        this.a = sb00Var;
        this.b = vvdVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = xzdVar;
    }

    public kme() {
        this(511, false);
    }
}
