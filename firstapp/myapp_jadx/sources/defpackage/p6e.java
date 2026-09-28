package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u0019"}, d2 = {"Lp6e;", "", "", "a", "Ljava/lang/String;", "getPhoneNo", "()Ljava/lang/String;", "phoneNo", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "payAmount", "", "c", "I", "getPayChId", "()I", "payChId", "d", "getCurrency", "currency", "e", "getChannel", AppsFlyerProperties.CHANNEL, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class p6e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("phoneNo")
    private final String phoneNo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("payAmount")
    private final BigDecimal payAmount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("payChId")
    private final int payChId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("currency")
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(AppsFlyerProperties.CHANNEL)
    private final String channel;

    public p6e(int i, String str, String str2, BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.phoneNo = str;
        this.payAmount = bigDecimal;
        this.payChId = i;
        this.currency = str2;
        this.channel = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6e)) {
            return false;
        }
        p6e p6eVar = (p6e) obj;
        return Intrinsics.g(this.phoneNo, p6eVar.phoneNo) && Intrinsics.g(this.payAmount, p6eVar.payAmount) && this.payChId == p6eVar.payChId && Intrinsics.g(this.currency, p6eVar.currency) && Intrinsics.g(this.channel, p6eVar.channel);
    }

    public final int hashCode() {
        String str = this.phoneNo;
        int iA = gpp.a(this.payChId, dd3.a(this.payAmount, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.currency;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channel;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.phoneNo;
        BigDecimal bigDecimal = this.payAmount;
        int i = this.payChId;
        String str2 = this.currency;
        String str3 = this.channel;
        StringBuilder sbA = yz80.a(bigDecimal, "DepositRequestInfo(phoneNo=", str, ", payAmount=", ", payChId=");
        f78.b(i, ", currency=", str2, ", channel=", sbA);
        return uf80.a(sbA, str3, ")");
    }
}
