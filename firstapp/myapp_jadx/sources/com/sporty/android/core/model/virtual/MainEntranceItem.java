package com.sporty.android.core.model.virtual;

import defpackage.hxa;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uts;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008b\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012Ê\u0001\u0002\b0¨\u0006/"}, d2 = {"Lcom/sporty/android/core/model/virtual/MainEntranceItem;", "", "itemName", "", "entranceName", "entranceLabel", "label", "imgUrl", "size", "redirectUrl", "enable", "", "availableUserType", "availableAppVersion", "updateRequiredAppVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItemName", "()Ljava/lang/String;", "getEntranceName", "getEntranceLabel", "getLabel", "getImgUrl", "getSize", "getRedirectUrl", "getEnable", "()Z", "getAvailableUserType", "getAvailableAppVersion", "getUpdateRequiredAppVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MainEntranceItem {
    private final String availableAppVersion;
    private final String availableUserType;
    private final boolean enable;
    private final String entranceLabel;
    private final String entranceName;
    private final String imgUrl;
    private final String itemName;
    private final String label;
    private final String redirectUrl;
    private final String size;
    private final String updateRequiredAppVersion;

    public /* synthetic */ MainEntranceItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? false : z, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10);
    }

    public static /* synthetic */ MainEntranceItem copy$default(MainEntranceItem mainEntranceItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mainEntranceItem.itemName;
        }
        if ((i & 2) != 0) {
            str2 = mainEntranceItem.entranceName;
        }
        if ((i & 4) != 0) {
            str3 = mainEntranceItem.entranceLabel;
        }
        if ((i & 8) != 0) {
            str4 = mainEntranceItem.label;
        }
        if ((i & 16) != 0) {
            str5 = mainEntranceItem.imgUrl;
        }
        if ((i & 32) != 0) {
            str6 = mainEntranceItem.size;
        }
        if ((i & 64) != 0) {
            str7 = mainEntranceItem.redirectUrl;
        }
        if ((i & 128) != 0) {
            z = mainEntranceItem.enable;
        }
        if ((i & 256) != 0) {
            str8 = mainEntranceItem.availableUserType;
        }
        if ((i & 512) != 0) {
            str9 = mainEntranceItem.availableAppVersion;
        }
        if ((i & 1024) != 0) {
            str10 = mainEntranceItem.updateRequiredAppVersion;
        }
        String str11 = str9;
        String str12 = str10;
        boolean z2 = z;
        String str13 = str8;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        String str17 = str3;
        return mainEntranceItem.copy(str, str2, str17, str4, str16, str14, str15, z2, str13, str11, str12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAvailableAppVersion() {
        return this.availableAppVersion;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUpdateRequiredAppVersion() {
        return this.updateRequiredAppVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntranceName() {
        return this.entranceName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEntranceLabel() {
        return this.entranceLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAvailableUserType() {
        return this.availableUserType;
    }

    public final MainEntranceItem copy(String itemName, String entranceName, String entranceLabel, String label, String imgUrl, String size, String redirectUrl, boolean enable, String availableUserType, String availableAppVersion, String updateRequiredAppVersion) {
        return new MainEntranceItem(itemName, entranceName, entranceLabel, label, imgUrl, size, redirectUrl, enable, availableUserType, availableAppVersion, updateRequiredAppVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainEntranceItem)) {
            return false;
        }
        MainEntranceItem mainEntranceItem = (MainEntranceItem) other;
        return Intrinsics.g(this.itemName, mainEntranceItem.itemName) && Intrinsics.g(this.entranceName, mainEntranceItem.entranceName) && Intrinsics.g(this.entranceLabel, mainEntranceItem.entranceLabel) && Intrinsics.g(this.label, mainEntranceItem.label) && Intrinsics.g(this.imgUrl, mainEntranceItem.imgUrl) && Intrinsics.g(this.size, mainEntranceItem.size) && Intrinsics.g(this.redirectUrl, mainEntranceItem.redirectUrl) && this.enable == mainEntranceItem.enable && Intrinsics.g(this.availableUserType, mainEntranceItem.availableUserType) && Intrinsics.g(this.availableAppVersion, mainEntranceItem.availableAppVersion) && Intrinsics.g(this.updateRequiredAppVersion, mainEntranceItem.updateRequiredAppVersion);
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

    public final String getEntranceLabel() {
        return this.entranceLabel;
    }

    public final String getEntranceName() {
        return this.entranceName;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getUpdateRequiredAppVersion() {
        return this.updateRequiredAppVersion;
    }

    public int hashCode() {
        String str = this.itemName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entranceName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entranceLabel;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imgUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.size;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.redirectUrl;
        int iA = mtg0.a((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.enable);
        String str8 = this.availableUserType;
        int iHashCode7 = (iA + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.availableAppVersion;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.updateRequiredAppVersion;
        return iHashCode8 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        String str = this.itemName;
        String str2 = this.entranceName;
        String str3 = this.entranceLabel;
        String str4 = this.label;
        String str5 = this.imgUrl;
        String str6 = this.size;
        String str7 = this.redirectUrl;
        boolean z = this.enable;
        String str8 = this.availableUserType;
        String str9 = this.availableAppVersion;
        String str10 = this.updateRequiredAppVersion;
        StringBuilder sbA = ux5.a("MainEntranceItem(itemName=", str, ", entranceName=", str2, ", entranceLabel=");
        hxa.c(sbA, str3, ", label=", str4, ", imgUrl=");
        hxa.c(sbA, str5, ", size=", str6, ", redirectUrl=");
        uts.b(str7, ", enable=", ", availableUserType=", sbA, z);
        hxa.c(sbA, str8, ", availableAppVersion=", str9, ", updateRequiredAppVersion=");
        return uf80.a(sbA, str10, ")");
    }

    public MainEntranceItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10) {
        this.itemName = str;
        this.entranceName = str2;
        this.entranceLabel = str3;
        this.label = str4;
        this.imgUrl = str5;
        this.size = str6;
        this.redirectUrl = str7;
        this.enable = z;
        this.availableUserType = str8;
        this.availableAppVersion = str9;
        this.updateRequiredAppVersion = str10;
    }

    public MainEntranceItem() {
        this(null, null, null, null, null, null, null, false, null, null, null, 2047, null);
    }
}
