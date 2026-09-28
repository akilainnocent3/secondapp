package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tÊ\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/plugin/realsports/data/PickMarketMetadata;", "Landroid/os/Parcelable;", "entityName", "", "entityType", "marketHeadline", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEntityName", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getEntityType", "getMarketHeadline", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PickMarketMetadata implements Parcelable {

    @SerializedName("entityName")
    private final String entityName;

    @SerializedName("entityType")
    private final String entityType;

    @SerializedName("marketHeadline")
    private final String marketHeadline;
    public static final Parcelable.Creator<PickMarketMetadata> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PickMarketMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PickMarketMetadata createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PickMarketMetadata(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PickMarketMetadata[] newArray(int i) {
            return new PickMarketMetadata[i];
        }
    }

    public /* synthetic */ PickMarketMetadata(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ PickMarketMetadata copy$default(PickMarketMetadata pickMarketMetadata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pickMarketMetadata.entityName;
        }
        if ((i & 2) != 0) {
            str2 = pickMarketMetadata.entityType;
        }
        if ((i & 4) != 0) {
            str3 = pickMarketMetadata.marketHeadline;
        }
        return pickMarketMetadata.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEntityName() {
        return this.entityName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntityType() {
        return this.entityType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketHeadline() {
        return this.marketHeadline;
    }

    public final PickMarketMetadata copy(String entityName, String entityType, String marketHeadline) {
        return new PickMarketMetadata(entityName, entityType, marketHeadline);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickMarketMetadata)) {
            return false;
        }
        PickMarketMetadata pickMarketMetadata = (PickMarketMetadata) other;
        return Intrinsics.g(this.entityName, pickMarketMetadata.entityName) && Intrinsics.g(this.entityType, pickMarketMetadata.entityType) && Intrinsics.g(this.marketHeadline, pickMarketMetadata.marketHeadline);
    }

    public final String getEntityName() {
        return this.entityName;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final String getMarketHeadline() {
        return this.marketHeadline;
    }

    public int hashCode() {
        String str = this.entityName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entityType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.marketHeadline;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.entityName;
        String str2 = this.entityType;
        return uf80.a(ux5.a("PickMarketMetadata(entityName=", str, ", entityType=", str2, ", marketHeadline="), this.marketHeadline, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.entityName);
        dest.writeString(this.entityType);
        dest.writeString(this.marketHeadline);
    }

    public PickMarketMetadata(String str, String str2, String str3) {
        this.entityName = str;
        this.entityType = str2;
        this.marketHeadline = str3;
    }

    public PickMarketMetadata() {
        this(null, null, null, 7, null);
    }
}
