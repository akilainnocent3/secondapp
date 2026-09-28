package com.sporty.android.core.model.gift;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.l;
import defpackage.ai50;
import defpackage.f78;
import defpackage.f87;
import defpackage.g41;
import defpackage.gfs;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.m2g;
import defpackage.ng1;
import defpackage.pq6;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003JÐ\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0001¢\u0006\u0002\u0010MJ\u0006\u0010N\u001a\u00020\u0003J\u0014\u0010O\u001a\u00020\f2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0083\u0004J\n\u0010R\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010S\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\u000b\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00106\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010:\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b;\u00109Ê\u0001\u0002\bZ¨\u0006Y"}, d2 = {"Lcom/sporty/android/core/model/gift/GiftUsablePushData;", "Landroid/os/Parcelable;", "giftPurposeType", "", "title", "", "text", "amount", "", "currency", "linkUrl", "isMultiple", "", "kind", "leastOrderAmount", "usableTime", "expireTime", "from", "activityName", "conditions", "", "srcCtt", "bizTypeScope", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;IJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getGiftPurposeType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/String;", "getText", "getAmount", "()J", "getCurrency", "getLinkUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKind", "()I", "getLeastOrderAmount", "getUsableTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExpireTime", "getFrom", "getActivityName", "getConditions", "()Ljava/util/List;", "getSrcCtt", "getBizTypeScope", "mappedGiftPurposeType", "Lcom/sporty/android/core/model/gift/GiftPurposeType;", "getMappedGiftPurposeType", "()Lcom/sporty/android/core/model/gift/GiftPurposeType;", "usableTimeDate", "Ljava/util/Date;", "getUsableTimeDate", "()Ljava/util/Date;", "expireTimeDate", "getExpireTimeDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;IJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/sporty/android/core/model/gift/GiftUsablePushData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftUsablePushData implements Parcelable {
    public static final Parcelable.Creator<GiftUsablePushData> CREATOR = new Creator();
    private final String activityName;
    private final long amount;
    private final List<Integer> bizTypeScope;
    private final List<String> conditions;
    private final String currency;
    private final Long expireTime;
    private final String from;
    private final Integer giftPurposeType;
    private final Boolean isMultiple;
    private final int kind;
    private final long leastOrderAmount;
    private final String linkUrl;
    private final String srcCtt;
    private final String text;
    private final String title;
    private final Long usableTime;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GiftUsablePushData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftUsablePushData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i2 = parcel.readInt();
            long j2 = parcel.readLong();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string7 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            while (i != i3) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
                i++;
                i3 = i3;
            }
            return new GiftUsablePushData(numValueOf, string, string2, j, string3, string4, boolValueOf, i2, j2, lValueOf, lValueOf2, string5, string6, arrayListCreateStringArrayList, string7, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GiftUsablePushData[] newArray(int i) {
            return new GiftUsablePushData[i];
        }
    }

    public GiftUsablePushData(Integer num, String str, String str2, long j, String str3, String str4, Boolean bool, int i, long j2, Long l, Long l2, String str5, String str6, List list, String str7, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? 0 : i, (i2 & 256) == 0 ? j2 : 0L, (i2 & 512) != 0 ? null : l, (i2 & 1024) != 0 ? null : l2, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? m2g.a : list, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str7, (i2 & 32768) != 0 ? m2g.a : list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getGiftPurposeType() {
        return this.giftPurposeType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getUsableTime() {
        return this.usableTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    public final List<String> component14() {
        return this.conditions;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSrcCtt() {
        return this.srcCtt;
    }

    public final List<Integer> component16() {
        return this.bizTypeScope;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsMultiple() {
        return this.isMultiple;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getLeastOrderAmount() {
        return this.leastOrderAmount;
    }

    public final GiftUsablePushData copy(Integer giftPurposeType, String title, String text, long amount, String currency, String linkUrl, Boolean isMultiple, int kind, long leastOrderAmount, Long usableTime, Long expireTime, String from, String activityName, List<String> conditions, String srcCtt, List<Integer> bizTypeScope) {
        conditions.getClass();
        bizTypeScope.getClass();
        return new GiftUsablePushData(giftPurposeType, title, text, amount, currency, linkUrl, isMultiple, kind, leastOrderAmount, usableTime, expireTime, from, activityName, conditions, srcCtt, bizTypeScope);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftUsablePushData)) {
            return false;
        }
        GiftUsablePushData giftUsablePushData = (GiftUsablePushData) other;
        return Intrinsics.g(this.giftPurposeType, giftUsablePushData.giftPurposeType) && Intrinsics.g(this.title, giftUsablePushData.title) && Intrinsics.g(this.text, giftUsablePushData.text) && this.amount == giftUsablePushData.amount && Intrinsics.g(this.currency, giftUsablePushData.currency) && Intrinsics.g(this.linkUrl, giftUsablePushData.linkUrl) && Intrinsics.g(this.isMultiple, giftUsablePushData.isMultiple) && this.kind == giftUsablePushData.kind && this.leastOrderAmount == giftUsablePushData.leastOrderAmount && Intrinsics.g(this.usableTime, giftUsablePushData.usableTime) && Intrinsics.g(this.expireTime, giftUsablePushData.expireTime) && Intrinsics.g(this.from, giftUsablePushData.from) && Intrinsics.g(this.activityName, giftUsablePushData.activityName) && Intrinsics.g(this.conditions, giftUsablePushData.conditions) && Intrinsics.g(this.srcCtt, giftUsablePushData.srcCtt) && Intrinsics.g(this.bizTypeScope, giftUsablePushData.bizTypeScope);
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final List<Integer> getBizTypeScope() {
        return this.bizTypeScope;
    }

    public final List<String> getConditions() {
        return this.conditions;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Long getExpireTime() {
        return this.expireTime;
    }

    public final Date getExpireTimeDate() {
        Long l = this.expireTime;
        if (l != null) {
            return new Date(l.longValue());
        }
        return null;
    }

    public final String getFrom() {
        return this.from;
    }

    public final Integer getGiftPurposeType() {
        return this.giftPurposeType;
    }

    public final int getKind() {
        return this.kind;
    }

    public final long getLeastOrderAmount() {
        return this.leastOrderAmount;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final GiftPurposeType getMappedGiftPurposeType() {
        return GiftPurposeType.INSTANCE.fromInt(this.giftPurposeType);
    }

    public final String getSrcCtt() {
        return this.srcCtt;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUsableTime() {
        return this.usableTime;
    }

    public final Date getUsableTimeDate() {
        Long l = this.usableTime;
        if (l != null) {
            return new Date(l.longValue());
        }
        return null;
    }

    public int hashCode() {
        Integer num = this.giftPurposeType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iA = f87.a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.amount, 31);
        String str3 = this.currency;
        int iHashCode3 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isMultiple;
        int iA2 = f87.a(gpp.a(this.kind, (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31), this.leastOrderAmount, 31);
        Long l = this.usableTime;
        int iHashCode5 = (iA2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.expireTime;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.from;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.activityName;
        int iA3 = ai50.a((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.conditions);
        String str7 = this.srcCtt;
        return this.bizTypeScope.hashCode() + ((iA3 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final Boolean isMultiple() {
        return this.isMultiple;
    }

    public String toString() {
        Integer num = this.giftPurposeType;
        String str = this.title;
        String str2 = this.text;
        long j = this.amount;
        String str3 = this.currency;
        String str4 = this.linkUrl;
        Boolean bool = this.isMultiple;
        int i = this.kind;
        long j2 = this.leastOrderAmount;
        Long l = this.usableTime;
        Long l2 = this.expireTime;
        String str5 = this.from;
        String str6 = this.activityName;
        List<String> list = this.conditions;
        String str7 = this.srcCtt;
        List<Integer> list2 = this.bizTypeScope;
        StringBuilder sbA = pq6.a(num, "GiftUsablePushData(giftPurposeType=", ", title=", str, ", text=");
        l.a(j, str2, ", amount=", sbA);
        hxa.c(sbA, ", currency=", str3, ", linkUrl=", str4);
        sbA.append(", isMultiple=");
        sbA.append(bool);
        sbA.append(", kind=");
        sbA.append(i);
        g41.a(j2, ", leastOrderAmount=", ", usableTime=", sbA);
        sbA.append(l);
        sbA.append(", expireTime=");
        sbA.append(l2);
        sbA.append(", from=");
        hxa.c(sbA, str5, ", activityName=", str6, ", conditions=");
        gfs.a(", srcCtt=", str7, ", bizTypeScope=", sbA, list);
        return ng1.a(sbA, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        Integer num = this.giftPurposeType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
        dest.writeString(this.title);
        dest.writeString(this.text);
        dest.writeLong(this.amount);
        dest.writeString(this.currency);
        dest.writeString(this.linkUrl);
        Boolean bool = this.isMultiple;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.kind);
        dest.writeLong(this.leastOrderAmount);
        Long l = this.usableTime;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        Long l2 = this.expireTime;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l2.longValue());
        }
        dest.writeString(this.from);
        dest.writeString(this.activityName);
        dest.writeStringList(this.conditions);
        dest.writeString(this.srcCtt);
        List<Integer> list = this.bizTypeScope;
        dest.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            dest.writeInt(it.next().intValue());
        }
    }

    public GiftUsablePushData(Integer num, String str, String str2, long j, String str3, String str4, Boolean bool, int i, long j2, Long l, Long l2, String str5, String str6, List<String> list, String str7, List<Integer> list2) {
        list.getClass();
        list2.getClass();
        this.giftPurposeType = num;
        this.title = str;
        this.text = str2;
        this.amount = j;
        this.currency = str3;
        this.linkUrl = str4;
        this.isMultiple = bool;
        this.kind = i;
        this.leastOrderAmount = j2;
        this.usableTime = l;
        this.expireTime = l2;
        this.from = str5;
        this.activityName = str6;
        this.conditions = list;
        this.srcCtt = str7;
        this.bizTypeScope = list2;
    }

    public GiftUsablePushData() {
        this(null, null, null, 0L, null, null, null, 0, 0L, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }
}
