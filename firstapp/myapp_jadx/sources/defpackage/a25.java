package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\r\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001d"}, d2 = {"La25;", "", "", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "giftId", "", "b", "I", "()I", "boostKind", "c", "e", "displayTitle", "d", "displayDesc", "days", "f", "h", "multiplier", "i", AnalyticsParam.EVENT_STATUS, "", "J", "()J", "deliveryTime", "expireTime", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class a25 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("giftId")
    private final String giftId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("boostKind")
    private final int boostKind;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("displayTitle")
    private final String displayTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("displayDesc")
    private final String displayDesc;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("days")
    private final int days;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("multiplier")
    private final int multiplier;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("deliveryTime")
    private final long deliveryTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("expireTime")
    private final long expireTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBoostKind() {
        return this.boostKind;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDeliveryTime() {
        return this.deliveryTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDisplayDesc() {
        return this.displayDesc;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a25)) {
            return false;
        }
        a25 a25Var = (a25) obj;
        return Intrinsics.g(this.giftId, a25Var.giftId) && this.boostKind == a25Var.boostKind && Intrinsics.g(this.displayTitle, a25Var.displayTitle) && Intrinsics.g(this.displayDesc, a25Var.displayDesc) && this.days == a25Var.days && this.multiplier == a25Var.multiplier && this.status == a25Var.status && this.deliveryTime == a25Var.deliveryTime && this.expireTime == a25Var.expireTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMultiplier() {
        return this.multiplier;
    }

    public final int hashCode() {
        return Long.hashCode(this.expireTime) + f87.a(gpp.a(this.status, gpp.a(this.multiplier, gpp.a(this.days, gmf0.a(gmf0.a(gpp.a(this.boostKind, this.giftId.hashCode() * 31, 31), 31, this.displayTitle), 31, this.displayDesc), 31), 31), 31), this.deliveryTime, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final String toString() {
        String str = this.giftId;
        int i = this.boostKind;
        String str2 = this.displayTitle;
        String str3 = this.displayDesc;
        int i2 = this.days;
        int i3 = this.multiplier;
        int i4 = this.status;
        long j = this.deliveryTime;
        long j2 = this.expireTime;
        StringBuilder sbA = ml5.a(i, "BoostGiftDto(giftId=", str, ", boostKind=", ", displayTitle=");
        hxa.c(sbA, str2, ", displayDesc=", str3, ", days=");
        d5d.a(sbA, i2, ", multiplier=", i3, ", status=");
        sbA.append(i4);
        sbA.append(", deliveryTime=");
        sbA.append(j);
        return zug.a(j2, ", expireTime=", ")", sbA);
    }
}
