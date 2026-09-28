package com.sporty.android.core.model.orders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/orders/BetEventSourceItem;", "Landroid/os/Parcelable;", "sourceType", "Lcom/sporty/android/core/model/orders/BetEventSourceType;", "sourceId", "", "<init>", "(Lcom/sporty/android/core/model/orders/BetEventSourceType;Ljava/lang/String;)V", "getSourceType", "()Lcom/sporty/android/core/model/orders/BetEventSourceType;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSourceId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetEventSourceItem implements Parcelable {
    public static final Parcelable.Creator<BetEventSourceItem> CREATOR = new Creator();

    @SerializedName("sourceId")
    private final String sourceId;

    @SerializedName("sourceType")
    private final BetEventSourceType sourceType;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BetEventSourceItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetEventSourceItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BetEventSourceItem(parcel.readInt() == 0 ? null : BetEventSourceType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetEventSourceItem[] newArray(int i) {
            return new BetEventSourceItem[i];
        }
    }

    public BetEventSourceItem(BetEventSourceType betEventSourceType, String str) {
        this.sourceType = betEventSourceType;
        this.sourceId = str;
    }

    public static /* synthetic */ BetEventSourceItem copy$default(BetEventSourceItem betEventSourceItem, BetEventSourceType betEventSourceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            betEventSourceType = betEventSourceItem.sourceType;
        }
        if ((i & 2) != 0) {
            str = betEventSourceItem.sourceId;
        }
        return betEventSourceItem.copy(betEventSourceType, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BetEventSourceType getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public final BetEventSourceItem copy(BetEventSourceType sourceType, String sourceId) {
        return new BetEventSourceItem(sourceType, sourceId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetEventSourceItem)) {
            return false;
        }
        BetEventSourceItem betEventSourceItem = (BetEventSourceItem) other;
        return this.sourceType == betEventSourceItem.sourceType && Intrinsics.g(this.sourceId, betEventSourceItem.sourceId);
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final BetEventSourceType getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        BetEventSourceType betEventSourceType = this.sourceType;
        int iHashCode = (betEventSourceType == null ? 0 : betEventSourceType.hashCode()) * 31;
        String str = this.sourceId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BetEventSourceItem(sourceType=" + this.sourceType + ", sourceId=" + this.sourceId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        BetEventSourceType betEventSourceType = this.sourceType;
        if (betEventSourceType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            betEventSourceType.writeToParcel(dest, flags);
        }
        dest.writeString(this.sourceId);
    }
}
