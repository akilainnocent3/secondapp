package com.sporty.android.sportynews.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/sportynews/data/NewsArticleList;", "", "heroArticleList", "Lcom/sporty/android/sportynews/data/HeroArticleList;", "subArticleList", "Lcom/sporty/android/sportynews/data/SubArticleList;", "<init>", "(Lcom/sporty/android/sportynews/data/HeroArticleList;Lcom/sporty/android/sportynews/data/SubArticleList;)V", "getHeroArticleList", "()Lcom/sporty/android/sportynews/data/HeroArticleList;", "getSubArticleList", "()Lcom/sporty/android/sportynews/data/SubArticleList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sportyMedia", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NewsArticleList {
    public static final int $stable = SubArticleList.$stable | HeroArticleList.$stable;
    private final HeroArticleList heroArticleList;
    private final SubArticleList subArticleList;

    public NewsArticleList(HeroArticleList heroArticleList, SubArticleList subArticleList) {
        this.heroArticleList = heroArticleList;
        this.subArticleList = subArticleList;
    }

    public static /* synthetic */ NewsArticleList copy$default(NewsArticleList newsArticleList, HeroArticleList heroArticleList, SubArticleList subArticleList, int i, Object obj) {
        if ((i & 1) != 0) {
            heroArticleList = newsArticleList.heroArticleList;
        }
        if ((i & 2) != 0) {
            subArticleList = newsArticleList.subArticleList;
        }
        return newsArticleList.copy(heroArticleList, subArticleList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeroArticleList getHeroArticleList() {
        return this.heroArticleList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SubArticleList getSubArticleList() {
        return this.subArticleList;
    }

    public final NewsArticleList copy(HeroArticleList heroArticleList, SubArticleList subArticleList) {
        return new NewsArticleList(heroArticleList, subArticleList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsArticleList)) {
            return false;
        }
        NewsArticleList newsArticleList = (NewsArticleList) other;
        return Intrinsics.g(this.heroArticleList, newsArticleList.heroArticleList) && Intrinsics.g(this.subArticleList, newsArticleList.subArticleList);
    }

    public final HeroArticleList getHeroArticleList() {
        return this.heroArticleList;
    }

    public final SubArticleList getSubArticleList() {
        return this.subArticleList;
    }

    public int hashCode() {
        HeroArticleList heroArticleList = this.heroArticleList;
        int iHashCode = (heroArticleList == null ? 0 : heroArticleList.hashCode()) * 31;
        SubArticleList subArticleList = this.subArticleList;
        return iHashCode + (subArticleList != null ? subArticleList.hashCode() : 0);
    }

    public String toString() {
        return "NewsArticleList(heroArticleList=" + this.heroArticleList + ", subArticleList=" + this.subArticleList + ")";
    }
}
