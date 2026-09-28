package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rw1 {
    public static final rw1 c = new rw1(false, m2g.a);
    public final boolean a;
    public final List<aoe0.a> b;

    public rw1(boolean z, List<aoe0.a> list) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw1)) {
            return false;
        }
        rw1 rw1Var = (rw1) obj;
        return this.a == rw1Var.a && Intrinsics.g(this.b, rw1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BankTransferSwitchDialogUIState(isDialogShow=" + this.a + ", displaySwitchPaymentItemStateList=" + this.b + ")";
    }
}
