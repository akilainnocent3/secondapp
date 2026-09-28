package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.ArticleDetailItem;
import com.sporty.android.sportynews.data.CategoryList;
import com.sporty.android.sportynews.data.HeroArticleList;

/* JADX INFO: loaded from: classes5.dex */
public interface wsc0 {
    lyh<BaseResponse<HeroArticleList>> a(String str);

    lyh b(String str, String str2);

    lyh<BaseResponse<CategoryList>> c();

    lyh d(String str, String str2);

    lyh<BaseResponse<ArticleDetailItem>> e(String str);
}
