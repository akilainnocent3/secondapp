package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.ew7;
import defpackage.f78;
import defpackage.hxa;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0005J\r\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0017J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0005J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0092\u0002\u0002\b\u0010¢\u0006\u0004\n\u0002\u0010\u000fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fÊ\u0001\u0002\b+Ê\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0000¨\u0006*"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/PostCommentData;", "Landroid/os/Parcelable;", "comment", "", "parentId", "", "refId", "sharedBetsMeta", "type", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "Ljava/lang/Integer;", "Lkotlin/jvm/JvmField;", "getRefId", "getSharedBetsMeta", "getType", "setParentId", "", "getParentId", "()Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/PostCommentData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PostCommentData implements Parcelable {

    @SerializedName("comment")
    private final String comment;

    @SerializedName("parentId")
    public Integer parentId;

    @SerializedName("refId")
    private final String refId;

    @SerializedName("sharedBetsMeta")
    private final String sharedBetsMeta;

    @SerializedName("type")
    private final String type;
    public static final Parcelable.Creator<PostCommentData> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PostCommentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostCommentData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PostCommentData(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PostCommentData[] newArray(int i) {
            return new PostCommentData[i];
        }
    }

    public /* synthetic */ PostCommentData(String str, Integer num, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    public static /* synthetic */ PostCommentData copy$default(PostCommentData postCommentData, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postCommentData.comment;
        }
        if ((i & 2) != 0) {
            num = postCommentData.parentId;
        }
        if ((i & 4) != 0) {
            str2 = postCommentData.refId;
        }
        if ((i & 8) != 0) {
            str3 = postCommentData.sharedBetsMeta;
        }
        if ((i & 16) != 0) {
            str4 = postCommentData.type;
        }
        String str5 = str4;
        String str6 = str2;
        return postCommentData.copy(str, num, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefId() {
        return this.refId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSharedBetsMeta() {
        return this.sharedBetsMeta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final PostCommentData copy(String comment, Integer parentId, String refId, String sharedBetsMeta, String type) {
        return new PostCommentData(comment, parentId, refId, sharedBetsMeta, type);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostCommentData)) {
            return false;
        }
        PostCommentData postCommentData = (PostCommentData) other;
        return Intrinsics.g(this.comment, postCommentData.comment) && Intrinsics.g(this.parentId, postCommentData.parentId) && Intrinsics.g(this.refId, postCommentData.refId) && Intrinsics.g(this.sharedBetsMeta, postCommentData.sharedBetsMeta) && Intrinsics.g(this.type, postCommentData.type);
    }

    public final String getComment() {
        return this.comment;
    }

    public final Integer getParentId() {
        return this.parentId;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final String getSharedBetsMeta() {
        return this.sharedBetsMeta;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.comment;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.parentId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.refId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sharedBetsMeta;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setParentId(int value) {
        this.parentId = Integer.valueOf(value);
    }

    public String toString() {
        String str = this.comment;
        Integer num = this.parentId;
        String str2 = this.refId;
        String str3 = this.sharedBetsMeta;
        String str4 = this.type;
        StringBuilder sbA = ew7.a(num, "PostCommentData(comment=", str, ", parentId=", ", refId=");
        hxa.c(sbA, str2, ", sharedBetsMeta=", str3, ", type=");
        return uf80.a(sbA, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.comment);
        Integer num = this.parentId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
        dest.writeString(this.refId);
        dest.writeString(this.sharedBetsMeta);
        dest.writeString(this.type);
    }

    public PostCommentData(String str, Integer num, String str2, String str3, String str4) {
        this.comment = str;
        this.parentId = num;
        this.refId = str2;
        this.sharedBetsMeta = str3;
        this.type = str4;
    }

    public PostCommentData() {
        this(null, null, null, null, null, 31, null);
    }
}
