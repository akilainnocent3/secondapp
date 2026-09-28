package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w6x {
    public final qcn<GiftItem> a;

    public w6x(uf00 uf00Var) {
        uf00Var.getClass();
        this.a = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6x) && Intrinsics.g(this.a, ((w6x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Gift(giftList=" + this.a + ')';
    }
}
