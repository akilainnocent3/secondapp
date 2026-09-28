package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0005J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u001eÊ\u0001\u0002\b\u001fÊ\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001d"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/SimpleCommentInfo;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "commentCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getEventId", "()Ljava/lang/String;", "getCommentCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/SimpleCommentInfo;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SimpleCommentInfo implements Parcelable {
    private final Integer commentCount;
    private final String eventId;
    public static final Parcelable.Creator<SimpleCommentInfo> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SimpleCommentInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleCommentInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SimpleCommentInfo(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleCommentInfo[] newArray(int i) {
            return new SimpleCommentInfo[i];
        }
    }

    public SimpleCommentInfo(String str, Integer num) {
        this.eventId = str;
        this.commentCount = num;
    }

    public static /* synthetic */ SimpleCommentInfo copy$default(SimpleCommentInfo simpleCommentInfo, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleCommentInfo.eventId;
        }
        if ((i & 2) != 0) {
            num = simpleCommentInfo.commentCount;
        }
        return simpleCommentInfo.copy(str, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCommentCount() {
        return this.commentCount;
    }

    public final SimpleCommentInfo copy(String eventId, Integer commentCount) {
        return new SimpleCommentInfo(eventId, commentCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleCommentInfo)) {
            return false;
        }
        SimpleCommentInfo simpleCommentInfo = (SimpleCommentInfo) other;
        return Intrinsics.g(this.eventId, simpleCommentInfo.eventId) && Intrinsics.g(this.commentCount, simpleCommentInfo.commentCount);
    }

    public final Integer getCommentCount() {
        return this.commentCount;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.commentCount;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SimpleCommentInfo(eventId=" + this.eventId + ", commentCount=" + this.commentCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.eventId);
        Integer num = this.commentCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
    }
}
