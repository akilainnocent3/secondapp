package com.sportybet.android.data;

import defpackage.m2g;
import defpackage.zk1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/data/NCResponse;", "", "edges", "", "Lcom/sportybet/android/data/NCEdge;", "pageInfo", "Lcom/sportybet/android/data/PageInfo;", "totalCount", "", "<init>", "(Ljava/util/List;Lcom/sportybet/android/data/PageInfo;I)V", "getEdges", "()Ljava/util/List;", "getPageInfo", "()Lcom/sportybet/android/data/PageInfo;", "getTotalCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NCResponse {
    public static final int $stable = PageInfo.$stable;
    private final List<NCEdge> edges;
    private final PageInfo pageInfo;
    private final int totalCount;

    public NCResponse(List list, PageInfo pageInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? m2g.a : list, (i2 & 2) != 0 ? new PageInfo(false, false, null, null, 15, null) : pageInfo, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NCResponse copy$default(NCResponse nCResponse, List list, PageInfo pageInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = nCResponse.edges;
        }
        if ((i2 & 2) != 0) {
            pageInfo = nCResponse.pageInfo;
        }
        if ((i2 & 4) != 0) {
            i = nCResponse.totalCount;
        }
        return nCResponse.copy(list, pageInfo, i);
    }

    public final List<NCEdge> component1() {
        return this.edges;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final NCResponse copy(List<NCEdge> edges, PageInfo pageInfo, int totalCount) {
        edges.getClass();
        pageInfo.getClass();
        return new NCResponse(edges, pageInfo, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NCResponse)) {
            return false;
        }
        NCResponse nCResponse = (NCResponse) other;
        return Intrinsics.g(this.edges, nCResponse.edges) && Intrinsics.g(this.pageInfo, nCResponse.pageInfo) && this.totalCount == nCResponse.totalCount;
    }

    public final List<NCEdge> getEdges() {
        return this.edges;
    }

    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalCount) + ((this.pageInfo.hashCode() + (this.edges.hashCode() * 31)) * 31);
    }

    public String toString() {
        List<NCEdge> list = this.edges;
        PageInfo pageInfo = this.pageInfo;
        int i = this.totalCount;
        StringBuilder sb = new StringBuilder("NCResponse(edges=");
        sb.append(list);
        sb.append(", pageInfo=");
        sb.append(pageInfo);
        sb.append(", totalCount=");
        return zk1.a(i, ")", sb);
    }

    public NCResponse(List<NCEdge> list, PageInfo pageInfo, int i) {
        list.getClass();
        pageInfo.getClass();
        this.edges = list;
        this.pageInfo = pageInfo;
        this.totalCount = i;
    }

    public NCResponse() {
        this(null, null, 0, 7, null);
    }
}
