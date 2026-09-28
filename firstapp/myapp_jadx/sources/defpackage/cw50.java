package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcw50;", "", "", "a", "J", "d", "()J", "roomConfigId", "", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "roomName", "c", "maxWinAmount", "", "I", "()I", "activePlayerCount", "", "D", "()D", "entryFeeAmount", "f", "theme", "", "g", "Z", "()Z", "isSpecial", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class cw50 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("roomConfigId")
    private final long roomConfigId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("name")
    private final String roomName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("maxWinAmount")
    private final String maxWinAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("activePlayerCount")
    private final int activePlayerCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("entryFeeAmount")
    private final double entryFeeAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("theme")
    private final String theme;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("special")
    private final boolean isSpecial;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getActivePlayerCount() {
        return this.activePlayerCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getEntryFeeAmount() {
        return this.entryFeeAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMaxWinAmount() {
        return this.maxWinAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getRoomConfigId() {
        return this.roomConfigId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw50)) {
            return false;
        }
        cw50 cw50Var = (cw50) obj;
        return this.roomConfigId == cw50Var.roomConfigId && Intrinsics.g(this.roomName, cw50Var.roomName) && Intrinsics.g(this.maxWinAmount, cw50Var.maxWinAmount) && this.activePlayerCount == cw50Var.activePlayerCount && Double.compare(this.entryFeeAmount, cw50Var.entryFeeAmount) == 0 && Intrinsics.g(this.theme, cw50Var.theme) && this.isSpecial == cw50Var.isSpecial;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSpecial() {
        return this.isSpecial;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSpecial) + gmf0.a(nrg0.a(gpp.a(this.activePlayerCount, gmf0.a(gmf0.a(Long.hashCode(this.roomConfigId) * 31, 31, this.roomName), 31, this.maxWinAmount), 31), 31, this.entryFeeAmount), 31, this.theme);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoomResponse(roomConfigId=");
        sb.append(this.roomConfigId);
        sb.append(", roomName=");
        sb.append(this.roomName);
        sb.append(", maxWinAmount=");
        sb.append(this.maxWinAmount);
        sb.append(", activePlayerCount=");
        sb.append(this.activePlayerCount);
        sb.append(", entryFeeAmount=");
        sb.append(this.entryFeeAmount);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", isSpecial=");
        return ruw.a(sb, this.isSpecial, ')');
    }
}
