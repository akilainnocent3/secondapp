package defpackage;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lnnh0;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "giftId", "", "b", "I", "()I", "boostKind", "d", "logId", "", "J", "()J", "acceptTime", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class nnh0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("giftId")
    private final String giftId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("boostKind")
    private final int boostKind;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("logId")
    private final String logId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("acceptTime")
    private final long acceptTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAcceptTime() {
        return this.acceptTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBoostKind() {
        return this.boostKind;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLogId() {
        return this.logId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnh0)) {
            return false;
        }
        nnh0 nnh0Var = (nnh0) obj;
        return Intrinsics.g(this.giftId, nnh0Var.giftId) && this.boostKind == nnh0Var.boostKind && Intrinsics.g(this.logId, nnh0Var.logId) && this.acceptTime == nnh0Var.acceptTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.acceptTime) + gmf0.a(gpp.a(this.boostKind, this.giftId.hashCode() * 31, 31), 31, this.logId);
    }

    public final String toString() {
        String str = this.giftId;
        int i = this.boostKind;
        String str2 = this.logId;
        long j = this.acceptTime;
        StringBuilder sbA = ml5.a(i, "UseBoostGiftResponseDto(giftId=", str, ", boostKind=", ", logId=");
        l.a(j, str2, ", acceptTime=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
