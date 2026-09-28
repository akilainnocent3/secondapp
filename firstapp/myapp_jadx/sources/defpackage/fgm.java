package defpackage;

import com.sporty.android.core.model.patron.KycSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fgm {
    public final KycSource a;
    public final pdd0 b;
    public final pdd0 c;
    public final pdd0 d;

    public /* synthetic */ fgm(KycSource kycSource, osp ospVar, osp.l lVar, int i) {
        this(kycSource, (i & 2) != 0 ? null : ospVar, (i & 4) != 0 ? null : lVar, (osp.p) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgm)) {
            return false;
        }
        fgm fgmVar = (fgm) obj;
        return this.a == fgmVar.a && Intrinsics.g(this.b, fgmVar.b) && Intrinsics.g(this.c, fgmVar.c) && Intrinsics.g(this.d, fgmVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        pdd0 pdd0Var = this.b;
        int iHashCode2 = (iHashCode + (pdd0Var == null ? 0 : pdd0Var.hashCode())) * 31;
        pdd0 pdd0Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (pdd0Var2 == null ? 0 : pdd0Var2.hashCode())) * 31;
        pdd0 pdd0Var3 = this.d;
        return iHashCode3 + (pdd0Var3 != null ? pdd0Var3.hashCode() : 0);
    }

    public final String toString() {
        return "HomeKycBannerPolicy(source=" + this.a + ", viewEvent=" + this.b + ", clickEvent=" + this.c + ", rejectReasonClickEvent=" + this.d + ")";
    }

    public fgm(KycSource kycSource, pdd0 pdd0Var, pdd0 pdd0Var2, osp.p pVar) {
        kycSource.getClass();
        this.a = kycSource;
        this.b = pdd0Var;
        this.c = pdd0Var2;
        this.d = pVar;
    }
}
