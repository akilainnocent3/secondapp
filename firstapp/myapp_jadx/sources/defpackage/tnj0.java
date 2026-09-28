package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0018"}, d2 = {"Ltnj0;", "", "", "a", "Ljava/lang/String;", "getPhoneNo", "()Ljava/lang/String;", "phoneNo", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "payAmount", "", "c", "I", "getPayChId", "()I", "payChId", "d", "isConfirmAudit", "e", "getChannel", AppsFlyerProperties.CHANNEL, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class tnj0 {

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
    @SerializedName("isConfirmAudit")
    private final int isConfirmAudit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(AppsFlyerProperties.CHANNEL)
    private final String channel;

    public tnj0(String str, BigDecimal bigDecimal, int i, int i2, String str2) {
        str.getClass();
        bigDecimal.getClass();
        this.phoneNo = str;
        this.payAmount = bigDecimal;
        this.payChId = i;
        this.isConfirmAudit = i2;
        this.channel = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnj0)) {
            return false;
        }
        tnj0 tnj0Var = (tnj0) obj;
        return Intrinsics.g(this.phoneNo, tnj0Var.phoneNo) && Intrinsics.g(this.payAmount, tnj0Var.payAmount) && this.payChId == tnj0Var.payChId && this.isConfirmAudit == tnj0Var.isConfirmAudit && Intrinsics.g(this.channel, tnj0Var.channel);
    }

    public final int hashCode() {
        int iA = gpp.a(this.isConfirmAudit, gpp.a(this.payChId, dd3.a(this.payAmount, this.phoneNo.hashCode() * 31, 31), 31), 31);
        String str = this.channel;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.phoneNo;
        BigDecimal bigDecimal = this.payAmount;
        int i = this.payChId;
        int i2 = this.isConfirmAudit;
        String str2 = this.channel;
        StringBuilder sbA = yz80.a(bigDecimal, "WithdrawRequestInfo(phoneNo=", str, ", payAmount=", ", payChId=");
        d5d.a(sbA, i, ", isConfirmAudit=", i2, ", channel=");
        return uf80.a(sbA, str2, ")");
    }
}
