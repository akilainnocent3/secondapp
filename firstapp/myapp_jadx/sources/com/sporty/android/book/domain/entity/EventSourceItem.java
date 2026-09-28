package com.sporty.android.book.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/book/domain/entity/EventSourceItem;", "Landroid/os/Parcelable;", "sourceType", "Lcom/sporty/android/book/domain/entity/SourceType;", "sourceId", "", "<init>", "(Lcom/sporty/android/book/domain/entity/SourceType;Ljava/lang/String;)V", "getSourceType", "()Lcom/sporty/android/book/domain/entity/SourceType;", "getSourceId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sportybook", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventSourceItem implements Parcelable {
    private final String sourceId;
    private final SourceType sourceType;
    public static final Parcelable.Creator<EventSourceItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EventSourceItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventSourceItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new EventSourceItem(parcel.readInt() == 0 ? null : SourceType.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventSourceItem[] newArray(int i) {
            return new EventSourceItem[i];
        }
    }

    public EventSourceItem(SourceType sourceType, String str) {
        this.sourceType = sourceType;
        this.sourceId = str;
    }

    public static /* synthetic */ EventSourceItem copy$default(EventSourceItem eventSourceItem, SourceType sourceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceType = eventSourceItem.sourceType;
        }
        if ((i & 2) != 0) {
            str = eventSourceItem.sourceId;
        }
        return eventSourceItem.copy(sourceType, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SourceType getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public final EventSourceItem copy(SourceType sourceType, String sourceId) {
        return new EventSourceItem(sourceType, sourceId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSourceItem)) {
            return false;
        }
        EventSourceItem eventSourceItem = (EventSourceItem) other;
        return this.sourceType == eventSourceItem.sourceType && Intrinsics.g(this.sourceId, eventSourceItem.sourceId);
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final SourceType getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        SourceType sourceType = this.sourceType;
        int iHashCode = (sourceType == null ? 0 : sourceType.hashCode()) * 31;
        String str = this.sourceId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "EventSourceItem(sourceType=" + this.sourceType + ", sourceId=" + this.sourceId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        SourceType sourceType = this.sourceType;
        if (sourceType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sourceType.writeToParcel(dest, flags);
        }
        dest.writeString(this.sourceId);
    }
}
