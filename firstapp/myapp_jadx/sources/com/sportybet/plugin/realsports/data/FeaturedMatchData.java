package com.sportybet.plugin.realsports.data;

import defpackage.ai50;
import defpackage.hfb0;
import defpackage.mtg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/plugin/realsports/data/FeaturedMatchData;", "", "featuredTabs", "", "Lcom/sportybet/plugin/realsports/data/FeaturedTab;", "featuredMatches", "Lcom/sportybet/plugin/realsports/data/FeaturedMatch;", "showFeatured", "", "boostInfo", "Lcom/sportybet/plugin/realsports/data/BoostInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;ZLcom/sportybet/plugin/realsports/data/BoostInfo;)V", "getFeaturedTabs", "()Ljava/util/List;", "getFeaturedMatches", "getShowFeatured", "()Z", "getBoostInfo", "()Lcom/sportybet/plugin/realsports/data/BoostInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeaturedMatchData {
    public static final int $stable = 8;
    private final BoostInfo boostInfo;
    private final List<FeaturedMatch> featuredMatches;
    private final List<FeaturedTab> featuredTabs;
    private final boolean showFeatured;

    public FeaturedMatchData(List<FeaturedTab> list, List<FeaturedMatch> list2, boolean z, BoostInfo boostInfo) {
        list.getClass();
        list2.getClass();
        this.featuredTabs = list;
        this.featuredMatches = list2;
        this.showFeatured = z;
        this.boostInfo = boostInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeaturedMatchData copy$default(FeaturedMatchData featuredMatchData, List list, List list2, boolean z, BoostInfo boostInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = featuredMatchData.featuredTabs;
        }
        if ((i & 2) != 0) {
            list2 = featuredMatchData.featuredMatches;
        }
        if ((i & 4) != 0) {
            z = featuredMatchData.showFeatured;
        }
        if ((i & 8) != 0) {
            boostInfo = featuredMatchData.boostInfo;
        }
        return featuredMatchData.copy(list, list2, z, boostInfo);
    }

    public final List<FeaturedTab> component1() {
        return this.featuredTabs;
    }

    public final List<FeaturedMatch> component2() {
        return this.featuredMatches;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowFeatured() {
        return this.showFeatured;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BoostInfo getBoostInfo() {
        return this.boostInfo;
    }

    public final FeaturedMatchData copy(List<FeaturedTab> featuredTabs, List<FeaturedMatch> featuredMatches, boolean showFeatured, BoostInfo boostInfo) {
        featuredTabs.getClass();
        featuredMatches.getClass();
        return new FeaturedMatchData(featuredTabs, featuredMatches, showFeatured, boostInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturedMatchData)) {
            return false;
        }
        FeaturedMatchData featuredMatchData = (FeaturedMatchData) other;
        return Intrinsics.g(this.featuredTabs, featuredMatchData.featuredTabs) && Intrinsics.g(this.featuredMatches, featuredMatchData.featuredMatches) && this.showFeatured == featuredMatchData.showFeatured && Intrinsics.g(this.boostInfo, featuredMatchData.boostInfo);
    }

    public final BoostInfo getBoostInfo() {
        return this.boostInfo;
    }

    public final List<FeaturedMatch> getFeaturedMatches() {
        return this.featuredMatches;
    }

    public final List<FeaturedTab> getFeaturedTabs() {
        return this.featuredTabs;
    }

    public final boolean getShowFeatured() {
        return this.showFeatured;
    }

    public int hashCode() {
        int iA = mtg0.a(ai50.a(this.featuredTabs.hashCode() * 31, 31, this.featuredMatches), 31, this.showFeatured);
        BoostInfo boostInfo = this.boostInfo;
        return iA + (boostInfo == null ? 0 : boostInfo.hashCode());
    }

    public String toString() {
        List<FeaturedTab> list = this.featuredTabs;
        List<FeaturedMatch> list2 = this.featuredMatches;
        boolean z = this.showFeatured;
        BoostInfo boostInfo = this.boostInfo;
        StringBuilder sbA = hfb0.a("FeaturedMatchData(featuredTabs=", ", featuredMatches=", ", showFeatured=", list, list2);
        sbA.append(z);
        sbA.append(", boostInfo=");
        sbA.append(boostInfo);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ FeaturedMatchData(List list, List list2, boolean z, BoostInfo boostInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, z, (i & 8) != 0 ? null : boostInfo);
    }
}
