package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class da8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ da8(int i, Object obj, Object obj2) {
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
        switch (i) {
            case 0:
                return ha8.j0((ha8) obj4, (ComposeView) obj3, (a) obj, ((Integer) obj2).intValue());
            default:
                final ytw ytwVar = (ytw) obj4;
                final Function1 function1 = (Function1) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    aVar.G();
                } else if (StringsKt.U((String) ytwVar.getValue())) {
                    aVar.N(1959097381);
                    aVar.H();
                } else {
                    aVar.N(1958448706);
                    boolean zM = aVar.M(ytwVar) | aVar.M(function1);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: b080
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ytwVar.setValue("");
                                function1.invoke("");
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    c6n.a((Function0) objY, g3w.h(j.r(d.a.b, 18.0f), "clear_search_button"), false, null, null, po9.a, aVar, 1572912, 60);
                    aVar.H();
                }
                return Unit.a;
        }
    }
}
