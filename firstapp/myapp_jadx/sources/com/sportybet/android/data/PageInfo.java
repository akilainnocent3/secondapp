package com.sportybet.android.data;

import defpackage.cwz;
import defpackage.kwi;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eÊ\u0001\u0002\b\u001bÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/sportybet/android/data/PageInfo;", "", "hasPreviousPage", "", "hasNextPage", "startCursor", "", "endCursor", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "getHasPreviousPage", "()Z", "getHasNextPage", "getStartCursor", "()Ljava/lang/String;", "getEndCursor", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PageInfo {
    public static final int $stable = 0;
    private final String endCursor;
    private final boolean hasNextPage;
    private final boolean hasPreviousPage;
    private final String startCursor;

    public /* synthetic */ PageInfo(boolean z, boolean z2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }

    public static /* synthetic */ PageInfo copy$default(PageInfo pageInfo, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pageInfo.hasPreviousPage;
        }
        if ((i & 2) != 0) {
            z2 = pageInfo.hasNextPage;
        }
        if ((i & 4) != 0) {
            str = pageInfo.startCursor;
        }
        if ((i & 8) != 0) {
            str2 = pageInfo.endCursor;
        }
        return pageInfo.copy(z, z2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartCursor() {
        return this.startCursor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndCursor() {
        return this.endCursor;
    }

    public final PageInfo copy(boolean hasPreviousPage, boolean hasNextPage, String startCursor, String endCursor) {
        return new PageInfo(hasPreviousPage, hasNextPage, startCursor, endCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageInfo)) {
            return false;
        }
        PageInfo pageInfo = (PageInfo) other;
        return this.hasPreviousPage == pageInfo.hasPreviousPage && this.hasNextPage == pageInfo.hasNextPage && Intrinsics.g(this.startCursor, pageInfo.startCursor) && Intrinsics.g(this.endCursor, pageInfo.endCursor);
    }

    public final String getEndCursor() {
        return this.endCursor;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    public final String getStartCursor() {
        return this.startCursor;
    }

    public int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.hasPreviousPage) * 31, 31, this.hasNextPage);
        String str = this.startCursor;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endCursor;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.hasPreviousPage;
        boolean z2 = this.hasNextPage;
        return kwi.a(cwz.a("PageInfo(hasPreviousPage=", ", hasNextPage=", ", startCursor=", z, z2), this.startCursor, ", endCursor=", this.endCursor, ")");
    }

    public PageInfo(boolean z, boolean z2, String str, String str2) {
        this.hasPreviousPage = z;
        this.hasNextPage = z2;
        this.startCursor = str;
        this.endCursor = str2;
    }

    public PageInfo() {
        this(false, false, null, null, 15, null);
    }
}
