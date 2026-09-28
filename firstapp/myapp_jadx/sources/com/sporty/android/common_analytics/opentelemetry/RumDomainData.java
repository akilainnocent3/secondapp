package com.sporty.android.common_analytics.opentelemetry;

import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tÊ\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/common_analytics/opentelemetry/RumDomainData;", "", "allowlist", "", "", "blocklist", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAllowlist", "()Ljava/util/List;", "getBlocklist", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common-analytics", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RumDomainData {
    private final List<String> allowlist;
    private final List<String> blocklist;

    public RumDomainData(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.allowlist = list;
        this.blocklist = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RumDomainData copy$default(RumDomainData rumDomainData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rumDomainData.allowlist;
        }
        if ((i & 2) != 0) {
            list2 = rumDomainData.blocklist;
        }
        return rumDomainData.copy(list, list2);
    }

    public final List<String> component1() {
        return this.allowlist;
    }

    public final List<String> component2() {
        return this.blocklist;
    }

    public final RumDomainData copy(List<String> allowlist, List<String> blocklist) {
        allowlist.getClass();
        blocklist.getClass();
        return new RumDomainData(allowlist, blocklist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RumDomainData)) {
            return false;
        }
        RumDomainData rumDomainData = (RumDomainData) other;
        return Intrinsics.g(this.allowlist, rumDomainData.allowlist) && Intrinsics.g(this.blocklist, rumDomainData.blocklist);
    }

    public final List<String> getAllowlist() {
        return this.allowlist;
    }

    public final List<String> getBlocklist() {
        return this.blocklist;
    }

    public int hashCode() {
        return this.blocklist.hashCode() + (this.allowlist.hashCode() * 31);
    }

    public String toString() {
        return w9d.a("RumDomainData(allowlist=", ", blocklist=", ")", this.allowlist, this.blocklist);
    }
}
