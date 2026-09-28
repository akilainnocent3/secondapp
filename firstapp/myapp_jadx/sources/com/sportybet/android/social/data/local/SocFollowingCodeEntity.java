package com.sportybet.android.social.data.local;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.bt6;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.nrg0;
import defpackage.qn4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u0091\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001J\u0014\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010E\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010F\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R%\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b( ¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R%\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(#¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R%\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(%¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R%\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b((¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R%\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(*¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR%\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(,¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R%\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R%\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(0¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(3¢\u0006\b\n\u0000\u001a\u0004\b1\u00102Ê\u0001\u0002\bHÊ\u0001&\bI\u0012\u0018\bJ\u0012\u0014\b\fJ\u0004\b\b(%J\u0004\b\b(\u0002J\u0004\b\b(\u0006\u0012\b\bK\u0012\u0004\b\b(LÊ\u0001\f\bM\u0012\b\bN\u0012\u0004\b\u0003\u0010\u0000¨\u0006G"}, d2 = {"Lcom/sportybet/android/social/data/local/SocFollowingCodeEntity;", "", "account", "", "pageIndex", "", "nickname", "avatarUrl", "country", "userType", "shareCode", "totalOdds", "", "foldsAmount", "userId", "deadline", "", "createTime", "shareCodeDetail", "", "Lcom/sportybet/android/social/data/local/SocShareCodeDetailEntity;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;JJLjava/util/List;)V", "getAccount", "()Ljava/lang/String;", "Landroidx/room/ColumnInfo;", "name", "getPageIndex", "()I", "page_index", "getNickname", "getAvatarUrl", "avatar_url", "getCountry", "getUserType", "user_type", "getShareCode", "share_code", "getTotalOdds", "()D", "total_odds", "getFoldsAmount", "folds_amount", "getUserId", AnalyticsParam.EVENT_PARAM_USER_ID, "getDeadline", "()J", "getCreateTime", "create_time", "getShareCodeDetail", "()Ljava/util/List;", "share_code_detail", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/room/Entity;", "primaryKeys", "tableName", "social_following_code_table", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocFollowingCodeEntity {
    public static final int $stable = 8;
    private final String account;
    private final String avatarUrl;
    private final String country;
    private final long createTime;
    private final long deadline;
    private final int foldsAmount;
    private final String nickname;
    private final int pageIndex;
    private final String shareCode;
    private final List<SocShareCodeDetailEntity> shareCodeDetail;
    private final double totalOdds;
    private final String userId;
    private final String userType;

    public SocFollowingCodeEntity(String str, int i, String str2, String str3, String str4, String str5, String str6, double d, int i2, String str7, long j, long j2, List<SocShareCodeDetailEntity> list) {
        qn4.b(str, str2, str3, str4, str5);
        bt6.a(str6, str7, list);
        this.account = str;
        this.pageIndex = i;
        this.nickname = str2;
        this.avatarUrl = str3;
        this.country = str4;
        this.userType = str5;
        this.shareCode = str6;
        this.totalOdds = d;
        this.foldsAmount = i2;
        this.userId = str7;
        this.deadline = j;
        this.createTime = j2;
        this.shareCodeDetail = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<SocShareCodeDetailEntity> component13() {
        return this.shareCodeDetail;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFoldsAmount() {
        return this.foldsAmount;
    }

    public final SocFollowingCodeEntity copy(String account, int pageIndex, String nickname, String avatarUrl, String country, String userType, String shareCode, double totalOdds, int foldsAmount, String userId, long deadline, long createTime, List<SocShareCodeDetailEntity> shareCodeDetail) {
        qn4.b(account, nickname, avatarUrl, country, userType);
        shareCode.getClass();
        userId.getClass();
        shareCodeDetail.getClass();
        return new SocFollowingCodeEntity(account, pageIndex, nickname, avatarUrl, country, userType, shareCode, totalOdds, foldsAmount, userId, deadline, createTime, shareCodeDetail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocFollowingCodeEntity)) {
            return false;
        }
        SocFollowingCodeEntity socFollowingCodeEntity = (SocFollowingCodeEntity) other;
        return Intrinsics.g(this.account, socFollowingCodeEntity.account) && this.pageIndex == socFollowingCodeEntity.pageIndex && Intrinsics.g(this.nickname, socFollowingCodeEntity.nickname) && Intrinsics.g(this.avatarUrl, socFollowingCodeEntity.avatarUrl) && Intrinsics.g(this.country, socFollowingCodeEntity.country) && Intrinsics.g(this.userType, socFollowingCodeEntity.userType) && Intrinsics.g(this.shareCode, socFollowingCodeEntity.shareCode) && Double.compare(this.totalOdds, socFollowingCodeEntity.totalOdds) == 0 && this.foldsAmount == socFollowingCodeEntity.foldsAmount && Intrinsics.g(this.userId, socFollowingCodeEntity.userId) && this.deadline == socFollowingCodeEntity.deadline && this.createTime == socFollowingCodeEntity.createTime && Intrinsics.g(this.shareCodeDetail, socFollowingCodeEntity.shareCodeDetail);
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCountry() {
        return this.country;
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

    public final String getNickname() {
        return this.nickname;
    }

    public final int getPageIndex() {
        return this.pageIndex;
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

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return this.shareCodeDetail.hashCode() + f87.a(f87.a(gmf0.a(gpp.a(this.foldsAmount, nrg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.pageIndex, this.account.hashCode() * 31, 31), 31, this.nickname), 31, this.avatarUrl), 31, this.country), 31, this.userType), 31, this.shareCode), 31, this.totalOdds), 31), 31, this.userId), this.deadline, 31), this.createTime, 31);
    }

    public String toString() {
        String str = this.account;
        int i = this.pageIndex;
        String str2 = this.nickname;
        String str3 = this.avatarUrl;
        String str4 = this.country;
        String str5 = this.userType;
        String str6 = this.shareCode;
        double d = this.totalOdds;
        int i2 = this.foldsAmount;
        String str7 = this.userId;
        long j = this.deadline;
        long j2 = this.createTime;
        List<SocShareCodeDetailEntity> list = this.shareCodeDetail;
        StringBuilder sbA = ml5.a(i, "SocFollowingCodeEntity(account=", str, ", pageIndex=", ", nickname=");
        hxa.c(sbA, str2, ", avatarUrl=", str3, ", country=");
        hxa.c(sbA, str4, ", userType=", str5, ", shareCode=");
        sbA.append(str6);
        sbA.append(", totalOdds=");
        sbA.append(d);
        sbA.append(", foldsAmount=");
        sbA.append(i2);
        sbA.append(", userId=");
        sbA.append(str7);
        g41.a(j, ", deadline=", ", createTime=", sbA);
        sbA.append(j2);
        sbA.append(", shareCodeDetail=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}
