package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.x9d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0003J\u0014\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\u0002\b%Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0000¨\u0006$"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/VoteSource;", "Landroid/os/Parcelable;", "count", "", AnalyticsParam.EVENT_PARAM_ID, "text", "", "votedByMe", "", "<init>", "(IILjava/lang/String;Z)V", "getCount", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getId", "getText", "()Ljava/lang/String;", "getVotedByMe", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VoteSource implements Parcelable {

    @SerializedName("count")
    private final int count;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final int id;

    @SerializedName("text")
    private final String text;

    @SerializedName("votedByMe")
    private final boolean votedByMe;
    public static final Parcelable.Creator<VoteSource> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoteSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoteSource createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new VoteSource(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoteSource[] newArray(int i) {
            return new VoteSource[i];
        }
    }

    public /* synthetic */ VoteSource(int i, int i2, String str, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? false : z);
    }

    public static /* synthetic */ VoteSource copy$default(VoteSource voteSource, int i, int i2, String str, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = voteSource.count;
        }
        if ((i3 & 2) != 0) {
            i2 = voteSource.id;
        }
        if ((i3 & 4) != 0) {
            str = voteSource.text;
        }
        if ((i3 & 8) != 0) {
            z = voteSource.votedByMe;
        }
        return voteSource.copy(i, i2, str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getVotedByMe() {
        return this.votedByMe;
    }

    public final VoteSource copy(int count, int id, String text, boolean votedByMe) {
        text.getClass();
        return new VoteSource(count, id, text, votedByMe);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoteSource)) {
            return false;
        }
        VoteSource voteSource = (VoteSource) other;
        return this.count == voteSource.count && this.id == voteSource.id && Intrinsics.g(this.text, voteSource.text) && this.votedByMe == voteSource.votedByMe;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getVotedByMe() {
        return this.votedByMe;
    }

    public int hashCode() {
        return Boolean.hashCode(this.votedByMe) + gmf0.a(gpp.a(this.id, Integer.hashCode(this.count) * 31, 31), 31, this.text);
    }

    public String toString() {
        int i = this.count;
        int i2 = this.id;
        return x9d.a(this.text, ", votedByMe=", ")", dy5.a("VoteSource(count=", i, i2, ", id=", ", text="), this.votedByMe);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.count);
        dest.writeInt(this.id);
        dest.writeString(this.text);
        dest.writeInt(this.votedByMe ? 1 : 0);
    }

    public VoteSource(int i, int i2, String str, boolean z) {
        str.getClass();
        this.count = i;
        this.id = i2;
        this.text = str;
        this.votedByMe = z;
    }

    public VoteSource() {
        this(0, 0, null, false, 15, null);
    }
}
