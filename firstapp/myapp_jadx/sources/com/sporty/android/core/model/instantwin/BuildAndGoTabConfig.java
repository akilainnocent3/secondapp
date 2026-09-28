package com.sporty.android.core.model.instantwin;

import defpackage.cwz;
import defpackage.mtg0;
import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/instantwin/BuildAndGoTabConfig;", "", "enableVirtualsAsFirstTab", "", "isFullRollout", "userFilter", "Lcom/sporty/android/core/model/instantwin/BuildAndGoTabConfig$UserFilter;", "<init>", "(ZZLcom/sporty/android/core/model/instantwin/BuildAndGoTabConfig$UserFilter;)V", "getEnableVirtualsAsFirstTab", "()Z", "getUserFilter", "()Lcom/sporty/android/core/model/instantwin/BuildAndGoTabConfig$UserFilter;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "UserFilter", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BuildAndGoTabConfig {
    private final boolean enableVirtualsAsFirstTab;
    private final boolean isFullRollout;
    private final UserFilter userFilter;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\r\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0004HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/instantwin/BuildAndGoTabConfig$UserFilter;", "", "userIdSuffixes", "", "", "exactUserIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getUserIdSuffixes", "()Ljava/util/List;", "getExactUserIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UserFilter {
        private final List<String> exactUserIds;
        private final List<String> userIdSuffixes;

        public UserFilter(List<String> list, List<String> list2) {
            this.userIdSuffixes = list;
            this.exactUserIds = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserFilter copy$default(UserFilter userFilter, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = userFilter.userIdSuffixes;
            }
            if ((i & 2) != 0) {
                list2 = userFilter.exactUserIds;
            }
            return userFilter.copy(list, list2);
        }

        public final List<String> component1() {
            return this.userIdSuffixes;
        }

        public final List<String> component2() {
            return this.exactUserIds;
        }

        public final UserFilter copy(List<String> userIdSuffixes, List<String> exactUserIds) {
            return new UserFilter(userIdSuffixes, exactUserIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserFilter)) {
                return false;
            }
            UserFilter userFilter = (UserFilter) other;
            return Intrinsics.g(this.userIdSuffixes, userFilter.userIdSuffixes) && Intrinsics.g(this.exactUserIds, userFilter.exactUserIds);
        }

        public final List<String> getExactUserIds() {
            return this.exactUserIds;
        }

        public final List<String> getUserIdSuffixes() {
            return this.userIdSuffixes;
        }

        public int hashCode() {
            List<String> list = this.userIdSuffixes;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.exactUserIds;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            return w9d.a("UserFilter(userIdSuffixes=", ", exactUserIds=", ")", this.userIdSuffixes, this.exactUserIds);
        }
    }

    public BuildAndGoTabConfig(boolean z, boolean z2, UserFilter userFilter) {
        this.enableVirtualsAsFirstTab = z;
        this.isFullRollout = z2;
        this.userFilter = userFilter;
    }

    public static /* synthetic */ BuildAndGoTabConfig copy$default(BuildAndGoTabConfig buildAndGoTabConfig, boolean z, boolean z2, UserFilter userFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            z = buildAndGoTabConfig.enableVirtualsAsFirstTab;
        }
        if ((i & 2) != 0) {
            z2 = buildAndGoTabConfig.isFullRollout;
        }
        if ((i & 4) != 0) {
            userFilter = buildAndGoTabConfig.userFilter;
        }
        return buildAndGoTabConfig.copy(z, z2, userFilter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableVirtualsAsFirstTab() {
        return this.enableVirtualsAsFirstTab;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFullRollout() {
        return this.isFullRollout;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserFilter getUserFilter() {
        return this.userFilter;
    }

    public final BuildAndGoTabConfig copy(boolean enableVirtualsAsFirstTab, boolean isFullRollout, UserFilter userFilter) {
        return new BuildAndGoTabConfig(enableVirtualsAsFirstTab, isFullRollout, userFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildAndGoTabConfig)) {
            return false;
        }
        BuildAndGoTabConfig buildAndGoTabConfig = (BuildAndGoTabConfig) other;
        return this.enableVirtualsAsFirstTab == buildAndGoTabConfig.enableVirtualsAsFirstTab && this.isFullRollout == buildAndGoTabConfig.isFullRollout && Intrinsics.g(this.userFilter, buildAndGoTabConfig.userFilter);
    }

    public final boolean getEnableVirtualsAsFirstTab() {
        return this.enableVirtualsAsFirstTab;
    }

    public final UserFilter getUserFilter() {
        return this.userFilter;
    }

    public int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.enableVirtualsAsFirstTab) * 31, 31, this.isFullRollout);
        UserFilter userFilter = this.userFilter;
        return iA + (userFilter == null ? 0 : userFilter.hashCode());
    }

    public final boolean isFullRollout() {
        return this.isFullRollout;
    }

    public String toString() {
        boolean z = this.enableVirtualsAsFirstTab;
        boolean z2 = this.isFullRollout;
        UserFilter userFilter = this.userFilter;
        StringBuilder sbA = cwz.a("BuildAndGoTabConfig(enableVirtualsAsFirstTab=", ", isFullRollout=", ", userFilter=", z, z2);
        sbA.append(userFilter);
        sbA.append(")");
        return sbA.toString();
    }
}
