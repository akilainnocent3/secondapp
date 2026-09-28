package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.h;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0003J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\u0002\b\u001eÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001d"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/MatchVote;", "Landroid/os/Parcelable;", "choiceId", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "<init>", "(ILjava/lang/String;)V", "getChoiceId", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getEventId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MatchVote implements Parcelable {

    @SerializedName("choiceId")
    private final int choiceId;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;
    public static final Parcelable.Creator<MatchVote> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MatchVote> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MatchVote createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MatchVote(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MatchVote[] newArray(int i) {
            return new MatchVote[i];
        }
    }

    public /* synthetic */ MatchVote(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ MatchVote copy$default(MatchVote matchVote, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = matchVote.choiceId;
        }
        if ((i2 & 2) != 0) {
            str = matchVote.eventId;
        }
        return matchVote.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getChoiceId() {
        return this.choiceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    public final MatchVote copy(int choiceId, String eventId) {
        eventId.getClass();
        return new MatchVote(choiceId, eventId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchVote)) {
            return false;
        }
        MatchVote matchVote = (MatchVote) other;
        return this.choiceId == matchVote.choiceId && Intrinsics.g(this.eventId, matchVote.eventId);
    }

    public final int getChoiceId() {
        return this.choiceId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public int hashCode() {
        return this.eventId.hashCode() + (Integer.hashCode(this.choiceId) * 31);
    }

    public String toString() {
        return h.a(this.choiceId, "MatchVote(choiceId=", ", eventId=", this.eventId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.choiceId);
        dest.writeString(this.eventId);
    }

    public MatchVote(int i, String str) {
        str.getClass();
        this.choiceId = i;
        this.eventId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchVote() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}
