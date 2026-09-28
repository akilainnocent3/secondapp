package com.sportybet.android.social.data.local;

import defpackage.d830;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\n¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0016Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sportybet/android/social/data/local/SocFollowingCodeCursorEntity;", "", "account", "", "pageNo", "", "<init>", "(Ljava/lang/String;I)V", "getAccount", "()Ljava/lang/String;", "Landroidx/room/PrimaryKey;", "getPageNo", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/room/Entity;", "tableName", "social_following_code_cursor_table", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocFollowingCodeCursorEntity {
    public static final int $stable = 0;
    private final String account;
    private final int pageNo;

    public SocFollowingCodeCursorEntity(String str, int i) {
        str.getClass();
        this.account = str;
        this.pageNo = i;
    }

    public static /* synthetic */ SocFollowingCodeCursorEntity copy$default(SocFollowingCodeCursorEntity socFollowingCodeCursorEntity, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = socFollowingCodeCursorEntity.account;
        }
        if ((i2 & 2) != 0) {
            i = socFollowingCodeCursorEntity.pageNo;
        }
        return socFollowingCodeCursorEntity.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNo() {
        return this.pageNo;
    }

    public final SocFollowingCodeCursorEntity copy(String account, int pageNo) {
        account.getClass();
        return new SocFollowingCodeCursorEntity(account, pageNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocFollowingCodeCursorEntity)) {
            return false;
        }
        SocFollowingCodeCursorEntity socFollowingCodeCursorEntity = (SocFollowingCodeCursorEntity) other;
        return Intrinsics.g(this.account, socFollowingCodeCursorEntity.account) && this.pageNo == socFollowingCodeCursorEntity.pageNo;
    }

    public final String getAccount() {
        return this.account;
    }

    public final int getPageNo() {
        return this.pageNo;
    }

    public int hashCode() {
        return Integer.hashCode(this.pageNo) + (this.account.hashCode() * 31);
    }

    public String toString() {
        return d830.a(this.pageNo, "SocFollowingCodeCursorEntity(account=", this.account, ", pageNo=", ")");
    }
}
