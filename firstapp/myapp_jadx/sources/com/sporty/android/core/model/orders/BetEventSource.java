package com.sporty.android.core.model.orders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0011HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\u0002\b\"¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/orders/BetEventSource;", "Landroid/os/Parcelable;", "preMatchSource", "Lcom/sporty/android/core/model/orders/BetEventSourceItem;", "liveSource", "<init>", "(Lcom/sporty/android/core/model/orders/BetEventSourceItem;Lcom/sporty/android/core/model/orders/BetEventSourceItem;)V", "getPreMatchSource", "()Lcom/sporty/android/core/model/orders/BetEventSourceItem;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLiveSource", "getSourceType", "Lcom/sporty/android/core/model/orders/BetEventSourceType;", "isLive", "", "getSourceId", "", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetEventSource implements Parcelable {
    public static final Parcelable.Creator<BetEventSource> CREATOR = new Creator();

    @SerializedName("liveSource")
    private final BetEventSourceItem liveSource;

    @SerializedName("preMatchSource")
    private final BetEventSourceItem preMatchSource;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BetEventSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetEventSource createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BetEventSource(parcel.readInt() == 0 ? null : BetEventSourceItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BetEventSourceItem.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetEventSource[] newArray(int i) {
            return new BetEventSource[i];
        }
    }

    public BetEventSource(BetEventSourceItem betEventSourceItem, BetEventSourceItem betEventSourceItem2) {
        this.preMatchSource = betEventSourceItem;
        this.liveSource = betEventSourceItem2;
    }

    public static /* synthetic */ BetEventSource copy$default(BetEventSource betEventSource, BetEventSourceItem betEventSourceItem, BetEventSourceItem betEventSourceItem2, int i, Object obj) {
        if ((i & 1) != 0) {
            betEventSourceItem = betEventSource.preMatchSource;
        }
        if ((i & 2) != 0) {
            betEventSourceItem2 = betEventSource.liveSource;
        }
        return betEventSource.copy(betEventSourceItem, betEventSourceItem2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BetEventSourceItem getPreMatchSource() {
        return this.preMatchSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BetEventSourceItem getLiveSource() {
        return this.liveSource;
    }

    public final BetEventSource copy(BetEventSourceItem preMatchSource, BetEventSourceItem liveSource) {
        return new BetEventSource(preMatchSource, liveSource);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetEventSource)) {
            return false;
        }
        BetEventSource betEventSource = (BetEventSource) other;
        return Intrinsics.g(this.preMatchSource, betEventSource.preMatchSource) && Intrinsics.g(this.liveSource, betEventSource.liveSource);
    }

    public final BetEventSourceItem getLiveSource() {
        return this.liveSource;
    }

    public final BetEventSourceItem getPreMatchSource() {
        return this.preMatchSource;
    }

    public final String getSourceId(boolean isLive) {
        if (isLive) {
            BetEventSourceItem betEventSourceItem = this.liveSource;
            if (betEventSourceItem != null) {
                return betEventSourceItem.getSourceId();
            }
            return null;
        }
        BetEventSourceItem betEventSourceItem2 = this.preMatchSource;
        if (betEventSourceItem2 != null) {
            return betEventSourceItem2.getSourceId();
        }
        return null;
    }

    public final BetEventSourceType getSourceType(boolean isLive) {
        if (isLive) {
            BetEventSourceItem betEventSourceItem = this.liveSource;
            if (betEventSourceItem != null) {
                return betEventSourceItem.getSourceType();
            }
            return null;
        }
        BetEventSourceItem betEventSourceItem2 = this.preMatchSource;
        if (betEventSourceItem2 != null) {
            return betEventSourceItem2.getSourceType();
        }
        return null;
    }

    public int hashCode() {
        BetEventSourceItem betEventSourceItem = this.preMatchSource;
        int iHashCode = (betEventSourceItem == null ? 0 : betEventSourceItem.hashCode()) * 31;
        BetEventSourceItem betEventSourceItem2 = this.liveSource;
        return iHashCode + (betEventSourceItem2 != null ? betEventSourceItem2.hashCode() : 0);
    }

    public String toString() {
        return "BetEventSource(preMatchSource=" + this.preMatchSource + ", liveSource=" + this.liveSource + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        BetEventSourceItem betEventSourceItem = this.preMatchSource;
        if (betEventSourceItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            betEventSourceItem.writeToParcel(dest, flags);
        }
        BetEventSourceItem betEventSourceItem2 = this.liveSource;
        if (betEventSourceItem2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            betEventSourceItem2.writeToParcel(dest, flags);
        }
    }
}
