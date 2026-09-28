package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\n\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\n\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eÊ\u0001\u0002\b%Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0000¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/MarketInRound;", "Landroid/os/Parcelable;", "marketId", "", "title", "subTitle", "bannerTitles", "oddTitles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSubTitle", "()Ljava/lang/String;", "getBannerTitles", "getOddTitles", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketInRound implements Parcelable {

    @SerializedName("bannerTitles")
    private final String bannerTitles;

    @SerializedName("marketId")
    public final String marketId;

    @SerializedName("oddTitles")
    private final String oddTitles;

    @SerializedName("subTitle")
    private final String subTitle;

    @SerializedName("title")
    public final String title;
    public static final Parcelable.Creator<MarketInRound> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MarketInRound> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketInRound createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MarketInRound(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketInRound[] newArray(int i) {
            return new MarketInRound[i];
        }
    }

    public MarketInRound(String str, String str2, String str3, String str4, String str5) {
        this.marketId = str;
        this.title = str2;
        this.subTitle = str3;
        this.bannerTitles = str4;
        this.oddTitles = str5;
    }

    public static /* synthetic */ MarketInRound copy$default(MarketInRound marketInRound, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketInRound.marketId;
        }
        if ((i & 2) != 0) {
            str2 = marketInRound.title;
        }
        if ((i & 4) != 0) {
            str3 = marketInRound.subTitle;
        }
        if ((i & 8) != 0) {
            str4 = marketInRound.bannerTitles;
        }
        if ((i & 16) != 0) {
            str5 = marketInRound.oddTitles;
        }
        String str6 = str5;
        String str7 = str3;
        return marketInRound.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOddTitles() {
        return this.oddTitles;
    }

    public final MarketInRound copy(String marketId, String title, String subTitle, String bannerTitles, String oddTitles) {
        return new MarketInRound(marketId, title, subTitle, bannerTitles, oddTitles);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketInRound)) {
            return false;
        }
        MarketInRound marketInRound = (MarketInRound) other;
        return Intrinsics.g(this.marketId, marketInRound.marketId) && Intrinsics.g(this.title, marketInRound.title) && Intrinsics.g(this.subTitle, marketInRound.subTitle) && Intrinsics.g(this.bannerTitles, marketInRound.bannerTitles) && Intrinsics.g(this.oddTitles, marketInRound.oddTitles);
    }

    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    public final String getOddTitles() {
        return this.oddTitles;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public int hashCode() {
        String str = this.marketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bannerTitles;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.oddTitles;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.title;
        String str3 = this.subTitle;
        String str4 = this.bannerTitles;
        String str5 = this.oddTitles;
        StringBuilder sbA = ux5.a("MarketInRound(marketId=", str, ", title=", str2, ", subTitle=");
        hxa.c(sbA, str3, ", bannerTitles=", str4, ", oddTitles=");
        return uf80.a(sbA, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.marketId);
        dest.writeString(this.title);
        dest.writeString(this.subTitle);
        dest.writeString(this.bannerTitles);
        dest.writeString(this.oddTitles);
    }
}
