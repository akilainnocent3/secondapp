package defpackage;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kmj0 {
    public static final kmj0 c;
    public final String a;
    public final String b;

    public kmj0(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmj0)) {
            return false;
        }
        kmj0 kmj0Var = (kmj0) obj;
        return this.a.equals(kmj0Var.a) && Intrinsics.g(this.b, kmj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("WithdrawInfoUiState(displayMaxWithdrawableAmount=", this.a, ", hint=", this.b, ")");
    }

    static {
        String str = yFmFZvuWxAYfEj.qOPHWbowQo;
        c = new kmj0(str, str);
    }
}
