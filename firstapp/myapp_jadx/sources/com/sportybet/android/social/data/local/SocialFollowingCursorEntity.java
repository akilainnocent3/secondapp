package com.sportybet.android.social.data.local;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/social/data/local/SocialFollowingCursorEntity;", "", "account", "", "pageNo", "", "pageSize", "<init>", "(Ljava/lang/String;II)V", "getAccount", "()Ljava/lang/String;", "Landroidx/room/PrimaryKey;", "getPageNo", "()I", "getPageSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/room/Entity;", "tableName", "social_following_cursor_table", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialFollowingCursorEntity {
    public static final int $stable = 0;
    private final String account;
    private final int pageNo;
    private final int pageSize;

    public SocialFollowingCursorEntity(String str, int i, int i2) {
        str.getClass();
        this.account = str;
        this.pageNo = i;
        this.pageSize = i2;
    }

    public static /* synthetic */ SocialFollowingCursorEntity copy$default(SocialFollowingCursorEntity socialFollowingCursorEntity, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = socialFollowingCursorEntity.account;
        }
        if ((i3 & 2) != 0) {
            i = socialFollowingCursorEntity.pageNo;
        }
        if ((i3 & 4) != 0) {
            i2 = socialFollowingCursorEntity.pageSize;
        }
        return socialFollowingCursorEntity.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNo() {
        return this.pageNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    public final SocialFollowingCursorEntity copy(String account, int pageNo, int pageSize) {
        account.getClass();
        return new SocialFollowingCursorEntity(account, pageNo, pageSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialFollowingCursorEntity)) {
            return false;
        }
        SocialFollowingCursorEntity socialFollowingCursorEntity = (SocialFollowingCursorEntity) other;
        return Intrinsics.g(this.account, socialFollowingCursorEntity.account) && this.pageNo == socialFollowingCursorEntity.pageNo && this.pageSize == socialFollowingCursorEntity.pageSize;
    }

    public final String getAccount() {
        return this.account;
    }

    public final int getPageNo() {
        return this.pageNo;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        return Integer.hashCode(this.pageSize) + gpp.a(this.pageNo, this.account.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.account;
        return zk1.a(this.pageSize, ")", ml5.a(this.pageNo, "SocialFollowingCursorEntity(account=", str, ", pageNo=", ", pageSize="));
    }
}
