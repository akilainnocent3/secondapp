package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class usj0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public usj0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usj0)) {
            return false;
        }
        usj0 usj0Var = (usj0) obj;
        return Intrinsics.g(this.a, usj0Var.a) && Intrinsics.g(this.b, usj0Var.b) && Intrinsics.g(this.c, usj0Var.c) && Intrinsics.g(this.d, usj0Var.d) && Intrinsics.g(this.e, usj0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("WithdrawalPendingState(amount=", this.a, LxHElgWAiSeM.KqgkjHYBZeBLpES, this.b, ", tradeId=");
        hxa.c(sbA, this.c, ", paymentMethodName=", this.d, ", currency=");
        return uf80.a(sbA, this.e, ")");
    }

    public /* synthetic */ usj0(int i) {
        this("", "", "", "", "");
    }

    public usj0() {
        this(0);
    }
}
