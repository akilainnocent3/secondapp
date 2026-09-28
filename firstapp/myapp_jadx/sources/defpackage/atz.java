package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Latz;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "type", "b", AnalyticsParam.EVENT_STATUS, EventKeys.ERROR_MESSAGE, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class atz {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("type")
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(EventKeys.ERROR_MESSAGE)
    private final String message;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atz)) {
            return false;
        }
        atz atzVar = (atz) obj;
        return Intrinsics.g(this.type, atzVar.type) && Intrinsics.g(this.status, atzVar.status) && Intrinsics.g(this.message, atzVar.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + gmf0.a(this.type.hashCode() * 31, 31, this.status);
    }

    public final String toString() {
        String str = this.type;
        String str2 = this.status;
        return uf80.a(ux5.a("ParticipateBettingStreakMissionResponse(type=", str, ", status=", str2, ", message="), this.message, ")");
    }
}
