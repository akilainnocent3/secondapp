package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dej0 {
    public final x0f a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final int d;

    public dej0(x0f x0fVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        this.a = x0fVar;
        this.b = bigDecimal;
        this.c = bigDecimal2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dej0)) {
            return false;
        }
        dej0 dej0Var = (dej0) obj;
        return this.a.equals(dej0Var.a) && Intrinsics.g(this.b, dej0Var.b) && Intrinsics.g(this.c, dej0Var.c) && this.d == dej0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dd3.a(this.c, dd3.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "WinningPopupDoubleOrNothingTakeTheShotResult(result=" + this.a + ", takeTheShotAmount=" + this.b + ", cashedOutAmount=" + this.c + ", kickCountdownDurationSec=" + this.d + ")";
    }
}
