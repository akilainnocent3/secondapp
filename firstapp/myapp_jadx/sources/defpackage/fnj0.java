package defpackage;

import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fnj0 {
    public final WithdrawRequest a;
    public final v1i0.c b;
    public final g0i0.d c;

    public fnj0(WithdrawRequest withdrawRequest, v1i0.c cVar, g0i0.d dVar) {
        withdrawRequest.getClass();
        this.a = withdrawRequest;
        this.b = cVar;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnj0)) {
            return false;
        }
        fnj0 fnj0Var = (fnj0) obj;
        return Intrinsics.g(this.a, fnj0Var.a) && Intrinsics.g(this.b, fnj0Var.b) && Intrinsics.g(this.c, fnj0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v1i0.c cVar = this.b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        g0i0.d dVar = this.c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "WithdrawOperation(withdrawRequest=" + this.a + ", previousVerifySportyPinSuccessResult=" + this.b + ", previousVerifyOtpSuccessResult=" + this.c + ")";
    }
}
