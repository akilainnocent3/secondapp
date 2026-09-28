package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nse0 {
    public final List<mse0> a;
    public final kse0 b;

    public nse0(List<mse0> list, kse0 kse0Var) {
        list.getClass();
        this.a = list;
        this.b = kse0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nse0)) {
            return false;
        }
        nse0 nse0Var = (nse0) obj;
        return Intrinsics.g(this.a, nse0Var.a) && Intrinsics.g(this.b, nse0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TGBetAmountConfig(betAmount=" + this.a + ", autoSpin=" + this.b + ')';
    }
}
