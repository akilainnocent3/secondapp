package com.sporty.android.book.domain.entity;

import defpackage.ux5;
import defpackage.x9d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/book/domain/entity/MarketExtend;", "", "name", "", "rootMarketId", "nodeMarketId", "notSupport", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getRootMarketId", "getNodeMarketId", "getNotSupport", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketExtend {
    public static final int $stable = 0;
    private final String name;
    private final String nodeMarketId;
    private final boolean notSupport;
    private final String rootMarketId;

    public /* synthetic */ MarketExtend(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, z);
    }

    public static /* synthetic */ MarketExtend copy$default(MarketExtend marketExtend, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketExtend.name;
        }
        if ((i & 2) != 0) {
            str2 = marketExtend.rootMarketId;
        }
        if ((i & 4) != 0) {
            str3 = marketExtend.nodeMarketId;
        }
        if ((i & 8) != 0) {
            z = marketExtend.notSupport;
        }
        return marketExtend.copy(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRootMarketId() {
        return this.rootMarketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNodeMarketId() {
        return this.nodeMarketId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNotSupport() {
        return this.notSupport;
    }

    public final MarketExtend copy(String name, String rootMarketId, String nodeMarketId, boolean notSupport) {
        return new MarketExtend(name, rootMarketId, nodeMarketId, notSupport);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketExtend)) {
            return false;
        }
        MarketExtend marketExtend = (MarketExtend) other;
        return Intrinsics.g(this.name, marketExtend.name) && Intrinsics.g(this.rootMarketId, marketExtend.rootMarketId) && Intrinsics.g(this.nodeMarketId, marketExtend.nodeMarketId) && this.notSupport == marketExtend.notSupport;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNodeMarketId() {
        return this.nodeMarketId;
    }

    public final boolean getNotSupport() {
        return this.notSupport;
    }

    public final String getRootMarketId() {
        return this.rootMarketId;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rootMarketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nodeMarketId;
        return Boolean.hashCode(this.notSupport) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.rootMarketId;
        return x9d.a(this.nodeMarketId, ", notSupport=", ")", ux5.a("MarketExtend(name=", str, ", rootMarketId=", str2, ", nodeMarketId="), this.notSupport);
    }

    public MarketExtend(String str, String str2, String str3, boolean z) {
        this.name = str;
        this.rootMarketId = str2;
        this.nodeMarketId = str3;
        this.notSupport = z;
    }
}
