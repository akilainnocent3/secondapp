package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.ArticleItem;
import com.sporty.android.sportynews.data.HeroArticleList;
import com.sporty.android.sportynews.data.NewsArticleList;
import com.sporty.android.sportynews.data.SubArticleList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ssc0 implements Function1 {
    public final /* synthetic */ tsc0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ssc0(tsc0 tsc0Var, String str) {
        this.a = tsc0Var;
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
        SubArticleList subArticleList;
        Object value6;
        List<ArticleItem> articleList;
        Object value7;
        T t;
        List<ArticleItem> articleList2;
        tsc0 tsc0Var = this.a;
        wwd0 wwd0Var = tsc0Var.d;
        wwd0 wwd0Var2 = tsc0Var.f;
        lk50 lk50Var = (lk50) obj;
        lk50Var.getClass();
        if (lk50Var instanceof lk50.c) {
            BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
            do {
                value4 = wwd0Var2.getValue();
                ((Boolean) value4).getClass();
            } while (!wwd0Var2.g(value4, Boolean.FALSE));
            if (baseResponse.bizCode == 10000) {
                HeroArticleList heroArticleList = ((NewsArticleList) baseResponse.data).getHeroArticleList();
                if ((heroArticleList == null || (articleList2 = heroArticleList.getArticleList()) == null || !(!articleList2.isEmpty())) && ((subArticleList = ((NewsArticleList) baseResponse.data).getSubArticleList()) == null || (articleList = subArticleList.getArticleList()) == null || !(!articleList.isEmpty()))) {
                    do {
                        value6 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value6, u78.a.a));
                } else {
                    do {
                        value7 = wwd0Var.getValue();
                        t = baseResponse.data;
                        t.getClass();
                    } while (!wwd0Var.g(value7, new u78.c((NewsArticleList) t)));
                }
            } else {
                do {
                    value5 = wwd0Var.getValue();
                } while (!wwd0Var.g(value5, u78.b.a));
            }
        } else if (lk50Var instanceof lk50.a) {
            do {
                value2 = wwd0Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!wwd0Var2.g(value2, Boolean.FALSE));
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, u78.b.a));
        } else {
            if (!(lk50Var instanceof lk50.b)) {
                uhc.a();
                return null;
            }
            do {
                value = wwd0Var2.getValue();
                ((Boolean) value).getClass();
            } while (!wwd0Var2.g(value, Boolean.valueOf(this.b.length() == 0)));
        }
        return Unit.a;
    }
}
