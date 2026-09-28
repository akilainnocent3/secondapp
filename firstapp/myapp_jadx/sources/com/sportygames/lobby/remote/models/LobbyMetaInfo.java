package com.sportygames.lobby.remote.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.xbp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u0010?\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010@J\u0006\u0010A\u001a\u00020BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020BHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020BR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016¨\u0006N"}, d2 = {"Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;", "Landroid/os/Parcelable;", "toolbarColor", "", "minimumSdkVersion", "", "minimumAppVersionSupported", "webviewVersion", "betcontainer_clean", "fbgdialog_old", "sporthero_oldflow", "minimumCMSVersionSupported", "gameUrl", "deepLinkCode", "appLinkEntrySupported", "jackpot_amount", "jackpot_currency", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToolbarColor", "()Ljava/lang/String;", "setToolbarColor", "(Ljava/lang/String;)V", "getMinimumSdkVersion", "()Ljava/lang/Long;", "setMinimumSdkVersion", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMinimumAppVersionSupported", "setMinimumAppVersionSupported", "getWebviewVersion", "setWebviewVersion", "getBetcontainer_clean", "setBetcontainer_clean", "getFbgdialog_old", "setFbgdialog_old", "getSporthero_oldflow", "setSporthero_oldflow", "getMinimumCMSVersionSupported", "setMinimumCMSVersionSupported", "getGameUrl", "setGameUrl", "getDeepLinkCode", "setDeepLinkCode", "getAppLinkEntrySupported", "setAppLinkEntrySupported", "getJackpot_amount", "setJackpot_amount", "getJackpot_currency", "setJackpot_currency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyMetaInfo implements Parcelable {
    private String appLinkEntrySupported;
    private String betcontainer_clean;
    private String deepLinkCode;
    private String fbgdialog_old;
    private String gameUrl;
    private String jackpot_amount;
    private String jackpot_currency;
    private Long minimumAppVersionSupported;
    private Long minimumCMSVersionSupported;
    private Long minimumSdkVersion;
    private String sporthero_oldflow;
    private String toolbarColor;
    private String webviewVersion;
    public static final Parcelable.Creator<LobbyMetaInfo> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LobbyMetaInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LobbyMetaInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LobbyMetaInfo(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LobbyMetaInfo[] newArray(int i) {
            return new LobbyMetaInfo[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LobbyMetaInfo(String str, Long l, Long l2, String str2, String str3, String str4, String str5, Long l3, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l4 = 0L;
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? l4 : l, (i & 4) != 0 ? l4 : l2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) == 0 ? l3 : 0L, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10);
    }

    public static /* synthetic */ LobbyMetaInfo copy$default(LobbyMetaInfo lobbyMetaInfo, String str, Long l, Long l2, String str2, String str3, String str4, String str5, Long l3, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lobbyMetaInfo.toolbarColor;
        }
        return lobbyMetaInfo.copy(str, (i & 2) != 0 ? lobbyMetaInfo.minimumSdkVersion : l, (i & 4) != 0 ? lobbyMetaInfo.minimumAppVersionSupported : l2, (i & 8) != 0 ? lobbyMetaInfo.webviewVersion : str2, (i & 16) != 0 ? lobbyMetaInfo.betcontainer_clean : str3, (i & 32) != 0 ? lobbyMetaInfo.fbgdialog_old : str4, (i & 64) != 0 ? lobbyMetaInfo.sporthero_oldflow : str5, (i & 128) != 0 ? lobbyMetaInfo.minimumCMSVersionSupported : l3, (i & 256) != 0 ? lobbyMetaInfo.gameUrl : str6, (i & 512) != 0 ? lobbyMetaInfo.deepLinkCode : str7, (i & 1024) != 0 ? lobbyMetaInfo.appLinkEntrySupported : str8, (i & 2048) != 0 ? lobbyMetaInfo.jackpot_amount : str9, (i & 4096) != 0 ? lobbyMetaInfo.jackpot_currency : str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolbarColor() {
        return this.toolbarColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeepLinkCode() {
        return this.deepLinkCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAppLinkEntrySupported() {
        return this.appLinkEntrySupported;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getJackpot_amount() {
        return this.jackpot_amount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getJackpot_currency() {
        return this.jackpot_currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getMinimumSdkVersion() {
        return this.minimumSdkVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getMinimumAppVersionSupported() {
        return this.minimumAppVersionSupported;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWebviewVersion() {
        return this.webviewVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBetcontainer_clean() {
        return this.betcontainer_clean;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFbgdialog_old() {
        return this.fbgdialog_old;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSporthero_oldflow() {
        return this.sporthero_oldflow;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getMinimumCMSVersionSupported() {
        return this.minimumCMSVersionSupported;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGameUrl() {
        return this.gameUrl;
    }

    public final LobbyMetaInfo copy(@xbp(name = "toolbarColor") String toolbarColor, @xbp(name = "minimumSdkVersion") Long minimumSdkVersion, @xbp(name = "minimumAppVersionSupported") Long minimumAppVersionSupported, @xbp(name = "webviewVersion") String webviewVersion, @xbp(name = "betcontainer_clean") String betcontainer_clean, @xbp(name = "fbgdialog_old") String fbgdialog_old, @xbp(name = "sporthero_oldflow") String sporthero_oldflow, @xbp(name = "minimumCMSVersionSupported") Long minimumCMSVersionSupported, @xbp(name = "gameUrl") String gameUrl, @xbp(name = "deepLinkCode") String deepLinkCode, @xbp(name = "appLinkEntrySupported") String appLinkEntrySupported, @xbp(name = "jackpot_amount") String jackpot_amount, @xbp(name = "jackpot_currency") String jackpot_currency) {
        return new LobbyMetaInfo(toolbarColor, minimumSdkVersion, minimumAppVersionSupported, webviewVersion, betcontainer_clean, fbgdialog_old, sporthero_oldflow, minimumCMSVersionSupported, gameUrl, deepLinkCode, appLinkEntrySupported, jackpot_amount, jackpot_currency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LobbyMetaInfo)) {
            return false;
        }
        LobbyMetaInfo lobbyMetaInfo = (LobbyMetaInfo) other;
        return Intrinsics.g(this.toolbarColor, lobbyMetaInfo.toolbarColor) && Intrinsics.g(this.minimumSdkVersion, lobbyMetaInfo.minimumSdkVersion) && Intrinsics.g(this.minimumAppVersionSupported, lobbyMetaInfo.minimumAppVersionSupported) && Intrinsics.g(this.webviewVersion, lobbyMetaInfo.webviewVersion) && Intrinsics.g(this.betcontainer_clean, lobbyMetaInfo.betcontainer_clean) && Intrinsics.g(this.fbgdialog_old, lobbyMetaInfo.fbgdialog_old) && Intrinsics.g(this.sporthero_oldflow, lobbyMetaInfo.sporthero_oldflow) && Intrinsics.g(this.minimumCMSVersionSupported, lobbyMetaInfo.minimumCMSVersionSupported) && Intrinsics.g(this.gameUrl, lobbyMetaInfo.gameUrl) && Intrinsics.g(this.deepLinkCode, lobbyMetaInfo.deepLinkCode) && Intrinsics.g(this.appLinkEntrySupported, lobbyMetaInfo.appLinkEntrySupported) && Intrinsics.g(this.jackpot_amount, lobbyMetaInfo.jackpot_amount) && Intrinsics.g(this.jackpot_currency, lobbyMetaInfo.jackpot_currency);
    }

    public final String getAppLinkEntrySupported() {
        return this.appLinkEntrySupported;
    }

    public final String getBetcontainer_clean() {
        return this.betcontainer_clean;
    }

    public final String getDeepLinkCode() {
        return this.deepLinkCode;
    }

    public final String getFbgdialog_old() {
        return this.fbgdialog_old;
    }

    public final String getGameUrl() {
        return this.gameUrl;
    }

    public final String getJackpot_amount() {
        return this.jackpot_amount;
    }

    public final String getJackpot_currency() {
        return this.jackpot_currency;
    }

    public final Long getMinimumAppVersionSupported() {
        return this.minimumAppVersionSupported;
    }

    public final Long getMinimumCMSVersionSupported() {
        return this.minimumCMSVersionSupported;
    }

    public final Long getMinimumSdkVersion() {
        return this.minimumSdkVersion;
    }

    public final String getSporthero_oldflow() {
        return this.sporthero_oldflow;
    }

    public final String getToolbarColor() {
        return this.toolbarColor;
    }

    public final String getWebviewVersion() {
        return this.webviewVersion;
    }

    public int hashCode() {
        String str = this.toolbarColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.minimumSdkVersion;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.minimumAppVersionSupported;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.webviewVersion;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.betcontainer_clean;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fbgdialog_old;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sporthero_oldflow;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l3 = this.minimumCMSVersionSupported;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.gameUrl;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deepLinkCode;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.appLinkEntrySupported;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.jackpot_amount;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.jackpot_currency;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setAppLinkEntrySupported(String str) {
        this.appLinkEntrySupported = str;
    }

    public final void setBetcontainer_clean(String str) {
        this.betcontainer_clean = str;
    }

    public final void setDeepLinkCode(String str) {
        this.deepLinkCode = str;
    }

    public final void setFbgdialog_old(String str) {
        this.fbgdialog_old = str;
    }

    public final void setGameUrl(String str) {
        this.gameUrl = str;
    }

    public final void setJackpot_amount(String str) {
        this.jackpot_amount = str;
    }

    public final void setJackpot_currency(String str) {
        this.jackpot_currency = str;
    }

    public final void setMinimumAppVersionSupported(Long l) {
        this.minimumAppVersionSupported = l;
    }

    public final void setMinimumCMSVersionSupported(Long l) {
        this.minimumCMSVersionSupported = l;
    }

    public final void setMinimumSdkVersion(Long l) {
        this.minimumSdkVersion = l;
    }

    public final void setSporthero_oldflow(String str) {
        this.sporthero_oldflow = str;
    }

    public final void setToolbarColor(String str) {
        this.toolbarColor = str;
    }

    public final void setWebviewVersion(String str) {
        this.webviewVersion = str;
    }

    public String toString() {
        String str = this.toolbarColor;
        Long l = this.minimumSdkVersion;
        Long l2 = this.minimumAppVersionSupported;
        String str2 = this.webviewVersion;
        String str3 = this.betcontainer_clean;
        String str4 = this.fbgdialog_old;
        String str5 = this.sporthero_oldflow;
        Long l3 = this.minimumCMSVersionSupported;
        String str6 = this.gameUrl;
        String str7 = this.deepLinkCode;
        String str8 = this.appLinkEntrySupported;
        String str9 = this.jackpot_amount;
        String str10 = this.jackpot_currency;
        StringBuilder sb = new StringBuilder("LobbyMetaInfo(toolbarColor=");
        sb.append(str);
        sb.append(", minimumSdkVersion=");
        sb.append(l);
        sb.append(", minimumAppVersionSupported=");
        sb.append(l2);
        sb.append(", webviewVersion=");
        sb.append(str2);
        sb.append(", betcontainer_clean=");
        hxa.c(sb, str3, ", fbgdialog_old=", str4, ", sporthero_oldflow=");
        sb.append(str5);
        sb.append(", minimumCMSVersionSupported=");
        sb.append(l3);
        sb.append(", gameUrl=");
        hxa.c(sb, str6, ", deepLinkCode=", str7, ", appLinkEntrySupported=");
        hxa.c(sb, str8, ", jackpot_amount=", str9, ", jackpot_currency=");
        return uf80.a(sb, str10, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.toolbarColor);
        Long l = this.minimumSdkVersion;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        Long l2 = this.minimumAppVersionSupported;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l2.longValue());
        }
        dest.writeString(this.webviewVersion);
        dest.writeString(this.betcontainer_clean);
        dest.writeString(this.fbgdialog_old);
        dest.writeString(this.sporthero_oldflow);
        Long l3 = this.minimumCMSVersionSupported;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l3.longValue());
        }
        dest.writeString(this.gameUrl);
        dest.writeString(this.deepLinkCode);
        dest.writeString(this.appLinkEntrySupported);
        dest.writeString(this.jackpot_amount);
        dest.writeString(this.jackpot_currency);
    }

    public LobbyMetaInfo(@xbp(name = "toolbarColor") String str, @xbp(name = "minimumSdkVersion") Long l, @xbp(name = "minimumAppVersionSupported") Long l2, @xbp(name = "webviewVersion") String str2, @xbp(name = "betcontainer_clean") String str3, @xbp(name = "fbgdialog_old") String str4, @xbp(name = "sporthero_oldflow") String str5, @xbp(name = "minimumCMSVersionSupported") Long l3, @xbp(name = "gameUrl") String str6, @xbp(name = "deepLinkCode") String str7, @xbp(name = "appLinkEntrySupported") String str8, @xbp(name = "jackpot_amount") String str9, @xbp(name = "jackpot_currency") String str10) {
        this.toolbarColor = str;
        this.minimumSdkVersion = l;
        this.minimumAppVersionSupported = l2;
        this.webviewVersion = str2;
        this.betcontainer_clean = str3;
        this.fbgdialog_old = str4;
        this.sporthero_oldflow = str5;
        this.minimumCMSVersionSupported = l3;
        this.gameUrl = str6;
        this.deepLinkCode = str7;
        this.appLinkEntrySupported = str8;
        this.jackpot_amount = str9;
        this.jackpot_currency = str10;
    }

    public LobbyMetaInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
