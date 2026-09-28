package defpackage;

import com.google.gson.annotations.SerializedName;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcr4;", "", "", "a", "Ljava/lang/Long;", "getSessionId", "()Ljava/lang/Long;", "sessionId", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "type", "c", "getCountryCode", "countryCode", "Lxdp;", "d", "Lxdp;", "()Lxdp;", EventKeys.PAYLOAD, "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class cr4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("sessionId")
    private final Long sessionId = null;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("type")
    private final String type = null;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("countryCode")
    private final String countryCode = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(EventKeys.PAYLOAD)
    private final xdp payload = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final xdp getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr4)) {
            return false;
        }
        cr4 cr4Var = (cr4) obj;
        return Intrinsics.g(this.sessionId, cr4Var.sessionId) && Intrinsics.g(this.type, cr4Var.type) && Intrinsics.g(this.countryCode, cr4Var.countryCode) && Intrinsics.g(this.payload, cr4Var.payload);
    }

    public final int hashCode() {
        Long l = this.sessionId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        xdp xdpVar = this.payload;
        return iHashCode3 + (xdpVar != null ? xdpVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "BonusCupWsMessageEnvelope(sessionId=" + this.sessionId + ", type=" + this.type + ", countryCode=" + this.countryCode + ", payload=" + this.payload + ')';
    }
}
