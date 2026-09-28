package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l7i implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l7i(int i, d dVar, String str) {
        this.b = dVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj4;
                ytw ytwVar = (ytw) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x7i x7iVar = (x7i) ytwVar.getValue();
                    x7iVar.getClass();
                    r7i.d(function0, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.sportybet.feature.inappreview.d.a(qj40.a(385), (a) obj, (d) obj4, (String) obj3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l7i(ytw ytwVar, Function0 function0) {
        this.b = function0;
        this.c = ytwVar;
    }
}
