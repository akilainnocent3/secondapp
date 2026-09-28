package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.p200;
import defpackage.zk1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\nJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\nHÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\nR+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R%\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017Ê\u0001\u0002\b+Ê\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0002¨\u0006*"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/VoteResponse;", "Landroid/os/Parcelable;", "voteSources", "", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/VoteSource;", "endDate", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, AnalyticsParam.EVENT_STATUS, "voteCount", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getVoteSources", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "choices", "getEndDate", "()Ljava/lang/String;", "getEventId", "getStatus", "getVoteCount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VoteResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VoteResponse> CREATOR = new Creator();

    @SerializedName("endDate")
    private final String endDate;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String status;

    @SerializedName("voteCount")
    private final int voteCount;

    @SerializedName("choices")
    private final List<VoteSource> voteSources;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoteResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoteResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = p200.a(VoteSource.CREATOR, parcel, arrayList, iA, 1);
            }
            return new VoteResponse(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoteResponse[] newArray(int i) {
            return new VoteResponse[i];
        }
    }

    public /* synthetic */ VoteResponse(List list, String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoteResponse copy$default(VoteResponse voteResponse, List list, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = voteResponse.voteSources;
        }
        if ((i2 & 2) != 0) {
            str = voteResponse.endDate;
        }
        if ((i2 & 4) != 0) {
            str2 = voteResponse.eventId;
        }
        if ((i2 & 8) != 0) {
            str3 = voteResponse.status;
        }
        if ((i2 & 16) != 0) {
            i = voteResponse.voteCount;
        }
        int i3 = i;
        String str4 = str2;
        return voteResponse.copy(list, str, str4, str3, i3);
    }

    public final List<VoteSource> component1() {
        return this.voteSources;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVoteCount() {
        return this.voteCount;
    }

    public final VoteResponse copy(List<VoteSource> voteSources, String endDate, String eventId, String status, int voteCount) {
        voteSources.getClass();
        endDate.getClass();
        eventId.getClass();
        status.getClass();
        return new VoteResponse(voteSources, endDate, eventId, status, voteCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoteResponse)) {
            return false;
        }
        VoteResponse voteResponse = (VoteResponse) other;
        return Intrinsics.g(this.voteSources, voteResponse.voteSources) && Intrinsics.g(this.endDate, voteResponse.endDate) && Intrinsics.g(this.eventId, voteResponse.eventId) && Intrinsics.g(this.status, voteResponse.status) && this.voteCount == voteResponse.voteCount;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public final List<VoteSource> getVoteSources() {
        return this.voteSources;
    }

    public int hashCode() {
        return Integer.hashCode(this.voteCount) + gmf0.a(gmf0.a(gmf0.a(this.voteSources.hashCode() * 31, 31, this.endDate), 31, this.eventId), 31, this.status);
    }

    public String toString() {
        List<VoteSource> list = this.voteSources;
        String str = this.endDate;
        String str2 = this.eventId;
        String str3 = this.status;
        int i = this.voteCount;
        StringBuilder sb = new StringBuilder("VoteResponse(voteSources=");
        sb.append(list);
        sb.append(", endDate=");
        sb.append(str);
        sb.append(", eventId=");
        hxa.c(sb, str2, ", status=", str3, ", voteCount=");
        return zk1.a(i, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        List<VoteSource> list = this.voteSources;
        dest.writeInt(list.size());
        Iterator<VoteSource> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.endDate);
        dest.writeString(this.eventId);
        dest.writeString(this.status);
        dest.writeInt(this.voteCount);
    }

    public VoteResponse(List<VoteSource> list, String str, String str2, String str3, int i) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.voteSources = list;
        this.endDate = str;
        this.eventId = str2;
        this.status = str3;
        this.voteCount = i;
    }

    public VoteResponse() {
        this(null, null, null, null, 0, 31, null);
    }
}
