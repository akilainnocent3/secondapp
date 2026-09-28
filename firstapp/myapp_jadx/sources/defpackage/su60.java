package defpackage;

import com.sporty.android.core.model.pocket.common.PayHintData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class su60 {
    public final List<aoe0.b> a;
    public final aoe0.b b;
    public final bx c;
    public final PayHintData d;
    public final mij0 e;
    public final boolean f;

    public su60(List list, bx bxVar, PayHintData payHintData, mij0 mij0Var, int i) {
        this((i & 1) != 0 ? m2g.a : list, null, (i & 4) != 0 ? new bx(0) : bxVar, (i & 8) != 0 ? null : payHintData, (i & 16) != 0 ? new mij0(0) : mij0Var, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su60)) {
            return false;
        }
        su60 su60Var = (su60) obj;
        return Intrinsics.g(this.a, su60Var.a) && Intrinsics.g(this.b, su60Var.b) && Intrinsics.g(this.c, su60Var.c) && Intrinsics.g(this.d, su60Var.d) && Intrinsics.g(this.e, su60Var.e) && this.f == su60Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        aoe0.b bVar = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        PayHintData payHintData = this.d;
        int iHashCode3 = payHintData != null ? payHintData.hashCode() : 0;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iHashCode2 + iHashCode3) * 31)) * 31);
    }

    public final String toString() {
        return "SavedAssetsUiState(savedAssets=" + this.a + ", selectedAsset=" + this.b + ", amountTextFieldUiState=" + this.c + ", payHint=" + this.d + ", withdrawBankHintBundleState=" + this.e + ", isManageAccountEnabled=" + this.f + ")";
    }

    public su60(List<aoe0.b> list, aoe0.b bVar, bx bxVar, PayHintData payHintData, mij0 mij0Var, boolean z) {
        list.getClass();
        bxVar.getClass();
        mij0Var.getClass();
        this.a = list;
        this.b = bVar;
        this.c = bxVar;
        this.d = payHintData;
        this.e = mij0Var;
        this.f = z;
    }

    public su60() {
        this(null, null, null, null, 63);
    }
}
