package com.sportybet.android.social.data.local;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.mq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\f¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/social/data/local/CreatorCreditsHistoryCursorEntity;", "", "userId", "", "pageNo", "", "isClaimed", "", "<init>", "(Ljava/lang/String;IZ)V", "getUserId", "()Ljava/lang/String;", "Landroidx/room/PrimaryKey;", "getPageNo", "()I", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/room/Entity;", "tableName", "creator_credits_history_cursor_table", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CreatorCreditsHistoryCursorEntity {
    public static final int $stable = 0;
    private final boolean isClaimed;
    private final int pageNo;
    private final String userId;

    public CreatorCreditsHistoryCursorEntity(String str, int i, boolean z) {
        str.getClass();
        this.userId = str;
        this.pageNo = i;
        this.isClaimed = z;
    }

    public static /* synthetic */ CreatorCreditsHistoryCursorEntity copy$default(CreatorCreditsHistoryCursorEntity creatorCreditsHistoryCursorEntity, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = creatorCreditsHistoryCursorEntity.userId;
        }
        if ((i2 & 2) != 0) {
            i = creatorCreditsHistoryCursorEntity.pageNo;
        }
        if ((i2 & 4) != 0) {
            z = creatorCreditsHistoryCursorEntity.isClaimed;
        }
        return creatorCreditsHistoryCursorEntity.copy(str, i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNo() {
        return this.pageNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsClaimed() {
        return this.isClaimed;
    }

    public final CreatorCreditsHistoryCursorEntity copy(String userId, int pageNo, boolean isClaimed) {
        userId.getClass();
        return new CreatorCreditsHistoryCursorEntity(userId, pageNo, isClaimed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatorCreditsHistoryCursorEntity)) {
            return false;
        }
        CreatorCreditsHistoryCursorEntity creatorCreditsHistoryCursorEntity = (CreatorCreditsHistoryCursorEntity) other;
        return Intrinsics.g(this.userId, creatorCreditsHistoryCursorEntity.userId) && this.pageNo == creatorCreditsHistoryCursorEntity.pageNo && this.isClaimed == creatorCreditsHistoryCursorEntity.isClaimed;
    }

    public final int getPageNo() {
        return this.pageNo;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isClaimed) + gpp.a(this.pageNo, this.userId.hashCode() * 31, 31);
    }

    public final boolean isClaimed() {
        return this.isClaimed;
    }

    public String toString() {
        String str = this.userId;
        int i = this.pageNo;
        return mq0.a(ml5.a(i, "CreatorCreditsHistoryCursorEntity(userId=", str, ", pageNo=", ", isClaimed="), this.isClaimed, ")");
    }
}
