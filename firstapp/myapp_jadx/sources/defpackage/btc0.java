package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.ArticleItem;
import com.sporty.android.sportynews.data.SubArticleList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class btc0 implements Function1 {
    public final /* synthetic */ ctc0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ btc0(ctc0 ctc0Var, String str) {
        this.a = ctc0Var;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        SubArticleList subArticleList;
        ctc0 ctc0Var = this.a;
        wwd0 wwd0Var = ctc0Var.b;
        wwd0 wwd0Var2 = ctc0Var.d;
        lk50 lk50Var = (lk50) obj;
        lk50Var.getClass();
        List<ArticleItem> articleList = null;
        if (lk50Var instanceof lk50.c) {
            BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
            do {
                value5 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value5, fzs.a.a));
            if (baseResponse.bizCode == 10000) {
                List<ArticleItem> articleList2 = ((SubArticleList) baseResponse.data).getArticleList();
                if (articleList2 == null || !(!articleList2.isEmpty())) {
                    do {
                        value7 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value7, jce0.b.a));
                } else {
                    String nextCursor = ((SubArticleList) baseResponse.data).getNextCursor();
                    if (nextCursor == null) {
                        nextCursor = "";
                    }
                    ctc0Var.v = nextCursor;
                    ctc0Var.w = ((SubArticleList) baseResponse.data).getHasNextPage();
                    Object value9 = wwd0Var.getValue();
                    jce0.a aVar = value9 instanceof jce0.a ? (jce0.a) value9 : null;
                    if (aVar != null && (subArticleList = aVar.a) != null) {
                        articleList = subArticleList.getArticleList();
                    }
                    if (articleList == null) {
                        articleList = m2g.a;
                    }
                    List<ArticleItem> articleList3 = ((SubArticleList) baseResponse.data).getArticleList();
                    if (articleList3 == null) {
                        articleList3 = m2g.a;
                    }
                    SubArticleList subArticleList2 = new SubArticleList(ctc0Var.v, ctc0Var.w, CollectionsKt.i0(articleList3, articleList), ((SubArticleList) baseResponse.data).getArticleQueryItem());
                    do {
                        value8 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value8, new jce0.a(subArticleList2)));
                }
            } else {
                do {
                    value6 = wwd0Var.getValue();
                } while (!wwd0Var.g(value6, jce0.c.a));
            }
        } else if (lk50Var instanceof lk50.a) {
            do {
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, fzs.a.a));
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, jce0.c.a));
        } else {
            if (!(lk50Var instanceof lk50.b)) {
                uhc.a();
                return null;
            }
            if (this.b.length() == 0) {
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, fzs.b.a));
            } else {
                do {
                    value = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value, fzs.c.a));
            }
        }
        return Unit.a;
    }
}
