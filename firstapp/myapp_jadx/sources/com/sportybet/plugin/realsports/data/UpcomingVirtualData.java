package com.sportybet.plugin.realsports.data;

import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013Ê\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001e"}, d2 = {"Lcom/sportybet/plugin/realsports/data/UpcomingVirtualData;", "", "sportId", "", "sportName", "categories", "", "Lcom/sportybet/plugin/realsports/data/UpcomingVirtualCategory;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSportId", "()Ljava/lang/String;", "setSportId", "(Ljava/lang/String;)V", "getSportName", "setSportName", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpcomingVirtualData {
    public static final int $stable = 8;
    private List<UpcomingVirtualCategory> categories;
    private String sportId;
    private String sportName;

    public /* synthetic */ UpcomingVirtualData(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpcomingVirtualData copy$default(UpcomingVirtualData upcomingVirtualData, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upcomingVirtualData.sportId;
        }
        if ((i & 2) != 0) {
            str2 = upcomingVirtualData.sportName;
        }
        if ((i & 4) != 0) {
            list = upcomingVirtualData.categories;
        }
        return upcomingVirtualData.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    public final List<UpcomingVirtualCategory> component3() {
        return this.categories;
    }

    public final UpcomingVirtualData copy(String sportId, String sportName, List<UpcomingVirtualCategory> categories) {
        return new UpcomingVirtualData(sportId, sportName, categories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcomingVirtualData)) {
            return false;
        }
        UpcomingVirtualData upcomingVirtualData = (UpcomingVirtualData) other;
        return Intrinsics.g(this.sportId, upcomingVirtualData.sportId) && Intrinsics.g(this.sportName, upcomingVirtualData.sportName) && Intrinsics.g(this.categories, upcomingVirtualData.categories);
    }

    public final List<UpcomingVirtualCategory> getCategories() {
        return this.categories;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getSportName() {
        return this.sportName;
    }

    public int hashCode() {
        String str = this.sportId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sportName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UpcomingVirtualCategory> list = this.categories;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setCategories(List<UpcomingVirtualCategory> list) {
        this.categories = list;
    }

    public final void setSportId(String str) {
        this.sportId = str;
    }

    public final void setSportName(String str) {
        this.sportName = str;
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.sportName;
        return ng1.a(ux5.a("UpcomingVirtualData(sportId=", str, ", sportName=", str2, ", categories="), this.categories, ")");
    }

    public UpcomingVirtualData(String str, String str2, List<UpcomingVirtualCategory> list) {
        this.sportId = str;
        this.sportName = str2;
        this.categories = list;
    }

    public UpcomingVirtualData() {
        this(null, null, null, 7, null);
    }
}
