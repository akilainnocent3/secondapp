package com.sporty.android.core.model.virtual;

import defpackage.hxa;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uts;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eÊ\u0001\u0002\b$¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/virtual/BannerItem;", "", "itemName", "", "imgUrl", "redirectUrl", "enable", "", "availableUserType", "availableAppVersion", "updateRequiredAppVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItemName", "()Ljava/lang/String;", "getImgUrl", "getRedirectUrl", "getEnable", "()Z", "getAvailableUserType", "getAvailableAppVersion", "getUpdateRequiredAppVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BannerItem {
    private final String availableAppVersion;
    private final String availableUserType;
    private final boolean enable;
    private final String imgUrl;
    private final String itemName;
    private final String redirectUrl;
    private final String updateRequiredAppVersion;

    public /* synthetic */ BannerItem(String str, String str2, String str3, boolean z, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6);
    }

    public static /* synthetic */ BannerItem copy$default(BannerItem bannerItem, String str, String str2, String str3, boolean z, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerItem.itemName;
        }
        if ((i & 2) != 0) {
            str2 = bannerItem.imgUrl;
        }
        if ((i & 4) != 0) {
            str3 = bannerItem.redirectUrl;
        }
        if ((i & 8) != 0) {
            z = bannerItem.enable;
        }
        if ((i & 16) != 0) {
            str4 = bannerItem.availableUserType;
        }
        if ((i & 32) != 0) {
            str5 = bannerItem.availableAppVersion;
        }
        if ((i & 64) != 0) {
            str6 = bannerItem.updateRequiredAppVersion;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return bannerItem.copy(str, str2, str10, z, str9, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvailableUserType() {
        return this.availableUserType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvailableAppVersion() {
        return this.availableAppVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUpdateRequiredAppVersion() {
        return this.updateRequiredAppVersion;
    }

    public final BannerItem copy(String itemName, String imgUrl, String redirectUrl, boolean enable, String availableUserType, String availableAppVersion, String updateRequiredAppVersion) {
        return new BannerItem(itemName, imgUrl, redirectUrl, enable, availableUserType, availableAppVersion, updateRequiredAppVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerItem)) {
            return false;
        }
        BannerItem bannerItem = (BannerItem) other;
        return Intrinsics.g(this.itemName, bannerItem.itemName) && Intrinsics.g(this.imgUrl, bannerItem.imgUrl) && Intrinsics.g(this.redirectUrl, bannerItem.redirectUrl) && this.enable == bannerItem.enable && Intrinsics.g(this.availableUserType, bannerItem.availableUserType) && Intrinsics.g(this.availableAppVersion, bannerItem.availableAppVersion) && Intrinsics.g(this.updateRequiredAppVersion, bannerItem.updateRequiredAppVersion);
    }

    public final String getAvailableAppVersion() {
        return this.availableAppVersion;
    }

    public final String getAvailableUserType() {
        return this.availableUserType;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getUpdateRequiredAppVersion() {
        return this.updateRequiredAppVersion;
    }

    public int hashCode() {
        String str = this.itemName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imgUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redirectUrl;
        int iA = mtg0.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.enable);
        String str4 = this.availableUserType;
        int iHashCode3 = (iA + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.availableAppVersion;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.updateRequiredAppVersion;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.itemName;
        String str2 = this.imgUrl;
        String str3 = this.redirectUrl;
        boolean z = this.enable;
        String str4 = this.availableUserType;
        String str5 = this.availableAppVersion;
        String str6 = this.updateRequiredAppVersion;
        StringBuilder sbA = ux5.a("BannerItem(itemName=", str, ", imgUrl=", str2, ", redirectUrl=");
        uts.b(str3, ", enable=", ", availableUserType=", sbA, z);
        hxa.c(sbA, str4, ", availableAppVersion=", str5, ", updateRequiredAppVersion=");
        return uf80.a(sbA, str6, ")");
    }

    public BannerItem(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.itemName = str;
        this.imgUrl = str2;
        this.redirectUrl = str3;
        this.enable = z;
        this.availableUserType = str4;
        this.availableAppVersion = str5;
        this.updateRequiredAppVersion = str6;
    }

    public BannerItem() {
        this(null, null, null, false, null, null, null, 127, null);
    }
}
