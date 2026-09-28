package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                ComposeView composeView = (ComposeView) obj4;
                wk wkVar = (wk) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1715756595, new sk(objArr == true ? 1 : 0, composeView, wkVar), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
            default:
                final uwd0 uwd0Var = (uwd0) obj4;
                final Function0 function0 = (Function0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-296822424, new Function2() { // from class: ngi
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            a aVar3 = (a) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            if (!aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                aVar3.G();
                            } else if (((lni0) wyh.c(uwd0Var, aVar3, 0, 7).getValue()) == lni0.b) {
                                aVar3.N(700965668);
                                wgi.b(function0, aVar3, 0);
                                aVar3.H();
                            } else {
                                aVar3.N(701048314);
                                aVar3.H();
                            }
                            return Unit.a;
                        }
                    }, aVar2), aVar2, 196608);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
