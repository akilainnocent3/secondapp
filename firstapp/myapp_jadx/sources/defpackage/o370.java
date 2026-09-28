package defpackage;

import com.sporty.android.sportynews.data.ArticleItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o370 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o370(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                scn scnVar = (scn) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = ((qcn) obj2).iterator();
                while (it.hasNext()) {
                    nnt nntVar = (nnt) scnVar.get((String) it.next());
                    Pair pair = nntVar != null ? new Pair(Boolean.valueOf(nntVar.a()), nntVar.e()) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return arrayList;
            default:
                ArticleItem articleItem = (ArticleItem) obj;
                ((Function1) obj2).invoke(new dsc0.c(articleItem.getId(), articleItem.getArticleType()));
                return Unit.a;
        }
    }
}
