package com.sporty.android.chat.data;

import android.net.Uri;
import defpackage.eal;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.uts;
import defpackage.ux5;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010*\u001a\u00020\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jq\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0014\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00107\u001a\u000208HÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006:"}, d2 = {"Lcom/sporty/android/chat/data/LiveShareBetData;", "", "shareCode", "", "totalOdds", "totalBonus", "winningStatus", "totalStake", "isAllSettled", "", "imageUrl", "uri", "Landroid/net/Uri;", "originalFile", "Ljava/io/File;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Landroid/net/Uri;Ljava/io/File;)V", "getShareCode", "()Ljava/lang/String;", "setShareCode", "(Ljava/lang/String;)V", "getTotalOdds", "setTotalOdds", "getTotalBonus", "setTotalBonus", "getWinningStatus", "setWinningStatus", "getTotalStake", "setTotalStake", "()Z", "setAllSettled", "(Z)V", "getImageUrl", "setImageUrl", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "getOriginalFile", "()Ljava/io/File;", "setOriginalFile", "(Ljava/io/File;)V", "toJsonString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveShareBetData {
    private String imageUrl;
    private boolean isAllSettled;
    private transient File originalFile;
    private String shareCode;
    private String totalBonus;
    private String totalOdds;
    private String totalStake;
    private transient Uri uri;
    private String winningStatus;

    public /* synthetic */ LiveShareBetData(String str, String str2, String str3, String str4, String str5, boolean z, String str6, Uri uri, File file, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? Uri.EMPTY : uri, (i & 256) != 0 ? null : file);
    }

    public static /* synthetic */ LiveShareBetData copy$default(LiveShareBetData liveShareBetData, String str, String str2, String str3, String str4, String str5, boolean z, String str6, Uri uri, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveShareBetData.shareCode;
        }
        if ((i & 2) != 0) {
            str2 = liveShareBetData.totalOdds;
        }
        if ((i & 4) != 0) {
            str3 = liveShareBetData.totalBonus;
        }
        if ((i & 8) != 0) {
            str4 = liveShareBetData.winningStatus;
        }
        if ((i & 16) != 0) {
            str5 = liveShareBetData.totalStake;
        }
        if ((i & 32) != 0) {
            z = liveShareBetData.isAllSettled;
        }
        if ((i & 64) != 0) {
            str6 = liveShareBetData.imageUrl;
        }
        if ((i & 128) != 0) {
            uri = liveShareBetData.uri;
        }
        if ((i & 256) != 0) {
            file = liveShareBetData.originalFile;
        }
        Uri uri2 = uri;
        File file2 = file;
        boolean z2 = z;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return liveShareBetData.copy(str, str2, str9, str4, str8, z2, str7, uri2, file2);
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

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final File getOriginalFile() {
        return this.originalFile;
    }

    public final LiveShareBetData copy(String shareCode, String totalOdds, String totalBonus, String winningStatus, String totalStake, boolean isAllSettled, String imageUrl, Uri uri, File originalFile) {
        imageUrl.getClass();
        return new LiveShareBetData(shareCode, totalOdds, totalBonus, winningStatus, totalStake, isAllSettled, imageUrl, uri, originalFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveShareBetData)) {
            return false;
        }
        LiveShareBetData liveShareBetData = (LiveShareBetData) other;
        return Intrinsics.g(this.shareCode, liveShareBetData.shareCode) && Intrinsics.g(this.totalOdds, liveShareBetData.totalOdds) && Intrinsics.g(this.totalBonus, liveShareBetData.totalBonus) && Intrinsics.g(this.winningStatus, liveShareBetData.winningStatus) && Intrinsics.g(this.totalStake, liveShareBetData.totalStake) && this.isAllSettled == liveShareBetData.isAllSettled && Intrinsics.g(this.imageUrl, liveShareBetData.imageUrl) && Intrinsics.g(this.uri, liveShareBetData.uri) && Intrinsics.g(this.originalFile, liveShareBetData.originalFile);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final File getOriginalFile() {
        return this.originalFile;
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

    public final Uri getUri() {
        return this.uri;
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
        int iA = gmf0.a(mtg0.a((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.isAllSettled), 31, this.imageUrl);
        Uri uri = this.uri;
        int iHashCode5 = (iA + (uri == null ? 0 : uri.hashCode())) * 31;
        File file = this.originalFile;
        return iHashCode5 + (file != null ? file.hashCode() : 0);
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

    public final void setOriginalFile(File file) {
        this.originalFile = file;
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

    public final void setUri(Uri uri) {
        this.uri = uri;
    }

    public final void setWinningStatus(String str) {
        this.winningStatus = str;
    }

    public final String toJsonString() {
        return new eal().j(this);
    }

    public String toString() {
        String str = this.shareCode;
        String str2 = this.totalOdds;
        String str3 = this.totalBonus;
        String str4 = this.winningStatus;
        String str5 = this.totalStake;
        boolean z = this.isAllSettled;
        String str6 = this.imageUrl;
        Uri uri = this.uri;
        File file = this.originalFile;
        StringBuilder sbA = ux5.a("LiveShareBetData(shareCode=", str, ", totalOdds=", str2, ", totalBonus=");
        hxa.c(sbA, str3, ", winningStatus=", str4, ", totalStake=");
        uts.b(str5, ", isAllSettled=", ", imageUrl=", sbA, z);
        sbA.append(str6);
        sbA.append(", uri=");
        sbA.append(uri);
        sbA.append(", originalFile=");
        sbA.append(file);
        sbA.append(")");
        return sbA.toString();
    }

    public LiveShareBetData(String str, String str2, String str3, String str4, String str5, boolean z, String str6, Uri uri, File file) {
        str6.getClass();
        this.shareCode = str;
        this.totalOdds = str2;
        this.totalBonus = str3;
        this.winningStatus = str4;
        this.totalStake = str5;
        this.isAllSettled = z;
        this.imageUrl = str6;
        this.uri = uri;
        this.originalFile = file;
    }

    public LiveShareBetData() {
        this(null, null, null, null, null, false, null, null, null, 511, null);
    }
}
