package com.sporty.android.book.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u000fHÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/book/domain/entity/EventSource;", "Landroid/os/Parcelable;", "preMatchSource", "Lcom/sporty/android/book/domain/entity/EventSourceItem;", "liveSource", "<init>", "(Lcom/sporty/android/book/domain/entity/EventSourceItem;Lcom/sporty/android/book/domain/entity/EventSourceItem;)V", "getPreMatchSource", "()Lcom/sporty/android/book/domain/entity/EventSourceItem;", "getLiveSource", "getSourceType", "Lcom/sporty/android/book/domain/entity/SourceType;", "isLive", "", "getSourceId", "", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sportybook", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventSource implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EventSource> CREATOR = new Creator();
    private final EventSourceItem liveSource;
    private final EventSourceItem preMatchSource;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EventSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventSource createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new EventSource(parcel.readInt() == 0 ? null : EventSourceItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EventSourceItem.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventSource[] newArray(int i) {
            return new EventSource[i];
        }
    }

    public EventSource(EventSourceItem eventSourceItem, EventSourceItem eventSourceItem2) {
        this.preMatchSource = eventSourceItem;
        this.liveSource = eventSourceItem2;
    }

    public static /* synthetic */ EventSource copy$default(EventSource eventSource, EventSourceItem eventSourceItem, EventSourceItem eventSourceItem2, int i, Object obj) {
        if ((i & 1) != 0) {
            eventSourceItem = eventSource.preMatchSource;
        }
        if ((i & 2) != 0) {
            eventSourceItem2 = eventSource.liveSource;
        }
        return eventSource.copy(eventSourceItem, eventSourceItem2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EventSourceItem getPreMatchSource() {
        return this.preMatchSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventSourceItem getLiveSource() {
        return this.liveSource;
    }

    public final EventSource copy(EventSourceItem preMatchSource, EventSourceItem liveSource) {
        return new EventSource(preMatchSource, liveSource);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSource)) {
            return false;
        }
        EventSource eventSource = (EventSource) other;
        return Intrinsics.g(this.preMatchSource, eventSource.preMatchSource) && Intrinsics.g(this.liveSource, eventSource.liveSource);
    }

    public final EventSourceItem getLiveSource() {
        return this.liveSource;
    }

    public final EventSourceItem getPreMatchSource() {
        return this.preMatchSource;
    }

    public final String getSourceId(boolean isLive) {
        if (isLive) {
            EventSourceItem eventSourceItem = this.liveSource;
            if (eventSourceItem != null) {
                return eventSourceItem.getSourceId();
            }
            return null;
        }
        EventSourceItem eventSourceItem2 = this.preMatchSource;
        if (eventSourceItem2 != null) {
            return eventSourceItem2.getSourceId();
        }
        return null;
    }

    public final SourceType getSourceType(boolean isLive) {
        if (isLive) {
            EventSourceItem eventSourceItem = this.liveSource;
            if (eventSourceItem != null) {
                return eventSourceItem.getSourceType();
            }
            return null;
        }
        EventSourceItem eventSourceItem2 = this.preMatchSource;
        if (eventSourceItem2 != null) {
            return eventSourceItem2.getSourceType();
        }
        return null;
    }

    public int hashCode() {
        EventSourceItem eventSourceItem = this.preMatchSource;
        int iHashCode = (eventSourceItem == null ? 0 : eventSourceItem.hashCode()) * 31;
        EventSourceItem eventSourceItem2 = this.liveSource;
        return iHashCode + (eventSourceItem2 != null ? eventSourceItem2.hashCode() : 0);
    }

    public String toString() {
        return "EventSource(preMatchSource=" + this.preMatchSource + ", liveSource=" + this.liveSource + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        EventSourceItem eventSourceItem = this.preMatchSource;
        if (eventSourceItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventSourceItem.writeToParcel(dest, flags);
        }
        EventSourceItem eventSourceItem2 = this.liveSource;
        if (eventSourceItem2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventSourceItem2.writeToParcel(dest, flags);
        }
    }
}
