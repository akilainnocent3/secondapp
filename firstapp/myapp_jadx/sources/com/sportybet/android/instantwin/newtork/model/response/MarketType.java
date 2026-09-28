package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\n\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\n\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\n\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\u0002\b\n\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\u0002\n\u0000Ê\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/MarketType;", "Landroid/os/Parcelable;", "type", "", "title", "bannerTitles", "attributes", "Lcom/sportybet/android/instantwin/newtork/model/response/MarketAttribute;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/response/MarketAttribute;)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketType implements Parcelable {

    @SerializedName("attributes")
    public final MarketAttribute attributes;

    @SerializedName("bannerTitles")
    public final String bannerTitles;

    @SerializedName("title")
    public final String title;

    @SerializedName("type")
    public final String type;
    public static final Parcelable.Creator<MarketType> CREATOR = new Creator();
    public static final int $stable = MarketAttribute.$stable;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MarketType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketType createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MarketType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MarketAttribute.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketType[] newArray(int i) {
            return new MarketType[i];
        }
    }

    public MarketType(String str, String str2, String str3, MarketAttribute marketAttribute) {
        this.type = str;
        this.title = str2;
        this.bannerTitles = str3;
        this.attributes = marketAttribute;
    }

    public static /* synthetic */ MarketType copy$default(MarketType marketType, String str, String str2, String str3, MarketAttribute marketAttribute, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketType.type;
        }
        if ((i & 2) != 0) {
            str2 = marketType.title;
        }
        if ((i & 4) != 0) {
            str3 = marketType.bannerTitles;
        }
        if ((i & 8) != 0) {
            marketAttribute = marketType.attributes;
        }
        return marketType.copy(str, str2, str3, marketAttribute);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MarketAttribute getAttributes() {
        return this.attributes;
    }

    public final MarketType copy(String type, String title, String bannerTitles, MarketAttribute attributes) {
        return new MarketType(type, title, bannerTitles, attributes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketType)) {
            return false;
        }
        MarketType marketType = (MarketType) other;
        return Intrinsics.g(this.type, marketType.type) && Intrinsics.g(this.title, marketType.title) && Intrinsics.g(this.bannerTitles, marketType.bannerTitles) && Intrinsics.g(this.attributes, marketType.attributes);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bannerTitles;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MarketAttribute marketAttribute = this.attributes;
        return iHashCode3 + (marketAttribute != null ? marketAttribute.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.title;
        String str3 = this.bannerTitles;
        MarketAttribute marketAttribute = this.attributes;
        StringBuilder sbA = ux5.a("MarketType(type=", str, ", title=", str2, ", bannerTitles=");
        sbA.append(str3);
        sbA.append(", attributes=");
        sbA.append(marketAttribute);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.bannerTitles);
        MarketAttribute marketAttribute = this.attributes;
        if (marketAttribute == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marketAttribute.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MarketType(String str, String str2, String str3, MarketAttribute marketAttribute, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : marketAttribute);
    }
}
