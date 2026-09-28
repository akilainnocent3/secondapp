package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.fu5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.p200;
import defpackage.qn4;
import defpackage.wd7;
import defpackage.wxa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u00102\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\tJ\u0006\u00104\u001a\u00020\tJ\u000e\u00105\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\fJ\u0006\u00106\u001a\u00020\fJ\u000e\u00107\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\fJ\u0006\u00108\u001a\u00020\fJ\u0006\u00109\u001a\u00020\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\fHÂ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\tHÂ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010(J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\fHÂ\u0003JÚ\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u00020\tJ\u0014\u0010P\u001a\u00020\f2\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0083\u0004J\n\u0010S\u001a\u00020\tHÖ\u0081\u0004J\n\u0010T\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010U\u001a\u0002032\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\tR'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR%\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR%\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R%\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR!\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u000b¢\u0006\u0002\n\u0000R%\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010&R!\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0083\u000e\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u000e¢\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u000f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R%\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR%\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R'\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR%\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR%\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR%\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR%\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR%\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR!\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0083\u000e\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0018¢\u0006\u0002\n\u0000Ê\u0001\u0002\bZÊ\u0001\f\b[\u0012\b\b\\\u0012\u0004\b\u0003\u0010\u0000¨\u0006Y"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/CommentsData;", "Landroid/os/Parcelable;", "avatar", "", "children", "", "comment", "createTime", AnalyticsParam.EVENT_PARAM_ID, "", "ipAddress", "likedByMe", "", "isIsolated", "likedCount", "parentId", "refId", "repliesCount", "sharedBetsMeta", "type", "userId", "userNickname", "countryCode", "userCountryCode", "needLoad", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZILjava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAvatar", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getChildren", "()Ljava/util/List;", "getComment", "getCreateTime", "getId", "()I", "getIpAddress", "()Z", "getParentId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRefId", "getRepliesCount", "getSharedBetsMeta", "getType", "getUserId", "getUserNickname", "getCountryCode", "getUserCountryCode", "setLikeCount", "", "getLikedCount", "setLikedByMe", "getLikedByMe", "setNeedLoad", "getNeedLoad", "getHiddenName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZILjava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/CommentsData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CommentsData implements Parcelable {

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("children")
    private final List<CommentsData> children;

    @SerializedName("comment")
    private final String comment;

    @SerializedName("countryCode")
    private final String countryCode;

    @SerializedName("createTime")
    private final String createTime;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final int id;

    @SerializedName("ipAddress")
    private final String ipAddress;

    @SerializedName("isIsolated")
    private final boolean isIsolated;

    @SerializedName("likedByMe")
    private boolean likedByMe;

    @SerializedName("likedCount")
    private int likedCount;

    @SerializedName("needLoad")
    private boolean needLoad;

    @SerializedName("parentId")
    private final Integer parentId;

    @SerializedName("refId")
    private final String refId;

    @SerializedName("repliesCount")
    private final int repliesCount;

    @SerializedName("sharedBetsMeta")
    private final String sharedBetsMeta;

    @SerializedName("type")
    private final String type;

    @SerializedName("userCountryCode")
    private final String userCountryCode;

    @SerializedName("userId")
    private final String userId;

    @SerializedName("userNickname")
    private final String userNickname;
    public static final Parcelable.Creator<CommentsData> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommentsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommentsData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = p200.a(CommentsData.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = null;
            ArrayList arrayList2 = arrayList;
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            boolean z4 = z2;
            String string5 = parcel.readString();
            int i4 = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z5 = z4;
            String string11 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            }
            return new CommentsData(string, arrayList2, string2, string3, i2, string4, z3, z, i3, numValueOf, string5, i4, string6, string7, string8, string9, string10, string11, z5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommentsData[] newArray(int i) {
            return new CommentsData[i];
        }
    }

    public /* synthetic */ CommentsData(String str, List list, String str2, String str3, int i, String str4, boolean z, boolean z2, int i2, Integer num, String str5, int i3, String str6, String str7, String str8, String str9, String str10, String str11, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? new ArrayList() : list, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? false : z2, i2, (i4 & 512) != 0 ? 0 : num, (i4 & 1024) != 0 ? "" : str5, (i4 & 2048) != 0 ? 0 : i3, (i4 & 4096) != 0 ? "" : str6, (i4 & 8192) != 0 ? "" : str7, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str8, (32768 & i4) != 0 ? "" : str9, (65536 & i4) != 0 ? "" : str10, (131072 & i4) != 0 ? "" : str11, (i4 & 262144) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    private final boolean getNeedLoad() {
        return this.needLoad;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final boolean getLikedByMe() {
        return this.likedByMe;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final int getLikedCount() {
        return this.likedCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentsData copy$default(CommentsData commentsData, String str, List list, String str2, String str3, int i, String str4, boolean z, boolean z2, int i2, Integer num, String str5, int i3, String str6, String str7, String str8, String str9, String str10, String str11, boolean z3, int i4, Object obj) {
        boolean z4;
        String str12;
        String str13 = (i4 & 1) != 0 ? commentsData.avatar : str;
        List list2 = (i4 & 2) != 0 ? commentsData.children : list;
        String str14 = (i4 & 4) != 0 ? commentsData.comment : str2;
        String str15 = (i4 & 8) != 0 ? commentsData.createTime : str3;
        int i5 = (i4 & 16) != 0 ? commentsData.id : i;
        String str16 = (i4 & 32) != 0 ? commentsData.ipAddress : str4;
        boolean z5 = (i4 & 64) != 0 ? commentsData.likedByMe : z;
        boolean z6 = (i4 & 128) != 0 ? commentsData.isIsolated : z2;
        int i6 = (i4 & 256) != 0 ? commentsData.likedCount : i2;
        Integer num2 = (i4 & 512) != 0 ? commentsData.parentId : num;
        String str17 = (i4 & 1024) != 0 ? commentsData.refId : str5;
        int i7 = (i4 & 2048) != 0 ? commentsData.repliesCount : i3;
        String str18 = (i4 & 4096) != 0 ? commentsData.sharedBetsMeta : str6;
        String str19 = (i4 & 8192) != 0 ? commentsData.type : str7;
        String str20 = str13;
        String str21 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? commentsData.userId : str8;
        String str22 = (i4 & 32768) != 0 ? commentsData.userNickname : str9;
        String str23 = (i4 & 65536) != 0 ? commentsData.countryCode : str10;
        String str24 = (i4 & 131072) != 0 ? commentsData.userCountryCode : str11;
        if ((i4 & 262144) != 0) {
            str12 = str24;
            z4 = commentsData.needLoad;
        } else {
            z4 = z3;
            str12 = str24;
        }
        return commentsData.copy(str20, list2, str14, str15, i5, str16, z5, z6, i6, num2, str17, i7, str18, str19, str21, str22, str23, str12, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRefId() {
        return this.refId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getRepliesCount() {
        return this.repliesCount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSharedBetsMeta() {
        return this.sharedBetsMeta;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUserNickname() {
        return this.userNickname;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getUserCountryCode() {
        return this.userCountryCode;
    }

    public final List<CommentsData> component2() {
        return this.children;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsIsolated() {
        return this.isIsolated;
    }

    public final CommentsData copy(String avatar, List<CommentsData> children, String comment, String createTime, int id, String ipAddress, boolean likedByMe, boolean isIsolated, int likedCount, Integer parentId, String refId, int repliesCount, String sharedBetsMeta, String type, String userId, String userNickname, String countryCode, String userCountryCode, boolean needLoad) {
        qn4.b(comment, createTime, ipAddress, refId, type);
        userId.getClass();
        userNickname.getClass();
        countryCode.getClass();
        userCountryCode.getClass();
        return new CommentsData(avatar, children, comment, createTime, id, ipAddress, likedByMe, isIsolated, likedCount, parentId, refId, repliesCount, sharedBetsMeta, type, userId, userNickname, countryCode, userCountryCode, needLoad);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsData)) {
            return false;
        }
        CommentsData commentsData = (CommentsData) other;
        return Intrinsics.g(this.avatar, commentsData.avatar) && Intrinsics.g(this.children, commentsData.children) && Intrinsics.g(this.comment, commentsData.comment) && Intrinsics.g(this.createTime, commentsData.createTime) && this.id == commentsData.id && Intrinsics.g(this.ipAddress, commentsData.ipAddress) && this.likedByMe == commentsData.likedByMe && this.isIsolated == commentsData.isIsolated && this.likedCount == commentsData.likedCount && Intrinsics.g(this.parentId, commentsData.parentId) && Intrinsics.g(this.refId, commentsData.refId) && this.repliesCount == commentsData.repliesCount && Intrinsics.g(this.sharedBetsMeta, commentsData.sharedBetsMeta) && Intrinsics.g(this.type, commentsData.type) && Intrinsics.g(this.userId, commentsData.userId) && Intrinsics.g(this.userNickname, commentsData.userNickname) && Intrinsics.g(this.countryCode, commentsData.countryCode) && Intrinsics.g(this.userCountryCode, commentsData.userCountryCode) && this.needLoad == commentsData.needLoad;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final List<CommentsData> getChildren() {
        return this.children;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getHiddenName() {
        if (this.userNickname.length() == 0) {
            return "";
        }
        int length = this.userNickname.length();
        String str = this.userNickname;
        return length > 5 ? fu5.a("(?<=\\d{2})\\d(?=\\d{3})", str, "*") : str;
    }

    public final int getId() {
        return this.id;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final boolean getLikedByMe() {
        return this.likedByMe;
    }

    public final int getLikedCount() {
        return this.likedCount;
    }

    public final boolean getNeedLoad() {
        return this.needLoad;
    }

    public final Integer getParentId() {
        return this.parentId;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final int getRepliesCount() {
        return this.repliesCount;
    }

    public final String getSharedBetsMeta() {
        return this.sharedBetsMeta;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserCountryCode() {
        return this.userCountryCode;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserNickname() {
        return this.userNickname;
    }

    public int hashCode() {
        String str = this.avatar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CommentsData> list = this.children;
        int iA = gpp.a(this.likedCount, mtg0.a(mtg0.a(gmf0.a(gpp.a(this.id, gmf0.a(gmf0.a((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.comment), 31, this.createTime), 31), 31, this.ipAddress), 31, this.likedByMe), 31, this.isIsolated), 31);
        Integer num = this.parentId;
        int iA2 = gpp.a(this.repliesCount, gmf0.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.refId), 31);
        String str2 = this.sharedBetsMeta;
        return Boolean.hashCode(this.needLoad) + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((iA2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.type), 31, this.userId), 31, this.userNickname), 31, this.countryCode), 31, this.userCountryCode);
    }

    public final boolean isIsolated() {
        return this.isIsolated;
    }

    public final void setLikeCount(int value) {
        this.likedCount = value;
    }

    public final void setLikedByMe(boolean value) {
        this.likedByMe = value;
    }

    public final void setNeedLoad(boolean value) {
        this.needLoad = value;
    }

    public String toString() {
        String str = this.avatar;
        List<CommentsData> list = this.children;
        String str2 = this.comment;
        String str3 = this.createTime;
        int i = this.id;
        String str4 = this.ipAddress;
        boolean z = this.likedByMe;
        boolean z2 = this.isIsolated;
        int i2 = this.likedCount;
        Integer num = this.parentId;
        String str5 = this.refId;
        int i3 = this.repliesCount;
        String str6 = this.sharedBetsMeta;
        String str7 = this.type;
        String str8 = this.userId;
        String str9 = this.userNickname;
        String str10 = this.countryCode;
        String str11 = this.userCountryCode;
        boolean z3 = this.needLoad;
        StringBuilder sb = new StringBuilder("CommentsData(avatar=");
        sb.append(str);
        sb.append(", children=");
        sb.append(list);
        sb.append(", comment=");
        hxa.c(sb, str2, ", createTime=", str3, ", id=");
        f78.b(i, ", ipAddress=", str4, ", likedByMe=", sb);
        nng.a(", isIsolated=", ", likedCount=", sb, z, z2);
        sb.append(i2);
        sb.append(", parentId=");
        sb.append(num);
        sb.append(", refId=");
        wxa.b(i3, str5, ", repliesCount=", ", sharedBetsMeta=", sb);
        hxa.c(sb, str6, ", type=", str7, ", userId=");
        hxa.c(sb, str8, ", userNickname=", str9, ", countryCode=");
        hxa.c(sb, str10, ", userCountryCode=", str11, ", needLoad=");
        return mq0.a(sb, z3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.avatar);
        List<CommentsData> list = this.children;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<CommentsData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.comment);
        dest.writeString(this.createTime);
        dest.writeInt(this.id);
        dest.writeString(this.ipAddress);
        dest.writeInt(this.likedByMe ? 1 : 0);
        dest.writeInt(this.isIsolated ? 1 : 0);
        dest.writeInt(this.likedCount);
        Integer num = this.parentId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
        dest.writeString(this.refId);
        dest.writeInt(this.repliesCount);
        dest.writeString(this.sharedBetsMeta);
        dest.writeString(this.type);
        dest.writeString(this.userId);
        dest.writeString(this.userNickname);
        dest.writeString(this.countryCode);
        dest.writeString(this.userCountryCode);
        dest.writeInt(this.needLoad ? 1 : 0);
    }

    public CommentsData(String str, List<CommentsData> list, String str2, String str3, int i, String str4, boolean z, boolean z2, int i2, Integer num, String str5, int i3, String str6, String str7, String str8, String str9, String str10, String str11, boolean z3) {
        qn4.b(str2, str3, str4, str5, str7);
        wd7.a(str8, str9, str10, str11);
        this.avatar = str;
        this.children = list;
        this.comment = str2;
        this.createTime = str3;
        this.id = i;
        this.ipAddress = str4;
        this.likedByMe = z;
        this.isIsolated = z2;
        this.likedCount = i2;
        this.parentId = num;
        this.refId = str5;
        this.repliesCount = i3;
        this.sharedBetsMeta = str6;
        this.type = str7;
        this.userId = str8;
        this.userNickname = str9;
        this.countryCode = str10;
        this.userCountryCode = str11;
        this.needLoad = z3;
    }
}
