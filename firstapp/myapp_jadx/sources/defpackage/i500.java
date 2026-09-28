package defpackage;

import com.sporty.android.core.model.PaydayPromoModalVariantDomain;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i500 {
    public final x250 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final PaydayPromoModalVariantDomain f;

    public /* synthetic */ i500(int i) {
        this(new x250(false, 0, 0, 0, 0), "", "", "", "", null);
    }

    public static i500 a(i500 i500Var, x250 x250Var, String str, String str2, String str3, String str4, PaydayPromoModalVariantDomain paydayPromoModalVariantDomain, int i) {
        if ((i & 1) != 0) {
            x250Var = i500Var.a;
        }
        x250 x250Var2 = x250Var;
        if ((i & 2) != 0) {
            str = i500Var.b;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = i500Var.c;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = i500Var.d;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = i500Var.e;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            paydayPromoModalVariantDomain = i500Var.f;
        }
        i500Var.getClass();
        x250Var2.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new i500(x250Var2, str5, str6, str7, str8, paydayPromoModalVariantDomain);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i500)) {
            return false;
        }
        i500 i500Var = (i500) obj;
        return Intrinsics.g(this.a, i500Var.a) && Intrinsics.g(this.b, i500Var.b) && Intrinsics.g(this.c, i500Var.c) && Intrinsics.g(this.d, i500Var.d) && Intrinsics.g(this.e, i500Var.e) && this.f == i500Var.f;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        PaydayPromoModalVariantDomain paydayPromoModalVariantDomain = this.f;
        return iA + (paydayPromoModalVariantDomain == null ? 0 : paydayPromoModalVariantDomain.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaydayGiftState(remainingTime=");
        sb.append(this.a);
        sb.append(", minDepositCurrency=");
        sb.append(this.b);
        sb.append(", rewardCurrency=");
        hxa.c(sb, this.c, ", formattedRewardAmount=", this.d, ", formattedMinDepositAmount=");
        sb.append(this.e);
        sb.append(dqvOSm.XiSLjJrllejAIG);
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public i500(x250 x250Var, String str, String str2, String str3, String str4, PaydayPromoModalVariantDomain paydayPromoModalVariantDomain) {
        this.a = x250Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = paydayPromoModalVariantDomain;
    }

    public i500() {
        this(0);
    }
}
