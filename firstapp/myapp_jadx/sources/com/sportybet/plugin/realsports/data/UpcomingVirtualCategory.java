package com.sportybet.plugin.realsports.data;

import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013Ê\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001e"}, d2 = {"Lcom/sportybet/plugin/realsports/data/UpcomingVirtualCategory;", "", "categoryId", "", "categoryName", "leagues", "", "Lcom/sportybet/plugin/realsports/data/UpcomingVirtualLeague;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "getCategoryName", "setCategoryName", "getLeagues", "()Ljava/util/List;", "setLeagues", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpcomingVirtualCategory {
    public static final int $stable = 8;
    private String categoryId;
    private String categoryName;
    private List<UpcomingVirtualLeague> leagues;

    public /* synthetic */ UpcomingVirtualCategory(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpcomingVirtualCategory copy$default(UpcomingVirtualCategory upcomingVirtualCategory, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upcomingVirtualCategory.categoryId;
        }
        if ((i & 2) != 0) {
            str2 = upcomingVirtualCategory.categoryName;
        }
        if ((i & 4) != 0) {
            list = upcomingVirtualCategory.leagues;
        }
        return upcomingVirtualCategory.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    public final List<UpcomingVirtualLeague> component3() {
        return this.leagues;
    }

    public final UpcomingVirtualCategory copy(String categoryId, String categoryName, List<UpcomingVirtualLeague> leagues) {
        return new UpcomingVirtualCategory(categoryId, categoryName, leagues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcomingVirtualCategory)) {
            return false;
        }
        UpcomingVirtualCategory upcomingVirtualCategory = (UpcomingVirtualCategory) other;
        return Intrinsics.g(this.categoryId, upcomingVirtualCategory.categoryId) && Intrinsics.g(this.categoryName, upcomingVirtualCategory.categoryName) && Intrinsics.g(this.leagues, upcomingVirtualCategory.leagues);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final List<UpcomingVirtualLeague> getLeagues() {
        return this.leagues;
    }

    public int hashCode() {
        String str = this.categoryId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UpcomingVirtualLeague> list = this.leagues;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setCategoryName(String str) {
        this.categoryName = str;
    }

    public final void setLeagues(List<UpcomingVirtualLeague> list) {
        this.leagues = list;
    }

    public String toString() {
        String str = this.categoryId;
        String str2 = this.categoryName;
        return ng1.a(ux5.a("UpcomingVirtualCategory(categoryId=", str, ", categoryName=", str2, ", leagues="), this.leagues, ")");
    }

    public UpcomingVirtualCategory(String str, String str2, List<UpcomingVirtualLeague> list) {
        this.categoryId = str;
        this.categoryName = str2;
        this.leagues = list;
    }

    public UpcomingVirtualCategory() {
        this(null, null, null, 7, null);
    }
}
