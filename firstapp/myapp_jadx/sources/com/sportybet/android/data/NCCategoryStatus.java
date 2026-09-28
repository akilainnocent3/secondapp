package com.sportybet.android.data;

import com.sporty.android.book.domain.entity.Category;
import defpackage.mtg0;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/data/NCCategoryStatus;", "", Category.CATEGORY_ID, "", "hasUnreadMessages", "", "lastReadTime", "", "<init>", "(IZLjava/lang/String;)V", "getCategory", "()I", "getHasUnreadMessages", "()Z", "getLastReadTime", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NCCategoryStatus {
    public static final int $stable = 0;
    private final int category;
    private final boolean hasUnreadMessages;
    private final String lastReadTime;

    public NCCategoryStatus(int i, boolean z, String str) {
        str.getClass();
        this.category = i;
        this.hasUnreadMessages = z;
        this.lastReadTime = str;
    }

    public static /* synthetic */ NCCategoryStatus copy$default(NCCategoryStatus nCCategoryStatus, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nCCategoryStatus.category;
        }
        if ((i2 & 2) != 0) {
            z = nCCategoryStatus.hasUnreadMessages;
        }
        if ((i2 & 4) != 0) {
            str = nCCategoryStatus.lastReadTime;
        }
        return nCCategoryStatus.copy(i, z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasUnreadMessages() {
        return this.hasUnreadMessages;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastReadTime() {
        return this.lastReadTime;
    }

    public final NCCategoryStatus copy(int category, boolean hasUnreadMessages, String lastReadTime) {
        lastReadTime.getClass();
        return new NCCategoryStatus(category, hasUnreadMessages, lastReadTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NCCategoryStatus)) {
            return false;
        }
        NCCategoryStatus nCCategoryStatus = (NCCategoryStatus) other;
        return this.category == nCCategoryStatus.category && this.hasUnreadMessages == nCCategoryStatus.hasUnreadMessages && Intrinsics.g(this.lastReadTime, nCCategoryStatus.lastReadTime);
    }

    public final int getCategory() {
        return this.category;
    }

    public final boolean getHasUnreadMessages() {
        return this.hasUnreadMessages;
    }

    public final String getLastReadTime() {
        return this.lastReadTime;
    }

    public int hashCode() {
        return this.lastReadTime.hashCode() + mtg0.a(Integer.hashCode(this.category) * 31, 31, this.hasUnreadMessages);
    }

    public String toString() {
        int i = this.category;
        boolean z = this.hasUnreadMessages;
        String str = this.lastReadTime;
        StringBuilder sb = new StringBuilder("NCCategoryStatus(category=");
        sb.append(i);
        sb.append(", hasUnreadMessages=");
        sb.append(z);
        sb.append(", lastReadTime=");
        return uf80.a(sb, str, ")");
    }
}
