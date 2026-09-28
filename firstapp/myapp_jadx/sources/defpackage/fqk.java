package defpackage;

import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fqk {
    public final int a;
    public final InstantWinGiftApplicabilityContext b;
    public final m780 c;

    public fqk(int i, InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContext, m780 m780Var) {
        instantWinGiftApplicabilityContext.getClass();
        this.a = i;
        this.b = instantWinGiftApplicabilityContext;
        this.c = m780Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqk)) {
            return false;
        }
        fqk fqkVar = (fqk) obj;
        return this.a == fqkVar.a && Intrinsics.g(this.b, fqkVar.b) && Intrinsics.g(this.c, fqkVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.a.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        m780 m780Var = this.c;
        return iHashCode + (m780Var == null ? 0 : m780Var.hashCode());
    }

    public final String toString() {
        return "GiftPickerInput(orderBizType=" + this.a + ", instantWinGiftApplicabilityContext=" + this.b + ", selectedGiftInfo=" + this.c + ")";
    }
}
