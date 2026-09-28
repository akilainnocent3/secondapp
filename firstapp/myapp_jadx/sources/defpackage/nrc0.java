package defpackage;

import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.ArticleDetailItem;
import com.sporty.android.sportynews.data.CategoryList;
import com.sporty.android.sportynews.data.HeroArticleList;
import com.sporty.android.sportynews.data.SubArticleList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0015\u0010\u0010¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lnrc0;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/sportynews/data/CategoryList;", "b", "(Lv1b;)Ljava/lang/Object;", "", Category.CATEGORY_ID, "nextCursor", "", "pageSize", "Lcom/sporty/android/sportynews/data/SubArticleList;", "a", "(Ljava/lang/String;Ljava/lang/String;ILv1b;)Ljava/lang/Object;", "Lcom/sporty/android/sportynews/data/HeroArticleList;", "c", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "tag", "d", "articleId", "Lcom/sporty/android/sportynews/data/ArticleDetailItem;", "e", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface nrc0 {
    @sbj("factsCenter/sporty-news/article/content/sub/list")
    Object a(@db30("categoryId") String str, @db30("nextCursor") String str2, @db30("pageSize") int i, v1b<? super BaseResponse<SubArticleList>> v1bVar);

    @sbj("factsCenter/sporty-news/article/category/list")
    Object b(v1b<? super BaseResponse<CategoryList>> v1bVar);

    @sbj("factsCenter/sporty-news/article/content/hero/list")
    Object c(@db30("categoryId") String str, v1b<? super BaseResponse<HeroArticleList>> v1bVar);

    @sbj("factsCenter/sporty-news/article/content/tag/list")
    Object d(@db30("tagId") String str, @db30("nextCursor") String str2, @db30("pageSize") int i, v1b<? super BaseResponse<SubArticleList>> v1bVar);

    @sbj("factsCenter/sporty-news/article/content/detail")
    Object e(@db30("articleId") String str, v1b<? super BaseResponse<ArticleDetailItem>> v1bVar);
}
