package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.plugin.realsports.searchv2.SearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wx2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cy2.b((fq30.a) obj3, (a) obj, qj40.a(1));
                break;
            default:
                SearchActivity searchActivity = (SearchActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = SearchActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ihe0.a(j.e(d.a.b, 1.0f), null, 0L, 0L, 0.0f, 0.0f, null, pp8.b(775445903, new xx2(searchActivity), aVar), aVar, 12582918, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wx2(SearchActivity searchActivity) {
        this.b = searchActivity;
    }
}
