package com.sportybet.android.social.data.remote.entity;

import defpackage.ai50;
import defpackage.bt6;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.m2g;
import defpackage.nrg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010#J~\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00100J\u0014\u00101\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00103\u001a\u00020\u0007HÖ\u0081\u0004J\n\u00104\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\u0011\u0010#Ê\u0001\u0002\b6Ê\u0001\f\b7\u0012\b\b8\u0012\u0004\b\u0003\u0010\u0000¨\u00065"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocShareCode;", "", "shareCode", "", "totalOdds", "", "foldsAmount", "", "userId", "deadline", "", "createTime", "shareCodeDetail", "", "Lcom/sportybet/android/social/data/remote/entity/SocShareCodeDetail;", "note", "liabilityLevel", "isCreatorBookingCode", "", "<init>", "(Ljava/lang/String;DILjava/lang/String;JJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getShareCode", "()Ljava/lang/String;", "getTotalOdds", "()D", "getFoldsAmount", "()I", "getUserId", "getDeadline", "()J", "getCreateTime", "getShareCodeDetail", "()Ljava/util/List;", "getNote", "getLiabilityLevel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;DILjava/lang/String;JJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sportybet/android/social/data/remote/entity/SocShareCode;", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocShareCode {
    public static final int $stable = 8;
    private final long createTime;
    private final long deadline;
    private final int foldsAmount;
    private final Boolean isCreatorBookingCode;
    private final String liabilityLevel;
    private final String note;
    private final String shareCode;
    private final List<SocShareCodeDetail> shareCodeDetail;
    private final double totalOdds;
    private final String userId;

    public SocShareCode(String str, double d, int i, String str2, long j, long j2, List list, String str3, String str4, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, i, str2, j, j2, (i2 & 64) != 0 ? m2g.a : list, str3, str4, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocShareCode copy$default(SocShareCode socShareCode, String str, double d, int i, String str2, long j, long j2, List list, String str3, String str4, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = socShareCode.shareCode;
        }
        return socShareCode.copy(str, (i2 & 2) != 0 ? socShareCode.totalOdds : d, (i2 & 4) != 0 ? socShareCode.foldsAmount : i, (i2 & 8) != 0 ? socShareCode.userId : str2, (i2 & 16) != 0 ? socShareCode.deadline : j, (i2 & 32) != 0 ? socShareCode.createTime : j2, (i2 & 64) != 0 ? socShareCode.shareCodeDetail : list, (i2 & 128) != 0 ? socShareCode.note : str3, (i2 & 256) != 0 ? socShareCode.liabilityLevel : str4, (i2 & 512) != 0 ? socShareCode.isCreatorBookingCode : bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsCreatorBookingCode() {
        return this.isCreatorBookingCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFoldsAmount() {
        return this.foldsAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<SocShareCodeDetail> component7() {
        return this.shareCodeDetail;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLiabilityLevel() {
        return this.liabilityLevel;
    }

    public final SocShareCode copy(String shareCode, double totalOdds, int foldsAmount, String userId, long deadline, long createTime, List<SocShareCodeDetail> shareCodeDetail, String note, String liabilityLevel, Boolean isCreatorBookingCode) {
        shareCode.getClass();
        userId.getClass();
        shareCodeDetail.getClass();
        return new SocShareCode(shareCode, totalOdds, foldsAmount, userId, deadline, createTime, shareCodeDetail, note, liabilityLevel, isCreatorBookingCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocShareCode)) {
            return false;
        }
        SocShareCode socShareCode = (SocShareCode) other;
        return Intrinsics.g(this.shareCode, socShareCode.shareCode) && Double.compare(this.totalOdds, socShareCode.totalOdds) == 0 && this.foldsAmount == socShareCode.foldsAmount && Intrinsics.g(this.userId, socShareCode.userId) && this.deadline == socShareCode.deadline && this.createTime == socShareCode.createTime && Intrinsics.g(this.shareCodeDetail, socShareCode.shareCodeDetail) && Intrinsics.g(this.note, socShareCode.note) && Intrinsics.g(this.liabilityLevel, socShareCode.liabilityLevel) && Intrinsics.g(this.isCreatorBookingCode, socShareCode.isCreatorBookingCode);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getDeadline() {
        return this.deadline;
    }

    public final int getFoldsAmount() {
        return this.foldsAmount;
    }

    public final String getLiabilityLevel() {
        return this.liabilityLevel;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final List<SocShareCodeDetail> getShareCodeDetail() {
        return this.shareCodeDetail;
    }

    public final double getTotalOdds() {
        return this.totalOdds;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = ai50.a(f87.a(f87.a(gmf0.a(gpp.a(this.foldsAmount, nrg0.a(this.shareCode.hashCode() * 31, 31, this.totalOdds), 31), 31, this.userId), this.deadline, 31), this.createTime, 31), 31, this.shareCodeDetail);
        String str = this.note;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.liabilityLevel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isCreatorBookingCode;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isCreatorBookingCode() {
        return this.isCreatorBookingCode;
    }

    public String toString() {
        String str = this.shareCode;
        double d = this.totalOdds;
        int i = this.foldsAmount;
        String str2 = this.userId;
        long j = this.deadline;
        long j2 = this.createTime;
        List<SocShareCodeDetail> list = this.shareCodeDetail;
        String str3 = this.note;
        String str4 = this.liabilityLevel;
        Boolean bool = this.isCreatorBookingCode;
        StringBuilder sb = new StringBuilder("SocShareCode(shareCode=");
        sb.append(str);
        sb.append(", totalOdds=");
        sb.append(d);
        sb.append(", foldsAmount=");
        sb.append(i);
        sb.append(", userId=");
        sb.append(str2);
        g41.a(j, ", deadline=", ", createTime=", sb);
        sb.append(j2);
        sb.append(", shareCodeDetail=");
        sb.append(list);
        hxa.c(sb, ", note=", str3, ", liabilityLevel=", str4);
        sb.append(", isCreatorBookingCode=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public SocShareCode(String str, double d, int i, String str2, long j, long j2, List<SocShareCodeDetail> list, String str3, String str4, Boolean bool) {
        bt6.a(str, str2, list);
        this.shareCode = str;
        this.totalOdds = d;
        this.foldsAmount = i;
        this.userId = str2;
        this.deadline = j;
        this.createTime = j2;
        this.shareCodeDetail = list;
        this.note = str3;
        this.liabilityLevel = str4;
        this.isCreatorBookingCode = bool;
    }
}
