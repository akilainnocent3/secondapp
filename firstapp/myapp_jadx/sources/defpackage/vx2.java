package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.plugin.realsports.searchv2.SearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vx2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dy2.f((r8x.a.b) obj3, (a) obj, qj40.a(7));
                break;
            default:
                SearchActivity searchActivity = (SearchActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = SearchActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-581097846, new wx2(searchActivity), aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vx2(SearchActivity searchActivity) {
        this.b = searchActivity;
    }
}
