package com.sporty.android.core.model.loyalty;

import defpackage.gmf0;
import defpackage.hxa;
import defpackage.t160;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jo\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006)"}, d2 = {"Lcom/sporty/android/core/model/loyalty/RewardShowOffData;", "", "canShowOff", "", "urlForDrawRewardShowOffPic", "", "rewardShowOffJsScript", "batchId", "platforms", "text", "hashtags", "url", "redirectCode", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCanShowOff", "()Z", "getUrlForDrawRewardShowOffPic", "()Ljava/lang/String;", "getRewardShowOffJsScript", "getBatchId", "getPlatforms", "getText", "getHashtags", "getUrl", "getRedirectCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RewardShowOffData {
    private final String batchId;
    private final boolean canShowOff;
    private final String hashtags;
    private final String platforms;
    private final String redirectCode;
    private final String rewardShowOffJsScript;
    private final String text;
    private final String url;
    private final String urlForDrawRewardShowOffPic;

    public /* synthetic */ RewardShowOffData(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    public static /* synthetic */ RewardShowOffData copy$default(RewardShowOffData rewardShowOffData, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rewardShowOffData.canShowOff;
        }
        if ((i & 2) != 0) {
            str = rewardShowOffData.urlForDrawRewardShowOffPic;
        }
        if ((i & 4) != 0) {
            str2 = rewardShowOffData.rewardShowOffJsScript;
        }
        if ((i & 8) != 0) {
            str3 = rewardShowOffData.batchId;
        }
        if ((i & 16) != 0) {
            str4 = rewardShowOffData.platforms;
        }
        if ((i & 32) != 0) {
            str5 = rewardShowOffData.text;
        }
        if ((i & 64) != 0) {
            str6 = rewardShowOffData.hashtags;
        }
        if ((i & 128) != 0) {
            str7 = rewardShowOffData.url;
        }
        if ((i & 256) != 0) {
            str8 = rewardShowOffData.redirectCode;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        String str14 = str2;
        return rewardShowOffData.copy(z, str, str14, str3, str13, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCanShowOff() {
        return this.canShowOff;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrlForDrawRewardShowOffPic() {
        return this.urlForDrawRewardShowOffPic;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRewardShowOffJsScript() {
        return this.rewardShowOffJsScript;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlatforms() {
        return this.platforms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHashtags() {
        return this.hashtags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRedirectCode() {
        return this.redirectCode;
    }

    public final RewardShowOffData copy(boolean canShowOff, String urlForDrawRewardShowOffPic, String rewardShowOffJsScript, String batchId, String platforms, String text, String hashtags, String url, String redirectCode) {
        rewardShowOffJsScript.getClass();
        batchId.getClass();
        return new RewardShowOffData(canShowOff, urlForDrawRewardShowOffPic, rewardShowOffJsScript, batchId, platforms, text, hashtags, url, redirectCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardShowOffData)) {
            return false;
        }
        RewardShowOffData rewardShowOffData = (RewardShowOffData) other;
        return this.canShowOff == rewardShowOffData.canShowOff && Intrinsics.g(this.urlForDrawRewardShowOffPic, rewardShowOffData.urlForDrawRewardShowOffPic) && Intrinsics.g(this.rewardShowOffJsScript, rewardShowOffData.rewardShowOffJsScript) && Intrinsics.g(this.batchId, rewardShowOffData.batchId) && Intrinsics.g(this.platforms, rewardShowOffData.platforms) && Intrinsics.g(this.text, rewardShowOffData.text) && Intrinsics.g(this.hashtags, rewardShowOffData.hashtags) && Intrinsics.g(this.url, rewardShowOffData.url) && Intrinsics.g(this.redirectCode, rewardShowOffData.redirectCode);
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final boolean getCanShowOff() {
        return this.canShowOff;
    }

    public final String getHashtags() {
        return this.hashtags;
    }

    public final String getPlatforms() {
        return this.platforms;
    }

    public final String getRedirectCode() {
        return this.redirectCode;
    }

    public final String getRewardShowOffJsScript() {
        return this.rewardShowOffJsScript;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlForDrawRewardShowOffPic() {
        return this.urlForDrawRewardShowOffPic;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.canShowOff) * 31;
        String str = this.urlForDrawRewardShowOffPic;
        int iA = gmf0.a(gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.rewardShowOffJsScript), 31, this.batchId);
        String str2 = this.platforms;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hashtags;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.redirectCode;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.canShowOff;
        String str = this.urlForDrawRewardShowOffPic;
        String str2 = this.rewardShowOffJsScript;
        String str3 = this.batchId;
        String str4 = this.platforms;
        String str5 = this.text;
        String str6 = this.hashtags;
        String str7 = this.url;
        String str8 = this.redirectCode;
        StringBuilder sbA = t160.a("RewardShowOffData(canShowOff=", ", urlForDrawRewardShowOffPic=", str, ", rewardShowOffJsScript=", z);
        hxa.c(sbA, str2, ", batchId=", str3, ", platforms=");
        hxa.c(sbA, str4, ", text=", str5, ", hashtags=");
        hxa.c(sbA, str6, ", url=", str7, ", redirectCode=");
        return uf80.a(sbA, str8, ")");
    }

    public RewardShowOffData(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        str2.getClass();
        str3.getClass();
        this.canShowOff = z;
        this.urlForDrawRewardShowOffPic = str;
        this.rewardShowOffJsScript = str2;
        this.batchId = str3;
        this.platforms = str4;
        this.text = str5;
        this.hashtags = str6;
        this.url = str7;
        this.redirectCode = str8;
    }

    public RewardShowOffData() {
        this(false, null, null, null, null, null, null, null, null, 511, null);
    }
}
