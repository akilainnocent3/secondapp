package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uts;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JY\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0014\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0083\u0004J\n\u0010+\u001a\u00020'HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010Ê\u0001\u0002\b3Ê\u0001\f\b4\u0012\b\b5\u0012\u0004\b\u0003\u0010\u0000¨\u00062"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/ShareBetData;", "Landroid/os/Parcelable;", "shareCode", "", "totalOdds", "totalBonus", "winningStatus", "totalStake", "isAllSettled", "", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getShareCode", "()Ljava/lang/String;", "setShareCode", "(Ljava/lang/String;)V", "getTotalOdds", "setTotalOdds", "getTotalBonus", "setTotalBonus", "getWinningStatus", "setWinningStatus", "getTotalStake", "setTotalStake", "()Z", "setAllSettled", "(Z)V", "getImageUrl", "setImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ShareBetData implements Parcelable {
    private String imageUrl;
    private boolean isAllSettled;
    private String shareCode;
    private String totalBonus;
    private String totalOdds;
    private String totalStake;
    private String winningStatus;
    public static final Parcelable.Creator<ShareBetData> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShareBetData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBetData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ShareBetData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBetData[] newArray(int i) {
            return new ShareBetData[i];
        }
    }

    public /* synthetic */ ShareBetData(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str6);
    }

    public static /* synthetic */ ShareBetData copy$default(ShareBetData shareBetData, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareBetData.shareCode;
        }
        if ((i & 2) != 0) {
            str2 = shareBetData.totalOdds;
        }
        if ((i & 4) != 0) {
            str3 = shareBetData.totalBonus;
        }
        if ((i & 8) != 0) {
            str4 = shareBetData.winningStatus;
        }
        if ((i & 16) != 0) {
            str5 = shareBetData.totalStake;
        }
        if ((i & 32) != 0) {
            z = shareBetData.isAllSettled;
        }
        if ((i & 64) != 0) {
            str6 = shareBetData.imageUrl;
        }
        boolean z2 = z;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return shareBetData.copy(str, str2, str9, str4, str8, z2, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTotalBonus() {
        return this.totalBonus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWinningStatus() {
        return this.winningStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsAllSettled() {
        return this.isAllSettled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ShareBetData copy(String shareCode, String totalOdds, String totalBonus, String winningStatus, String totalStake, boolean isAllSettled, String imageUrl) {
        imageUrl.getClass();
        return new ShareBetData(shareCode, totalOdds, totalBonus, winningStatus, totalStake, isAllSettled, imageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareBetData)) {
            return false;
        }
        ShareBetData shareBetData = (ShareBetData) other;
        return Intrinsics.g(this.shareCode, shareBetData.shareCode) && Intrinsics.g(this.totalOdds, shareBetData.totalOdds) && Intrinsics.g(this.totalBonus, shareBetData.totalBonus) && Intrinsics.g(this.winningStatus, shareBetData.winningStatus) && Intrinsics.g(this.totalStake, shareBetData.totalStake) && this.isAllSettled == shareBetData.isAllSettled && Intrinsics.g(this.imageUrl, shareBetData.imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final String getTotalBonus() {
        return this.totalBonus;
    }

    public final String getTotalOdds() {
        return this.totalOdds;
    }

    public final String getTotalStake() {
        return this.totalStake;
    }

    public final String getWinningStatus() {
        return this.winningStatus;
    }

    public int hashCode() {
        String str = this.shareCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.totalOdds;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalBonus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.winningStatus;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.totalStake;
        return this.imageUrl.hashCode() + mtg0.a((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.isAllSettled);
    }

    public final boolean isAllSettled() {
        return this.isAllSettled;
    }

    public final void setAllSettled(boolean z) {
        this.isAllSettled = z;
    }

    public final void setImageUrl(String str) {
        str.getClass();
        this.imageUrl = str;
    }

    public final void setShareCode(String str) {
        this.shareCode = str;
    }

    public final void setTotalBonus(String str) {
        this.totalBonus = str;
    }

    public final void setTotalOdds(String str) {
        this.totalOdds = str;
    }

    public final void setTotalStake(String str) {
        this.totalStake = str;
    }

    public final void setWinningStatus(String str) {
        this.winningStatus = str;
    }

    public String toString() {
        String str = this.shareCode;
        String str2 = this.totalOdds;
        String str3 = this.totalBonus;
        String str4 = this.winningStatus;
        String str5 = this.totalStake;
        boolean z = this.isAllSettled;
        String str6 = this.imageUrl;
        StringBuilder sbA = ux5.a("ShareBetData(shareCode=", str, ", totalOdds=", str2, ", totalBonus=");
        hxa.c(sbA, str3, ", winningStatus=", str4, ", totalStake=");
        uts.b(str5, ", isAllSettled=", ", imageUrl=", sbA, z);
        return uf80.a(sbA, str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.shareCode);
        dest.writeString(this.totalOdds);
        dest.writeString(this.totalBonus);
        dest.writeString(this.winningStatus);
        dest.writeString(this.totalStake);
        dest.writeInt(this.isAllSettled ? 1 : 0);
        dest.writeString(this.imageUrl);
    }

    public ShareBetData(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        str6.getClass();
        this.shareCode = str;
        this.totalOdds = str2;
        this.totalBonus = str3;
        this.winningStatus = str4;
        this.totalStake = str5;
        this.isAllSettled = z;
        this.imageUrl = str6;
    }

    public ShareBetData() {
        this(null, null, null, null, null, false, null, 127, null);
    }
}
