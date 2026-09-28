package defpackage;

import java.math.BigDecimal;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ygj0 implements pdd0 {
    public final String a;
    public final bag b;
    public final String c;
    public final String d;
    public final BigDecimal e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final String i;
    public final String j;

    public /* synthetic */ ygj0(String str, BigDecimal bigDecimal, Integer num, Integer num2, Integer num3, String str2, String str3, int i) {
        this("withdrawal_page__click", null, (i & 4) != 0 ? null : str, null, (i & 16) != 0 ? null : bigDecimal, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3);
    }

    public static ygj0 e(ygj0 ygj0Var, bag bagVar, String str) {
        String str2 = ygj0Var.a;
        String str3 = ygj0Var.c;
        BigDecimal bigDecimal = ygj0Var.e;
        Integer num = ygj0Var.f;
        Integer num2 = ygj0Var.g;
        Integer num3 = ygj0Var.h;
        String str4 = ygj0Var.i;
        String str5 = ygj0Var.j;
        ygj0Var.getClass();
        str2.getClass();
        return new ygj0(str2, bagVar, str3, str, bigDecimal, num, num2, num3, str4, str5);
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        bag bagVar = this.b;
        HashMap<String, Object> mapD = kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null), new Pair("tab", this.d), new Pair("amount", this.e), new Pair("status_code", this.f), new Pair("trade_id", this.c));
        Integer num = this.g;
        if (num != null) {
            mapD.put("channel_id", Integer.valueOf(num.intValue()));
        }
        Integer num2 = this.h;
        if (num2 != null) {
            mapD.put("bank_id", Integer.valueOf(num2.intValue()));
        }
        String str = this.i;
        if (str != null) {
            mapD.put("mobile_operator_name", str);
        }
        String str2 = this.j;
        if (str2 != null) {
            mapD.put("phone", str2);
        }
        return mapD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygj0)) {
            return false;
        }
        ygj0 ygj0Var = (ygj0) obj;
        return Intrinsics.g(this.a, ygj0Var.a) && Intrinsics.g(this.b, ygj0Var.b) && Intrinsics.g(this.c, ygj0Var.c) && Intrinsics.g(this.d, ygj0Var.d) && Intrinsics.g(this.e, ygj0Var.e) && Intrinsics.g(this.f, ygj0Var.f) && Intrinsics.g(this.g, ygj0Var.g) && Intrinsics.g(this.h, ygj0Var.h) && Intrinsics.g(this.i, ygj0Var.i) && Intrinsics.g(this.j, ygj0Var.j);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bag bagVar = this.b;
        int iHashCode2 = (iHashCode + (bagVar == null ? 0 : bagVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.e;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawalPageClickEvent(name=");
        sb.append(this.a);
        sb.append(", entrance=");
        sb.append(this.b);
        sb.append(", tradingId=");
        hxa.c(sb, this.c, ", tab=", this.d, ", amount=");
        sb.append(this.e);
        sb.append(", statusCode=");
        sb.append(this.f);
        sb.append(", payChId=");
        cv7.a(sb, this.g, ", bankId=", this.h, ", mobileOperatorName=");
        return kwi.a(sb, this.i, ", phone=", this.j, ")");
    }

    public ygj0(String str, bag bagVar, String str2, String str3, BigDecimal bigDecimal, Integer num, Integer num2, Integer num3, String str4, String str5) {
        this.a = str;
        this.b = bagVar;
        this.c = str2;
        this.d = str3;
        this.e = bigDecimal;
        this.f = num;
        this.g = num2;
        this.h = num3;
        this.i = str4;
        this.j = str5;
    }

    public ygj0() {
        this(null, null, null, null, null, null, null, 1023);
    }
}
