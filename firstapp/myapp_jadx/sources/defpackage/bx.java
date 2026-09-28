package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bx {
    public final ijf0 a;
    public final xhj0 b;
    public final BigDecimal c;

    public /* synthetic */ bx(int i) {
        ijf0 ijf0Var = new ijf0("", 0L, 6);
        xhj0.d dVar = xhj0.d.a;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        this(ijf0Var, dVar, bigDecimal);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return Intrinsics.g(this.a, bxVar.a) && Intrinsics.g(this.b, bxVar.b) && Intrinsics.g(this.c, bxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountTextFieldUiState(amountFieldValue=");
        sb.append(this.a);
        sb.append(", amountValidation=");
        sb.append(this.b);
        sb.append(", amountHintMin=");
        return mh2.a(")", sb, this.c);
    }

    public bx(ijf0 ijf0Var, xhj0 xhj0Var, BigDecimal bigDecimal) {
        xhj0Var.getClass();
        bigDecimal.getClass();
        this.a = ijf0Var;
        this.b = xhj0Var;
        this.c = bigDecimal;
    }
}
