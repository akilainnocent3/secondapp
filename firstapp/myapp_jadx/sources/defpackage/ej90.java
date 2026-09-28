package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ej90 {
    public static final ej90 e = new ej90(null, ipk.a, m2g.a, false);
    public final GiftDetails a;
    public final ipk b;
    public final List<GiftDetails> c;
    public final boolean d;

    public ej90(GiftDetails giftDetails, ipk ipkVar, List<GiftDetails> list, boolean z) {
        ipkVar.getClass();
        list.getClass();
        this.a = giftDetails;
        this.b = ipkVar;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej90)) {
            return false;
        }
        ej90 ej90Var = (ej90) obj;
        return Intrinsics.g(this.a, ej90Var.a) && this.b == ej90Var.b && Intrinsics.g(this.c, ej90Var.c) && this.d == ej90Var.d;
    }

    public final int hashCode() {
        GiftDetails giftDetails = this.a;
        return Boolean.hashCode(this.d) + ai50.a((this.b.hashCode() + ((giftDetails == null ? 0 : giftDetails.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "SimSelectedGiftState(selectedGiftDetails=" + this.a + ", giftLoadingStatus=" + this.b + ", applicableGiftDetails=" + this.c + ", isAddToStake=" + this.d + ")";
    }
}
