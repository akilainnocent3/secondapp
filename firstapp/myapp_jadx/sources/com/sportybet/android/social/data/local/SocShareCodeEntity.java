package com.sportybet.android.social.data.local;

import defpackage.ai50;
import defpackage.f87;
import defpackage.g41;
import defpackage.gfs;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nrg0;
import defpackage.u4;
import defpackage.ux5;
import defpackage.z320;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0088\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0018J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u001a\u0010.\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010 R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b:\u0010 R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b=\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010&R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\b\u0014\u0010(¨\u0006A"}, d2 = {"Lcom/sportybet/android/social/data/local/SocShareCodeEntity;", "", "", "username", "shareCode", "", "totalOdds", "", "foldsAmount", "userId", "", "deadline", "createTime", "", "Lcom/sportybet/android/social/data/local/SocShareCodeDetailEntity;", "shareCodeDetail", "note", "Lz320;", "popularityLevel", "", "isCreatorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;JJLjava/util/List;Ljava/lang/String;Lz320;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "()I", "component5", "component6", "()J", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "()Lz320;", "component11", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;JJLjava/util/List;Ljava/lang/String;Lz320;Z)Lcom/sportybet/android/social/data/local/SocShareCodeEntity;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUsername", "getShareCode", "D", "getTotalOdds", "I", "getFoldsAmount", "getUserId", "J", "getDeadline", "getCreateTime", "Ljava/util/List;", "getShareCodeDetail", "getNote", "Lz320;", "getPopularityLevel", "Z", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocShareCodeEntity {
    public static final int $stable = 8;
    private final long createTime;
    private final long deadline;
    private final int foldsAmount;
    private final boolean isCreatorCode;
    private final String note;
    private final z320 popularityLevel;
    private final String shareCode;
    private final List<SocShareCodeDetailEntity> shareCodeDetail;
    private final double totalOdds;
    private final String userId;
    private final String username;

    public SocShareCodeEntity(String str, String str2, double d, int i, String str3, long j, long j2, List<SocShareCodeDetailEntity> list, String str4, z320 z320Var, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.username = str;
        this.shareCode = str2;
        this.totalOdds = d;
        this.foldsAmount = i;
        this.userId = str3;
        this.deadline = j;
        this.createTime = j2;
        this.shareCodeDetail = list;
        this.note = str4;
        this.popularityLevel = z320Var;
        this.isCreatorCode = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final z320 getPopularityLevel() {
        return this.popularityLevel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsCreatorCode() {
        return this.isCreatorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFoldsAmount() {
        return this.foldsAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<SocShareCodeDetailEntity> component8() {
        return this.shareCodeDetail;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    public final SocShareCodeEntity copy(String username, String shareCode, double totalOdds, int foldsAmount, String userId, long deadline, long createTime, List<SocShareCodeDetailEntity> shareCodeDetail, String note, z320 popularityLevel, boolean isCreatorCode) {
        username.getClass();
        shareCode.getClass();
        userId.getClass();
        shareCodeDetail.getClass();
        return new SocShareCodeEntity(username, shareCode, totalOdds, foldsAmount, userId, deadline, createTime, shareCodeDetail, note, popularityLevel, isCreatorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocShareCodeEntity)) {
            return false;
        }
        SocShareCodeEntity socShareCodeEntity = (SocShareCodeEntity) other;
        return Intrinsics.g(this.username, socShareCodeEntity.username) && Intrinsics.g(this.shareCode, socShareCodeEntity.shareCode) && Double.compare(this.totalOdds, socShareCodeEntity.totalOdds) == 0 && this.foldsAmount == socShareCodeEntity.foldsAmount && Intrinsics.g(this.userId, socShareCodeEntity.userId) && this.deadline == socShareCodeEntity.deadline && this.createTime == socShareCodeEntity.createTime && Intrinsics.g(this.shareCodeDetail, socShareCodeEntity.shareCodeDetail) && Intrinsics.g(this.note, socShareCodeEntity.note) && this.popularityLevel == socShareCodeEntity.popularityLevel && this.isCreatorCode == socShareCodeEntity.isCreatorCode;
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

    public final String getNote() {
        return this.note;
    }

    public final z320 getPopularityLevel() {
        return this.popularityLevel;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final List<SocShareCodeDetailEntity> getShareCodeDetail() {
        return this.shareCodeDetail;
    }

    public final double getTotalOdds() {
        return this.totalOdds;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iA = ai50.a(f87.a(f87.a(gmf0.a(gpp.a(this.foldsAmount, nrg0.a(gmf0.a(this.username.hashCode() * 31, 31, this.shareCode), 31, this.totalOdds), 31), 31, this.userId), this.deadline, 31), this.createTime, 31), 31, this.shareCodeDetail);
        String str = this.note;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        z320 z320Var = this.popularityLevel;
        return Boolean.hashCode(this.isCreatorCode) + ((iHashCode + (z320Var != null ? z320Var.hashCode() : 0)) * 31);
    }

    public final boolean isCreatorCode() {
        return this.isCreatorCode;
    }

    public String toString() {
        String str = this.username;
        String str2 = this.shareCode;
        double d = this.totalOdds;
        int i = this.foldsAmount;
        String str3 = this.userId;
        long j = this.deadline;
        long j2 = this.createTime;
        List<SocShareCodeDetailEntity> list = this.shareCodeDetail;
        String str4 = this.note;
        z320 z320Var = this.popularityLevel;
        boolean z = this.isCreatorCode;
        StringBuilder sbA = ux5.a("SocShareCodeEntity(username=", str, ", shareCode=", str2, ", totalOdds=");
        sbA.append(d);
        sbA.append(", foldsAmount=");
        sbA.append(i);
        u4.a(sbA, ", userId=", str3, ", deadline=");
        sbA.append(j);
        g41.a(j2, ", createTime=", ", shareCodeDetail=", sbA);
        gfs.a(", note=", str4, ", popularityLevel=", sbA, list);
        sbA.append(z320Var);
        sbA.append(", isCreatorCode=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }
}
