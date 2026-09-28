package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.google.gson.annotations.SerializedName;
import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionBannerDto;", "", "iconUrl", "", "title", "content", "learnMore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTitle", "getContent", "getLearnMore", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneTimeBankPromotionBannerDto {

    @SerializedName("content")
    private final String content;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("learnMore")
    private final String learnMore;

    @SerializedName("title")
    private final String title;

    public /* synthetic */ OneTimeBankPromotionBannerDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ OneTimeBankPromotionBannerDto copy$default(OneTimeBankPromotionBannerDto oneTimeBankPromotionBannerDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTimeBankPromotionBannerDto.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = oneTimeBankPromotionBannerDto.title;
        }
        if ((i & 4) != 0) {
            str3 = oneTimeBankPromotionBannerDto.content;
        }
        if ((i & 8) != 0) {
            str4 = oneTimeBankPromotionBannerDto.learnMore;
        }
        return oneTimeBankPromotionBannerDto.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLearnMore() {
        return this.learnMore;
    }

    public final OneTimeBankPromotionBannerDto copy(String iconUrl, String title, String content, String learnMore) {
        return new OneTimeBankPromotionBannerDto(iconUrl, title, content, learnMore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeBankPromotionBannerDto)) {
            return false;
        }
        OneTimeBankPromotionBannerDto oneTimeBankPromotionBannerDto = (OneTimeBankPromotionBannerDto) other;
        return Intrinsics.g(this.iconUrl, oneTimeBankPromotionBannerDto.iconUrl) && Intrinsics.g(this.title, oneTimeBankPromotionBannerDto.title) && Intrinsics.g(this.content, oneTimeBankPromotionBannerDto.content) && Intrinsics.g(this.learnMore, oneTimeBankPromotionBannerDto.learnMore);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLearnMore() {
        return this.learnMore;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.learnMore;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        return kwi.a(ux5.a("OneTimeBankPromotionBannerDto(iconUrl=", str, ", title=", str2, ", content="), this.content, ", learnMore=", this.learnMore, ")");
    }

    public OneTimeBankPromotionBannerDto(String str, String str2, String str3, String str4) {
        this.iconUrl = str;
        this.title = str2;
        this.content = str3;
        this.learnMore = str4;
    }

    public OneTimeBankPromotionBannerDto() {
        this(null, null, null, null, 15, null);
    }
}
