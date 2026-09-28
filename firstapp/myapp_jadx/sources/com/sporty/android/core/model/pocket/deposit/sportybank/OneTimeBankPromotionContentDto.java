package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bÊ\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionContentDto;", "", "iconUrl", "", "title", "benefit", "legalDescription", "registrationNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTitle", "getBenefit", "getLegalDescription", "getRegistrationNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneTimeBankPromotionContentDto {

    @SerializedName("benefit")
    private final String benefit;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("legalDescription")
    private final String legalDescription;

    @SerializedName("registrationNumber")
    private final String registrationNumber;

    @SerializedName("title")
    private final String title;

    public /* synthetic */ OneTimeBankPromotionContentDto(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ OneTimeBankPromotionContentDto copy$default(OneTimeBankPromotionContentDto oneTimeBankPromotionContentDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTimeBankPromotionContentDto.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = oneTimeBankPromotionContentDto.title;
        }
        if ((i & 4) != 0) {
            str3 = oneTimeBankPromotionContentDto.benefit;
        }
        if ((i & 8) != 0) {
            str4 = oneTimeBankPromotionContentDto.legalDescription;
        }
        if ((i & 16) != 0) {
            str5 = oneTimeBankPromotionContentDto.registrationNumber;
        }
        String str6 = str5;
        String str7 = str3;
        return oneTimeBankPromotionContentDto.copy(str, str2, str7, str4, str6);
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
    public final String getBenefit() {
        return this.benefit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLegalDescription() {
        return this.legalDescription;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public final OneTimeBankPromotionContentDto copy(String iconUrl, String title, String benefit, String legalDescription, String registrationNumber) {
        return new OneTimeBankPromotionContentDto(iconUrl, title, benefit, legalDescription, registrationNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeBankPromotionContentDto)) {
            return false;
        }
        OneTimeBankPromotionContentDto oneTimeBankPromotionContentDto = (OneTimeBankPromotionContentDto) other;
        return Intrinsics.g(this.iconUrl, oneTimeBankPromotionContentDto.iconUrl) && Intrinsics.g(this.title, oneTimeBankPromotionContentDto.title) && Intrinsics.g(this.benefit, oneTimeBankPromotionContentDto.benefit) && Intrinsics.g(this.legalDescription, oneTimeBankPromotionContentDto.legalDescription) && Intrinsics.g(this.registrationNumber, oneTimeBankPromotionContentDto.registrationNumber);
    }

    public final String getBenefit() {
        return this.benefit;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLegalDescription() {
        return this.legalDescription;
    }

    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.benefit;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.legalDescription;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.registrationNumber;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        String str3 = this.benefit;
        String str4 = this.legalDescription;
        String str5 = this.registrationNumber;
        StringBuilder sbA = ux5.a("OneTimeBankPromotionContentDto(iconUrl=", str, ", title=", str2, ", benefit=");
        hxa.c(sbA, str3, ", legalDescription=", str4, ", registrationNumber=");
        return uf80.a(sbA, str5, ")");
    }

    public OneTimeBankPromotionContentDto(String str, String str2, String str3, String str4, String str5) {
        this.iconUrl = str;
        this.title = str2;
        this.benefit = str3;
        this.legalDescription = str4;
        this.registrationNumber = str5;
    }

    public OneTimeBankPromotionContentDto() {
        this(null, null, null, null, null, 31, null);
    }
}
