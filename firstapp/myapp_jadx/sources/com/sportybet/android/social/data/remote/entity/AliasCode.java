package com.sportybet.android.social.data.remote.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.m2g;
import defpackage.oie;
import defpackage.uqe0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010-\u001a\u00020\u0014J\u0006\u0010.\u001a\u00020\u0014J\u0006\u0010/\u001a\u00020\u0014J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010+J \u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010=J\u0014\u0010>\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010@\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010&\u001a\u0004\b'\u0010%R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\u0013\u0010+Ê\u0001\u0002\bCÊ\u0001\f\bD\u0012\b\bE\u0012\u0004\b\u0003\u0010\u0000¨\u0006B"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/AliasCode;", "", AnalyticsParam.EVENT_PARAM_ID, "", "aliasName", "", "shareCode", "shareCodeStatus", "totalOdds", "", "foldsAmount", "userId", "deadline", "", "createTime", "shareCodeDetail", "", "Lcom/sportybet/android/social/data/remote/entity/SocShareCodeDetail;", "liabilityLevel", "isCreatorBookingCode", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()I", "getAliasName", "()Ljava/lang/String;", "getShareCode", "getShareCodeStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalOdds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFoldsAmount", "getUserId", "getDeadline", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreateTime", "getShareCodeDetail", "()Ljava/util/List;", "getLiabilityLevel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isShareCodeValid", "isShareCodeInvalid", "isCodeAssigned", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sportybet/android/social/data/remote/entity/AliasCode;", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AliasCode {
    public static final int $stable = 8;
    private final String aliasName;
    private final Long createTime;
    private final Long deadline;
    private final Integer foldsAmount;
    private final int id;
    private final Boolean isCreatorBookingCode;
    private final String liabilityLevel;
    private final String shareCode;
    private final List<SocShareCodeDetail> shareCodeDetail;
    private final Integer shareCodeStatus;
    private final Double totalOdds;
    private final String userId;

    public AliasCode(int i, String str, String str2, Integer num, Double d, Integer num2, String str3, Long l, Long l2, List list, String str4, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : d, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : l2, (i2 & 512) != 0 ? m2g.a : list, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AliasCode copy$default(AliasCode aliasCode, int i, String str, String str2, Integer num, Double d, Integer num2, String str3, Long l, Long l2, List list, String str4, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aliasCode.id;
        }
        if ((i2 & 2) != 0) {
            str = aliasCode.aliasName;
        }
        if ((i2 & 4) != 0) {
            str2 = aliasCode.shareCode;
        }
        if ((i2 & 8) != 0) {
            num = aliasCode.shareCodeStatus;
        }
        if ((i2 & 16) != 0) {
            d = aliasCode.totalOdds;
        }
        if ((i2 & 32) != 0) {
            num2 = aliasCode.foldsAmount;
        }
        if ((i2 & 64) != 0) {
            str3 = aliasCode.userId;
        }
        if ((i2 & 128) != 0) {
            l = aliasCode.deadline;
        }
        if ((i2 & 256) != 0) {
            l2 = aliasCode.createTime;
        }
        if ((i2 & 512) != 0) {
            list = aliasCode.shareCodeDetail;
        }
        if ((i2 & 1024) != 0) {
            str4 = aliasCode.liabilityLevel;
        }
        if ((i2 & 2048) != 0) {
            bool = aliasCode.isCreatorBookingCode;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        Long l3 = l2;
        List list2 = list;
        String str6 = str3;
        Long l4 = l;
        Double d2 = d;
        Integer num3 = num2;
        return aliasCode.copy(i, str, str2, num, d2, num3, str6, l4, l3, list2, str5, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final List<SocShareCodeDetail> component10() {
        return this.shareCodeDetail;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLiabilityLevel() {
        return this.liabilityLevel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsCreatorBookingCode() {
        return this.isCreatorBookingCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAliasName() {
        return this.aliasName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getShareCodeStatus() {
        return this.shareCodeStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getFoldsAmount() {
        return this.foldsAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    public final AliasCode copy(int id, String aliasName, String shareCode, Integer shareCodeStatus, Double totalOdds, Integer foldsAmount, String userId, Long deadline, Long createTime, List<SocShareCodeDetail> shareCodeDetail, String liabilityLevel, Boolean isCreatorBookingCode) {
        aliasName.getClass();
        return new AliasCode(id, aliasName, shareCode, shareCodeStatus, totalOdds, foldsAmount, userId, deadline, createTime, shareCodeDetail, liabilityLevel, isCreatorBookingCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliasCode)) {
            return false;
        }
        AliasCode aliasCode = (AliasCode) other;
        return this.id == aliasCode.id && Intrinsics.g(this.aliasName, aliasCode.aliasName) && Intrinsics.g(this.shareCode, aliasCode.shareCode) && Intrinsics.g(this.shareCodeStatus, aliasCode.shareCodeStatus) && Intrinsics.g(this.totalOdds, aliasCode.totalOdds) && Intrinsics.g(this.foldsAmount, aliasCode.foldsAmount) && Intrinsics.g(this.userId, aliasCode.userId) && Intrinsics.g(this.deadline, aliasCode.deadline) && Intrinsics.g(this.createTime, aliasCode.createTime) && Intrinsics.g(this.shareCodeDetail, aliasCode.shareCodeDetail) && Intrinsics.g(this.liabilityLevel, aliasCode.liabilityLevel) && Intrinsics.g(this.isCreatorBookingCode, aliasCode.isCreatorBookingCode);
    }

    public final String getAliasName() {
        return this.aliasName;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final Long getDeadline() {
        return this.deadline;
    }

    public final Integer getFoldsAmount() {
        return this.foldsAmount;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLiabilityLevel() {
        return this.liabilityLevel;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final List<SocShareCodeDetail> getShareCodeDetail() {
        return this.shareCodeDetail;
    }

    public final Integer getShareCodeStatus() {
        return this.shareCodeStatus;
    }

    public final Double getTotalOdds() {
        return this.totalOdds;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gmf0.a(Integer.hashCode(this.id) * 31, 31, this.aliasName);
        String str = this.shareCode;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.shareCodeStatus;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.totalOdds;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.foldsAmount;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.deadline;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createTime;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<SocShareCodeDetail> list = this.shareCodeDetail;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.liabilityLevel;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isCreatorBookingCode;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isCodeAssigned() {
        String str = this.shareCode;
        return !(str == null || str.length() == 0);
    }

    public final Boolean isCreatorBookingCode() {
        return this.isCreatorBookingCode;
    }

    public final boolean isShareCodeInvalid() {
        Integer num;
        String str = this.shareCode;
        return (str == null || str.length() == 0 || (num = this.shareCodeStatus) == null || num.intValue() != 0) ? false : true;
    }

    public final boolean isShareCodeValid() {
        Integer num;
        String str = this.shareCode;
        return (str == null || str.length() == 0 || (num = this.shareCodeStatus) == null || num.intValue() != 1) ? false : true;
    }

    public String toString() {
        int i = this.id;
        String str = this.aliasName;
        String str2 = this.shareCode;
        Integer num = this.shareCodeStatus;
        Double d = this.totalOdds;
        Integer num2 = this.foldsAmount;
        String str3 = this.userId;
        Long l = this.deadline;
        Long l2 = this.createTime;
        List<SocShareCodeDetail> list = this.shareCodeDetail;
        String str4 = this.liabilityLevel;
        Boolean bool = this.isCreatorBookingCode;
        StringBuilder sbA = uqe0.a(i, "AliasCode(id=", ", aliasName=", str, ", shareCode=");
        oie.a(num, str2, ", shareCodeStatus=", ", totalOdds=", sbA);
        sbA.append(d);
        sbA.append(", foldsAmount=");
        sbA.append(num2);
        sbA.append(", userId=");
        sbA.append(str3);
        sbA.append(", deadline=");
        sbA.append(l);
        sbA.append(", createTime=");
        sbA.append(l2);
        sbA.append(", shareCodeDetail=");
        sbA.append(list);
        sbA.append(", liabilityLevel=");
        sbA.append(str4);
        sbA.append(", isCreatorBookingCode=");
        sbA.append(bool);
        sbA.append(")");
        return sbA.toString();
    }

    public AliasCode(int i, String str, String str2, Integer num, Double d, Integer num2, String str3, Long l, Long l2, List<SocShareCodeDetail> list, String str4, Boolean bool) {
        str.getClass();
        this.id = i;
        this.aliasName = str;
        this.shareCode = str2;
        this.shareCodeStatus = num;
        this.totalOdds = d;
        this.foldsAmount = num2;
        this.userId = str3;
        this.deadline = l;
        this.createTime = l2;
        this.shareCodeDetail = list;
        this.liabilityLevel = str4;
        this.isCreatorBookingCode = bool;
    }
}
