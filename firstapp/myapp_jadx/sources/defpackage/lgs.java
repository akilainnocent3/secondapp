package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.y;
import com.sporty.android.sportynews.data.ArticleItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lgs implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lgs(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                y.a aVar = (y.a) obj;
                ArrayList arrayListD = qb2.d((List) obj3, ((mgs) obj2).a);
                if (arrayListD != null) {
                    int size = arrayListD.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Pair pair = (Pair) arrayListD.get(i2);
                        y yVar = (y) pair.a;
                        Function0 function0 = (Function0) pair.b;
                        y.a.x(aVar, yVar, function0 != null ? ((iwo) function0.invoke()).a : 0L);
                    }
                }
                break;
            default:
                final jce0.a aVar2 = (jce0.a) obj3;
                ctc0 ctc0Var = (ctc0) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                List<ArticleItem> articleList = aVar2.a.getArticleList();
                if (articleList == null) {
                    articleList = m2g.a;
                }
                szrVar.d(articleList.size(), null, new xcd0.b(articleList), new op8(2039820996, new xcd0.c(articleList, ctc0Var), true));
                szr.h(szrVar, null, new op8(285648628, new gaj() { // from class: ucd0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        a aVar3 = (a) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        ((gwr) obj4).getClass();
                        if (!aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            aVar3.G();
                        } else if (aVar2.a.getHasNextPage()) {
                            aVar3.N(1428110556);
                            aga.b(0, aVar3);
                            aVar3.H();
                        } else {
                            aVar3.N(1428166821);
                            ty0.a(aVar3, j.i(d.a.b, 16.0f));
                            aVar3.H();
                        }
                        return Unit.a;
                    }
                }, true), 3);
                break;
        }
        return Unit.a;
    }
}
