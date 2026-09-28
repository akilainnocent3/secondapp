package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.ArticleItem;
import com.sporty.android.sportynews.data.SubArticleList;
import com.sporty.android.sportynews.data.TagItem;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltsc0;", "Lj8i0;", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tsc0 extends j8i0 {
    public final ku90<TagItem> A;
    public final ku90 B;
    public final List<String> C;
    public final ku90<Integer> D;
    public final ku90 E;
    public final xtc0 a;
    public final wwd0 b;
    public final v340 c;
    public final wwd0 d;
    public final v340 e;
    public final wwd0 f;
    public final v340 i;
    public final wwd0 v;
    public final v340 w;
    public String y;
    public boolean z;

    public tsc0(xtc0 xtc0Var) {
        this.a = xtc0Var;
        wwd0 wwd0VarA = xwd0.a(ot6.a.a);
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(u78.a.a);
        this.d = wwd0VarA2;
        this.e = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(Boolean.FALSE);
        this.f = wwd0VarA3;
        this.i = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.v = wwd0VarA4;
        this.w = e1i.b(wwd0VarA4);
        this.y = "";
        this.z = true;
        ku90<TagItem> ku90Var = new ku90<>();
        this.A = ku90Var;
        this.B = ku90Var;
        this.C = a.c("sportradar.com");
        ku90<Integer> ku90Var2 = new ku90<>();
        this.D = ku90Var2;
        this.E = ku90Var2;
    }

    public final void x1(String str, String str2) {
        str.getClass();
        str2.getClass();
        et7 et7VarD = o8i0.d(this);
        ssc0 ssc0Var = new ssc0(this, str2);
        xtc0 xtc0Var = this.a;
        xtc0Var.getClass();
        jvd0 jvd0Var = xtc0Var.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        wsc0 wsc0Var = xtc0Var.a;
        lyh lyhVarD = wsc0Var.d(str, str2);
        lyh n1iVar = str2.length() == 0 ? new n1i(wsc0Var.a(str), lyhVarD, new ktc0(xtc0Var, null)) : new jtc0(lyhVarD, xtc0Var);
        pfd pfdVar = fse.a;
        xtc0Var.c = kzh.d(new g1i(new yzh(new xzh(new ptc0(ozh.c(n1iVar, odd.b)), new qtc0(2, null)), new rtc0(3, null)), new stc0(ssc0Var, null)), et7VarD);
    }

    public final void y1(String str, final String str2) {
        str.getClass();
        str2.getClass();
        this.a.b(o8i0.d(this), str, str2, new Function1() { // from class: rsc0
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
                SubArticleList subArticleList;
                tsc0 tsc0Var = this.a;
                wwd0 wwd0Var = tsc0Var.v;
                wwd0 wwd0Var2 = tsc0Var.f;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                List<ArticleItem> articleList = null;
                if (lk50Var instanceof lk50.c) {
                    BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                    do {
                        value4 = wwd0Var2.getValue();
                        ((Boolean) value4).getClass();
                    } while (!wwd0Var2.g(value4, Boolean.FALSE));
                    if (baseResponse.bizCode == 10000) {
                        List<ArticleItem> articleList2 = ((SubArticleList) baseResponse.data).getArticleList();
                        if (articleList2 == null || !(!articleList2.isEmpty())) {
                            do {
                                value6 = wwd0Var.getValue();
                            } while (!wwd0Var.g(value6, jce0.b.a));
                        } else {
                            String nextCursor = ((SubArticleList) baseResponse.data).getNextCursor();
                            if (nextCursor == null) {
                                nextCursor = "";
                            }
                            tsc0Var.y = nextCursor;
                            tsc0Var.z = ((SubArticleList) baseResponse.data).getHasNextPage();
                            Object value8 = wwd0Var.getValue();
                            jce0.a aVar = value8 instanceof jce0.a ? (jce0.a) value8 : null;
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
                            SubArticleList subArticleList2 = new SubArticleList(tsc0Var.y, tsc0Var.z, CollectionsKt.i0(articleList3, articleList), ((SubArticleList) baseResponse.data).getArticleQueryItem());
                            do {
                                value7 = wwd0Var.getValue();
                            } while (!wwd0Var.g(value7, new jce0.a(subArticleList2)));
                        }
                    } else {
                        do {
                            value5 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value5, jce0.c.a));
                    }
                } else if (lk50Var instanceof lk50.a) {
                    do {
                        value2 = wwd0Var2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!wwd0Var2.g(value2, Boolean.FALSE));
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, jce0.c.a));
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    do {
                        value = wwd0Var2.getValue();
                        ((Boolean) value).getClass();
                    } while (!wwd0Var2.g(value, Boolean.valueOf(str2.length() == 0)));
                }
                return Unit.a;
            }
        });
    }
}
