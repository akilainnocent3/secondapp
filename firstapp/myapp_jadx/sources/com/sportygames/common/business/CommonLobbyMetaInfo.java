package com.sportygames.common.business;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b0\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0006\u00105\u001a\u000206J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000206HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000206R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013¨\u0006B"}, d2 = {"Lcom/sportygames/common/business/CommonLobbyMetaInfo;", "Landroid/os/Parcelable;", "toolbarColor", "", "minimumSdkVersion", "", "minimumAppVersionSupported", "webviewVersion", "betcontainer_clean", "fbgdialog_old", "sporthero_oldflow", "minimumCMSVersionSupported", "gameUrl", "deepLinkCode", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getToolbarColor", "()Ljava/lang/String;", "setToolbarColor", "(Ljava/lang/String;)V", "getMinimumSdkVersion", "()Ljava/lang/Long;", "setMinimumSdkVersion", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMinimumAppVersionSupported", "setMinimumAppVersionSupported", "getWebviewVersion", "setWebviewVersion", "getBetcontainer_clean", "setBetcontainer_clean", "getFbgdialog_old", "setFbgdialog_old", "getSporthero_oldflow", "setSporthero_oldflow", "getMinimumCMSVersionSupported", "setMinimumCMSVersionSupported", "getGameUrl", "setGameUrl", "getDeepLinkCode", "setDeepLinkCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/common/business/CommonLobbyMetaInfo;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommonLobbyMetaInfo implements Parcelable {
    public static final Parcelable.Creator<CommonLobbyMetaInfo> CREATOR = new a();
    private String betcontainer_clean;
    private String deepLinkCode;
    private String fbgdialog_old;
    private String gameUrl;
    private Long minimumAppVersionSupported;
    private Long minimumCMSVersionSupported;
    private Long minimumSdkVersion;
    private String sporthero_oldflow;
    private String toolbarColor;
    private String webviewVersion;

    public static final class a implements Parcelable.Creator<CommonLobbyMetaInfo> {
        @Override // android.os.Parcelable.Creator
        public final CommonLobbyMetaInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CommonLobbyMetaInfo(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonLobbyMetaInfo[] newArray(int i) {
            return new CommonLobbyMetaInfo[i];
        }
    }

    public /* synthetic */ CommonLobbyMetaInfo(String str, Long l, Long l2, String str2, String str3, String str4, String str5, Long l3, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? 0L : l2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? 0L : l3, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7);
    }

    public static /* synthetic */ CommonLobbyMetaInfo copy$default(CommonLobbyMetaInfo commonLobbyMetaInfo, String str, Long l, Long l2, String str2, String str3, String str4, String str5, Long l3, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonLobbyMetaInfo.toolbarColor;
        }
        if ((i & 2) != 0) {
            l = commonLobbyMetaInfo.minimumSdkVersion;
        }
        if ((i & 4) != 0) {
            l2 = commonLobbyMetaInfo.minimumAppVersionSupported;
        }
        if ((i & 8) != 0) {
            str2 = commonLobbyMetaInfo.webviewVersion;
        }
        if ((i & 16) != 0) {
            str3 = commonLobbyMetaInfo.betcontainer_clean;
        }
        if ((i & 32) != 0) {
            str4 = commonLobbyMetaInfo.fbgdialog_old;
        }
        if ((i & 64) != 0) {
            str5 = commonLobbyMetaInfo.sporthero_oldflow;
        }
        if ((i & 128) != 0) {
            l3 = commonLobbyMetaInfo.minimumCMSVersionSupported;
        }
        if ((i & 256) != 0) {
            str6 = commonLobbyMetaInfo.gameUrl;
        }
        if ((i & 512) != 0) {
            str7 = commonLobbyMetaInfo.deepLinkCode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        Long l4 = l3;
        String str11 = str3;
        String str12 = str4;
        return commonLobbyMetaInfo.copy(str, l, l2, str2, str11, str12, str10, l4, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolbarColor() {
        return this.toolbarColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeepLinkCode() {
        return this.deepLinkCode;
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

    public final CommonLobbyMetaInfo copy(String toolbarColor, Long minimumSdkVersion, Long minimumAppVersionSupported, String webviewVersion, String betcontainer_clean, String fbgdialog_old, String sporthero_oldflow, Long minimumCMSVersionSupported, String gameUrl, String deepLinkCode) {
        return new CommonLobbyMetaInfo(toolbarColor, minimumSdkVersion, minimumAppVersionSupported, webviewVersion, betcontainer_clean, fbgdialog_old, sporthero_oldflow, minimumCMSVersionSupported, gameUrl, deepLinkCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonLobbyMetaInfo)) {
            return false;
        }
        CommonLobbyMetaInfo commonLobbyMetaInfo = (CommonLobbyMetaInfo) other;
        return Intrinsics.g(this.toolbarColor, commonLobbyMetaInfo.toolbarColor) && Intrinsics.g(this.minimumSdkVersion, commonLobbyMetaInfo.minimumSdkVersion) && Intrinsics.g(this.minimumAppVersionSupported, commonLobbyMetaInfo.minimumAppVersionSupported) && Intrinsics.g(this.webviewVersion, commonLobbyMetaInfo.webviewVersion) && Intrinsics.g(this.betcontainer_clean, commonLobbyMetaInfo.betcontainer_clean) && Intrinsics.g(this.fbgdialog_old, commonLobbyMetaInfo.fbgdialog_old) && Intrinsics.g(this.sporthero_oldflow, commonLobbyMetaInfo.sporthero_oldflow) && Intrinsics.g(this.minimumCMSVersionSupported, commonLobbyMetaInfo.minimumCMSVersionSupported) && Intrinsics.g(this.gameUrl, commonLobbyMetaInfo.gameUrl) && Intrinsics.g(this.deepLinkCode, commonLobbyMetaInfo.deepLinkCode);
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
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
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
        StringBuilder sb = new StringBuilder("CommonLobbyMetaInfo(toolbarColor=");
        sb.append(this.toolbarColor);
        sb.append(", minimumSdkVersion=");
        sb.append(this.minimumSdkVersion);
        sb.append(", minimumAppVersionSupported=");
        sb.append(this.minimumAppVersionSupported);
        sb.append(", webviewVersion=");
        sb.append(this.webviewVersion);
        sb.append(", betcontainer_clean=");
        sb.append(this.betcontainer_clean);
        sb.append(", fbgdialog_old=");
        sb.append(this.fbgdialog_old);
        sb.append(", sporthero_oldflow=");
        sb.append(this.sporthero_oldflow);
        sb.append(", minimumCMSVersionSupported=");
        sb.append(this.minimumCMSVersionSupported);
        sb.append(", gameUrl=");
        sb.append(this.gameUrl);
        sb.append(", deepLinkCode=");
        return j26.a(sb, this.deepLinkCode, ')');
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
    }

    public CommonLobbyMetaInfo(String str, Long l, Long l2, String str2, String str3, String str4, String str5, Long l3, String str6, String str7) {
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
    }

    public CommonLobbyMetaInfo() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
