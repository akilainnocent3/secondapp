package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class brg0 {
    public final String a;
    public final int b;
    public final BigDecimal c;
    public final Integer d;
    public final i41 e;
    public final long f;
    public final String g;
    public final Integer h;
    public final String i;
    public final String j;
    public final UiText k;

    public brg0(String str, int i, BigDecimal bigDecimal, Integer num, i41 i41Var, long j, String str2, Integer num2, String str3, String str4, UiText uiText) {
        i41Var.getClass();
        this.a = str;
        this.b = i;
        this.c = bigDecimal;
        this.d = num;
        this.e = i41Var;
        this.f = j;
        this.g = str2;
        this.h = num2;
        this.i = str3;
        this.j = str4;
        this.k = uiText;
    }

    public static brg0 a(brg0 brg0Var, int i, Integer num, UiText uiText, int i2) {
        String str = brg0Var.a;
        if ((i2 & 2) != 0) {
            i = brg0Var.b;
        }
        int i3 = i;
        BigDecimal bigDecimal = brg0Var.c;
        Integer num2 = (i2 & 8) != 0 ? brg0Var.d : num;
        i41 i41Var = brg0Var.e;
        long j = brg0Var.f;
        String str2 = brg0Var.g;
        Integer num3 = brg0Var.h;
        String str3 = brg0Var.i;
        String str4 = brg0Var.j;
        UiText uiText2 = (i2 & 1024) != 0 ? brg0Var.k : uiText;
        brg0Var.getClass();
        i41Var.getClass();
        return new brg0(str, i3, bigDecimal, num2, i41Var, j, str2, num3, str3, str4, uiText2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brg0)) {
            return false;
        }
        brg0 brg0Var = (brg0) obj;
        return Intrinsics.g(this.a, brg0Var.a) && this.b == brg0Var.b && Intrinsics.g(this.c, brg0Var.c) && Intrinsics.g(this.d, brg0Var.d) && Intrinsics.g(this.e, brg0Var.e) && this.f == brg0Var.f && Intrinsics.g(this.g, brg0Var.g) && this.h.equals(brg0Var.h) && Intrinsics.g(this.i, brg0Var.i) && Intrinsics.g(this.j, brg0Var.j) && this.k.equals(brg0Var.k);
    }

    public final int hashCode() {
        String str = this.a;
        int iA = gpp.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        BigDecimal bigDecimal = this.c;
        int iHashCode = (iA + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.d;
        int iA2 = f87.a((this.e.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, this.f, 31);
        String str2 = this.g;
        int iHashCode2 = (this.h.hashCode() + ((iA2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return this.k.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "TransactionUI(tradeId=", this.a, ", status=", ", amount=");
        sbA.append(this.c);
        sbA.append(", amountSign=");
        sbA.append(this.d);
        sbA.append(", auditStatus=");
        sbA.append(this.e);
        sbA.append(", createTime=");
        sbA.append(this.f);
        sbA.append(", tradeCode=");
        sbA.append(this.g);
        sbA.append(", bizType=");
        sbA.append(this.h);
        hxa.c(sbA, ", bizName=", this.i, ", subBizTypeName=", this.j);
        sbA.append(", displayTypeUiText=");
        sbA.append(this.k);
        sbA.append(")");
        return sbA.toString();
    }
}
