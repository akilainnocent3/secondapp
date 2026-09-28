package com.sporty.android.sportynews.data;

import defpackage.mtg0;
import defpackage.z620;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/sportynews/data/SubArticleList;", "", "nextCursor", "", "hasNextPage", "", "articleList", "", "Lcom/sporty/android/sportynews/data/ArticleItem;", "articleQueryItem", "Lcom/sporty/android/sportynews/data/ArticleQueryItem;", "<init>", "(Ljava/lang/String;ZLjava/util/List;Lcom/sporty/android/sportynews/data/ArticleQueryItem;)V", "getNextCursor", "()Ljava/lang/String;", "getHasNextPage", "()Z", "getArticleList", "()Ljava/util/List;", "getArticleQueryItem", "()Lcom/sporty/android/sportynews/data/ArticleQueryItem;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "sportyMedia", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubArticleList {
    public static final int $stable = ArticleQueryItem.$stable;
    private final List<ArticleItem> articleList;
    private final ArticleQueryItem articleQueryItem;
    private final boolean hasNextPage;
    private final String nextCursor;

    public SubArticleList(String str, boolean z, List<ArticleItem> list, ArticleQueryItem articleQueryItem) {
        this.nextCursor = str;
        this.hasNextPage = z;
        this.articleList = list;
        this.articleQueryItem = articleQueryItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubArticleList copy$default(SubArticleList subArticleList, String str, boolean z, List list, ArticleQueryItem articleQueryItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subArticleList.nextCursor;
        }
        if ((i & 2) != 0) {
            z = subArticleList.hasNextPage;
        }
        if ((i & 4) != 0) {
            list = subArticleList.articleList;
        }
        if ((i & 8) != 0) {
            articleQueryItem = subArticleList.articleQueryItem;
        }
        return subArticleList.copy(str, z, list, articleQueryItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final List<ArticleItem> component3() {
        return this.articleList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ArticleQueryItem getArticleQueryItem() {
        return this.articleQueryItem;
    }

    public final SubArticleList copy(String nextCursor, boolean hasNextPage, List<ArticleItem> articleList, ArticleQueryItem articleQueryItem) {
        return new SubArticleList(nextCursor, hasNextPage, articleList, articleQueryItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubArticleList)) {
            return false;
        }
        SubArticleList subArticleList = (SubArticleList) other;
        return Intrinsics.g(this.nextCursor, subArticleList.nextCursor) && this.hasNextPage == subArticleList.hasNextPage && Intrinsics.g(this.articleList, subArticleList.articleList) && Intrinsics.g(this.articleQueryItem, subArticleList.articleQueryItem);
    }

    public final List<ArticleItem> getArticleList() {
        return this.articleList;
    }

    public final ArticleQueryItem getArticleQueryItem() {
        return this.articleQueryItem;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        String str = this.nextCursor;
        int iA = mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.hasNextPage);
        List<ArticleItem> list = this.articleList;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        ArticleQueryItem articleQueryItem = this.articleQueryItem;
        return iHashCode + (articleQueryItem != null ? articleQueryItem.hashCode() : 0);
    }

    public String toString() {
        String str = this.nextCursor;
        boolean z = this.hasNextPage;
        List<ArticleItem> list = this.articleList;
        ArticleQueryItem articleQueryItem = this.articleQueryItem;
        StringBuilder sbA = z620.a("SubArticleList(nextCursor=", str, ", hasNextPage=", ", articleList=", z);
        sbA.append(list);
        sbA.append(", articleQueryItem=");
        sbA.append(articleQueryItem);
        sbA.append(")");
        return sbA.toString();
    }
}
