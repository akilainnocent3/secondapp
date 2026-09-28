package defpackage;

import com.sporty.android.core.model.patron.KycSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dev {
    public final boolean a;
    public final ftp b;
    public final KycSource c;
    public final pdd0 d;

    public dev(boolean z, ftp ftpVar, KycSource kycSource, pdd0 pdd0Var) {
        kycSource.getClass();
        pdd0Var.getClass();
        this.a = z;
        this.b = ftpVar;
        this.c = kycSource;
        this.d = pdd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev)) {
            return false;
        }
        dev devVar = (dev) obj;
        return this.a == devVar.a && this.b == devVar.b && this.c == devVar.c && Intrinsics.g(this.d, devVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        ftp ftpVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (ftpVar == null ? 0 : ftpVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "MeKycActionPolicy(shouldOpenVerificationInProgressBottomSheet=" + this.a + ", verificationInProgressAction=" + this.b + ", source=" + this.c + ", trackingEvent=" + this.d + ")";
    }

    public /* synthetic */ dev(KycSource kycSource, pdd0 pdd0Var) {
        this(false, null, kycSource, pdd0Var);
    }
}
