package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lae7;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "chatRoomId", "getCountryCode", "countryCode", "c", "getGameName", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "d", "botUserId", "", "e", "I", "getCurrentRoomId", "()I", "currentRoomId", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ae7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("chatRoomId")
    private final String chatRoomId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("countryCode")
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT)
    private final String gameName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("botUserId")
    private final String botUserId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("currentRoomId")
    private final int currentRoomId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBotUserId() {
        return this.botUserId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae7)) {
            return false;
        }
        ae7 ae7Var = (ae7) obj;
        return Intrinsics.g(this.chatRoomId, ae7Var.chatRoomId) && Intrinsics.g(this.countryCode, ae7Var.countryCode) && Intrinsics.g(this.gameName, ae7Var.gameName) && Intrinsics.g(this.botUserId, ae7Var.botUserId) && this.currentRoomId == ae7Var.currentRoomId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.currentRoomId) + gmf0.a(gmf0.a(gmf0.a(this.chatRoomId.hashCode() * 31, 31, this.countryCode), 31, this.gameName), 31, this.botUserId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatRoomResponse(chatRoomId=");
        sb.append(this.chatRoomId);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", gameName=");
        sb.append(this.gameName);
        sb.append(", botUserId=");
        sb.append(this.botUserId);
        sb.append(", currentRoomId=");
        return rr1.b(sb, this.currentRoomId, ')');
    }
}
