package com.sportygames.lobby.remote.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.f78;
import defpackage.hxa;
import defpackage.oie;
import defpackage.ux5;
import defpackage.xbp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0090\u0001\u00107\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00108J\u0006\u00109\u001a\u00020\tJ\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\tHÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006E"}, d2 = {"Lcom/sportygames/lobby/remote/models/NotificationResponse;", "Landroid/os/Parcelable;", "nickName", "", "winAmount", "currency", "time", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "gameId", "", "launchUrl", "imageUrl", "launchTrigger", "nativeSupportVersion", "metaInfo", "Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;)V", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "getWinAmount", "getCurrency", "getTime", "getGameName", "setGameName", "getGameId", "()Ljava/lang/Integer;", "setGameId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLaunchUrl", "setLaunchUrl", "getImageUrl", "setImageUrl", "getLaunchTrigger", "setLaunchTrigger", "getNativeSupportVersion", "setNativeSupportVersion", "getMetaInfo", "()Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;", "setMetaInfo", "(Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;)Lcom/sportygames/lobby/remote/models/NotificationResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationResponse implements Parcelable {
    private final String currency;
    private Integer gameId;
    private String gameName;
    private String imageUrl;
    private String launchTrigger;
    private String launchUrl;
    private LobbyMetaInfo metaInfo;
    private String nativeSupportVersion;
    private String nickName;
    private final String time;
    private final String winAmount;
    public static final Parcelable.Creator<NotificationResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new NotificationResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? LobbyMetaInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationResponse[] newArray(int i) {
            return new NotificationResponse[i];
        }
    }

    public /* synthetic */ NotificationResponse(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, LobbyMetaInfo lobbyMetaInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0 : num, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? null : lobbyMetaInfo);
    }

    public static /* synthetic */ NotificationResponse copy$default(NotificationResponse notificationResponse, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, LobbyMetaInfo lobbyMetaInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationResponse.nickName;
        }
        if ((i & 2) != 0) {
            str2 = notificationResponse.winAmount;
        }
        if ((i & 4) != 0) {
            str3 = notificationResponse.currency;
        }
        if ((i & 8) != 0) {
            str4 = notificationResponse.time;
        }
        if ((i & 16) != 0) {
            str5 = notificationResponse.gameName;
        }
        if ((i & 32) != 0) {
            num = notificationResponse.gameId;
        }
        if ((i & 64) != 0) {
            str6 = notificationResponse.launchUrl;
        }
        if ((i & 128) != 0) {
            str7 = notificationResponse.imageUrl;
        }
        if ((i & 256) != 0) {
            str8 = notificationResponse.launchTrigger;
        }
        if ((i & 512) != 0) {
            str9 = notificationResponse.nativeSupportVersion;
        }
        if ((i & 1024) != 0) {
            lobbyMetaInfo = notificationResponse.metaInfo;
        }
        String str10 = str9;
        LobbyMetaInfo lobbyMetaInfo2 = lobbyMetaInfo;
        String str11 = str7;
        String str12 = str8;
        Integer num2 = num;
        String str13 = str6;
        String str14 = str5;
        String str15 = str3;
        return notificationResponse.copy(str, str2, str15, str4, str14, num2, str13, str11, str12, str10, lobbyMetaInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNativeSupportVersion() {
        return this.nativeSupportVersion;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final LobbyMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWinAmount() {
        return this.winAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGameName() {
        return this.gameName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLaunchUrl() {
        return this.launchUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLaunchTrigger() {
        return this.launchTrigger;
    }

    public final NotificationResponse copy(@xbp(name = "nickName") String nickName, @xbp(name = "winAmount") String winAmount, @xbp(name = "currency") String currency, @xbp(name = "time") String time, @xbp(name = JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String gameName, @xbp(name = "gameId") Integer gameId, @xbp(name = "launchUrl") String launchUrl, @xbp(name = "imageUrl") String imageUrl, @xbp(name = "launchTrigger") String launchTrigger, @xbp(name = "nativeSupportVersion") String nativeSupportVersion, @xbp(name = "metaInfo") LobbyMetaInfo metaInfo) {
        nickName.getClass();
        return new NotificationResponse(nickName, winAmount, currency, time, gameName, gameId, launchUrl, imageUrl, launchTrigger, nativeSupportVersion, metaInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationResponse)) {
            return false;
        }
        NotificationResponse notificationResponse = (NotificationResponse) other;
        return Intrinsics.g(this.nickName, notificationResponse.nickName) && Intrinsics.g(this.winAmount, notificationResponse.winAmount) && Intrinsics.g(this.currency, notificationResponse.currency) && Intrinsics.g(this.time, notificationResponse.time) && Intrinsics.g(this.gameName, notificationResponse.gameName) && Intrinsics.g(this.gameId, notificationResponse.gameId) && Intrinsics.g(this.launchUrl, notificationResponse.launchUrl) && Intrinsics.g(this.imageUrl, notificationResponse.imageUrl) && Intrinsics.g(this.launchTrigger, notificationResponse.launchTrigger) && Intrinsics.g(this.nativeSupportVersion, notificationResponse.nativeSupportVersion) && Intrinsics.g(this.metaInfo, notificationResponse.metaInfo);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getGameId() {
        return this.gameId;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLaunchTrigger() {
        return this.launchTrigger;
    }

    public final String getLaunchUrl() {
        return this.launchUrl;
    }

    public final LobbyMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public final String getNativeSupportVersion() {
        return this.nativeSupportVersion;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getWinAmount() {
        return this.winAmount;
    }

    public int hashCode() {
        int iHashCode = this.nickName.hashCode() * 31;
        String str = this.winAmount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.time;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gameName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.gameId;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.launchUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageUrl;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.launchTrigger;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.nativeSupportVersion;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        LobbyMetaInfo lobbyMetaInfo = this.metaInfo;
        return iHashCode10 + (lobbyMetaInfo != null ? lobbyMetaInfo.hashCode() : 0);
    }

    public final void setGameId(Integer num) {
        this.gameId = num;
    }

    public final void setGameName(String str) {
        this.gameName = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setLaunchTrigger(String str) {
        this.launchTrigger = str;
    }

    public final void setLaunchUrl(String str) {
        this.launchUrl = str;
    }

    public final void setMetaInfo(LobbyMetaInfo lobbyMetaInfo) {
        this.metaInfo = lobbyMetaInfo;
    }

    public final void setNativeSupportVersion(String str) {
        this.nativeSupportVersion = str;
    }

    public final void setNickName(String str) {
        str.getClass();
        this.nickName = str;
    }

    public String toString() {
        String str = this.nickName;
        String str2 = this.winAmount;
        String str3 = this.currency;
        String str4 = this.time;
        String str5 = this.gameName;
        Integer num = this.gameId;
        String str6 = this.launchUrl;
        String str7 = this.imageUrl;
        String str8 = this.launchTrigger;
        String str9 = this.nativeSupportVersion;
        LobbyMetaInfo lobbyMetaInfo = this.metaInfo;
        StringBuilder sbA = ux5.a("NotificationResponse(nickName=", str, ", winAmount=", str2, ", currency=");
        hxa.c(sbA, str3, ", time=", str4, ", gameName=");
        oie.a(num, str5, ", gameId=", ", launchUrl=", sbA);
        hxa.c(sbA, str6, ", imageUrl=", str7, ", launchTrigger=");
        hxa.c(sbA, str8, ", nativeSupportVersion=", str9, ", metaInfo=");
        sbA.append(lobbyMetaInfo);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.nickName);
        dest.writeString(this.winAmount);
        dest.writeString(this.currency);
        dest.writeString(this.time);
        dest.writeString(this.gameName);
        Integer num = this.gameId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
        dest.writeString(this.launchUrl);
        dest.writeString(this.imageUrl);
        dest.writeString(this.launchTrigger);
        dest.writeString(this.nativeSupportVersion);
        LobbyMetaInfo lobbyMetaInfo = this.metaInfo;
        if (lobbyMetaInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            lobbyMetaInfo.writeToParcel(dest, flags);
        }
    }

    public NotificationResponse(@xbp(name = "nickName") String str, @xbp(name = "winAmount") String str2, @xbp(name = "currency") String str3, @xbp(name = "time") String str4, @xbp(name = JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str5, @xbp(name = "gameId") Integer num, @xbp(name = "launchUrl") String str6, @xbp(name = "imageUrl") String str7, @xbp(name = "launchTrigger") String str8, @xbp(name = "nativeSupportVersion") String str9, @xbp(name = "metaInfo") LobbyMetaInfo lobbyMetaInfo) {
        str.getClass();
        this.nickName = str;
        this.winAmount = str2;
        this.currency = str3;
        this.time = str4;
        this.gameName = str5;
        this.gameId = num;
        this.launchUrl = str6;
        this.imageUrl = str7;
        this.launchTrigger = str8;
        this.nativeSupportVersion = str9;
        this.metaInfo = lobbyMetaInfo;
    }
}
