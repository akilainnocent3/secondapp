package defpackage;

import com.google.gson.annotations.SerializedName;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lb0e0;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "gameStatus", "Ltcp;", "b", "Ltcp;", "()Ltcp;", EventKeys.PAYLOAD, "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("gameStatus")
    private final String gameStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(EventKeys.PAYLOAD)
    private final tcp payload;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGameStatus() {
        return this.gameStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final tcp getPayload() {
        return this.payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0e0)) {
            return false;
        }
        b0e0 b0e0Var = (b0e0) obj;
        return Intrinsics.g(this.gameStatus, b0e0Var.gameStatus) && Intrinsics.g(this.payload, b0e0Var.payload);
    }

    public final int hashCode() {
        int iHashCode = this.gameStatus.hashCode() * 31;
        tcp tcpVar = this.payload;
        return iHashCode + (tcpVar == null ? 0 : tcpVar.hashCode());
    }

    public final String toString() {
        return "StatusResponse(gameStatus=" + this.gameStatus + ", payload=" + this.payload + ')';
    }
}
