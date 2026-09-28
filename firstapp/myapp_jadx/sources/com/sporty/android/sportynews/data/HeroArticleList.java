package com.sporty.android.sportynews.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0018Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/sportynews/data/HeroArticleList;", "", "articleList", "", "Lcom/sporty/android/sportynews/data/ArticleItem;", "articleQueryItem", "Lcom/sporty/android/sportynews/data/ArticleQueryItem;", "<init>", "(Ljava/util/List;Lcom/sporty/android/sportynews/data/ArticleQueryItem;)V", "getArticleList", "()Ljava/util/List;", "getArticleQueryItem", "()Lcom/sporty/android/sportynews/data/ArticleQueryItem;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sportyMedia", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class HeroArticleList {
    public static final int $stable = ArticleQueryItem.$stable;
    private final List<ArticleItem> articleList;
    private final ArticleQueryItem articleQueryItem;

    public HeroArticleList(List<ArticleItem> list, ArticleQueryItem articleQueryItem) {
        this.articleList = list;
        this.articleQueryItem = articleQueryItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeroArticleList copy$default(HeroArticleList heroArticleList, List list, ArticleQueryItem articleQueryItem, int i, Object obj) {
        if ((i & 1) != 0) {
            list = heroArticleList.articleList;
        }
        if ((i & 2) != 0) {
            articleQueryItem = heroArticleList.articleQueryItem;
        }
        return heroArticleList.copy(list, articleQueryItem);
    }

    public final List<ArticleItem> component1() {
        return this.articleList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ArticleQueryItem getArticleQueryItem() {
        return this.articleQueryItem;
    }

    public final HeroArticleList copy(List<ArticleItem> articleList, ArticleQueryItem articleQueryItem) {
        return new HeroArticleList(articleList, articleQueryItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeroArticleList)) {
            return false;
        }
        HeroArticleList heroArticleList = (HeroArticleList) other;
        return Intrinsics.g(this.articleList, heroArticleList.articleList) && Intrinsics.g(this.articleQueryItem, heroArticleList.articleQueryItem);
    }

    public final List<ArticleItem> getArticleList() {
        return this.articleList;
    }

    public final ArticleQueryItem getArticleQueryItem() {
        return this.articleQueryItem;
    }

    public int hashCode() {
        List<ArticleItem> list = this.articleList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ArticleQueryItem articleQueryItem = this.articleQueryItem;
        return iHashCode + (articleQueryItem != null ? articleQueryItem.hashCode() : 0);
    }

    public String toString() {
        return "HeroArticleList(articleList=" + this.articleList + ", articleQueryItem=" + this.articleQueryItem + ")";
    }
}
